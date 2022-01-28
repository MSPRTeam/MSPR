package securigo.infrastructure;

import securigo.services.AgentStockageInterface;
import securigo.domaine.Agent;
import securigo.domaine.Materiel;

import java.util.ArrayList;
import java.util.List;

public class agentFichierStockage implements AgentStockageInterface {
    @Override
    public Agent recupererAgent(String reference) {
        List<Materiel> materielsAffectesAAgent = new ArrayList<Materiel>();
        //TODO récupérer les infos des agents depuis le fichier + récupérer la mission et le matériel de l'agent
        return new Agent("Blabla","A","B","C");
    }
}
/// doPost(request)
