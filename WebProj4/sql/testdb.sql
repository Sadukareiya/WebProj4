-- データベースがすでに存在する場合は削除
drop database if exists testdb;

-- 新しいデータベースを作成
create database testdb;

-- 作成したデータベースを使用
use testdb;

-- ユーザー情報を格納するテーブルを作成
create table users (
    user_id int primary key auto_increment, -- ユーザーID（自動増分）
    user_name varchar(255), -- ユーザー名
    password varchar(255)   -- パスワード
);

-- ユーザー情報を挿入
insert into users values (1, "taro", "123");
insert into users values (2, "jiro", "456");
insert into users values (3, "hanako", "789");

-- 問い合わせ情報を格納するテーブルを作成
create table inquiry (
    name varchar(255), -- 名前
    qtype varchar(255), -- 問い合わせの種類
    body varchar(255)  -- 問い合わせ内容
);
