import java.util.Scanner;

//Calculadora de indice de masa corporal
//peso(kg)/altura(metros) al cuadrado
//bajo < 18.5 / normal 18.5-24.9 / sobrepeso 25-29.9 / obeso >30
public class Main {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg");
        double peso = cargaDatos.nextDouble();

        System.out.println("Ingrese su altura en Metros");
        double altura = cargaDatos.nextDouble();
        double calculoIMC = peso / (altura * altura);

        if(calculoIMC <= 18.5){
            System.out.println("Tienes un peso bajo");
        }else if(calculoIMC >= 18.5 && calculoIMC <= 24.9){
            System.out.println("Tienes un peso normal");
        } else if (calculoIMC >= 25 && calculoIMC <= 29.9) {
            System.out.println("Tienes sobrepeso");
        }else{
            System.out.println("Tienes obesidad");
        }
    }
}