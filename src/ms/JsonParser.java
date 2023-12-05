package ms;

import org.json.JSONArray;
import org.json.JSONObject;

import Model.Estudante;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public List<Estudante> parse(String responseBody) {
    	
        JSONArray estudantesArray = new JSONArray(responseBody);
        List<Estudante> estudantes = new ArrayList<>();

        for (int i = 0; i < estudantesArray.length(); i++) {
            JSONObject estudanteObj = estudantesArray.getJSONObject(i);
            Estudante estudante = new Estudante(
                    estudanteObj.getInt("id"),
                    estudanteObj.getString("nome"),
                    estudanteObj.getString("curso")
            );
            estudantes.add(estudante);
        }

        return estudantes;
    }
}
