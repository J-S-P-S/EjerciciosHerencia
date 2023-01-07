package com.jsps.pooherencia;

//Utilizar la palabra reservada extends para heredar
public class Alumno extends Persona{ //La clase Alumno se convierte en la clase hija/subclase de la clase padre Persona

    private String  institucion;
    private double  notaMatematica;
    private double  notaCastellano;
    private double  notaHistoria;

    //Al crear un constructor con parámetros en la clase padre Persona, la llamada de constructor encadenado
    // desde la clase hija Alumno se daña, se debería sobrecargar el constructor y crear un constructor vacío.
    public Alumno (){
        //super(); // Realizar llamada al constructor vacío(sin parámetros/argumentos) clase padre Persona, aunque esta instrucción se puede omitir, ya que se hace de forma automática.
        System.out.println("Alumno: inicializando constructor");
    }

    public Alumno(String nombre, String apellido){
        super(nombre,apellido); //Se hace llamado de forma explícita al constructor de la clase padre Persona
    }

    public Alumno(String nombre, String apellido, int edad){ //Se hace llamado de forma explícita al constructor de la clase padre Persona
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre,apellido,edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institicion,
                  double notaMatematica, double notaCastellano, double notaHistoria){ //Se hace llamado de forma explícita al constructor de la clase padre Persona
        this(nombre,apellido,edad,institicion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String colegio) {
        this.institucion = colegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }


    @Override
    public String saludar(){
        String saludar = super.saludar(); //Se puede poner directo sin crear una variable string.
        return saludar + " soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        //System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
        return (notaHistoria + notaCastellano + notaMatematica)/3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio=" + this.calcularPromedio();
    }

}