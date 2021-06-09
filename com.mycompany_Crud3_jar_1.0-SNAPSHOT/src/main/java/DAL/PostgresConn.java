package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgresConn {
    private static PostgresConn myConn;
    private Connection bdConn = null;
    private PostgresConn(){
        try {
            Class.forName("org.postgresql.Driver");
            bdConn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdCrud", "sergio", "123456");
            System.out.println("Conectado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgresConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PostgresConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static PostgresConn getInstance(){
        if(myConn == null){
            myConn = new PostgresConn();
        }
        return myConn;
    }
    // solo para insert, update y delete
    public boolean execute(String sql){
        boolean res = false;
        Statement st;
        try {
            st = bdConn.createStatement();
            st.execute(sql);
            res = true;
        } catch (SQLException ex) {
            Logger.getLogger(PostgresConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    // solo para recuperar informacion de la BD
    public ResultSet executeQuery(String sql){
        ResultSet res = null;
        try {
            Statement st = bdConn.createStatement();
            res = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PostgresConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
