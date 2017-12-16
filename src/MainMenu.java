import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args){
        ArrayList<String> firstDragonGenes = new ArrayList(3);
        ArrayList<String> secondDragonGenes = new ArrayList(3);

        firstDragonGenes.add("LL");
        firstDragonGenes.add("Mm");
        firstDragonGenes.add("ww");

        secondDragonGenes.add("ll");
        secondDragonGenes.add("Mm");
        secondDragonGenes.add("Ww");

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

        boolean run = true;
        ArrayList<Dragon> dragons = new ArrayList<>();
        dragons.add(firstDragon);
        dragons.add(secondDragon);
        Scanner scnr = new Scanner(System.in);

        while(run){
            System.out.println("Main Menu");
            System.out.println("---------");
            System.out.println("\tView a Dragon: v #");
            System.out.println("\tBreed Dragons: b # #");
            System.out.println("\tQuit:          q");

            String input = scnr.nextLine();

            if(input.charAt(0) == 'q'){
                run = false;
                System.out.println("Thanks for playing!");
            }
            else if(input.charAt(0) == 'b'){
                String[] breed = input.split(" ");
                try {
                    Dragon parent = dragons.get(Integer.parseInt(breed[1]));
                    Dragon baby = parent.breed(dragons.get(Integer.parseInt(breed[2])));
                    dragons.add(baby);
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Unrecognized dragon!");
                }
            }
            else if(input.charAt(0) == 'v'){
                String[] view = input.split(" ");
                try {
                    Dragon dragon = dragons.get(Integer.parseInt(view[1]));
                    dragon.printPhenotypes();
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Unrecognized dragon!");
                }
            }
            else {
                System.out.println("Unrecognized command!");
            }

        }
    }
}
