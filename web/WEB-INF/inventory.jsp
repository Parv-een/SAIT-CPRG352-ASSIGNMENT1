<%-- 
    Document   : inventory
    Created on : 11-Jul-2022, 10:33:58 AM
    Author     : parve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory Page</title>
    </head>
    <body>
        <h1>Home Inventory for ${message}</h1>
        <main>
            <h2>Add Item</h2>
            <form action="" method="post">
                <label>Category</label>
                <select name="homeInventory" id="Inventory">
                    <option value="bedroom">Bedroom</option>
                    <option value="garage">Garage</option>
                    <option value="kitchen">Kitchen</option>
                    <option value="living room ">Living Room</option>
                </select>
                <br>
                <label>Item Name:</label>
                <input type="text"  name="items" value="">
                <br>
                <label>Price:</label>
                <input type="text"  name="price" value="">
                <br>
                <input type="submit" name="action" value="Add">
            </form>
            <nav>
                <a href="login">Log Out</a>
            </nav>
        </main>
    </body>
</html>
