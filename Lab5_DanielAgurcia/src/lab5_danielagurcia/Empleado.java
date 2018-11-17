package lab5_danielagurcia;

import java.util.ArrayList;
import java.util.Date;

public class Empleado {

    String nombre;
    Date fecha_nacimiento;
    String correo;
    String cargo;
    int salario;
    ArrayList<Empleado> lista_contratados = new ArrayList();

    public Empleado() {
    }

    public ArrayList<Empleado> getLista_contratados() {
        return lista_contratados;
    }

    public void setLista_contratados(ArrayList<Empleado> lista_contratados) {
        this.lista_contratados = lista_contratados;
    }

    public Empleado(String nombre, Date fecha_nacimiento, String correo, String cargo, int salario) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String toString2() {
        return "Nombre: " + nombre + "\n fecha de nacimiento: " + fecha_nacimiento + "\n correo: " + correo + "\n cargo: " + cargo + "\n salario: " + salario + "\n lista de contratados: " + lista_contratados;
    }

    public String toString() {
        return nombre;
    }
}
