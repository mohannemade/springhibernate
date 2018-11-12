<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewpx`ort" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="//cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
  <script src="//cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
  <script src="//https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
  <script type="text/javascript" >
  $(document).ready(function() {
	  $.ajax({
		  url: '/spring1/products',
		  method: 'get',
		  dataType: 'json',
		  success: function (data) {
			  $('#myTable').dataTable({
				  data: data,
				  columns: [
					  { 'data': 'pId' },
					  { 'data': 'pName'},
					  { 'data': 'pCost'},
				  ]
			  });
		  }
		  
	  });
	  
  });
  </script>
<title>Insert title here</title>
</head>
<body>
<table id="myTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
<thead>
<tr>
	<th>Product Id</th>	
	<th>Product Name</th>
	<th>Product Cost</th>
</tr>
</thead>
</table>
</body>
</html>