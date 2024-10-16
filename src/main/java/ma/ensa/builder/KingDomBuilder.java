package ma.ensa.builder;

import ma.ensa.model.KingDom;

public class KingDomBuilder {
    private KingDom kingDom;

    public KingDomBuilder() {
        kingDom = new KingDom();
    }

    public KingDomBuilder addKing(String king) {
        kingDom.setKing(king);
        return this;
    }

    public KingDomBuilder addCountry(String name, String... details) {
        kingDom.addCountry(name, details);
        return this;
    }

    public KingDomBuilder addSoldiersOnEdges(String soldiers) {
        kingDom.addSoldiersOnEdges(soldiers);
        return this;
    }

    public KingDom build() {
        return kingDom;
    }
}
