<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
         pageEncoding="ISO-8859-1" import="java.util.*" 
         import="com.abc.products.Product" 
         import="com.abc.file.FileOperations" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>B-Mobile Online Shopping</title>

        <!-- Bootstrap Core CSS Uses relative paths from jsp  -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${pageContext.request.contextPath}css/heroic-features.css" rel="stylesheet">



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
                    <a class="navbar-brand" href="#">
                        <span class="lead">B-Mobile</span>
                    </a>
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

        <!-- Page Content -->
        <div class="container">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="images/banner2.jpg" alt="...">
                        <div class="carousel-caption">
                        </div>
                    </div>
                    <div class="item">
                        <img src="images/banner1.jpg" alt="...">
                        <div class="carousel-caption">

                        </div>

                    </div>
                    <div class="item">
                        <img src="images/banner3.jpg" alt="...">
                        <div class="carousel-caption">

                        </div>

                    </div>

                    <!-- Controls -->
                    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
            <div class="container">

                <!-- Jumbotron Header -->
                <header class="jumbotron" style="text-align:center">

                    <h1>B-Mobile</h1>
                    <p style="text-align:center;">Our Greatest pleasure is in giving you products with greatest quality.</p>
                    <p><a class="btn btn-primary btn-large">Contact Us</a>
                    </p>
                </header>

                <hr>

                <!-- Title -->            


                <!-- /.row -->

                <!-- Page Features -->
                <div class="col-md-3">
                    <!-- Phone brands -->
                    <div class="list-group">
                        <a href="#" class="list-group-item active">Latest</a>
                        <% ArrayList<String> manufList = (ArrayList) request.getAttribute("manufacturers"); %>
                        <% for(String manuf :manufList ){ %>                                               
                        <a href="#" class="list-group-item"><%=manuf.toUpperCase() %></a>
                        <% } %>

                    </div>

                    <div class="row">
                        <span>Search Available items</span>
                        <form class="form-inline">
                            <input type="text" class="form-control col-md-9" placeholder="find">
                            <input type="submit" value="Find" class="btn btn-primary col-md-2">
                        </form>
                    </div>

                    <!-- left column end-->
                </div>
                <div class="row text-left col-md-9">

                    <div class="row">
                        <div class="col-lg-12">
                            <h3>Latest products available</h3>
                        </div>
                    </div>

                    <div id="products_list" class="row">
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
                                    <a href="${pageContext.request.contextPath}/purchase.jsp" class="btn btn-primary">Order Now</a>
                                </div> 
                            </div> 
                        </div> 
                        <% }%> 
                    </div>

                </div>
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
        <script src="${pageContext.request.contextPath}/js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>

</html>
