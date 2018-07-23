<%--
  Created by IntelliJ IDEA.
  User: jerrywang
  Date: 2018/7/23
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Publish Form</title>
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">

        jQuery.fn.addtr = function () {
                alert("function");
                var html = "<tr>\n" +
                    "                <td><input type=\"text\" name=\"field\"></td>\n" +
                    "                <td><input type=\"text\" name=\"regex\"></td>\n" +
                    "                <td><input type=\"text\" name=\"info\"></td>\n" +
                    "                <td><input type=\"button\" value=\"添加\" class = \"add\" ></td>\n" +
                    "                <td><input type=\"button\" value=\"删除\" class = \"delete\"></td>\n" +
                    "            </tr>";
                $(this).parent().parent().after(html);
                $('.add').each(function () {
                    $(this).on("click",function () {
                        $(this).addtr();
                    })
                })
            }


        $(function () {
            alert("hello");
            $('.add').click(function () {
                $(this).addtr();
            });
        });
    </script>
</head>
<body>

<div align="center">
    <form>
       表名：<input type="text" name="formName"></td>

        <table>

            <thead>
                <tr>
                    <th>字段</th>
                    <th>正则表达式</th>
                    <th>备注</th>
                    <th aria-rowspan="2">操作</th>
                </tr>
            </thead>
            <tr>
                <td><input type="text" name="field"></td>
                <td><input type="text" name="regex"></td>
                <td><input type="text" name="info"></td>
                <td><input type="button" value="添加" class = "add" ></td>
                <td><input type="button" value="删除" class = "delete"></td>
            </tr>
        </table>
        <button ></button>
    </form>

</div>

</body>
</html>
