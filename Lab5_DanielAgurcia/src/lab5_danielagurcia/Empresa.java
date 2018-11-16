package lab5_danielagurcia;

public class Empresa {

    String nombre;
    int capital_financiero;
    int fecha_fundacion;
    String ubicacion;
    int id_sucursal;
    String pin_acceso;

    public Empresa() {
    }

    public Empresa(String nombre, int capital_financiero, int fecha_fundacion, String ubicacion, int id_sucursal, String pin_acceso) {
        this.nombre = nombre;
        this.capital_financiero = capital_financiero;
        this.fecha_fundacion = fecha_fundacion;
        this.ubicacion = ubicacion;
        this.id_sucursal = id_sucursal;
        this.pin_acceso = pin_acceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapital_financiero() {
        return capital_financiero;
    }

    public void setCapital_financiero(int capital_financiero) {
        this.capital_financiero = capital_financiero;
    }

    public int getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(int fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getPin_acceso() {
        return pin_acceso;
    }

    public void setPin_acceso(String pin_acceso) {
        this.pin_acceso = pin_acceso;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
