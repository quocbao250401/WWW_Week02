package vn.edu.iuh.week02.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.week02.configs.DatabaseConnection;
import vn.edu.iuh.week02.models.OrderDetail;

public class OrderDetailRepository {
    private EntityManager entityManager;
    private EntityTransaction entityTransaction;

    public OrderDetailRepository() {
        this.entityManager = DatabaseConnection.getInstance().getEntityManager();
        this.entityTransaction = entityManager.getTransaction();
    }

    public void addOrderDetail(OrderDetail orderDetail){
        try {
            entityTransaction.begin();
            entityManager.persist(orderDetail);
            entityTransaction.commit();
        }
        catch (Exception ex){
            entityTransaction.rollback();
            System.out.println(ex);
        }
    }
}
