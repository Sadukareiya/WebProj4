<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>LoginError</title>
</head>
<body>

    <!-- エラーメッセージの表示 -->
    <h1>エラーが発生しました</h1>
    <br>
    <h3>ログインできません。</h3>

    <!-- 該当者がいない場合のメッセージ -->
    <s:if test='(loginDTOList.get(0).username) == "該当なし"'>
        該当者はいませんでした。
    </s:if>

    <br>

    <!-- ユーザー名とパスワードを表示するテーブル -->
    <table>
        <tbody>
            <tr>
                <th>USERNAME</th>
                <th>PASSWORD</th>
            </tr>

            <!-- loginDTOListをループして、ユーザー名とパスワードを表示 -->
            <s:iterator value="loginDTOList">
                <tr>
                    <td><s:property value="username"/></td>
                    <td><s:property value="password"/></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>

</body>
</html>
