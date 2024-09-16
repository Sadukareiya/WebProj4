package com.diworksdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dao.TestDAO;
import com.diworksdev.webproj4.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    // ユーザー名
    private String username;

    // パスワード
    private String password;

    // ログインDTOリスト
    private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

    /**
     * ログイン情報を処理します。
     */
    public String execute() {
        String ret = ERROR;
        TestDAO dao = new TestDAO();

        // ユーザー情報をデータベースに挿入
        int count = dao.insert(username, password);
        if (count > 0) {
            ret = SUCCESS;
        } else {
            ret = ERROR;
        }

        // ユーザー情報をデータベースから取得
        loginDTOList = dao.select(username, password);
        return ret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LoginDTO> getLoginDTOList() {
        return loginDTOList;
    }

    public void setLoginDTOList(List<LoginDTO> loginDTOList) {
        this.loginDTOList = loginDTOList;
    }
}
