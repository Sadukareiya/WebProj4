package com.diworksdev.webproj4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj4.dto.LoginDTO;
import com.diworksdev.webproj4.util.DBConnector;

public class LoginDAO {

	public String username;
	public String password;
	private List<LoginDTO> loginDTOList = new ArrayList<>();

    /**
     * ユーザー名とパスワードでデータベースからユーザー情報を取得する
     */
    public List<LoginDTO> select(String username, String password) {
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();
        String sql = "SELECT * FROM users WHERE user_name=? AND password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LoginDTO dto = new LoginDTO();
                dto.setUsername(rs.getString("user_name"));
                dto.setPassword(rs.getString("password"));
                loginDTOList.add(dto);
            }

            // 該当するユーザーがいない場合
            if (loginDTOList.isEmpty()) {
                LoginDTO dto = new LoginDTO();
                dto.setUsername("該当なし");
                dto.setPassword("該当なし");
                loginDTOList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return loginDTOList;
    }
}
