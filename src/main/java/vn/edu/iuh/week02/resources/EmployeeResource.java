package vn.edu.iuh.week02.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.joda.time.DateTime;
import vn.edu.iuh.week02.models.Employee;
import vn.edu.iuh.week02.models.Order;
import vn.edu.iuh.week02.services.EmployeeService;

import java.util.List;
import java.util.Optional;

@Path("/employees")
public class EmployeeResource {
    private EmployeeService employeeService;

    public EmployeeResource() {
        this.employeeService = new EmployeeService();
    }

    @POST
    @Path("/")
    @Consumes("application/json")
    @Produces("application/json")
    public Response addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return Response.ok().entity("{\"message\": \"Create employee successfully\"}").build();
    }

    @GET
    @Path("/")
    @Produces("application/json")
    public Response findAll(){
        List<Employee> employees = employeeService.findAll();
        return Response.ok(employees).build();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response findById(@PathParam("id") long id){
        Optional<Employee> employee = employeeService.findById(id);
        if(employee.isEmpty()){
            return Response.status(404).entity("{\"message\": \"Employee not found\"}").build();
        }
        return Response.ok(employee.get()).build();
    }

    @PUT
    @Path("/{id}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response update(@PathParam("id") long id, Employee employee){
        boolean result = employeeService.updateEmployee(id, employee);
        if(!result){
            return Response.status(404).entity("{\"message\": \"Employee not found\"}").build();
        }

        return Response.ok().entity("{\"message\": \"Update employee successfully\"}").build();
    }

    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public Response delete(@PathParam("id") long id){
        boolean result = employeeService.deleteEmployee(id);
        if(!result){
            return Response.status(404).entity("{\"message\": \"Employee not found\"}").build();
        }

        return Response.ok().entity("{\"message\": \"Delete employee successfully\"}").build();
    }

    @GET
    @Path("/{id}/orders")
    @Produces("application/json")
    public Response getOrderFromRangeByEmployee(@PathParam("id") long id, @QueryParam("from_date")String fromDate, @QueryParam("to_date")String toDate, @QueryParam("date")String date){
        List<Order>orders = employeeService.getOrder(date,fromDate,toDate,id);
       return Response.ok(orders).build();
    }
}
