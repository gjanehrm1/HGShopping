<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:tiles="http://tiles.apache.org/tags-tiles">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<tiles:insertAttribute name="header" />
  	<tiles:insertAttribute name="body"/>
	<tiles:insertAttribute name="footer" />
</body>
</html>