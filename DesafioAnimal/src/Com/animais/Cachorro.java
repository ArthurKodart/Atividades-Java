package Com.animais;

public class Cachorro extends Animal{
    public Cachorro(String nome, String cor) {
        super(nome, cor);
    }

    public void abanarRabo(){
        System.out.println(":)");
    }
    @Override
    public void emitirSom(){
        System.out.println("auau");
    }
}
