<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
  <%@ include file="/jsp/public/head.jspf" %>
  <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
  <link rel="stylesheet" href="${uts}/jsp/css/style.css" type="text/css">
</head>

<body>
  <div style="text-align:center;clear:both">
</div>

<nav>
  <ul class="main">
    <li>
      <a href="#">Home</a>
      <ul class="drop menu1">
        <li><a href="<c:url value="/listCustomer" />">Customer</a></li>
        <li><a href="#">news</a></li>
        <li><a href="#">contact</a></li>
        <li><a href="#">about</a></li>
      </ul>
    </li>
    <li><a href="#">news</a>
      <ul class="drop menu2">
        <li><a href="#">Home</a></li>
        <li><a href="#">news</a></li>
        <li><a href="#">contact</a></li>
        <li><a href="#">about</a></li>
      </ul>
    </li>
    <li><a href="#">contact</a>
      <ul class="drop menu3">
        <li><a href="#">Home</a></li>
        <li><a href="#">news</a></li>
        <li><a href="#">contact</a></li>
        <li><a href="#">about</a></li>
      </ul>
    </li>
    <li><a href="#">works</a>
      <ul class="drop menu4">
        <li><a href="#">Home</a></li>
        <li><a href="#">news</a></li>
        <li><a href="#">contact</a></li>
        <li><a href="#">about</a></li>
      </ul>
    </li>
    <li><a href="#">team</a>
      <ul class="drop menu5">
        <li><a href="#">Home</a></li>
        <li><a href="#">news</a></li>
        <li><a href="#">contact</a></li>
        <li><a href="#">about</a></li>
      </ul>
    </li>
    <li><a href="#">about</a>
      <ul class="drop menu6">
        <li><a href="#">Home</a></li>
        <li><a href="#">news</a></li>
        <li><a href="#">contact</a></li>
        <li><a href="#">about</a></li>
      </ul>
    </li>
  </ul>
</nav>
</body>
</html>
