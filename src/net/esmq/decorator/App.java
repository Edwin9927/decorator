package net.esmq.decorator;

public class App {
    public static void main( String[] args )
    {
        Computadora compu1 = new MemoriaRAM(new Apple());
        System.out.println("Marca: "+compu1.Marca());
        System.out.println("Costo: "+compu1.Costo());

        Computadora compu2 = new Lector(new MemoriaRAM(new Lenovo()));
        System.out.println("Marca: "+compu2.Marca());
        System.out.println("Costo: "+compu2.Costo());

        Computadora compu3 = new Tarjeta(new MemoriaRAM(new HP()));
        System.out.println("Marca: "+compu3.Marca());
        System.out.println("Costo: "+compu3.Costo());

    }
}
