package pkg;

public class Principal {
    public static void main(String[]args) {

        Animal a = new Animal("sergio",2);
        Cachorro cusco = new Cachorro("cleiton",4);
        Rinoceronte rino = new Rinoceronte();

        a.emiteSom();
        cusco.emiteSom();
        rino.emitirSom();
    }
}