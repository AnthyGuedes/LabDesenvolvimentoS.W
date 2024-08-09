package pkg;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emiteSom(){
        System.out.println("Au Au AU au!!");
    }
}
