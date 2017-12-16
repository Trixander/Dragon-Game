import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dragon {
    private int health;
    private int magic;
    private int size;
    private Double damage;
    private Double speed;
    private ArrayList<String> genes;
    private Random rand = new Random();

    public Dragon(ArrayList<String> genes) {
        this.health = 100;
        this.magic = 0;
        this.size = 1;
        this.damage = 10.0;
        this.speed = 5.0;
        this.genes = genes;
    }

    public ArrayList<String> getGenes() { return this.genes; }

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
}
