package vn.edu.iuh.week02.requests;

import vn.edu.iuh.week02.models.OrderDetail;

import java.util.List;

public class OrderRequest {
    private long custId;
    private long empId;
    private List<OrderDetailRequest> details;

    public OrderRequest() {
    }

    public OrderRequest(long custId, long empId) {
        this.custId = custId;
        this.empId = empId;
    }

    public OrderRequest(long custId, long empId, List<OrderDetailRequest> details) {
        this.custId = custId;
        this.empId = empId;
        this.details = details;
    }

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public List<OrderDetailRequest> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetailRequest> details) {
        this.details = details;
    }
}

