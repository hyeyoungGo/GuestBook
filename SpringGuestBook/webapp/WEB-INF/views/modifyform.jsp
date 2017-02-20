<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/modify" method="post">
	<input type="hidden" name="no" value="${no }">
	<table>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password"></td>
			<!-- <td><input type="submit" value="확인"></td> -->
			
		</tr>
	</table>
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=3 align=left><a href="${pageContext.request.contextPath }/list">메인으로 돌아가기</a></td>
			<td><input type="submit" VALUE=" 수정 "></td>
		</tr>
	</table>
	</form>
</body>
</html>