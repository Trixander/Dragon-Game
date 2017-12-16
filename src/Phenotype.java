import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Phenotype {
    String name;
    String[] genotypes;
    Map<String, Integer> map;

    public Phenotype(String name, String[] genotypes, Map<String, Integer> map) {
        this.name = name;
        this.genotypes = genotypes;
        this.map = map;
    }

    public String getName() {
        return this.name;
    }

    public String[] getGenotypes(){
        return this.genotypes;
    }

    public Map<String, Integer> getMap() {
        return this.map;
    }
}





