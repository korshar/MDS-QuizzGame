<%-- 
    Document   : Admin View
    Created on : 15/jan/2017, 21:34:32
    Author     : jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="admin" scope="request" class="Servelet.AdminController" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Administrador!</h1>
        Pergunta ativa: <input type="text" name="Pergunta Ativa" value="" />
        <form name="RadioButtonList" action="AdminView.jsp" method="POST">
        Pergunta 1: <input type="radio" name="Pergunta" value="1" checked="true"/>
        Pergunta 2: <input type="radio" name="Pergunta" value="2" />
        Pergunta 3: <input type="radio" name="Pergunta" value="3" />
        Pergunta 4: <input type="radio" name="Pergunta" value="4" />
        Pergunta 5: <input type="radio" name="Pergunta" value="5" />
        <input type="submit" value="Submeter" name="AtivarPergunta" />
        
        </form>


    </body>
</html>
