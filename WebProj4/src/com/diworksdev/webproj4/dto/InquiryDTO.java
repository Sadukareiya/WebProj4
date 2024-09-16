package com.diworksdev.webproj4.dto;

public class InquiryDTO {
    // 名前を保持するフィールド
    private String name;

    // お問い合わせの種類を保持するフィールド
    private String qtype;

    // お問い合わせ内容を保持するフィールド
    private String body;

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // 名前を設定するメソッド
    public void setName(String name) {
        this.name = name;
    }

    // お問い合わせの種類を取得するメソッド
    public String getQtype() {
        return qtype;
    }

    // お問い合わせの種類を設定するメソッド
    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    // お問い合わせ内容を取得するメソッド
    public String getBody() {
        return body;
    }

    // お問い合わせ内容を設定するメソッド
    public void setBody(String body) {
        this.body = body;
    }
}

