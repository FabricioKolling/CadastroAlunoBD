package principal;


import model.Aluno;


public class Principal {

    public static void main(String[] args) {
        // Cria objeto vazio de aluno apenas para manipular o métodos relacionados a MinhaLista
        Aluno objetoaluno = new Aluno();
//Insere um objeto completo de Aluno em MinhaLista
        objetoaluno.insertAlunoBD(new Aluno(1111, "João", 95, "Sistemas", 7));
        System.out.println("\n ##########----------TESTE 1--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
// Insere um SEGUNDO objeto completo de Aluno em MinhaLista
        objetoaluno.insertAlunoBD(new Aluno(2222, "Maria", 21, "Computação", 2));
        System.out.println("\n ##########----------TESTE 2--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
// APAGA um objeto de Aluno em MinhaLista Utilizando o campo ID como referência.
        objetoaluno.deleteAlunoBD(1111);
        System.out.println("\n ##########----------TESTE 3--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
// EDITA um objeto de Aluno dentro de MinhaLista Utilizando o campo ID como referência e mandando outro objeto como modelo.
        Aluno objetoaluno2 = new Aluno(2222, "Maria da Silva", 25, "Computação Plus", 3);
        objetoaluno.updateAlunoBD(2222, objetoaluno2);
        System.out.println("\n ##########----------TESTE 4--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
    }
}
