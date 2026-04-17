package model;

import java.util.*;
import dao.AlunoDAO;

public class Aluno extends Pessoa {

    private String curso;
    private int fase;

    public Aluno() {
        this(0, "", 0, "", 0);
    }

    public Aluno(int id, String nome, int idade, String curso, int fase) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
// Override necessário para poder retornar os dados de Pessoa
// no toString para aluno.

    @Override
    public String toString() {
        return super.toString()
                + "\n Curso: " + this.getCurso()
                + "\n Fase:" + this.getFase()
                + "\n -----------";
    }

    // Retorna a Lista de Alunos(objetos)
    public ArrayList getMinhaLista() {
        return AlunoDAO.getMinhaLista();
    }
// Cadastra novo aluno

    public boolean insertAlunoBD(Aluno objeto) {
        AlunoDAO.getMinhaLista().add(objeto);
        return true;
    }
// Deleta um aluno específico pelo seu campo ID

    public boolean deleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        AlunoDAO.getMinhaLista().remove(indice);
        return true;
    }
// Edita um aluno específico pelo seu campo ID

    public boolean updateAlunoBD(int id, Aluno objeto) {
        int indice = this.procuraIndice(id);
        AlunoDAO.getMinhaLista().set(indice, objeto);
        return true;
    }
    // procura o ÍNDICE de objeto da MinhaLista que contém o ID enviado.

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AlunoDAO.minhaLista.size(); i++) {
            if (AlunoDAO.getMinhaLista().get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
}
