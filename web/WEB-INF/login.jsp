<%-- 
    Document   : login
    Author     : parve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Inventory</title>
    </head>
    <body>
        <form action="" method="post">
        <h1>Home Inventory</h1>
        <main>
            <h2>Login</h2>
            <label>Username:</label>
            <input type="text" name="username" value="">
            <br>
            <label>Password:</label>
            <input type="password" name="password" value="">
            <br>
            <input type="submit" value="Submit" name="action">
        </main>
        </form>
        <p>${message}</p>
    </body>
</html>
