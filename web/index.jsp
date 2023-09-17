<%-- 
    Document   : index
    Created on : 16 feb. 2023, 08:45:05
    Author     : ESTUDIANTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo JSP</h1>
        <form action="MiServlet" method="post">
            <label>Digite usuario:</label>
            <input type="email" name="txt_usuario" placeholder="ejemple@gmail.com" required=""/>
            <label>Clave de acceso:</label>
            <input type="password" name="txt_clave" required=""/>
            <input type="submit" name="btn_aceptar" value="Aceptar"/>
            <input type="reset" name="btn_reset" value="Limpiar"/>
        </form>
    </body>
</html>
