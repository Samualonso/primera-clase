public class Portatil {
    //El propietario del portatil.
    private String propietario;
    //El porcentaje de la bater�a.
    private int porcentajeBateria;
    //El portatil est� encendido o no.
    private boolean encendido; 
    
    //Este es el constructor, el cual inicializa los atributos.
    public Portatil(String propietarioActual, int bateria) {
        propietario = propietarioActual;
        porcentajeBateria = bateria;
        encendido = true;
    }
    
    //Este m�todo devuelve el nombre del propietario.
    public String getPropietario() {
        return propietario;
    }
    
    //Este m�todo devuelve la bater�a que queda.
    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }
    
    //Este m�todo indica si el port�til est� encendido o apagado.
    public boolean getEncendido() {
        return encendido;
    }
    
    //Este m�todo permite cambiar el nombre al propietario.
    public void setPropietario(String Propietario) {
        this.propietario = Propietario;
    }
    
    //Este m�todo permite agregar cantidad de bater�a al port�til.
    public void cargarBateria(int porcentajeBateriaA�adido) {
        porcentajeBateria = porcentajeBateria + porcentajeBateriaA�adido;
    }
    
    //Este m�todo cambia el port�til de encendido a apagado y viceversa.
    public void botonEncendido() {
        if (encendido == true) {
            encendido = false;
        }
        else {
            encendido = true;
        }
    }
    
    //Este m�todo imprime los detalles del port�til.
    public void imprimirTodosLosDetalles() {
        System.out.println(getTodosLosDetalles());
    }
    
    //Este m�todo devuelve todos los detalles del port�til.
    public String getTodosLosDetalles() {
        String estaEncendido = "no";
        if (encendido == true) {
            estaEncendido = "si";
        }
        String todosLosDetalles = "Propietario: " + propietario + " | Porcentaje de bater�a actual: " + porcentajeBateria + " | Ordenador encendido: " + estaEncendido;
        return todosLosDetalles;
    }
}