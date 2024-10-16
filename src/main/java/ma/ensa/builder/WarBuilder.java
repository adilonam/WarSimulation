package ma.ensa.builder;

import ma.ensa.model.KingDom;
import ma.ensa.model.War;

import java.util.ArrayList;
import java.util.List;

public class WarBuilder {
    private List<KingDom> kingdoms = new ArrayList<>();
    private String map;

    public WarBuilder addKingDom(KingDom kingDom) {
        kingdoms.add(kingDom);
        return this;
    }

    public WarBuilder addMap(String map) {
        this.map = map;
        return this;
    }

    public War build() {
        return new War(kingdoms, map);
    }
}
