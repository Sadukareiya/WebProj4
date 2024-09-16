package com.diworksdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dao.HelloStrutsDAO;
import com.diworksdev.webproj4.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport {

    // HelloStrutsDTOのリスト
    private List<HelloStrutsDTO> HelloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

    /**
     * アクションを実行するメソッド
     */
    public String execute() {
        String ret = ERROR;

        // DAOを使用してデータベースからデータを取得
        HelloStrutsDAO dao = new HelloStrutsDAO();
        HelloStrutsDTOList = dao.select();

        // データが取得できたかをチェックし、結果を設定
        if (HelloStrutsDTOList.size() > 0) {
            ret = SUCCESS;
        } else {
            ret = ERROR;
        }
        return ret;
    }

    /**
     * HelloStrutsDTOのリストを取得
     */
    public List<HelloStrutsDTO> getHelloStrutsDTOList() {
        return HelloStrutsDTOList;
    }

    /**
     * HelloStrutsDTOのリストを設定
     * @param helloStrutsDTOList 設定するHelloStrutsDTOのリスト
     */
    public void setHelloStrutsDTOList(List<HelloStrutsDTO> helloStrutsDTOList) {
        HelloStrutsDTOList = helloStrutsDTOList;
    }
}
