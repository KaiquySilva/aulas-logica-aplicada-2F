public class Main {
    public static void main(String[] args) {
        // Aula de Orientaçao a objetos
        // Declarar objetos

        Pessoa adao;

        // instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();

        // Definiçao do formato
        adao.nome = "Adao";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";

        // Adicionar comportamento
        adao.falar();
        eva.falar();

    }
}