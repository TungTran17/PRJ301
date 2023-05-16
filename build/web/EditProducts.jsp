<%-- 
    Document   : EditProducts
    Created on : Mar 15, 2023, 3:06:45 PM
    Author     : Tran Van Tung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                            <h2>Chỉnh Sửa<b>Sản Phẩm</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
            </div>
            <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="edit" method="post">
                            <div class="modal-header">						
                                <h4 class="modal-title">Chỉnh Sửa Sản Phẩm</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="modal-body">					
                                <div class="form-group">
                                    <label>Code</label>
                                    <input value="${ProductDetail.getP_code()}" name="P_code" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Tên Sản Phẩm</label>
                                    <input value="${ProductDetail.getP_name()}" name="P_name" type="text" class="form-control" required>
                                </div>               
                                <div class="form-group">
                                    <label>Màu</label>
                                    <input value="${ProductDetail.getP_color()}" name="P_color" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Giá</label>
                                    <input value="${ProductDetail.getP_price()}" name="P_price" type="text" class="form-control" required>
                                </div> 
                                <div class="form-group">
                                    <label>Size</label>
                                    <input value="${ProductDetail.getP_size()}" name="P_size" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Ảnh</label>
                                    <input value="${ProductDetail.getP_image()}" name="P_image" type="text" class="form-control" required>
                                </div>                       
                                <div class="form-group">
                                    <label>Giảm giá</label>
                                    <input value="${ProductDetail.getP_discount()}" name="P_discount" class="form-control" required></input>
                                </div>
                                <div class="form-group">
                                    <label>Mô Tả Sản Phẩm</label>
                                    <textarea name="P_description" class="form-control" required>${ProductDetail.getP_description()}"</textarea>
                                </div>
                                <div class="form-group">
                                    <label>Ngày Thêm Sản Phẩm</label>
                                    <input value="${ProductDetail.getP_dateadd()}" name="P_dateadd" type="date" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Loại Sản Phẩm</label>
                                    <select name="Cate_id" class="form-select" aria-label="Default select example">
                                        <c:forEach items="${arr1}" var="o">
                                            <option <c:if test="${ProductDetail.getCate_id() == o.getCate_id()}" >selected=""</c:if> value="${o.getCate_id()}">${o.getCate_name()}</option>
                                        </c:forEach>
                                    </select>
                                </div>				
                            </div>
                            <div class="modal-footer">
                                <input onclick="window.location.href = 'manager'" type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                <input type="submit" class="btn btn-info" value="Save">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>
