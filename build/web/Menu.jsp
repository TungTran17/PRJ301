<%-- 
    Document   : Menu
    Created on : March 4, 2023, 14:42:21 PM
    Author     : Tran Van Tung
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="https://cdn.jsdelivr.net/particles.js/2.0.0/particles.min.js"></script> 
<link href="https://fonts.googleapis.com/css?family=Dancing+Script|Itim|Lobster|Montserrat:500|Noto+Serif|Nunito|Patrick+Hand|Roboto+Mono:100,100i,300,300i,400,400i,500,500i,700,700i|Roboto+Slab|Saira" rel="stylesheet">
<!--begin of menu-->
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <div>
            <a href="home"/><img style="width: 120px; border-radius: 50%; padding: 10px;float: left;" src="image\logo.jpg" alt="logo"/></a>
        </div>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <div style="background-color: #cccccc; display: flex; justify-content: center;margin: 0 auto;border: 2px solid #ccc; border-radius: 10px;">
                <ul class="navbar-nav m-auto" style="font-family: 'Roboto Mono', monospace; font-size: 16px; font-weight: bold;">
                    <c:if test="${sessionScope.acc.is_admin == 1}">
                        <li class="nav-item">
                            <a class="nav-link" href="manageraccount" style="color: black">Tài Khoản</a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.acc.is_seller == 1}">
                        <li class="nav-item">
                            <a class="nav-link" href="manager" style="color: black">Sản Phẩm</a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.acc != null}">
                        <li class="nav-item">                        
                            <a class="nav-link" href="logout" style="color: black"><i class='fa fa-sign-out fa-2x' style='color:#161c12'> Đăng xuất</i></a>
                        </li>                      
                        <li class="nav-item">
                            <a class="nav-link" href="#" style="color: black"></a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.acc == null}">
                        <li class="nav-item">
                            <a class="nav-link" href="Login.jsp" style="color: black;"/><i class='fa fa-sign-in fa-2x' style='color:#161c12'> Đăng nhập</i></a>
                        </li>
                    </c:if>

                </ul>
            </div>
            <form action="search" method="post" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input value="${textsearch}" name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Tìm kiếm">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="show">
                    <i class="fa fa-shopping-cart"></i> Giỏ hàng
                    <span class="badge badge-light">3</span>
                </a>
            </form>
        </div>
    </div>
</nav>
<c:if test="${sessionScope.acc != null}">
    <section class="jumbotron text-center"style="padding: 15px">
        <div class="container" >
            <h1 class="jumbotron-heading">Xin chào <br> <a href="showeditinfo?A_id=${sessionScope.acc.getA_id()}" style="font-family:monospace; font-weight: bold;font-family: 'Noto Serif', serif; color: dimgrey; font-size: 20px; font-style: italic">${sessionScope.acc.getA_name()}</a></h1>
        </div>
    </section>
</c:if>
<!--end of menu-->
