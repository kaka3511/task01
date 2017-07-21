<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>添加水库信息</title>
</head>
<body>
	<form id="itemForm" align="center"
		action="${pageContext.request.contextPath }/Province/addRs00RsbaseSubmit.do"
		method="post" enctype="multipart/form-data">
		<br />
		<br />
		<br />
		<br /> <span class="label label-success" >请上传Excel文件:</span>
		<br />
		<br />
		<div align="center">
			<input type="file" class="btn btn-primary btn-lg" name="items_file"  />
		</div>
		<input type="submit" class="btn btn-warning"
			style="width: 374px; heigth: 50px" value="提交" />
	</form>
</body>

</html>