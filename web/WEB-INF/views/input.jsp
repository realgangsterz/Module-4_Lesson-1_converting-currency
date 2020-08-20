<%--
  Created by IntelliJ IDEA.
  User: daoxu
  Date: 8/20/2020
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form action="/doConvert" method="get">
    <fieldset>
        <legend>Currency converter</legend>
        Convert Rate:
        <input type="number" name="rate" value="23100"/>
        USD:
        <input type="number" name="usd"/> <br>
        <button type="submit">Convert</button>
    </fieldset>
</form>
</body>
</html>
