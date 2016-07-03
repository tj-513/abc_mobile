<%-- 
    Document   : products
    Created on : Jul 3, 2016, 2:16:09 PM
    Author     : TJR
    
    A page created for dynamically loading content into products list of home.jsp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.abc.products.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% ArrayList<Product> productList = (ArrayList) request.getAttribute("products"); %> 

<% for (Product product : productList) {%> 

<div class="col-sm-6 col-lg-3 col-md-4">
    <div class="thumbnail"  style="padding:5%"> 
        <img class="thumbnail"  src="${pageContext.request.contextPath}/images/<%=product.getImage()%>" alt="">
        <div class="caption">
            <div class="row">
                <h4 class="pull-left text-primary"><%=product.getName()%> </h4> 
            </div>
            <div class="row">
                <h4 class="pull-left">Rs.<%=product.getPrice()%></h4>
            </div>
            <p> <%=product.getDescription()%> </p>
        </div> 
        <div class="ratings text-center"> 
            <a href="${pageContext.request.contextPath}/PurchaseProductServlet?id=<%=product.getId()%>" class="btn btn-primary text-center">Order Now</a>
        </div> 
    </div> 
</div> 
<% }%> 
</div>
