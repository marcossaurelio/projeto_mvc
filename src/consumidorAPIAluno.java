
import java.util.ArrayList;
import java.util.List;

import Model.Estudante;
import ms.JsonParser;
import ms.ServicoDeEstudantes;

public class consumidorAPIAluno {

    public static ArrayList<Estudante> consumir(){
        ArrayList<Estudante> estudantes = new ArrayList<>();
        ServicoDeEstudantes servico = new ServicoDeEstudantes();
        JsonParser parser = new JsonParser();

        // Faz a chamada ao serviço e obtém a resposta em formato JSON
        String jsonResposta = servico.obterDadosEstudantesComoJson();

        // Analisa a resposta JSON e obtém a lista de estudantes
        List<Estudante> listaDeEstudantes = parser.parse(jsonResposta);

        // Imprime os detalhes de cada estudante
        for (Estudante estudante : listaDeEstudantes) {
            estudantes.add(estudante);
        }
        return estudantes;
    }
}
