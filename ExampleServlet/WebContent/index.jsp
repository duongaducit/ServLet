<%@page import="com.ducdh.bkdn.bo.ServiceBo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ducdh.bkdn.bean.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


<title>Manager</title>
</head>
<body>
	<h2 align="center">All Order</h2>
	<div align="center">
		<table class="table table-bordered">
			<tr style="background-color: #00ff00">
				<th>ID Order</th>
				<th>ID Cus</th>
				<th>Address Receive</th>
				<th>Time</th>
				<th>Money Ex</th>
				<th>Chirld</th>
				<th>Fee</th>
				<th>Sended</th>
				<th>Done</th>
			</tr>
			<tbody>
				<%
					ArrayList<Order> listOrder = new ArrayList<Order>();
					ArrayList<Customer> listCustomer = new ArrayList<Customer>();
					ServiceBo service = new ServiceBo();
					listOrder = (ArrayList<Order>) request.getSession().getAttribute(
							"listOrder");
					if (listOrder == null) {
						listOrder = service.initOrder();
						request.getSession().setAttribute("listOrder", listOrder);
						request.getSession().setAttribute("listCustomer", listCustomer);
					}
					for (int i = 0; i < listOrder.size(); i++) {
				%>

				<tr
					<%boolean condition1 = (service.countTime(listOrder.get(i)
						.getTimeReceive()) < 0);
				boolean condition2 = (service.countTime(listOrder.get(i)
						.getTimeReceive()) < 30);

				if (listOrder.get(i).isStatusOrder()) {%>
					class="success" <%} else if (condition1) {%>
					style="background-color: red" <%} else if (condition2) {%>
					style="background-color: green;" <%}%>>
					<td><%=listOrder.get(i).getIdOrder()%></td>
					<td><%=listOrder.get(i).getIdCustomer()%></td>
					<td><%=listOrder.get(i).getAddReceive()%></td>
					<td><%=listOrder.get(i).getTimeReceive()%></td>
					<td><%=listOrder.get(i).getMoneyEx()%></td>
					<td><%=listOrder.get(i).getNumberOfGif()%></td>
					<td><%=listOrder.get(i).getMoneyFee()%></td>
					<td><input type="checkbox"
						<%if (listOrder.get(i).isStatusOrder()) {%> checked="true" <%}%>></td>
					<td><a
						href="changeStatus?idOrder=<%=listOrder.get(i).getIdOrder()%>">
							<button>Done</button>
					</a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>

	</div>
	<div class="row">
		<div class="col-sm-4">
			<a href="addCustomer.jsp">
				<button class="btn btn-success">Add Customer</button>
			</a>
		</div>
		<div class="col-sm-4">
			<form class="form-inline" role="form">
				<div class="form-group">
					<input type="text" class="form-control" name="keyword">
				</div>
				<button type="submit" class="btn btn-success">Submit</button>
			</form>
		</div>
		<div class="col-sm-4">
			<a href="addOrder.jsp">
				<button class="btn btn-success">Add Order</button>
			</a>
		</div>
	</div>
</body>
</html>