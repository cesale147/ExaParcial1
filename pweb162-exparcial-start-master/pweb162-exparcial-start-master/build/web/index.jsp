<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Plataforma Web - Examen Parcial</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    
    <h1>INICIO DE SESION</h1>        
    <p><i>${message}</i></p> 
    <form action="libros" method="post"> 
        <input type="hidden" name="action" value="login">
        <label class="pad_top">Nombre:</label>
        <input type="text" name="user" value=""><br>
        <label class="pad_top">Contraseña:</label>
        <input type="password" name="pass" value=""><br> 
        <input type="submit" value="Enviar" class="margin_left">
        
    </form>     
    
</body>
</html>