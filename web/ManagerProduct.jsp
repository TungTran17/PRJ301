<%-- 
    Document   : ManagerProduct
    Created on : March 2, 2023, 5:19:02 PM
    Author     : Tran Van Tung
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Quản Lý Sản Phẩm</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    </head>    
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Quản Lý <b>Sản Phẩm</b></h2>
                        </div>
                        <div class="col-sm-6">
                            <a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Product</span></a>
                            <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="selectAll">
                                    <label for="selectAll"></label>
                                </span>
                            </th>
                            <th>Ảnh</th>
                            <th>ID</th>
                            <th>Tên Sản Phẩm</th>
                            <th>Size</th>
                            <th>Màu</th>
                            <th>Giá</th>
                            <th>Ngày Thêm Sản Phẩm</th>
                        </tr>
                    </thead>
                    <tbody>
                    <form action="delebypcode" method="post">
                        <div id="deleteEmployeeModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">

                                    <div class="modal-header">						
                                        <h4 class="modal-title">Delete Product</h4>
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    </div>
                                    <div class="modal-body">					
                                        <p>Are you sure you want to delete these Records?</p>
                                        <p class="text-warning"><small>This action cannot be undone.</small></p>
                                    </div>
                                    <div class="modal-footer">
                                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                        <input type="submit" class="btn btn-danger" value="Delete">
                                    </div>

                                </div>
                            </div>
                        </div>                       
                        <c:forEach items="${listPP}" var="o">
                            <tr>
                                <td>
                                    <span class="custom-checkbox">
                                        <input type="checkbox" name="checkbox" value="${o.getP_code()}">
                                        <label for="checkbox1"></label>
                                    </span>
                                </td>
                                <td>
                                    <img style="width: 100px; height: 100px" src="image/${o.getP_image()}">
                                </td>
                                <td>${o.getP_code()}</td>
                                <td>${o.getP_name()}</td>
                                <td>${o.getP_size()}</td>                               
                                <td>${o.getP_color()}</td>                               
                                <td>${o.getP_price()}</td>
                                <td>${o.getP_dateadd()}</td>
                                <td>
                                    <a href="showProduct?P_code=${o.getP_code()}"  class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                    <a href="delete?P_code=${o.getP_code()}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr>                          
                        </c:forEach>
                        <input type="hidden" id="checkValues" name="checkValues" value="">
                    </form>
                    </tbody>
                </table>
                <div style=" display: flex; justify-content: center; align-items: center;">                
                    <c:forEach begin="1" end="${endP}" var="i">
                        <a class="${tag==i?"active":""}" style="text-decoration: none;padding: 0.5rem 1rem;margin: 0.5rem;border: 1px solid #ccc;border-radius: 3px;" href="manager?index=${i}">${i}</a>
                    </c:forEach>
                </div>  
            </div>
            <a href="home"><button type="button" class="btn btn-primary">Quay về trang chủ</button></a>
        </div>
        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="add" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Thêm Sản Phẩm</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Code</label>
                                <input name="P_code" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tên Sản Phẩm</label>
                                <input name="P_name" type="text" class="form-control" required>
                            </div>               
                            <div class="form-group">
                                <label>Màu</label>
                                <input name="P_color" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Giá</label>
                                <input name="P_price" type="text" class="form-control" required>
                            </div> 
                            <div class="form-group">
                                <label>Size</label>
                                <input name="P_size" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Ảnh</label>
                                <input name="P_image" type="text" class="form-control" required>
                            </div>                       
                            <div class="form-group">
                                <label>Giảm giá</label>
                                <input name="P_discount" class="form-control" required></input>
                            </div>
                            <div class="form-group">
                                <label>Mô Tả Sản Phẩm</label>
                                <textarea name="P_description" class="form-control" required></textarea>
                            </div>
                            <div class="form-group">
                                <label>Ngày Thêm Sản Phẩm</label>
                                <input name="P_dateadd" type="date" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Loại Sản Phẩm</label>
                                <select name="Cate_id" class="form-select" aria-label="Default select example">
                                    <c:forEach items="${arr1}" var="o">
                                        <option value="${o.getCate_id()}">${o.getCate_name()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>

                    </form>
                </div>
            </div>
        </div>

        <!--         Edit Modal HTML 
                         Delete Modal HTML -->       
        <script>


            function getCheckValue() {
                const checkboxes = document.querySelectorAll('input[name="checkbox"]');

                var string = '';

                for (let i = 0; i < checkboxes.length; i++) {
                    if (checkboxes[i].checked) {
                        console.log(checkboxes[i].value);
                        string += checkboxes[i].value + '|';
                    }
                }
                checkValues.value = string;
            }
            ;
            const checkboxes = document.querySelectorAll('input[name="checkbox"]');
            for (let i = 0; i < checkboxes.length; i++) {
                checkboxes[i].addEventListener('click', getCheckValue);
            }
            console.log('Add L');
        </script>
        <script src="js/manager.js" type="text/javascript">
        </script>

    </body>
</html>