package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestConn {
    public static void main(String[] args){
        insertarRegistro();
        consultarTabla();
        
    }
    
    static void insertarRegistro(){
        String strQuery = "insert into \"Alumnos\" (matricula, nombre, semestre) values ('s19009812', 'jesus', 'Cuarto')";
        if(PostgresConn.getInstance().execute(strQuery)){
            System.out.println("Registrado");
        }else{
            System.out.println("no mms");
        }
    }
    
    static void consultarTabla(){
        String strQuery = "select * from \"Alumnos\";";
        ResultSet rs = PostgresConn.getInstance().executeQuery(strQuery);
        try {
            while(rs.next()){
                System.out.println("id:" + rs.getInt("id") + "matricula: " + rs.getString("matricula") + "nombre: " + rs.getString("nombre") + "semestre: " + rs.getString("semestre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
