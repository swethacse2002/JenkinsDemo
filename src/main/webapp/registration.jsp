<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Carz.com</h2>
	<form action="CarzController" method="post">
		<table>
			<tr>
				<th>CarNo</th><td><input type="text" name="CarNo" required/></td>
			</tr>
			<tr>
				<th>Manufacture</th><td><input type="text" name="Manufacture" required/></td>
			</tr>
			<tr>
				<th>Model</th><td><input type="text" name="Model" required/></td>
			</tr>
			<tr>
				<th>KmsRan</th><td><input type="text" name="KmsRan" required/></td>
			</tr>
			<tr>
				<th>Price Expected</th><td><input type="text" name="PriceExpected" required/></td>
			</tr>
			<tr>
				<th>No of Owners</th><td><input type="text" name="NoOfOwners" required/></td>
			</tr>
			<tr>
			<td><center><button type="submit" value="registerCarz" name="carz_button">Register</button></center></td>
			</tr>
		</table>
	</form>
</body>
