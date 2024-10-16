package ma.ensa.model;

import java.util.List;

public class War {
    private List<KingDom> kingdoms;
    private String map;

    public War(List<KingDom> kingdoms, String map) {
        this.kingdoms = kingdoms;
        this.map = map;
    }

    public void prepareAttack() {
        // Logic for preparing an attack
        for (KingDom kingdom : kingdoms) {
            if (kingdom.currentPower() > 0) {
                kingdom.addSoldiersOnEdges("50");
            }
        }
    }

    public void start() {
        // Logic for starting the war
        for (KingDom kingdom : kingdoms) {
            // Attack logic
        }
    }

    // Additional methods as required
}
