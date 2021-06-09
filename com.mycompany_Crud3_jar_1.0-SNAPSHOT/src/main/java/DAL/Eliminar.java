package DAL;

import controller.AlumnosDAOImpl;
import models.AlumnosModel;

public class Eliminar implements IConsulta{
    AlumnosDAOImpl alumDAO = new AlumnosDAOImpl();

    @Override
    public boolean consulta(AlumnosModel alumno) {
        String strQuery = "delete from \"Alumnos\" where \"id\" = "+ alumno.getId() +";";
        return alumDAO.tomarconsulta(strQuery);
    }

    @Override
    public String tipo(String t) {
        return "Eliminar";
    }   
}
