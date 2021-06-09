package controller;

import java.util.List;
import models.AlumnosModel;
import DAL.PostgresConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnosDAOImpl implements IAlumnosDAO{
    private List<AlumnosModel> lstAlumnos;

    @Override
    public boolean tomarconsulta(String sql) {
        return PostgresConn.getInstance().execute(sql);
    } 
    
    @Override
    public List<AlumnosModel> listarAlumnos() {
        lstAlumnos = new ArrayList<>();
        String strQuery = "select * from \"Alumnos\";";
        ResultSet rs = PostgresConn.getInstance().executeQuery(strQuery);
        try {
            while(rs.next()){
                AlumnosModel alum = new AlumnosModel();
                alum.setId(rs.getInt("id"));
                alum.setMatricula(rs.getString("matricula"));
                alum.setNombre(rs.getString("nombre"));
                alum.setSemestre(rs.getString("semestre"));
                lstAlumnos.add(alum);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstAlumnos;
    }
}
