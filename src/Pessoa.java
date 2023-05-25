public class Pessoa extends Animal {
    // Atributos de classe


    String sobrenome;
    // Metodo da classe

    public void falar() {
        System.out.println("falei");
    }

    public String falar(String volume) {
        return "falei " + volume;
    }
    // sobreescrita do metodo
    public void comer(){
        System.out.println("pessoa comeu");
    }
}