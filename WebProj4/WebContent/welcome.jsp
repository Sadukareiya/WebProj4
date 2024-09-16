<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"> <!-- ページの文字エンコーディングをUTF-8に設定 -->
    <title>WELCOME</title> <!-- ページタイトル -->
</head>
<body>
    <!-- ユーザーに名前とパスワードを入力するよう指示 -->
    <p>名前とパスワードを入力してください。</p>

    <!-- LoginActionにフォームを送信 -->
    <s:form action="LoginAction">
        <s:textfield name="username" label="ユーザー名" /> <!-- ユーザー名入力フィールド -->
        <s:password name="password" label="パスワード" /> <!-- パスワード入力フィールド -->
        <s:submit value="送信"/> <!-- フォーム送信ボタン -->
    </s:form>
</body>
</html>
