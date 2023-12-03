import java.util.ArrayList;

import Model.Disciplina;
import Model.Estudante;
import Model.Livro;

public class Controller {
    private Estudante estudante;
    private Disciplina disciplina;
    private Livro livro;
    private View view;
    private ArrayList<Estudante> estudantes;

    public Controller(Estudante estudante, Disciplina disciplina, Livro livro, View view) {
        this.estudante = new Estudante();
        this.disciplina = new Disciplina();
        this.livro = new Livro();
        this.view = new View();
    }

    public void insertEstudante(){
        estudante.setId(view.inputIdEstudante());
        estudante.setNome(view.inputNomeEstudante());
        estudante.setCurso(view.inputCursoEstudante());
        estudantes.add(estudante);
    }

    public void insertDisciplina(){
        disciplina.setId(view.inputIdDisciplina());
        disciplina.setNome(view.inputNomeDisciplina());
    }

    public void insertLivro(){
        livro.setId(view.inputIdLivro());
        livro.setTitulo(view.inputTituloLivro());
    }

    public ArrayList<Estudante> getEstudantes(){
        return estudantes;
    }

    public void listarEstudantes(){
        for(int i = 0;i<estudantes.size();i++){
            view.exibirDadosEstudante(estudantes.get(i));
        }
    }
}