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

        // Criar mais objetos
        Pessoa qualquer = new Pessoa();
        // Declarar objeto
        Pessoa rainha;
        // Instanciaçao do objeto
        rainha = new Pessoa();
        // Definindo forma da pessoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definiçao de comportamento
        System.out.println(rainha.falar("alto"));



    }
}
