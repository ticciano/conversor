<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//System.out.println(request.getAttribute("result"));
		String result = (String) request.getAttribute("result");
		String celsius = (String) request.getAttribute("celsius");
	
	%>
	
		<h1>Resultado</h1>
		<h2><%= celsius %>C representam  <%= result %>F</h2>
		<a href="/conversor/index.html">início</a>
	
</body>
</html>