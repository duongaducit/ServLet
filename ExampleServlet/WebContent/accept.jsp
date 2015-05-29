<%@page import="com.ducdh.bkdn.bean.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accept</title>
</head>
<body>
	<div align="center">
		<% Order order = (Order)request.getSession().getAttribute("Order");
		%>
		<h2>Your Order</h2>
		Numer : <%= order.getNumberOfGif() %>
		<br>
		Address: <%= order.getAddReceive() %>
		<br>
		Money Ex: <%= order.getMoneyEx() %>
		<br>
		Fee: <%= order.getMoneyFee() %>
		<br>
		Total: <%= order.getMoneyEx()+order.getMoneyFee() %>
		<br>
		<a href="accpetOrder"><button>Accept</button> </a>
		<a href="index.jsp"><button>Cancel</button></a>
	</div>
</body>
</html>