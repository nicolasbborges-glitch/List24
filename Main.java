package List24;

public class Main {
    public static void main(String[] args) {

        // EXERCÍCIO 1
        Cachorro dog = new Cachorro();
        dog.setNome("Thor");
        dog.setIdade(5);
        dog.setRaca("Labrador");
        dog.mostrarInfo();
        dog.abanarRabo();

        System.out.println("---------------------");

        Gato cat = new Gato();
        cat.setNome("Michael");
        cat.setIdade(3);
        cat.setCor("branco");
        cat.mostrarInfo();
        cat.subirNoMuro();

        System.out.println("---------------------");

        // EXERCÍCIO 2
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setAno(2020);
        carro.setPortas(4);
        carro.exibirInfo();
        carro.abrirPortaMalas();

        System.out.println("---------------------");

        // EXERCÍCIO 3
        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setSalarioBase(5000);
        gerente.setDepartamento("Financeiro");
        gerente.exibirInfo();
        gerente.gerenciar();

        System.out.println("---------------------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Ana");
        vendedor.setSalarioBase(2500);
        vendedor.exibirInfo();
        vendedor.vender();

        System.out.println("---------------------");

        // EXERCÍCIO 4
        Livro livro = new Livro();
        livro.setNome("Dom Casmurro");
        livro.setPreco(39.90);
        livro.setAutor("Machado de Assis");
        livro.mostrarInfo();
        livro.lerTrecho();

        System.out.println("---------------------");

        Filme filme = new Filme();
        filme.setNome("Interestelar");
        filme.setPreco(24.90);
        filme.setDiretor("Christopher Nolan");
        filme.mostrarInfo();
        filme.assistir();
    }
}
