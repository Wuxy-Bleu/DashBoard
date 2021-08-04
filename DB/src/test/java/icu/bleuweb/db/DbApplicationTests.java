package icu.bleuweb.db;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;

@SpringBootTest
class DbApplicationTests {

    @Test
    void contextLoads() {

        // 加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // 数据库连接信息：url，用户名，密码
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            String userName = "root";
            String password = "";

            // 获取连接
            Connection conn = DriverManager.getConnection(url, userName, password);

            // 创建语句对象
            Statement stat = conn.createStatement();

            // 查询语句
            String sql = "SELECT 'hello, world!' print";

            // 执行查询
            ResultSet rs = stat.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

}
