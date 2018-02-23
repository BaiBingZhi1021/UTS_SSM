<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/jsp/public/head.jspf" %>
</head>
<body>
<form method="POST" action="listCustomer">
<div>
Branch Code: <input type="text" name="genBrchCode" value="${pageCustomer.genBrchCode}"/> <input type="submit" value="Search" /></br>
</div>
</br>
</br>
<table width="100%" align="center" border="1" cellspacing="0">
		<tr><td>Customer No</td><td>Customer Name</td><td>Branch Code</td></tr>
		<c:forEach items="${customerList}" var="c" varStatus="st">
			<tr><td>${c.custNo}</td><td>${c.custLastName}</td><td>${c.genBrchCode}</td></tr>
		</c:forEach>
</table>
</form>
</body>
</html>