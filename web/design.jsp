<%-- 
    Document   : design
    Created on : 02-Oct-2023, 18:28:32
    Author     : Shubham
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
         <link rel="shortcut icon" href="assets/img/favicon.png" type="image/png">
        <link rel="stylesheet" href="assets/css/admin.css">
        <link rel="stylesheet" href="assets/css/styles.css">
        <link rel="stylesheet" href="assets/css/design.css">
        <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
    </head>
    <body style="background-image: url(assets/img/des.jpg); background-size: cover">
        
        <header class="header" id="header">
            <nav class="nav container">
                <a href="Home.jsp" class="nav__logo">Travel</a>
                <div class="nav__toggle" id="nav-toggle">
                    <i class="ri-function-line"></i>
                </div>
            </nav>
        </header>
        
        
        <div class="container bootstrap snippets bootdey" style="margin-top: 100px">
    <div class="row">
        <div class="col-lg-12" style="display: flex;
    justify-content: center;">
            <div class="main-box no-header clearfix" style="display: inline-block;
  background-color: whitesmoke; /* For demonstration */
  padding: 10px; /* For demonstration */
  text-align: center;
  vertical-align: middle;">
                <span class="main-box-body clearfix" >
                    <div class="table-responsive" style="display: flex;align-items: center;justify-content: center; height: 100%;">
                        <table class="table user-list" >
                            
                            <thead>
                                <tr>
                                <th colspan="5">CLIENT DB</th>
                                </tr><br><br>
                                <tr>
                                <th><span>ID</span></th>
                                <th><span>Name</span></th>
                                <th><span>Email</span></th>
                                <th><span>Phone No.</span></th>
                                <th><span>Destination</span></th>
                                <th>&nbsp;</th>
                                </tr>
                            </thead>
                            
                            <%
            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/javap", "root", "root");
                 Statement st=con.createStatement();
                 
                 String str="select * from persons";
                 
                 ResultSet rs=st.executeQuery(str);
                 
                 while(rs.next()){
                   %>
                            
                            
                                <tr>
                                    <td><%=rs.getInt("id")%></td>
                       <td><%=rs.getString("name") %></td>
                       <td><%=rs.getString("email") %></td>
                       <td><%=rs.getString("phone") %></td>
                       <td><%=rs.getString("destination") %></td>
                                </tr>
                                
                                <%
                 }
            }
            catch(Exception e){
                
            }
        %> 
                        </table>
                    </div>
                </span>
            </div>
        </div>
    </div>
</div>
                        
                        
                        
                        
                        
                            
<div class="container bootstrap snippets bootdey">
    <div class="row">
        <div class="col-lg-12" style="display: flex;
    justify-content: center;">
            <div class="main-box no-header clearfix" style="display: inline-block;
  background-color: whitesmoke; /* For demonstration */
  padding: 10px; /* For demonstration */
  text-align: center;
  vertical-align: middle;">
                <span class="main-box-body clearfix" >
                    <div class="table-responsive" style="display: flex;align-items: center;justify-content: center; height: 100%;">
                        <table class="table user-list" >
                            
                            <thead>
                                <tr>
                                <th colspan="1">NewsLetter Subscribers DB</th>
                                </tr><br><br>
                                <tr>
                                <th><span>EMAIL</span></th>
                                
                                <th>&nbsp;</th>
                                </tr>
                            </thead>
                            
                            <%
            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/javap", "root", "root");
                 Statement st=con.createStatement();
                 
                 String str="select * from subscribers";
                 
                 ResultSet rs=st.executeQuery(str);
                 
                 while(rs.next()){
                   %>
                            
                            
                                <tr>
                       <td><%=rs.getString("sub_email") %></td>
                                </tr>
                                
                                <%
                 }
            }
            catch(Exception e){
                
            }
        %> 
                        </table>
                    </div>
                </span>
            </div>
        </div>
    </div>
</div>
    </body>
</html>
