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

<title>Add Order</title>
</head>
<body>
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<form action="calFee" role="form">
				<div class="form-group">
					<label for="idOrder">Id Order</label> <input type="text"
						class="form-control" name="idOrder">
				</div>
				<div class="form-group">
					<label for="idCustomer">Id Customer</label> <input type="text"
						class="form-control" name="idCustomer">
				</div>
				<div class="form-group">
					<label for="day">Time</label> <select name="daySend" id="day">
						<option value="29" />29
						<option value="30" />30
						<option value="31" />31
					</select> <input name="hoursSend" type="text">
				</div>
				<div class="form-group">
					<label for="numbers">Numbers</label> <input type="text"
						class="form-control" name="numberGif" id = "numbers">
				</div>
				<div class="form-group">
					<label for="address">Adress</label> <input type="text"
						class="form-control" name="address">
						<select name="mapAddress" id="address">
						<option value="Hoa Khanh" />Hoa Khanh
						<option value="Cam Le" />Cam Le
						<option value="Thanh Khe" />Thanh Khe
						<option value="Hai Chau" />Hai Chau
					</select>
				</div>
				<button type="submit" class="btn btn-success">Submit</button>
			</form>
		</div>
		<div class="col-sm-4"></div>
	</div>
</body>
</html>