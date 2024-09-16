package com.diworksdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    /**
     * JDBC ドライバー名
     * MySQLのJDBCドライバーを使用
     */
    private static String driverName = "com.mysql.jdbc.Driver";

    /**
     * データベース接続 URL
     * データベースへの接続パス (ローカルホストのtestdbに接続)
     */
    private static String url = "jdbc:mysql://localhost/testdb";

    /**
     * データベース接続ユーザ名
     * MySQLデータベースに接続するためのユーザ名
     */
    private static String user = "root";

    /**
     * データベース接続パスワード
     * MySQLデータベースに接続するためのパスワード
     */
    private static String password = "mysql";

    /**
     * データベースへの接続を取得するメソッド
     */
    public Connection getConnection() {
        Connection con = null;
        try {
            // JDBCドライバーをロード
            Class.forName(driverName);

            // データベースに接続
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            // ドライバが見つからない場合の例外処理
            e.printStackTrace();
        } catch (SQLException e) {
            // SQLエラーが発生した場合の例外処理
            e.printStackTrace();
        }
        // データベース接続オブジェクトを返す
        return con;
    }
}
