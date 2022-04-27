<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改學生資料</title>
</head>
<body>
<h1>修改學生資料</h1>

<!-- 	在form內使用modelAttribute代表model帶過來的物件，搭配底下path代表物件的屬性 -->
	<form:form action="editpost" modelAttribute="studentBean" method="post">
		<form:input type="hidden" path="id" />
		<!-- 	//這邊的id,name,grade,notes都會跟Students.java的變數名稱對應到 -->
		<br>
	請輸入姓名 <form:input type="text" path="name" />
		<!-- 	//這邊的id,name,grade,notes都會跟Students.java的變數名稱對應到 -->
		<br>
	請輸入備註 <form:input type="text" path="notes" />
		<!-- 	//這邊的id,name,grade,notes都會跟Students.java的變數名稱對應到 -->
		<br>
	請選擇年級 <form:input type="number" min="0" max="6" path="grade" />
		<br>
		<input type="submit" value="送出">
	</form:form>


</body>
</html>