<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<c:url value='/js/jquery-1.4.4.min.js'/>" type="text/javascript"></script>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	body{ 
		padding:0; 
		margin:0; 
	}
</style>
<script type="text/javascript">

	function addItem(){
		document.itemsForm.action="${pageContext.request.contextPath }/Province/addRs00Rsbase.do";
		document.itemsForm.submit(); 
			
		}
	
	function pageSearch(pageStart){
		document.itemsForm.action="${pageContext.request.contextPath }/Province/queryProvince.do?pageStart="+pageStart;
		document.itemsForm.submit(); 
		}
	
	
</script>
<title>水库信息列表</title>
</head>
<body >

		<form
		name="itemsForm"
		action="${pageContext.request.contextPath }/Province/queryProvince.do"
		method="post">
		<table class="table table-bordered table-hover table-striped">
				<tr>
				 <td colspan="9" align="center" style="height: 50px;"><h1>各省水库数据统计</h1>
				 <input type="text" name="province" id="province"/><input type="submit" value="按省查询"/>
				 <input  type="button" value="添加水库信息" onclick="addItem()" />
				 <a href="${pageContext.request.contextPath }/file/demo.xlsx">
						<strong>
						 下载水库信息模板
						</strong> 
				</a>
				
				 </td>
				</tr>
			  <tr>
		        
		        <td rowspan="2" ><br/>省（市、区）</td>
			    <td colspan="2" align="center">合计</td>
		     	<td colspan="2" align="center">大型</td>
		     	<td colspan="2" align="center">中型</td>
		        <td colspan="2" align="center">小型</td>
			  </tr>
			  <tr>
			    <td>数量（座）</td>
			    <td>总库容（万m³）</td>
			  
			    <td>数量（座）</td>
			    <td>总库容（万m³）</td>
			    
			    <td>数量（座）</td>
			    <td>总库容（万m³）</td>
			  
			    <td>数量（座）</td>
			    <td>总库容（万m³）</td>
			  </tr>
			  <c:forEach items="${list }" var="item">
				<tr >
					<td >${item.pname }</td>
					
					<td>${item.totalNum }</td>
					<td>${item.totalCap }</td>
					
					<td>${item.totalNumBig }</td>
					<td>${item.totalCapBig }</td>
					
					<td>${item.totalNumMed }</td>
					<td>${item.totalCapMed }</td>
					
					<td>${item.totalNumSma }</td>
					<td>${item.totalCapSma }</td> 
				</tr>
			</c:forEach>
			<tr >
				<td colspan="9" align="right">
				<ul class="pagination" style="margin:-7px 0;float:right">
				 	<c:forEach items="${pageNumList }" var="item">
						<li>
							<a href="#" onclick="pageSearch(${item })">${item }</a>
						</li>
			  	 	</c:forEach>
				</ul>
				第<label name="page" >${page }</label>页
				</td>
			</tr>
			</table>
	</form>
</body>

</html>