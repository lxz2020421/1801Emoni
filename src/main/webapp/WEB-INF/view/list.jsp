<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>

<body>
<form action="select" method="post">
电影名称：<input type="text" name ="name" value="${movieVO.name }">
上映时间：<input type="date" name="t1" value="${movieVO.t1 }">至<input type="date" name="t2" value="${movieVO.t2 }"><br>
导演：<input type="text" name="actor" value="${movieVO.actor }">
价格：<input type="text" name="p1" value="${movieVO.p1 }">-<input type="text" name="p2" value="${movieVO.p2 }"><br>
电影年代：<input type="text" name="years" value="${movieVO.years }">
电影时长:<input type="text" name="l1" value="${movieVO.l1 }">-<input type="text" name="l2" value="${movieVO.l2 }"><br>
<input type="submit" value="提交">
	<table border="1">
		<tr>
			<td>电影名称</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
		</tr>
		<c:forEach items="${info.list }" var="s">
			<tr>
				<td>${s.name }</td>
				<td>${s.actor }</td>
				<td>${s.price }</td>
				<td>${s.uptime }</td>
				<td>${s.longtime }</td>
				<td>${s.type }</td>
				<td>${s.years }</td>
				<td>${s.area }</td>
				<td>${s.status }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
			</td>
		</tr>
	</table>
	<script type="text/javascript">
	function goPage(pageNum) {
		location.href="/select?pageNum="+pageNum
	}
</script>
</form>
</body>

</html>
