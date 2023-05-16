<%-- 
    Document   : Home
    Created on : Mar 7, 2023, 12:40:19 AM
    Author     : Tran Van Tung
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
            <div class="container" style="margin-top:20px">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb" style="background-color: #343a40">
                                <li class="breadcrumb-item" ><a href="home" style="color: white; font-weight: bold;" >Trang chủ</a></li>
                                <li class="breadcrumb-item"><a href="#" style="color: white; font-weight: 500;" >Loại sản phẩm</a></li>
                                <li class="breadcrumb-item active" aria-current="#" style="color: white;">Danh mục sản phẩm</li>


                            </ol>
                        </nav>
                    </div>
                    <a href="sxgiamdan"> P_giam
                        <a href="sxtangdan"> P_tang
                            </div>
                            </div>
                            <div class="container">
                                <div class="row">
                                <jsp:include page="ContentLeft.jsp"></jsp:include>
                                    <div class="col-sm-9">
                                        <div class="row" >
                                        <c:forEach items="${listPP}" var="o">
                                            <div class="col-12 col-md-6 col-lg-4" style="padding:  10px 10px 10px 10px">
                                                <div class="card" >                                  
                                                    <img class="card-img-top" src="image/${o.getP_image()}" alt="Card image cap" >
                                                    <div class="card-body">
                                                        <h4 class="card-title show_txt" style="text-align: center; font-family: Impact Charcoal; font-style: italic;"><a style="color: #000" href="productdetail?P_code=${o.getP_code()}" title="View Product">${o.getP_name()}</a></h4>
                                                        <p class="card-text show_txt" style="text-align: center">Size: ${o.getP_size()}
                                                        </p>
                                                        <div class="row">
                                                            <div class="col">
                                                                <p class="btn btn-danger btn-block"> ${o.getP_price()} vnd</p>
                                                            </div>
                                                            <div class="col">
                                                                <a href="#" class="btn btn-success btn-block">Thêm vào giỏ hàng</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div style=" display: flex; justify-content: center; align-items: center;">                
                            <c:forEach begin="1" end="${endP}" var="i">
                                <a class="${tag==i?"active":""}" style="text-decoration: none;padding: 0.5rem 1rem;margin: 0.5rem;border: 1px solid #ccc;border-radius: 3px;" href="home?index=${i}">${i}</a>
                            </c:forEach>
                        </div>    
                        <jsp:include page="Footer.jsp"></jsp:include>
                        </body>
                        </html>


