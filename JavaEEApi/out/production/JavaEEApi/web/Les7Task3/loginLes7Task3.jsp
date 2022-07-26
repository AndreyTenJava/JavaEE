<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
        <%@include file="../vender/head.jsp"%>
    </head>
    <body>
        <%@include file="../vender/navbarLes7Task3.jsp"%>
       <div class="container">
           <div class="row mt-5">
               <div class="col-6 mx-auto">
                   <%
                       String userError = request.getParameter("user_error");
                       if (userError != null) {
                   %>
                   <div class="alert alert-danger alert-dismissible fade show" role="alert">
                       Incorrect Login!
                       <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                   </div>
                   <%
                       }
                   %>
                   <%
                       String passwordError = request.getParameter("password_error");
                       if (passwordError != null) {
                   %>
                   <div class="alert alert-danger alert-dismissible fade show" role="alert">
                       Incorrect Password!
                       <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                   </div>
                   <%
                       }
                   %>
                   <form action="/loginLes7Task3" method="post">
                       <div class="mt-3 d-flex justify-content-between">
                           <label for="login_value" class="form-label col-2">Login</label>
                           <input id="login_value" name="login_value" type="text", class="form-control" placeholder="Insert login">
                       </div>
                       <div class="mt-3 d-flex justify-content-between">
                           <label for="password_value" class="form-label col-2">Login</label>
                           <input id="password_value" name="password_value" type="password", class="form-control" placeholder="Insert password">
                       </div>
                       <div class="mt-3" col-3>
                           <button class="btn-btn-secondary px-3">LOGIN</button>
                       </div>
                   </form>
               </div>
           </div>
       </div>

    </body>
</html>
