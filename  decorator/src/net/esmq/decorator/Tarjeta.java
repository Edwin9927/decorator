package net.esmq.decorator;

public class Tarjeta extends ComputadoraDecorador{

    public Tarjeta(Computadora compu) {
        super(compu);
    }

    @Override
    public String Marca() {
        return getCompu().Marca()+" + Tatjeta Nvidia GeForce GTX";
    }

    @Override
    public int Costo() {
        return getCompu().Costo()+125;
    }
}
