import Model.Disciplina;
import Model.Estudante;
import Model.Livro;

public class Main {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller(new Estudante(), new Disciplina(), new Livro(), new View());
        controller.insertEstudante();
        controller.listarEstudantes();
    }
}
