import java.util.Scanner;

import Model.Disciplina;
import Model.Estudante;
import Model.Livro;

public class View {
    Scanner input = new Scanner(System.in);

    public int inputInteiro(){
        int entrada;
        while(true){
            try{
                entrada = input.nextInt();
                break;
            } catch(Exception exception) {
                System.out.println("Valor inválido! Digite um número inteiro:");
                input.nextLine();
            }
        }
        return entrada;
    }
    
    public int inputIdEstudante(){
        System.out.println("Digite o ID do Estudante:");
        int entrada = inputInteiro();
        input.nextLine();
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
        int entrada = inputInteiro();
        input.nextLine();
        return entrada;
    }

    public String inputNomeDisciplina(){
        System.out.println("Digite o nome da disciplina:");
        String entrada = input.nextLine();
        return entrada;
    }

    public int inputIdLivro(){
        System.out.println("Digite o ID do livro:");
        int entrada = inputInteiro();
        input.nextLine();
        return entrada;
    }

    public String inputTituloLivro(){
        System.out.println("Digite o titulo do livro:");
        String entrada = input.nextLine();
        return entrada;
    }

    public void output(String string){
        System.out.println(string);
    }

    public String inputString(){
        return input.nextLine();
    }

    public int inputInt(){
        return inputInteiro();
    }

    public void exibirDadosEstudante(Estudante estudante){
        System.out.println("Estudante: " + estudante.getId() + " || Nome: " + estudante.getNome() + " || Curso: " + estudante.getCurso());
    }

    public void exibirDisciplina(Disciplina disciplina){
        System.out.println("Disciplina: " + disciplina.getId() + " || Nome: " + disciplina.getNome());
    }

    public void exibirLivro(Livro livro){
        System.out.println("Livro: " + livro.getId() + " || Titulo: " + livro.getTitulo());
    }
}