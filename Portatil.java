public class Portatil {
    //El propietario del portatil.
    private String propietario;
    //El porcentaje de la batería.
    private int porcentajeBateria;
    //El portatil está encendido o no.
    private boolean encendido;
    
    public Portatil(String propietarioActual, int bateria) {
        propietario = propietarioActual;
        porcentajeBateria = bateria;
        encendido = true;
    }
    
    public String getPropietario() {
        return propietario;
    }
    
    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }
    
    public boolean getEncendido() {
        return encendido;
    }
    
    public void setPropietario(String Propietario) {
        this.propietario = Propietario;
    }
    
    public void cargarBateria(int porcentajeBateriaAñadido) {
        porcentajeBateria = porcentajeBateria + porcentajeBateriaAñadido;
    }
    
    public void botonEncendido() {
        if (encendido == true) {
            encendido = false;
        }
        else {
            encendido = true;
        }
    }
    
    public void imprimirTodosLosDetalles() {
        System.out.println(getTodosLosDetalles());
    }
    
    public String getTodosLosDetalles() {
        String estaEncendido = "no";
        if (encendido == true) {
            estaEncendido = "si";
        }
        String todosLosDetalles = "Propietario: " + propietario + " | Porcentaje de batería actual: " + porcentajeBateria + " | Ordenador encendido: " + estaEncendido;
        return todosLosDetalles;
    }
}