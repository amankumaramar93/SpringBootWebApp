<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ideal Tech</title>
		<link rel="stylesheet" href="css/style.css" />
	</head>
	<body class="body_bg">
		
		<h4> Login Here </h4>
		
		<c:if test="${not empty errorMsg}">
			<h4 style="color: red"> ${errorMsg} </h4>	
		</c:if>

        <form action="loginForm" method="post">
            Email : <input type="text" name="email" /> <br/><br/>
            Password : <input type="password" name="password" /> <br/><br/>
            <input type="submit" value="Login" />
        </form>

        <br/><br/>

        If not registered...<a href="regPage"> Click Here </a>
		
	</body>
</html>