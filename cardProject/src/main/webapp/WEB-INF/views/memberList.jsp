<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>list</title>
<style type="text/css">
* {margin: 0; padding: 0;}
a {text-decoration: none;
color:inherit;
transition-duration:0.5s;

}
a:hover {
font-size:1.2em;
font-weight: bold;
animation-name: test;
  animation-duration:10s;
  animation-iteration-count: infinite;
}
@keyframes test {
	0% {
	color:white;
	}
	
	15% {
	color:red;
	}
	30% {
	color:yellow;
	}
	45% {
	color:green;
	}
	75% {
	color:blue;
	}
	100% {
	color:purple;
	}
	
}
table {
margin: 0 auto; 
}
</style>
</head>
<script type="text/javascript">
function View(idx) {
	//location = "/card/home?userIdx="+ idx;

	document.getElementById('userIdx').value = idx;
	
	document.getElementById('frm').submit();
	
}

</script>

<body>
<h2 align="center" style="margin: 30px 0 20px 0">회원목록</h2>

<form action="/card/home" id="frm" method="post">
<input type="hidden" id="userIdx" name="userIdx" value="">
</form>
<table  align="center">

	<tr>
	<!-- <td align="left">
			<input type="button" value="회원가입" onClick="location.href='/card/memberLogin'">
		</td> -->
		
	</tr>
	<tr>
		<td>
			<table id="ListTable" border = "1" >
				<tr>
					<td width="80" align="center">
						번호
					</td>
					<td width="80" align="center">
						이름
					</td>
					<td width="300" align="center">
						이메일
					</td>
					<td width="300" align="center">
						회원가입일자
					</td>
				</tr>
				<c:forEach items="${memList}" var="memList">
					<tr align="center">
						<td>
							${memList.userIdx}
						</td>
						<td><a href="#" onClick="View(${memList.userIdx})">
							${memList.userName}</a>
						</td>
						<td>
							${memList.userEmail}
						</td>
						<td>
							${memList.userRegisterDate}
						</td>
					</tr>	
				</c:forEach>
			</table>
		</td>
	</tr>
	<tr>
	<td align="right">
			<input type="button" value="개인이력카드 작성" onClick="location.href='/card/home'">
		</td>
	</tr>

	</table>
</body>
</html>