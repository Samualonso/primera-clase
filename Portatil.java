public class Portatil {
    //El propietario del portatil.
    private String propietario;
    //El porcentaje de la bater�a.
    private int porcentajeBateria;
    //El portatil est� encendido o no.
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
    
    public void cargarBateria(int porcentajeBateriaA�adido) {
        porcentajeBateria = porcentajeBateria + porcentajeBateriaA�adido;
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
        String estaEncendido = "si";
        if (encendido == true) {
            estaEncendido = "si";
        }
        else {
            estaEncendido = "no";
        }
        System.out.println("Propietario: " + propietario + " | Porcentaje de bater�a actual: " + porcentajeBateria + " | Ordenador encendido: " + estaEncendido);
    }
    
    public String getTodosLosDetalles() {
        String estaEncendido = "si";
        if (encendido == true) {
            estaEncendido = "si";
        }
        else {
            estaEncendido = "no";
        }
        String todosLosDetalles = "Propietario: " + propietario + " | Porcentaje de bater�a actual: " + porcentajeBateria + " | Ordenador encendido: " + estaEncendido;
        return todosLosDetalles;
    }
}