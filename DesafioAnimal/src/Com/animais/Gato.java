package Com.animais;

public class Gato extends Animal{
    public Gato(String nome, String cor) {
        super(nome, cor);
    }

    public void arranharMoveis(){
        System.out.println("scratch");
    }
    @Override
    public void emitirSom(){
        System.out.println("miau");
    }
}
