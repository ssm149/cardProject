<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습1</title>
</head>

<script type="text/javascript">
   
   
   function check() {
      var test = document.getElementsByName("aaa");
      alert(test[0].value);
       
      /* var test = document.getElementById("aaa");
      alert(test.value); */
   }
   
   function check2() {
      var test21 = document.getElementsByName("bb");
      /* var test22 = document.getElementsByName("bbbb"); */
      /* test21[0].value.innerHTML="@@" */
      var result2 = test21[0].value +test21[1].value +test21[2].value;
      alert(result2);
   }
   
   function check3() {
      var test31 = document.getElementsByName("ccc");
      var test32 = document.getElementsByName("cccc");
      var test33 = document.getElementsByName("ccccc");
      var result3 = test31[0].value +"@@" +test32[0].value +"@@" +test33[0].value;
      alert(result3);
   }
   
   function check4() {
      var test41 = document.getElementsByName("ddd");
      var test42 = document.getElementsByName("dddd");
      var result4 = parseInt(test41[0].value) + parseInt(test42[0].value);
      alert(result4);
   }
   
   function check5() {
      var test51 = document.getElementsByName("eee");
      var test52 = document.getElementsByName("eeee");
      var result5 = parseInt(test51[0].value) * parseInt(test52[0].value);
      alert(result5);
   }
   
   function check6() {
      var test61 = document.getElementsByName("fff");
      var test62 = document.getElementsByName("ffff");
      var test63 = document.getElementsByName("fffff");
      var result6 = parseInt(test61[0].value) + parseInt(test62[0].value) + parseInt(test63[0].value);
      alert(result6);
   }

</script>
<body>
   <form action="b.jsp" method="post">


   <h3>1. 입력한 내용이 alert로 표시되게 해주세요.</h3>
   <input type="text" name="aaa" id="aaa"> =
   <input type="button" value="결과" onclick="check();">


   <h3>2. 입력한 내용이 alert로 표시되게 해주세요.(@@포함)</h3>
   <input type="text" name="bb"> <!-- @@ -->
   <input type="text" name="bb" value="@@">
   <input type="text" name="bb"> =
   <input type="button" value="결과" onclick="check2();">


   <h3>3. 입력한 내용이 alert로 표시되게 해주세요.(@@포함)</h3>
   <input type="text" name="ccc"> @@
   <input type="text" name="cccc"> @@
   <input type="text" name="ccccc"> =
   <input type="button" value="결과" onclick="check3();">


   <h3>4. 입력한 내용이 alert로 표시되게 해주세요.(ex)100+200=???입니다.</h3>
   <input type="text" name="ddd"> +
   <input type="text" name="dddd"> =
   <input type="button" value="결과" onclick="check4();">


   <h3>5. 입력한 내용이 alert로 표시되게 해주세요.(ex)100*200=???입니다.</h3>
   <input type="text" name="eee"> *
   <input type="text" name="eeee"> =
   <input type="button" value="결과" onclick="check5();">


   <h3>6. 입력한 내용이 alert로 표시되게 해주세요.(ex)100+200+300=???입니다.</h3>
   <input type="text" name="fff"> +
   <input type="text" name="ffff"> +
   <input type="text" name="fffff"> =
   <input type="button" value="결과" onclick="check6();">


   
   
   <br>
   <br>
   <input type="submit" value="결과페이지로 이동">
   </form>

</body>
</html>