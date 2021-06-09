package DAL;

import controller.AlumnosDAOImpl;
import models.AlumnosModel;

public class Modificar implements IConsulta{
    AlumnosDAOImpl alumDAO = new AlumnosDAOImpl();

    @Override
    public boolean consulta(AlumnosModel alumno) {
        String strQuery = "update \"Alumnos\" set matricula = '"+ alumno.getMatricula() +"', nombre = '"+ alumno.getNombre() +"', semestre = '" + alumno.getSemestre() + "' where \"id\" = " + alumno.getId() + ";";
        return alumDAO.tomarconsulta(strQuery);
    }

    @Override
    public String tipo(String t) {
        return "Modificar";
    }   

}
