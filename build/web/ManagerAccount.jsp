<%-- 
    Document   : ManagerAccount
    Created on : Mar 15, 2023, 10:58:44 PM
    Author     : Tran Van Tung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Quản lý tài khoản</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
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
                            <h2>Quản Lý <b>Tài Khoản</b></h2>
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
                            <th>ID</th>
                            <th>Tài khoản</th>
                            <th>Mất khẩu</th>
                            <th>Tên</th>
                            <th>Ngày đăng kí</th>
                            <th>SĐT</th>

                            <th>Địa chỉ</th>
                            <th>Admin</th>
                            <th>Seller</th>
                            <th style="color: red">Xóa</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listPAcc}" var="o">
                            <tr>
                                <td>
                                    <span class="custom-checkbox">
                                        <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                        <label for="checkbox1"></label>
                                    </span>
                                </td>
                                <td>${o.getA_id()}</td>
                                <td>${o.getAccount()}</td>
                                <td>${o.getPassword()}</td>
                                <td>${o.getA_name()}</td>                               
                                <td>${o.getA_dob()}</td>                               
                                <td>${o.getA_phone()}</td>

                                <td>${o.getA_address()}</td>
                                <td>${o.getIs_admin()}</td>
                                <td>${o.getIs_seller()}</td>
                                <td>                                   
                                    <a href="deleteaccount?A_id=${o.getA_id()}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <div style=" display: flex; justify-content: center; align-items: center;">                
                    <c:forEach begin="1" end="${endP}" var="i">
                        <a class="${tag==i?"active":""}" style="text-decoration: none;padding: 0.5rem 1rem;margin: 0.5rem;border: 1px solid #ccc;border-radius: 3px;" href="manageraccount?index=${i}">${i}</a>
                    </c:forEach>
                </div>    
            </div>
            <a href="home"><button type="button" class="btn btn-primary">Quay về trang chủ</button></a>
        </div>
        <script src="js/manager.js" type="text/javascript"></script>
    </body>

</html>
