<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!-- 設定變數contextRoot，其值為${pageContext.request.contextPath}，代表根目錄 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>id</th>
			<th>學生姓名</th>
			<th>年級</th>
			<th>備註</th>
		</tr>
		<!-- 從studentController的listStudent()方法取得cookie:studentlist -->
		<c:forEach var="oneStudent" items="${studentlist}">
			<tr>
				<th>${oneStudent.id}</th>
				<th>${oneStudent.name}</th>
				<th>${oneStudent.grade}</th>
				<th>${oneStudent.notes}</th>
				<td><a
					href="${contextRoot}/student/editstudent?id=${oneStudent.id}">編輯</a></td>
				<td><a
					href="${contextRoot}/student/deleteStudent?id=${oneStudent.id}">刪除</a></td>
				<!-- 刪除按下去之後會去找studentController.java的deleteStudent()方法，因為deleteStudent()的annotaion是@GetMapping("/deleteStudent")和「刪除」的超連結連結網址一致 -->
			</tr>
		</c:forEach>
	</table>


</body>
</html>