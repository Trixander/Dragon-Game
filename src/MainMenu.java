import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    public static void main(String[] args){
        ArrayList<String> firstDragonGenes = new ArrayList(3);
        ArrayList<String> secondDragonGenes = new ArrayList(3);
        Dragon firstDragon = new Dragon(firstDragonGenes);
        Dragon secondDragon = new Dragon(secondDragonGenes);

        firstDragonGenes.add("Tt");
        firstDragonGenes.add("bb");
        firstDragonGenes.add("hh");

        secondDragonGenes.add("tt");
        secondDragonGenes.add("BB");
        secondDragonGenes.add("Hh");

        Dragon breedTest = firstDragon.breed(secondDragon);
        ArrayList<String> testGenesNew = breedTest.getGenes();

        for(int i = 0; i < testGenesNew.size(); i++) {
            System.out.println(testGenesNew.get(i));
        }
    }
}
