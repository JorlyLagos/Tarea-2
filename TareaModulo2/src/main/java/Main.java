import java.util.ArrayList;
import java.util.List;

class Recursos {
    
 
    public String obtenerMensajePOO() {
        return "PROGRAMACION ORIENTADA A OBJETOS";
    }

   
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

 
    public int multiplicar(int a, int b) {
        return a * b;
    }


    public List<Integer> generarListaNumeros(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }
}

public class Main {
    public static void main(String[] args) {
        Recursos recursos = new Recursos();

      
        String mensajePOO = recursos.obtenerMensajePOO();
        System.out.println(mensajePOO);

        
        int edadEstudiante = 20;
        String resultadoEdad = recursos.verificarEdad(edadEstudiante);
        System.out.println("Edad del estudiante: " + edadEstudiante + " - " + resultadoEdad);

        
        int num1 = 5;
        int num2 = 5;
        int resultadoMultiplicacion = recursos.multiplicar(num1, num2);
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);

     
        int x = 10; 
        List<Integer> listaNumeros = recursos.generarListaNumeros(x);
        System.out.println("Lista de numeros del 1 al " + x + ": " + listaNumeros);
    }
}
