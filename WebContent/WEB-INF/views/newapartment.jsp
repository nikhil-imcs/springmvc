<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
	<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Apartment</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<section id="navbar"> 
	<nav
		class="navbar navbar-expand-lg navbar-dark bg-dark navbar-full"
		id="nav-main"> <a class="navbar-brand" href="${pageContext.request.contextPath}/">The Apartments</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse " id="navbarSupportedContent">
		<ul class="navbar-nav ml-auto ">
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/signup">Sign up
			</a></li>
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/signin">Sign in</a></li>
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
			</li>	
		</ul>
	</div>
	</nav> 
	</section>
	<div class="container">
	<h1>Add New Apartment</h1>
	<hr>
	<form:form method="post" modelAttribute="apartment">
	
	<div class="form-group">
	<form:label for="title" path="title">Title</form:label>
	<form:input path="title" id="title" cssClass="form-control" type="text"/>
	</div>
	<div class="form-group">
	<form:label for="address" path="address">Address</form:label>
	<form:input path="address" id="address" cssClass="form-control" type="text"/>
	</div>
	<div class="form-group">
	<form:label for="imagepath" path="imagepath">Image Path</form:label>
	<form:input path="imagepath" id="imagepath" cssClass="form-control" type="text"/>
	</div>
	<div class="form-group">
	<form:label for="rent" path="rent">rent</form:label>
	<form:input path="rent" id="rent" cssClass="form-control" type="text"/>
	</div>
	<div class="form-group">
	<form:label for="description" path="description">Description</form:label>
	<form:textarea path="description" id="description" cssClass="form-control"/>
	</div>
	
	<br>
	<button type="submit" class="btn btn-success">Add</button>
	
	
	</form:form>
	
	
	</div>

	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>