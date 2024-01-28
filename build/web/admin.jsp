<%-- 
    Document   : admin
    Created on : 02-Oct-2023, 14:16:44
    Author     : Shubham
--%>
<%@ page import="java.io.IOException"%>
<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Random"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin LOG</title>
        <link rel="shortcut icon" href="assets/img/favicon.png" type="image/png">
        <link rel="stylesheet" href="assets/css/admin.css">
        <link rel="stylesheet" href="assets/css/styles.css">
    </head>
    <body>
        <header class="header" id="header">
            <nav class="nav container">
                <a href="Home.jsp" class="nav__logo">Travel</a>
                <div class="nav__toggle" id="nav-toggle">
                    <i class="ri-function-line"></i>
                </div>
            </nav>
        </header>
        
        <div class="container bootstrap snippets bootdey" >
    <div class="row login-page" style="background-image: url(assets/img/admin.jpg); background-size: cover"> 
        <div class="col-md-4 col-lg-4 col-md-offset-4 col-lg-offset-4" style="margin-top: 50px"> 
    		<img src="https://bootdey.com/img/Content/avatar/avatar7.png" class="user-avatar img-thumbnail"> 
                <h1 class="new" style="color: white">ADMIN</h1> 
    		<form role="form" class="ng-pristine ng-valid"> 
    			<div class="form-content"> 
    				<div class="form-group"> 
                                    <input type="text" class="form-control input-underline input-lg" placeholder="Username" name="email"> 
    				</div> 
    				<div class="form-group"> 
                                    <input type="password" class="form-control input-underline input-lg" placeholder="Password" name="pass"> 
    				</div> 
    			</div> 
                    <button class="btn btn-info btn-lg" style="padding-bottom: 5px;padding-left: 10px; padding-right: 10px; padding-top: 5px" value="login" name="log">
                            Log in
    			</button> &nbsp; 
    			<!--<button type="submit" class="btn btn-info btn-lg" style="padding-bottom: 5px;padding-left: 10px; padding-right: 10px; padding-top: 5px">Register</button>-->
    		</form> 
                
                <% Class.forName("org.apache.derby.jdbc.ClientDriver"); %>
                                                        <%
                                                        
                                                             String action = request.getParameter("log");
                                                             
                                                                if ("login".equals(action)) {
                                                                   // Your JSP code to execute when the button is clicked
                                                                    
                                                                 String adm="root";     
                                                                 String adp="root"; 
                                                                 
                                                            String email=request.getParameter("email");
                                                            String pass=request.getParameter("pass");
                                                            
                                                            
                                                            
                                                            if(email.equalsIgnoreCase(adm) && pass.equalsIgnoreCase(adp)){
                                                                          response.sendRedirect("design.jsp");           
                                                                }
                                                            else{
                                                                response.sendRedirect("log.jsp");   
                                                            }}
                                                        %>
    	</div> 
    </div>
</div>
    </body>
</html>
