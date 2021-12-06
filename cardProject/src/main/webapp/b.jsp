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
   /* 1번 */
   String aResult = request.getParameter("aaa");
   
   if (aResult == null || aResult == "") {
   }
   %>


   <%
   /* 2번 */
   String arr[] = request.getParameterValues("bb");

   String f_arr = "";
   String s_arr = "";
   String t_arr = "";

   for (int i = 0; i < arr.length; i++) {
      f_arr = arr[0];
      s_arr = arr[1];
      t_arr = arr[2];
   }

   %>
     
     
   <%-- <%
   String bResult = request.getParameter("bbb");
   String bbResult = request.getParameter("bbbb");
   if (bResult == null || bResult == "" || bbResult == null || bbResult == "") {
   }
   %> --%>
  
  
   <%
   /* 3번 */
   String cResult = request.getParameter("ccc");
   String ccResult = request.getParameter("cccc");
   String cccResult = request.getParameter("ccccc");

   if (cResult == null || cResult == "" || cResult == null || cResult == "" || cResult == null || cResult == "") {
   }
   %>


   <%
   /* 4번 */
   String num1 = request.getParameter("ddd");
   String num2 = request.getParameter("dddd");

   int num3 = Integer.parseInt(num1);
   int num4 = Integer.parseInt(num2);
   %>

   <%
   /* 5번 */
   String num11 = request.getParameter("eee");
   String num22 = request.getParameter("eeee");

   int num33 = Integer.parseInt(num11);
   int num44 = Integer.parseInt(num22);
   %>

   <%
   /* 6번 */
   String num111 = request.getParameter("fff");
   String num222 = request.getParameter("ffff");
   String num333 = request.getParameter("fffff");

   int num444 = Integer.parseInt(num111);
   int num555 = Integer.parseInt(num222);
   int num666 = Integer.parseInt(num333);
   %>

   <br /> 1번 결과는 ==>>><%=aResult%>
   <br />
   <br /> 2번 결과는 ==>>><%=f_arr%><%=s_arr%><%=t_arr%>
   <br />
   <br /> 3번 결과는 ==>>><%=cResult + "@@" + ccResult + "@@" + cccResult%>
   <br />
   <br /> <%out.println("4번 결과는 ==>>>" + (num3 + num4));%>
   <br />
   <br /> <%out.println("5번 결과는 ==>>>" + (num33 * num44));%>
   <br />
   <br /> <%out.println("6번 결과는 ==>>>" + (num444 + num555 + num666));%>









</body>
</html>