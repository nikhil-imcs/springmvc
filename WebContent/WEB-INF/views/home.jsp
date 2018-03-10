<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
	<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
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
		<c:if test="${sessionScope.username!=null}">
		<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/">Logged User: ${username}</a></li>
		</c:if>
		<c:if test="${sessionScope.username==null}">
		<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/signup">Signup</a></li>
		</c:if>
		<c:if test="${sessionScope.username==null}">
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/signin">Signin</a></li>
		</c:if>
		<c:if test="${sessionScope.username!=null}">
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a></li>	
		</c:if>
		</ul>
	</div>
	</nav> 
	</section>
	<section id="welcome-cover">
	<div class="container">
	<div class="jumbotron">
	<h1>Welcome to The Apartments..</h1>
	<p>View your next Dream Home</p>
	<c:if test="${sessionScope.username != null}">
    <p>Hi ${username}, now you can add new apartments ...</p>
	<br>
	<a href="${pageContext.request.contextPath}/newapartment"><button type="button" class="btn btn-primary">Add new Apartment</button></a>
	</c:if>
	</div>
	<div class="row">
	<c:forEach items="${apartments}" var="apartment">
					<div class="col-md-4">
						<div class="card" style="width: 20rem;margin:10px 10px;">
							<img class="card-img-top" src="${apartment.imagepath}" alt="${apartment.title}">
							<div class="card-body">
								<h4 class="card-title">${apartment.title}</h4>
								<p class="card-text">${apartment.address}</p>
								<a href="${pageContext.request.contextPath}/apartments/${apartment.id}">
								<button class="btn btn-primary">View Details</button></a>
							</div>
						</div>
					</div>
				</c:forEach>
	</div>
	
	
	</div>
	
	</section>

	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>