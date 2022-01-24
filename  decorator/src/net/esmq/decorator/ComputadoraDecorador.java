package net.esmq.decorator;

public abstract class ComputadoraDecorador implements Computadora{

    private Computadora compu;

    public ComputadoraDecorador (Computadora compu){
        this.compu = compu;
    }

    protected Computadora getCompu(){
        return compu;
    }

}
