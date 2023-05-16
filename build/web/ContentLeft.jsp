<%-- 
    Document   : Left
    Created on : March 1, 2023, 7:42:21 PM
    Author     : Tran Van Tung
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div class="card-header bg-primary text-white text-uppercase" style="background-color: #ff9f1a; text-align: center"><i class="fa fa-list"></i>Danh sách sản phẩm</div>
        <ul class="list-group category_block">
            <c:forEach items="${arr1}" var="o">
                <li class="list-group-item text-white ${choose == o.getCate_id() ? "active" : ""}" style="text-align: center; font-family: Tahoma Geneva; font-weight: bold; font-size: 20px"><a href="category?Cate_id=${o.getCate_id()}">${o.getCate_name()}</a></li>
                </c:forEach>

        </ul>
    </div>
    <div class="card bg-light mb-3">
        <div class="card-header bg-success text-white text-uppercase" style="text-align: center">Sản phảm mới nhất</div>
        <div class="card-body">
            <img class="img-fluid" src="image/${lp.getP_image()}" />
            <h5 class="card-title" style="text-align: center; font-family: Impact Charcoal; font-style: italic; font-weight: bold;">${lp.getP_name()}</h5>
            <p class="card-text" style="font-style: italic; text-align: center">${lp.getP_description()}</p>
            <p style="text-align: center">Size: ${lp.getP_size()}</p>
            <p class="bloc_left_price" style="text-align: center">${lp.getP_price()} vnd</p>
        </div>
    </div>
</div>