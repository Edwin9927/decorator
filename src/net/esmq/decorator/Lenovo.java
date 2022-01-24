package net.esmq.decorator;

public class Lenovo implements Computadora{

    public Lenovo(){

    }

    @Override
    public String Marca() {
        return "Lenovo";
    }

    @Override
    public int Costo() {
        return 600;
    }
}
