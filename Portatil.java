public class Portatil {
    //El propietario del portatil.
    private String propietario;
    //El porcentaje de la batería.
    private int porcentajeBateria;
    //El portatil está encendido o no.
    private boolean encendido; 
    
    //Este es el constructor, el cual inicializa los atributos.
    public Portatil(String propietarioActual, int bateria) {
        propietario = propietarioActual;
        porcentajeBateria = bateria;
        encendido = true;
    }
    
    //Este método devuelve el nombre del propietario.
    public String getPropietario() {
        return propietario;
    }
    
    //Este método devuelve la batería que queda.
    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }
    
    //Este método indica si el portátil está encendido o apagado.
    public boolean getEncendido() {
        return encendido;
    }
    
    //Este método permite cambiar el nombre al propietario.
    public void setPropietario(String Propietario) {
        this.propietario = Propietario;
    }
    
    //Este método permite agregar cantidad de batería al portátil.
    public void cargarBateria(int porcentajeBateriaAñadido) {
        porcentajeBateria = porcentajeBateria + porcentajeBateriaAñadido;
    }
    
    //Este método cambia el portátil de encendido a apagado y viceversa.
    public void botonEncendido() {
        if (encendido == true) {
            encendido = false;
        }
        else {
            encendido = true;
        }
    }
    
    //Este método imprime los detalles del portátil.
    public void imprimirTodosLosDetalles() {
        System.out.println(getTodosLosDetalles());
    }
    
    //Este método devuelve todos los detalles del portátil.
    public String getTodosLosDetalles() {
        String estaEncendido = "no";
        if (encendido == true) {
            estaEncendido = "si";
        }
        String todosLosDetalles = "Propietario: " + propietario + " | Porcentaje de batería actual: " + porcentajeBateria + " | Ordenador encendido: " + estaEncendido;
        return todosLosDetalles;
    }
}