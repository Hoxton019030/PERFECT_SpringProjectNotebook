<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>嘻嘻 我是首頁</title>
</head>
<body>
	<h1>嘻嘻 我是首頁</h1>
	<!-- 	與FirstController的showAllStudents的GetMapping配對 @GetMapping(value = "/showform") -->
	<a href="student/list">查看所有學生</a>
	<!-- 	按下去之後會到StudentController的listStudent -->
	<br />
	<a href="student/add">新增學生</a>
	<!-- 	按下去之後會到StudentController的addStudentPage -->
	<br>
	<a href="student/getStudentPage">按編號搜尋學生</a>
	<!-- 	按下去之後會到StudentController的getStudentPage -->
	<br>

</body>
</html>