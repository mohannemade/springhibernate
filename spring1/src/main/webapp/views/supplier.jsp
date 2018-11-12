<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/spring1/addsupplier" method="POST">
	Supplier name: <input type="text" name="sName"/>
	Supplier address: <input type="text" name="sAddress"/>
	<input type="submit" value="Submit info"/>
</form>

</body>
</html>