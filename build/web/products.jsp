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

<div class="col-sm-4 col-lg-4 col-md-4">
    <div class="thumbnail"> 
        <img class="thumbnail"  src="${pageContext.request.contextPath}/images/<%=product.getImage()%>" alt="">
        <div class="caption">
            <h4 class="pull-right">$<%=product.getPrice()%></h4>
            <h4><a href="#"><%=product.getName()%></a> </h4> 
            <p> <%=product.getDescription()%> </p>
        </div> 
        <div class="ratings"> 
            <a href="${pageContext.request.contextPath}/PurchaseProductServlet?id=<%=product.getId()%>" class="btn btn-primary">Order Now</a>
        </div> 
    </div> 
</div> 
<% }%> 
</div>
