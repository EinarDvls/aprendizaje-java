public class Impresion{

    public static void main(String[] args){

        String nombre = "Alejandro";
        int edad = 28; 

        System.out.print("Mi nombre es \"" + nombre + "\"\n");

        double peso = 85.3685;

        System.out.printf("Mi nombre es %s con una edad de %d y mi peso es %.2f kilos\n", nombre, edad, peso);
        
    }

}