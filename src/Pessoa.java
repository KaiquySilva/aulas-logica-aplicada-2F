public class Pessoa {
    // Atributos de classe

    String nome;

    String sobrenome;
    // Metodo da classe

    public void falar() {
        System.out.println("falei");
    }

    public String falar(String volume) {
        return "falei " + volume;
    }

}