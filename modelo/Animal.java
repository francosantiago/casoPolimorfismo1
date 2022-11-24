package modelo;

public class Animal
{
    //Atributos
    protected int peso = 0;

    //Metodos
    public void setPeso(int peso)
    {
        this.peso = peso;
    }

    public int getPeso()
    {
        return peso;
    }

    public String hablar()
    {
        return "Los animales no hablan";
    }

    
}