/*
Aqui vamos simular a persistência de dados.
Nas próximas aulas nós vamos reprogramar esta classe para conectar-se com o banco de dados.
*/
package dao;
import model.Aluno;

import java.util.ArrayList;
public class AlunoDAO {
// vamos usar static para que a classe Aluno possa acessar SEM INSTANCIAR OBJETOS.

    public static ArrayList<Aluno> minhaLista = new ArrayList<>();

    public static ArrayList<Aluno> getMinhaLista() {
        return minhaLista;
    }

    public static void setMinhaLista(ArrayList minhaLista) {
        AlunoDAO.minhaLista = minhaLista;
    }
}
