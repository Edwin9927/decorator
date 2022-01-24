package net.esmq.decorator;

public class Apple implements Computadora{

    public Apple (){

    }

    @Override
    public String Marca() {
        return "Apple";
    }

    @Override
    public int Costo() {
        return 950;
    }
}
