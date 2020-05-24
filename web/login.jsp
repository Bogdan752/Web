<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Authorization</title>
    <style>
        .forma {
            padding-left: 50%;
            padding-right: 50%;
            padding-top: 45px;
        }
        .txt {
            text-align: center;
        }
        .btn-r{
            float: right;
            width: 120px;
        }
    </style>
</head>
<body>

<form class="form" method="post" action="authentication">
    <div class="form-group">
        <h5 class="txt">Authorization</h5>
        <label for="InputEmail">Login</label>
        <input name="login" type="text" class="form-control" id="InputEmail" aria-describedby="emailHelp">
   </div>
    <div class="form-group">
        <label for="InputPass">Password</label>
        <input name="pass" type="password" class="form-control" id="InputPass">
    </div>
    <button type="submit" class="btn btn-primary btn-r" value="Login">Entry</button>

</form>
</body>
</html>