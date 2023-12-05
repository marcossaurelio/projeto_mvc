import Model.Disciplina;
import Model.Estudante;
import Model.Livro;

public class Main {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller(new Estudante(), new Disciplina(), new Livro(), new View());
        controller.insertDisciplina(1,"Álgebra");
        controller.insertDisciplina(2,"Filosofia I");
        controller.insertDisciplina(3,"Fundamentos da computação");
        controller.insertDisciplina(4,"Programação Orientada a Objetos");
        controller.insertDisciplina(5,"Química II");
        controller.insertLivro(1, "O Código da Vinci");
        controller.insertLivro(2, "A Revolução dos Bichos");
        controller.insertLivro(3, "O Príncipe");
        controller.run();
    }
}
