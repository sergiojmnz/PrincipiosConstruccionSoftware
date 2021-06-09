package DAL;

import models.AlumnosModel;

public interface IConsulta {
    public boolean consulta(AlumnosModel alumno);
    public String tipo(String t);
}
