<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
   request.setCharacterEncoding("UTF-8");
   %>
    
    <%
   /* 1번 */
   String aResult = request.getParameter("aaa");
   
   if (aResult == null || aResult == "") {
   }
   %>
   
    <%
   
   
   /* 2번 */
   String bResult = request.getParameter("bbb");
   String bbResult = request.getParameter("bbbb");
   String bbbResult = request.getParameter("ccbbbbbccc");

   if (bResult == null || bResult == "" || bbResult == null || bbResult == "" || bbbResult == null || bbbResult == "") {
   }
   

   %>
     
   <%
   
   /* 3번 */
   String cResult = request.getParameter("ccc");
   String ccResult = request.getParameter("cccc");
   String cccResult = request.getParameter("ccccc");

   if (cResult == null || cResult == "" || ccResult == null || ccResult == "" || cccResult == null || cccResult == "") {
   }
   
   %>


   <%
   
   /* 4번 */
   int num3 = 0;
   int num4 = 0;
   
   String num1 = request.getParameter("ddd");
   String num2 = request.getParameter("dddd");

   //int num3 = Integer.parseInt(num1);
   //int num4 = Integer.parseInt(num2);
    
   if(num1 != null) {
      num3 = Integer.parseInt(num1);
   } 
   
   if (num2 != null) {
      num4 = Integer.parseInt(num2);
   }
   
   %>

   <%
   /* 5번 */
   int num33 = 0;
   int num44 = 0;
   
   String num11 = request.getParameter("eee");
   String num22 = request.getParameter("eeee");

   //int num33 = Integer.parseInt(num11);
   //int num44 = Integer.parseInt(num22);
   
   if(num11 != null) {
      num33 = Integer.parseInt(num11);
   }
   
   if (num22 != null) {
      num44 = Integer.parseInt(num22);
   }
   %>

   <%
   /* 6번 */
   int num444 = 0;
   int num555 = 0;
   int num666 = 0;
   
   String num111 = request.getParameter("fff");
   String num222 = request.getParameter("ffff");
   String num333 = request.getParameter("fffff");
   
   //int num444 = Integer.parseInt(num111);
   //int num555 = Integer.parseInt(num222);
   //int num666 = Integer.parseInt(num333);
   
   if(num333 != null){
      num666 = Integer.parseInt(num333);
   } 
   
   if (num222 != null){
      num555 = Integer.parseInt(num222);
   } 
   
   if (num111 != null){
      num444 = Integer.parseInt(num111);
   }
   %>
   
   
   <br />
   <br />1번 결과는 ==>>> <input type="text" name="kkk" value="<%=aResult %>">
   <br />
   <br />2번 결과는 ==>>> <input type="text" name="kkk" value="<%=bResult + bbResult + bbbResult %>">
   <br />
   <br />3번 결과는 ==>>> <input type="text" name="kkk" value="<%=cResult + "@@" + "@@" + ccResult %>">
   <br /> 
   <br />4번 결과는 ==>>> <input type="text" name="kkk" value="<%=num3 + num4 %>">
   <br />
   <br />5번 결과는 ==>>> <input type="text" name="kkk" value="<%=num33 * num44 %>">
   <br />
   <br />6번 결과는 ==>>> <input type="text" name="kkk" value="<%=num444 + num555 + num666 %>">

<br />






</body>
</html>