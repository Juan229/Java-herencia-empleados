package quiz;

class Empleado extends Persona {

  
    double salario;
    String cargo;

    
    public Empleado(String nombre, int edad, String cargo, double salario) {
        super(nombre, edad);
        this.cargo = cargo;
        this.salario = salario;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // 
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
}

