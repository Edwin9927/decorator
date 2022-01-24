package net.esmq.decorator;

public class MemoriaRAM extends ComputadoraDecorador{

    public MemoriaRAM(Computadora compu){
        super(compu);
    }

    @Override
    public String Marca() {
        return getCompu().Marca()+" + 4GB de memoria RAM";
    }

    @Override
    public int Costo() {
        return getCompu().Costo()+25;
    }
}
