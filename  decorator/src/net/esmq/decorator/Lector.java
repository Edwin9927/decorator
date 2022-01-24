package net.esmq.decorator;

public class Lector extends ComputadoraDecorador {

    public Lector (Computadora compu){
        super(compu);
    }

    @Override
    public String Marca() {
        return getCompu().Marca()+" + Lector Blu-ray";
    }

    @Override
    public int Costo() {
        return getCompu().Costo()+85;
    }
}
