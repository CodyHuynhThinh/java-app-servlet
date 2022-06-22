<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang chủ" /></title>
<!-- Bootstrap core CSS -->
<link href="<c:url value='/template/web/css/bootstrap.css' />" rel="stylesheet" type="text/css" media="all" />

<!-- Add custom CSS here -->
<link href="<c:url value='/template/web/css/shop-homepage.css' />" rel="stylesheet" media="all" />
</head>
<body>
	<!-- Header -->
	<%@ include file="/common/web/header.jsp"%>
	<!-- Header -->
	
	<div class="container">
		<dec:body />
	</div>
	
	<!-- Footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- Footer -->
	
	<!-- JavaScript -->
	<script src="/template/web/js/jquery-1.10.2.js"></script>
	<script src="/template/web/js/bootstrap.js"></script>
</body>
</html>