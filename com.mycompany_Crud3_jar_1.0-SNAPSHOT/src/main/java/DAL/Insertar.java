package DAL;

import models.AlumnosModel;
import controller.AlumnosDAOImpl;

public class Insertar implements IConsulta{
    AlumnosDAOImpl alumDAO = new AlumnosDAOImpl();

    @Override
    public boolean consulta(AlumnosModel alumno) {
        String strQuery = "insert into \"Alumnos\" (matricula, nombre, semestre) values ('"+ alumno.getMatricula() +"', '"+ alumno.getNombre() +"', '"+ alumno.getSemestre() +"')";
        return alumDAO.tomarconsulta(strQuery);      
    }

    @Override
    public String tipo(String t) {
        return "Insertar";
    }   
}
