package com.diworksdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dao.InquiryCompleteDAO;
import com.diworksdev.webproj4.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport {

    // フォームからの入力データ
    private String name;
    private String qtype;
    private String body;

    // お問い合わせデータを格納するリスト
    private List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

    // アクションの実行メソッド
    public String execute() {
        String ret = ERROR;
        InquiryCompleteDAO dao = new InquiryCompleteDAO();

        // データベースに新しいお問い合わせを挿入
        int count = dao.insert(name, qtype, body);

        // 挿入が成功した場合、すべてのお問い合わせを取得
        if (count > 0) {
            inquiryDTOList = dao.select();
            ret = SUCCESS;
        }

        return ret;
    }

    // フォームからのデータ取得用のゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<InquiryDTO> getInquiryDTOList() {
        return inquiryDTOList;
    }

    public void setInquiryDTOList(List<InquiryDTO> inquiryDTOList) {
        this.inquiryDTOList = inquiryDTOList;
    }
}
