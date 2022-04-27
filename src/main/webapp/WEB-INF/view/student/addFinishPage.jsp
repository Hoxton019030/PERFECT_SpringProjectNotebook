<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>學生 ${studentBean.name}新增完成</h1>
	<!-- 	從addPage.jsp夾帶的modelAttribute的studentBean取得屬性 -->

	<a href="${pageContext.request.contextPath}">回到首頁</a>
	<!-- ${pageContext.request.contextPath}=首頁 -->
</body>
</html>