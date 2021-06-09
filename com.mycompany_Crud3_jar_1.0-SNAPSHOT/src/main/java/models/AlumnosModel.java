package models;
public class AlumnosModel {
    private int id;
    private String matricula;
    private String nombre;
    private String semestre;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSemestre(String semestre){
        this.semestre = semestre;
    }
    
    public int getId(){
        return id;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getSemestre(){
        return semestre;
    }
}
