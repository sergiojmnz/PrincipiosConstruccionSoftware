package DAL;
public class Fabrica {
    public static IConsulta construir(String tipo){
        switch(tipo){
            case "Insertar":
                return new Insertar();
            case "Modificar":
                return new Modificar();
            case "Eliminar":
                return new Eliminar();
            default:
                return null;
        }
    }
}
