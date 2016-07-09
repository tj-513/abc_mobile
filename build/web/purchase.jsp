<%@page import="com.abc.products.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>B-Mobile Online Shopping</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/heroic-features.css" rel="stylesheet">


    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="HomeServlet"><span class="lead">B-Mobile</span></a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="#">About</a>
                        </li>
                        <li>
                            <a href="#">Services</a>
                        </li>
                        <li>
                            <a href="#">Contact</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->

        </nav>
        <div class="row" style="padding-left:10px">
            <ol class="breadcrumb">
                <li><a href="index.html">Home</a></li>
                <li><a href="#">Purchase</a></li>

            </ol>
        </div>
        <!-- Page Content  h -->
        <div class="container">
            <div class="row jumbotron" id="main_area" style="background-color:#CCC">
                <!-- Jumbotron Header -->
                <!-- header -->
                <div class="row">
                    <h2 style="padding-left: 5px;">${product.name}</h2>
                    <h3 style="padding-left: 5px;"> Price:Rs.${product.price}</h3>
                </div>
                <div class="row">
                <div class="col-md-4 pull-left">
                    <img src="images/${product.image}" class="img-thumbnail thumbnail text-left pull-left" style="border:3px grey outset "/>
                </div>
                <div class="col-md-8">
                    <h4>${product.description}</h4>
                </div>
                </div>

                <div class="row" id="input">
                    <form class="form-horizontal" method="POST" >
                        <div class="form-group">
                            <label for="inputEmail1" class="col-sm-2 control-label">Full Name</label>
                            <div class="col-sm-10 col-md-5">
                                <input type="text" name="name" class="form-control" id="inputEmail1" placeholder="John Doe">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
                            <div class="col-sm-10 col-md-5">
                                <input type="email" name="email" class="form-control" id="inputEmail3" placeholder="Email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Your Telephone</label>
                            <div class="col-sm-10 col-md-5">
                                <input type="tel" name="phone" class="form-control" id="inputPassword3" placeholder="Telephone">
                            </div>
                        </div>
                       
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" onclick="$('#input').load('Success')" class="btn btn-danger">Buy Now</button>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
            <hr>

            <!-- Title -->            


            <!-- /.row -->

            <!-- Page Features -->

            <!-- left column end-->
        </div>
        <div class="row text-left" style="padding: 5%">

            <div class="row">
                <div class="col-lg-12">
                    <h3 class="text-center">Related Products</h3>
                </div>
            </div>
            <% ArrayList<Product> products = (ArrayList) request.getAttribute("products"); %>
            <%for (Product p : products) {%>
            <div class="text-left col-md-3 col-sm-6">
                <div class="img-thumbnail thumbnail img-rounded">
                    <a href="PurchaseProductServlet?id=<%=p.getId()%>" >
                        <img src="images/<%=p.getImage()%>" alt=""/>
                    </a>
                </div>
                <div class="row text-center"> <%=p.getName()%></div>
            </div>

            <%}%>

            <!-- /.row -->
        </div>
        <hr>

        <!-- Footer -->

        <footer>
            <div class="row" style="background-color:#999">
                <div class="col-lg-12">
                    <p>Copyright &copy; B-Mobile.com 2014</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
