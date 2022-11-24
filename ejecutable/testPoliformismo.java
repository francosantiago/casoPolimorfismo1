package ejecutable;

import modelo.Animal;
import modelo.cerdo;
import modelo.serpiente;
import modelo.vaca;

public class testPoliformismo 
{
    public static void main(String[] args) 
    {
        vaca deisy = new vaca();
        Animal animal = new vaca();
        serpiente serpiente = new serpiente();
        cerdo marrano = new cerdo();

        System.out.println("daisy dice = " + deisy.hablar());
        System.out.println("Animal dice = " + animal.hablar());
        System.out.println("Serpiente dice = " + serpiente.hablar());
        System.out.println("Cerdo dice = " + marrano.hablar());

    }
}