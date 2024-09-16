package com.diworksdev.webproj4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dto.HelloStrutsDTO;
import com.diworksdev.webproj4.util.DBConnector;

public class HelloStrutsDAO {

    // HelloStrutsDTOのリスト
    List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

    /**
     * usersテーブルからデータを取得し、DTOにマッピングしてリストに格納するメソッド
     */
    public List<HelloStrutsDTO> select() {
        // データベース接続オブジェクトを取得
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();

        // SQL文（usersテーブルから全てのデータを取得）
        String sql = "select * from users";

        try {
            // SQL文を準備
            PreparedStatement ps = con.prepareStatement(sql);

            // SQL文を実行し、結果を取得
            ResultSet rs = ps.executeQuery();

            // 結果セットからデータを取り出し、DTOにセットしてリストに追加
            while (rs.next()) {
                HelloStrutsDTO dto = new HelloStrutsDTO();
                dto.setUserId(rs.getInt("user_id"));
                dto.setUserName(rs.getString("user_name"));
                dto.setPassword(rs.getString("password"));
                dto.setResult("MySQLと接続できます。");
                helloStrutsDTOList.add(dto);
            }
        } catch (SQLException e) {
            // SQLエラーが発生した場合の例外処理
            e.printStackTrace();
        }

        try {
            // データベース接続を閉じる
            con.close();
        } catch (SQLException e) {
            // 接続を閉じる際にエラーが発生した場合の例外処理
            e.printStackTrace();
        }

        // DTOリストを返す
        return helloStrutsDTOList;
    }
}
