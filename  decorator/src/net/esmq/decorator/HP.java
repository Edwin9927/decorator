package net.esmq.decorator;

public class HP implements Computadora{

    public HP(){

    }
    @Override
    public String Marca() {
        return "HP";
    }

    @Override
    public int Costo() {
        return 500;
    }
}
