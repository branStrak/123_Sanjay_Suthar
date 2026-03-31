<%-- 
    Document   : home
    Created on : 08-Mar-2026, 4:36:27 pm
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        
        <form method="post" action="ConvertServlet">
             Amount: <input type="text" name="amount">
             From :
        <select name="from">
            <option value="USD">USD</option>
            <option value="INR">INR</option>
            <option value="EUR">EUR</option>
        </select>
        To Currency:
        <select name="to">
            <option value="USD">USD</option>
            <option value="INR">INR</option>
            <option value="EUR">EUR</option>
        </select> 
        
        <br><br><!-- comment -->
        <input type="submit" value="COnvert">
            
        </form>
        
       
        
    </body>
</html>
