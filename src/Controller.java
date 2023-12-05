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
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Livro> livros;
    private ArrayList<int[]> matriculas;
    private ArrayList<int[]> reservas;

    public Controller(Estudante estudante, Disciplina disciplina, Livro livro, View view) {
        this.estudante = new Estudante();
        this.disciplina = new Disciplina();
        this.livro = new Livro();
        this.view = new View();
        this.estudantes = new ArrayList<Estudante>();
        this.disciplinas = new ArrayList<Disciplina>();
        this.livros = new ArrayList<Livro>();
        this.matriculas = new ArrayList<int[]>();
        this.reservas = new ArrayList<int[]>();
    }

    public void consumirApiEstudantes(){
        estudantes = consumidorAPIAluno.consumir();
    }

    public void insertEstudante(){
        Estudante estudante = new Estudante();
        estudante.setId(view.inputIdEstudante());
        estudante.setNome(view.inputNomeEstudante());
        estudante.setCurso(view.inputCursoEstudante());
        this.estudantes.add(estudante);
    }

    public void insertEstudante(int id, String nome, String curso){
        Estudante estudante = new Estudante();
        estudante.setId(id);
        estudante.setNome(nome);
        estudante.setCurso(curso);
        this.estudantes.add(estudante);
    }

    public void insertDisciplina(){
        Disciplina disciplina = new Disciplina();
        disciplina.setId(view.inputIdDisciplina());
        disciplina.setNome(view.inputNomeDisciplina());
        this.disciplinas.add(disciplina);
    }

    public void insertDisciplina(int id, String nome){
        Disciplina disciplina = new Disciplina();
        disciplina.setId(id);
        disciplina.setNome(nome);
        this.disciplinas.add(disciplina);
    }

    public void insertLivro(){
        Livro livro = new Livro();
        livro.setId(view.inputIdLivro());
        livro.setTitulo(view.inputTituloLivro());
        this.livros.add(livro);
    }

    public void insertLivro(int id, String titulo){
        Livro livro = new Livro();
        livro.setId(id);
        livro.setTitulo(titulo);
        this.livros.add(livro);
    }

    public ArrayList<Estudante> getEstudantes(){
        return estudantes;
    }

    public void listarEstudantes(){
        for(int i = 0;i<estudantes.size();i++){
            view.exibirDadosEstudante(estudantes.get(i));
        }
    }

    public int verDadosEstudante(){
        int id = view.inputIdEstudante();
        for(int i = 0;i<estudantes.size();i++){
            if(id==estudantes.get(i).getId()){
                view.exibirDadosEstudante(estudantes.get(i));
                break;
            }
        }
        return id;
    }

    public void fazerMatricula(){
        int idEstudante = view.inputIdEstudante();
        int idDisciplina = view.inputIdDisciplina();
        int[] matricula = new int[2];
        matricula[0] = idEstudante;
        matricula[1] = idDisciplina;
        matriculas.add(matricula);
    }

    public void listarDisciplinasEstudante(){
        int id = verDadosEstudante();
        for(int i = 0;i<matriculas.size();i++){
            if(id==matriculas.get(i)[0]){
                for(int j = 0;j<disciplinas.size();j++){
                    if(matriculas.get(i)[1]==disciplinas.get(j).getId()){
                        view.exibirDisciplina(disciplinas.get(j));
                    }
                }
            }
        }
    }

    public void cancelarMatricula(){
        int idEstudante = view.inputIdEstudante();
        int idDisciplina = view.inputIdDisciplina();
        for(int i = 0;i<matriculas.size();i++){
            if(matriculas.get(i)[0]==idEstudante && matriculas.get(i)[1]==idDisciplina){
                matriculas.remove(i);
                break;
            }
        }
        
    }

    public void fazerReserva(){
        int idEstudante = view.inputIdEstudante();
        int idLivro = view.inputIdLivro();
        int[] reserva = new int[2];
        reserva[0] = idEstudante;
        reserva[1] = idLivro;
        reservas.add(reserva);
    }

    public void listarReservasEstudante(){
        int id = verDadosEstudante();
        for(int i = 0;i<reservas.size();i++){
            if(id==reservas.get(i)[0]){
                for(int j = 0;j<livros.size();j++){
                    if(reservas.get(i)[1]==livros.get(j).getId()){
                        view.exibirLivro(livros.get(j));
                    }
                }
            }
        }
    }

    public void cancelarReserva(){
        int idEstudante = view.inputIdEstudante();
        int idLivro = view.inputIdLivro();
        for(int i = 0;i<reservas.size();i++){
            if(reservas.get(i)[0]==idEstudante && reservas.get(i)[1]==idLivro){
                reservas.remove(i);
                break;
            }
        }
    }

    public void run(){
        int opcao = 99;
        while(opcao!=0){
            view.output("----------------------------");
            view.output("Menu Principal\n1. Carregar estudantes\n2. Listar todos os estudantes\n3. Exibir detalhes do estudante\n4. Fazer matrícula\n5. Listar matriculas do estudante\n6. Cancelar matrícula\n7. Reservar livro\n8. Listar reservas do estudante\n9. Cancelar reserva\n0. Encerrar Programa");
            view.output("----------------------------");
            opcao = view.inputInt();
            switch (opcao) {
                case 1:
                    consumirApiEstudantes();
                    view.output("------ Estudantes carregados ------");
                    view.inputString();
                    break;
                case 2:
                    view.output("------ Lista de estudantes ------");
                    listarEstudantes();
                    view.inputString();
                    break;
                case 3:
                    view.output("----------------------------");
                    verDadosEstudante();
                    break;
                case 4:
                    view.output("------ Matrícula ------");
                    fazerMatricula();
                    break;
                case 5:
                    view.output("--- Lista de disciplinas matriculadas ---");
                    listarDisciplinasEstudante();
                    break;
                case 6:
                    view.output("------ Cancelar matrícula ------");
                    cancelarMatricula(); 
                    break;
                case 7:
                    view.output("------ Reserva ------");
                    fazerReserva();
                    break;
                case 8:
                    view.output("--- Lista de livros reservados ---");
                    listarReservasEstudante();
                    break;
                case 9:
                    view.output("------ Cancelar reserva ------");
                    cancelarReserva();
                    break;
                default:
                    break;
            }
            view.output("---------------------------------------------");
            view.output("Pressione ENTER para voltar ao menu principal");
            String bp = view.inputString();
        }
    }
}