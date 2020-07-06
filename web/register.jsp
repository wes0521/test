<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户</title>
    <script type="text/javascript">
        function check(input) {

            var v = input.value;
            var xhr = new XMLHttpRequest();

            xhr.onreadystatechange = function(ev){
                if (xhr.status == 200 && xhr.readyState == 4){
                    var s = xhr.responseText;
                    if (s == "0"){
                        document.getElementById("sp").innerText="可以注册";
                        document.getElementById("sp").style.color="green";
                    }else {
                        document.getElementById("sp").innerText="用户已存在";
                        document.getElementById("sp").style.color="red";
                    }
                }
            }

            xhr.open("get","${pageContext.request.contextPath}/check?username="+input.value,true);

            xhr.send();
        }
    </script>
</head>
<body>
    <form action="register" method="post">
        用户名：<input type="text" name="username" onchange="check(this)"/><span id="sp"></span><br>
        密 码：<input type="password" name="psd"/><br/>
        <input type="submit" value="注册" />
    </form>
</body>
</html>
