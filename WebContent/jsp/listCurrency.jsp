<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<%@ include file="/jsp/public/head.jspf" %>
</head>
<body>
<table width="100%" align="center" border="1" cellspacing="0">
	<tr><td>Currency Code</td><td>Currency Name</td></tr>
	<c:forEach items="${currencyList}" var="c" varStatus="st">
		<tr><td>${c.genCcyCode}</td><td>${c.genCcyName}</td></tr>
	</c:forEach>
</table>
</body>
</html>