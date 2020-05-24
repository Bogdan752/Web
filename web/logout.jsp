<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <style>
        .txt {
            padding: 45px;
            font-family: "Geneva", serif;
        }
        .btn-t {
            margin: 20px;
            margin-left: 300px;
        }
        .my-file {
            margin: 10px;
            margin-left: 100px;
        }
    </style>
</head>
<body>

<%
    String userName = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login")) {
                userName = cookie.getValue();
            }
        }
    }
%>
<h1 class="txt">Hello, ${sessionScope ['user']}
</h1>
<br>
<form action="hello" method="post">
    <img src="/ResponseImageServlet" class="btn-t"><br>
    <button type="submit" value="Execute" class="btn btn-primary btn-t">Exit</button>
</form>
<br>

</body>
</html>