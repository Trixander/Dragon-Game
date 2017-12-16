import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    public static void main(String[] args){
        ArrayList<String> firstDragonGenes = new ArrayList(3);
        ArrayList<String> secondDragonGenes = new ArrayList(3);

        firstDragonGenes.add("LL");
        firstDragonGenes.add("Mm");
        firstDragonGenes.add("bb");

        secondDragonGenes.add("ll");
        secondDragonGenes.add("Mm");
        secondDragonGenes.add("bb");

        Dragon firstDragon = new Dragon(firstDragonGenes);
        Dragon secondDragon = new Dragon(secondDragonGenes);


        firstDragon.printPhenotypes();
        System.out.println();
        secondDragon.printPhenotypes();
        System.out.println();

        Dragon breedTest = firstDragon.breed(secondDragon);
        ArrayList<String> testGenesNew = breedTest.getGenes();

        for(int i = 0; i < testGenesNew.size(); i++) {
            System.out.println(testGenesNew.get(i));
        }
        System.out.println();
        Dragon newDragon = new Dragon(testGenesNew);

        newDragon.printPhenotypes();
    }
}
