package com.diworksdev.webproj4.dto;

public class HelloStrutsDTO {

    // ユーザーID
    private int userId;

    // ユーザー名
    private String userName;

    // パスワード
    private String password;

    // 結果のステータス
    private String result;

    /**
     * ユーザーIDを取得
     */
    public int getUserId() {
        return userId;
    }

    /**
     * ユーザーIDを設定
     * @param userId 設定するユーザーID
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * ユーザー名を取得
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ユーザー名を設定
     * @param userName 設定するユーザー名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * パスワードを取得
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワードを設定
     * @param password 設定するパスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 結果のステータスを取得
     */
    public String getResult() {
        return result;
    }

    /**
     * 結果のステータスを設定
     * @param result 設定する結果のステータス
     */
    public void setResult(String result) {
        this.result = result;
    }
}
