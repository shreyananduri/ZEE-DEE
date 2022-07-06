import java.sql.*;  
class MySqlConn{  
    public static void main(String args[]){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://
            localhost:3306/databasename","username","password");  
            Statement stmt = conn.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from emp");    
            con.close();  
        }catch(Exception ex){
            System.out.println(ex);
        }  
    }
}