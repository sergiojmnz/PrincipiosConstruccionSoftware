package controller;

import java.util.List;
import models.AlumnosModel;

public interface IAlumnosDAO {
    public boolean tomarconsulta(String sql);  
    public List<AlumnosModel> listarAlumnos();
}
