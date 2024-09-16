package com.diworksdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dao.LoginDAO;
import com.diworksdev.webproj4.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private String username;
    private String password;
    private List<LoginDTO> LoginDTOList = new ArrayList<>();

    /**
     * ログイン処理を実行する
     */
    public String execute() {
        String ret = ERROR;

        // デバッグ用にユーザー名とパスワードを表示
        System.out.println(username);
        System.out.println(password);

        // DAOを使ってユーザー情報を取得
        LoginDAO dao = new LoginDAO();
        LoginDTOList = dao.select(username, password);

        // ユーザーが存在するか確認
        if (this.username.equals(LoginDTOList.get(0).getUsername()) &&
            this.password.equals(LoginDTOList.get(0).getPassword())) {
            ret = SUCCESS;
        }

        return ret;
    }

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

    /**
     * LoginDTOのリストを取得する
     */
    public List<LoginDTO> getLoginDTOList() {
        return LoginDTOList;
    }

    /**
     * LoginDTOのリストを設定する
     * @param LoginDTOList LoginDTOのリスト
     */
    public void setLoginDTOList(List<LoginDTO> LoginDTOList) {
        this.LoginDTOList = LoginDTOList;
    }
}
