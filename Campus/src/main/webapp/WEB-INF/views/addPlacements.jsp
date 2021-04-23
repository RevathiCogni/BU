<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Campus Recruitment System</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="main">
<header>
<jsp:include page="header.jsp"></jsp:include>
</header>
<div >
		<h1 class="heading">Campus Recruitment System</h1>
</div>
<div>
		<h3>Add Placements:</h3>
      <form action = "addPlacements" method = "post"  enctype="multipart/form-data">
      	 <label for="name">Company Name:</label><input name="name" id="name"/>
      	 <label for="dept">Department Name:</label><input name="dept" id="dept"/>
        <input  name="files" id="image" type="file" />
        <input name="files" id="file" type="file"/>
        <input name="files" id="vedio" type="file" />
        <input type="submit" name="submit"/>
      </form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>


   
     