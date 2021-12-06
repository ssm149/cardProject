<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습1</title>
</head>

<script type="text/javascript">
   
   function checkA(str) {
      var test = str;
      alert(test);
       
   }
   
   function checkB(str2, str22, str222) {
      var test2 = str2;
      var test22 = str22;
      var test222 = str222;
      alert(test2 + test22 + test222);
       
   }
   
   function checkC(str3, str33, str333) {
      var test3 = str3;
      var test33 = str33;
      var test333 = str333;
      alert(test3 + "@@" + test33 + "@@" + test333);
       
   }
   
   function checkD(str4, str44) {
      var test4 = str4;
      var test44 = str44;
      var result4 = parseInt(test4) + parseInt(test44)
      //if(result4 > 100){
      //   alert("100보다 큰 숫자입니다.");
      //}else{
      //   alert("100보다 작은 숫자입니다.");
      //}
      alert(result4);
       
   }
   
   function checkE(str5, str55) {
      var test5 = str5;
      var test55 = str55;
      var result5 = parseInt(test5) * parseInt(test55)
      alert(result5);
       
   }
   
   function checkF(str6, str66, str666) {
      var test6 = str6;
      var test66 = str66;
      var test666 = str666;
      var result6 = parseInt(test6) + parseInt(test66) + parseInt(test666)
      alert(result6);
       
   }

</script>
<body>
   <form action="d.jsp" method="post">

   <h3>A. 입력한 내용이 alert로 표시되게 해주세요.</h3>
   <input type="text" name="aaa" id="aaa">
   <input type="button" value="결과" onclick="checkA(aaa.value);">


   <h3>B. 입력한 내용이 alert로 표시되게 해주세요.(@@포함)</h3>
   <input type="text" name="bbb">
   <input type="text" name="bbbb" value="@@">
   <input type="text" name="bbbbb"> =
   <input type="button" value="결과" onclick="checkB(bbb.value, bbbb.value, bbbbb.value);">


   <h3>C. 입력한 내용이 alert로 표시되게 해주세요.(@@포함)</h3>
   <input type="text" name="ccc"> @@
   <input type="text" name="cccc"> @@
   <input type="text" name="ccccc"> =
   <input type="button" value="결과" onclick="checkC(ccc.value, cccc.value, ccccc.value);">


   <h3>D. 입력한 내용이 alert로 표시되게 해주세요.(ex)100+200=???입니다.</h3>
   <input type="text" name="ddd"> +
   <input type="text" name="dddd"> =
   <input type="button" value="결과" onclick="checkD(ddd.value, dddd.value);">


   <h3>E. 입력한 내용이 alert로 표시되게 해주세요.(ex)100*200=???입니다.</h3>
   <input type="text" name="eee"> *
   <input type="text" name="eeee"> =
   <input type="button" value="결과" onclick="checkE(eee.value, eeee.value);">


   <h3>F. 입력한 내용이 alert로 표시되게 해주세요.(ex)100+200+300=???입니다.</h3>
   <input type="text" name="fff"> +
   <input type="text" name="ffff"> +
   <input type="text" name="fffff"> =
   <input type="button" value="결과" onclick="checkF(fff.value, ffff.value, fffff.value);">


   
   
   <br>
   <br>
   <input type="submit" value="결과페이지로 이동">
   </form>

</body>
</html>