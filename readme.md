# WWW tuần 2

## Các chức năng 
- Tạo CRUD cho các đối tượng và tạo đơn hàng.
- Thống kê đơn hàng theo ngày.
- Thống kê đơn hàng trong khoảng thời gian.
- Thống kê đơn hàng theo nhân viên.
- Thống kê đơn hàng theo nhân viên theo ngày.
- Thống kê đơn hàng theo nhân viên trong khoảng thời gian.

## Database diagram: 
![image](/assets/DatabaseDiagram.png)

## API:
### Customer
#### FIND ALL CUSTOMER
- Path: /api/customers 
- Method: GET 
- Response: ![image](/assets/GetAllCustomer.png)

#### ADD CUSTOMER
- Path: /api/customers 
- Method: POST 
- Request: 
```JSON
{ 
  "custName": "String", 
  "email": "String", 
  "phone": "String", 
  "address": "String" 
}
```
- Response: ![](assets/AddCustomer.png)

#### UPDATE CUSTOMER
- Path: /api/customers/{id} 
- PathParams: id (Integer) 
- Method: PUT 
- Request: 
```JSON
{
  "custName": "String",
  "email": "String",
  "phone": "String",
  "address": "String"
} 
```
- Response: ![](assets/UpdateCustomer.png)

#### FIND CUSTOMER BY ID
- Path: /api/customers/{id} 
- PathParams: id (Integer) 
- Method: GET 
- Response: ![](assets/FindCustomerById.png)

### Employee
#### GET ALL EMPLOYEE
- Path: /api/employees
- Method: GET
- Response: ![](assets/getAllEmployee.png)

#### ADD EMPLOYEE
- Path: /api/employees 
- Method: POST 
- Request: 
```JSON
{
    "fullName": "String",
    "dob": "String(yyyy-MM-dd)",
    "email": "String",
    "phone": "String",
    "address": "String"
}
```
- Response: ![](assets/AddEmployee.png)

#### FIND EMPLOYEE BY ID
- Path: /api/employees/{id} 
- PathParams: id (Integer) 
- Method: GET </br>
- Response: ![](assets/FindByIdEmployee.png)

#### UPDATE EMPLOYEE 
- Path: /api/employees/{id} 
- PathParams: id (Integer) 
- Method: PUT
- Request: 
```JSON
{
    "fullName": "String",
    "dob": "String(yyyy-MM-dd)",
    "email": "String",
    "phone": "String",
    "address": "String"
}
```
- Response: ![](assets/UpdateEmployee.png)

#### DELETE EMPLOYEE
- Path: /api/employees/{id} 
- PathParams: id (Integer) 
- Method: DELETE 
- Response: ![](assets/DeleteEmployee.png)

#### GET ORDER BY EMPLOYEE
- Path: /api/employees/{empId}/orders 
- PathParams: empId (Integer) 
- Method: GET 
- Response: ![](assets/GetOrderByEmployee.png)

#### GET ORDER BY EMPLOYEE FROM DATE TO DATE
- Path: /api/employees/{empId}/orders 
- QueryParams: ```from_date=String(yyyy-MM-dd) & to_date= String(yyyy-MM-dd) ```
- Method: GET 
- Response: ![](assets/GetOrderFromDateToDate.png)

#### GET ORDER BY EMPLOYEE BY DATE
- Path: /api/employees/{empId}/orders
- QueryParams: ```date=String(yyyy-MM-dd) ```
- Method: GET 
- Response: ![](assets/GetOrderByEmployeeByDay.png)

### Product
#### ADD PRODUCT
- Path: /api/products 
- Method: POST 
- Request: 
```JSON
{ 
    "name": "String", 
    "description": "String", 
    "unit": "String", 
    "manufacturerName": "String" 
}
```
- Response: ![](assets/AddProduct.png)

#### ADD PRODUCT IMAGE
- Path: /api/products/{productId}/product_image 
- Method: POST 
- PathParams: productId (Integer) 
- Request: 
```JSON
{ 
    "path": "String", 
    "alternative": "String" 
}
```
- Response: ![](assets/AddProductImage.png)

#### ADD PRODUCT PRICE
- Path: /api/products/{productId}/product_price 
- Method: POST 
- PathParams: productId(Integer) 
- Request: 
```JSON
{ 
    "price": "Integer", 
    "note": "String", 
    "priceDateTime": "String (yyyy-MM-dd HH:mm:ss)"
} 
```
- Response: ![](assets/AddProductPrice.png)

#### DELETE PRODUCT 
- Path: /api/products/{id} 
- Method: DELETE 
- PathParams: id(Integer) 
- Response: ![](assets/DeleteProduct.png)

#### DELETE PRODUCT IMAGE
- Path: /api/products/{productId}/product_image/{imgId} 
- Method: DELETE 
- PathParams: productId(Integer), imgId(Integer) 
- Response: ![](assets/DeleteProductImage.png)

#### GET ALL PRODUCT
- Path: /api/products 
- Method: GET 
- Response: ![](assets/GetAllProduct.png)

#### FIND PRODUCT BY ID
- Path: /api/products/{id} 
- Method: GET 
- PathParams: id (Integer) 
- Response: ![](assets/GetProductById.png)

### ORDER
#### ADD ORDER
- Path: /api/orders 
- Method: POST 
- Respone: ![](assets/CreateOrder.png)

#### GET ORDER BY DAY
- Path: /api/orders 
- Method: GET 
- QueryParams: ```date=String(yyyy-MM-dd) ```
- Response: ![](assets/GetOrderByDay.png)

#### GET ORDER FROM DATE TO DATE
- Path: /api/orders 
- Method: GET 
- QueryParams: ```from_date=String(yyyy-MM-dd)&to_date=String(yyyy-MM-dd)```
- Response: ![](assets/GetOrderFromDateToDate.png)
