package com.diworksdev.webproj4.dto;

public class LoginDTO {

    private String username;
    private String password;

    /**
     * ユーザー名を取得する
     */
    public String getUsername() {
        return username;
    }

    /**
     * ユーザー名を設定する
     * @param username ユーザー名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * パスワードを取得する
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワードを設定する
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
