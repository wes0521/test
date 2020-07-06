<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-7-2
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript">

      /*var student={name:"zhangsan",age:50}
      document.write(student.name);
      */

      /*var s = "I am a studentc";
      var reg = /[a|b|c]/g;
       alert(s.replace(reg,"1"));*/

      console.log("najfnjiakf");

      var stu = {name: "小明", age: 20};

      var s = JSON.stringify(stu);
      console.log(s);

      var stus = '{"name":"xiaohong","age":22,"sex":"女"}';
      var ss = JSON.parse(stus);
      console.log(ss);
      // String json1 = "{'id':1,'name':'JAVAEE-1910','stus':[{'id':101,'name':'刘一','age':16},{'id':101,'name':'刘二','age':20}]}";

      // alert("na");

    </script>
  </head>
  <body>
  $END$
  </body>
</html>
