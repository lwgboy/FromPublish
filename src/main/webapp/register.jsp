<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="/user/add" method="post">

    <table>

        <tbody>

            <tr>
                <td>工号</td>
                <td><input type="text" name="id"></td>
            </tr>

            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"></td>
            </tr>

            <tr>
                <td>密码</td>
                <td><input type="password" name="password" ></td>
            </tr>
        </tbody>

    </table>
    <input type="submit" value="submit">
    <input type="reset" value="reset">

</form>
</body>
</html>
