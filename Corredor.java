public class Corredor{
    
    //DECLARE LOS ATRIBUTOS DE LA CLASE
    //Corredor SEGÚN LAS ESPECIFICACIONES
    //EN EL ENUNCIADO
    private String nombreCompleto;
    private String numeroIdentificador;
    private double estatura;
    private int edad;
    private double tiempoMeta;

    //A CONTINUACIÓN ADJUNTE TODOS LOS
    //MÉTODOS DE LA CLASE, ES DECIR, EL
    //MÉTODO CONSTRUCTOR, LOS GETTERS Y
    //LOS SETTERS
    
    public Corredor(String nombreCompleto, String numeroIdentificador, double estatura, int edad, double tiempoMeta) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificador = numeroIdentificador;
        this.estatura = estatura;
        this.edad = edad;
        this.tiempoMeta = tiempoMeta;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(String numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTiempoMeta() {
        return tiempoMeta;
    }

    public void setTiempoMeta(double tiempoMeta) {
        this.tiempoMeta = tiempoMeta;
    }

}
