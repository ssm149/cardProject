<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<script>
    function send_go(){
        if(document.f.id.value == ""){
            alert("이름을 입력하세요");
            document.f.id.focus();
            return;
        }
       
        if(document.f.pw.value == ""){
            alert("비밀번호를 입력하세요");
            document.f.pw.focus();
            return;
        }
        
        if(document.f.name.value == ""){
            alert("이름을 입력하세요");
            document.f.name.focus();
            return;
        }
        
        if(document.f.age.value == ""){
            alert("나이를 입력하세요");
            document.f.age.focus();
            return;
        }
    }
</script>

<body>


<h2>회원가입</h2>
	<table>
	<form action="/member/memberList.jsp" method="post" name="f">
	<td>
		아이디:<input type="text" name="id" placeholder=" 아이디"><br/>
		<br>
		비밀번호:<input type="password" name="pw" placeholder=" 비밀번호"><br/>
		<br>
		이름:<input type="text" name="name" placeholder=" 이름"><br/>
		<br>
		나이:<input type="text" name="age" placeholder=" 나이"><br/>
		<br>
		
		<input type="submit" value="회원가입" class="submit">
		<input type="button" value="취소" onclick = "window.location='/member/memberList.jsp'">
	</td>
	</form>
	
	</table>
</body>
</html>