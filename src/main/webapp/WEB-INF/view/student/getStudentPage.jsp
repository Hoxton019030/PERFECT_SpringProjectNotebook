<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>搜尋學生</title>
</head>
<body>
	<h1>請輸入妳想搜尋的學生編號</h1>
	<!-- 	在form內使用modelAttribute代表model帶過來的物件，搭配底下path代表物件的屬性 -->
	<form:form action="getid" method="post" modelAttribute="studentBean">
	請輸入編號:<form:input type="text" path="id" />
	</form:form>

	結果: 學生編號:${studentBean.id}
	<br>學生姓名:${studentBean.name}
	<br> 學生備註:${studentBean.notes}
	<br>學生年級:${studentBean.grade}
	<br>
	<a href="${pageContext.request.contextPath}">回到首頁</a>

</body>
</html>