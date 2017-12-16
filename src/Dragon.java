import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Dragon {
    private int health;
    private int magic;
    private int size;
    private int tailLength;
    private Double damage;
    private Double speed;

    private ArrayList<String> genes;

    private Random rand = new Random();
    private boolean hasSpikedTail = false;
    private Database database = new Database();
    private ArrayList<Phenotype> dragonPhenotypes = new ArrayList<>();

    private Map<String, Integer> stats = new HashMap<>();


    public Dragon(ArrayList<String> genes) {
        stats.put("health", 100);
        stats.put("magic", 0);
        stats.put("size", 1);
        stats.put("damage", 10);
        stats.put("speed", 5);
        stats.put("tailLength", 0);
        stats.put("bladeTail", 0);
        stats.put("wingLength", 0);

        /*this.health = 100;
        this.magic = 0;
        this.size = 1;
        this.damage = 10.0;
        this.speed = 5.0;

        this.tailLength = 0;
        this.speed = 5.0;*/
        this.genes = genes;

        buildDragon();
    }

    public ArrayList<String> getGenes() {
        return this.genes;
    }

    public Dragon breed (Dragon otherDragon) {
        ArrayList<String> newDragonGenes = new ArrayList<>(3);
        for(int i = 0; i < this.genes.size(); i++) {
            //Take a random character from first dragon and add it to a random character from second dragon.
            char firstGene = this.genes.get(i).charAt(rand.nextInt(this.genes.get(i).length()));
            char secondGene = otherDragon.getGenes().get(i).charAt(rand.nextInt(otherDragon.getGenes().get(i).length()));

            //Alphabetize and sort by caps.
            if(firstGene > secondGene) {
                char placeHolder = secondGene;
                secondGene = firstGene;
                firstGene = placeHolder;
            }

            newDragonGenes.add(Character.toString(firstGene) + Character.toString(secondGene));
        }
        return new Dragon(newDragonGenes);
    }

    public void buildDragon(){
        for(int i = 0; i < genes.size(); i++){
            String genotype = genes.get(i);
            boolean found = false;
            int count = 0;
            while(!found){
                String[] genotypes = database.PHENOTYPES.get(count).getGenotypes();
                for(int j = 0; j < genotypes.length; j++){
                    if(genotypes[j].equals(genotype)){
                        found = true;
                        dragonPhenotypes.add(database.PHENOTYPES.get(count));
                    }
                }
                count++;
            }
        }

        for(int i = 0; i < dragonPhenotypes.size(); i++){
            Map<String, Integer> map = dragonPhenotypes.get(i).getMap();
            map.forEach( (key, value) -> {
                int mainVal = stats.get(key);
                mainVal += value;
                stats.replace(key, mainVal);
            });
        }
    }

    public void printPhenotypes() {
        dragonPhenotypes.forEach( (phenotype) -> {
            System.out.print(phenotype.getName() + "\n");
        });
    }
}
