package ec.ejemplo.pojo;

public class Persona {
    
    public Persona(Long cedula, String nombre, int edad, String sexo, String lugarResidencia, String educacion) {
        super();
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.lugarResidencia = lugarResidencia;
        this.educacion = educacion;
    }
    
    public Persona() {
        super();
    }

    private Long cedula;
    private String nombre;
    private int edad;
    private String sexo;
    private String lugarResidencia;
    private String educacion;
    

    
    public Long getCedula() {
        return cedula;
    }
    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getLugarResidencia() {
        return lugarResidencia;
    }
    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }
    public String getEducacion() {
        return educacion;
    }
    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }
    
    

}
