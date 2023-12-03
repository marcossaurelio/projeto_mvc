import java.util.Scanner;

import Model.Estudante;

public class View {
    Scanner input = new Scanner(System.in);
    
    public int inputIdEstudante(){
        System.out.println("Digite o ID do Estudante:");
        int entrada = input.nextInt();
        return entrada;
    }

    public String inputNomeEstudante(){
        System.out.println("Digite o nome do Estudante:");
        String entrada = input.nextLine();
        return entrada;
    }

    public String inputCursoEstudante(){
        System.out.println("Digite o curso do Estudante:");
        String entrada = input.nextLine();
        return entrada;
    }

    public int inputIdDisciplina(){
        System.out.println("Digite o ID da disciplina:");
        int entrada = input.nextInt();
        return entrada;
    }

    public String inputNomeDisciplina(){
        System.out.println("Digite o nome da disciplina:");
        String entrada = input.nextLine();
        return entrada;
    }

    public int inputIdLivro(){
        System.out.println("Digite o ID do livro:");
        int entrada = input.nextInt();
        return entrada;
    }

    public String inputTituloLivro(){
        System.out.println("Digite o titulo do livro:");
        String entrada = input.nextLine();
        return entrada;
    }

    public void exibirDadosEstudante(Estudante estudante){
        System.out.println("ID: " + estudante.getId() + " || Nome: " + estudante.getNome() + " || Curso: " + estudante.getCurso());
    }
}