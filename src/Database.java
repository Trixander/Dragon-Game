import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {
    //Genotypes
    ArrayList<String[]> GENOTYPES = new ArrayList<>();
    ArrayList<Phenotype> PHENOTYPES = new ArrayList<>();

    public Database() {
        //Genotypes
        String[] tailShapes = {"TT","Tt","tt"};
        String[] tailLengthsOne = {"LL","Ll","ll"};
        String[] tailLengthsTwo = {"MM","Mm","mm"};
        String[] spikeTail = {"EE","Ee","ee"};
        String[] cudgelTail = {"CC","Cc","cc"};
        String[] bladeTail = {"BB","Bb","bb"};
        String[] wingSizeOne = {"WW","Ww","ww"};
        String[] wingSizeTwo = {"XX","Xx","xx"};
        String[] bodyLengthOne = {"LL","Ll","ll"};
        String[] bodyLengthTwo = {"MM","Mm","mm"};
        String[] featherWings = {"BB","Bb","bb"};
        String[] insectWings = {"II","Ii","ii"};
        String[] faerieWings = {"FF","Ff","ff"};
        String[] ramHorns = {"RR","Rr","rr"};
        String[] spikeHorns = {"SS","Ss","ss"};
        String[] crownHorns = {"CC","Cc","cc"};
        String[] buildOne = {"BB","Bb","bb"};
        String[] buildTwo = {"CC","Cc","cc"};
        String[] sizeOne = {"SS","Ss","ss"};
        String[] sizeTwo = {"TT","Tt","tt"};
        String[] venom = {"VV","Vv","vv"};
        String[] nocturnalEyes = {"NN","Nn","nn"};
        String[] infraredEyes = {"II","Ii","ii"};
        String[] xrayEyes = {"XX","Xx","xx"};
        String[] clawsLength = {"CC","Cc","cc"};
        String[] serratedClaw = {"SS","Ss","ss"};
        String[] tongue = {"TT","Tt","tt"};
        String[] nose = {"NN","Nn","nn"};
        String[] monsterScent = {"SS","Ss","ss"};
        String[] itemScent = {"TT","Tt","tt"};
        String[] breathShapeOne = {"BB","Bb","bb"};
        String[] breathShapeTwo = {"CC","Cc","cc"};
        String[] magicOne = {"MM","Mm","mm"};
        String[] magicTwo = {"NN","Nn","nn"};
        String[] magicThree = {"OO","Oo","oo"};
        String[] bellyPlating = {"BB","Bb","bb"};
        String[] scales = {"SS","Ss","ss"};
        String[] plateScales = {"PP","Pp","pp"};
        String[] featherScales = {"FF","Ff","ff"};
        String[] spikeLength = {"BB","Bb","bb"};
        String[] spikeLocation = {"SS","Ss","ss"};
        String[] spikeArms = {"AA","Aa","aa"};
        String[] legs = {"LL","Ll","ll"};
        String[] sex = {"XX","XY"};
        GENOTYPES.add(tailShapes);
        GENOTYPES.add(tailLengthsOne);
        GENOTYPES.add(tailLengthsTwo);
        GENOTYPES.add(spikeTail);
        GENOTYPES.add(cudgelTail);
        GENOTYPES.add(bladeTail);
        GENOTYPES.add(bodyLengthOne);
        GENOTYPES.add(bodyLengthTwo);
        GENOTYPES.add(wingSizeOne);
        GENOTYPES.add(wingSizeTwo);
        GENOTYPES.add(featherWings);
        GENOTYPES.add(insectWings);
        GENOTYPES.add(faerieWings);
        GENOTYPES.add(ramHorns);
        GENOTYPES.add(spikeHorns);
        GENOTYPES.add(cudgelTail);
        GENOTYPES.add(clawsLength);
        GENOTYPES.add(legs);
        GENOTYPES.add(sex);
        GENOTYPES.add(crownHorns);
        GENOTYPES.add(buildOne);
        GENOTYPES.add(buildTwo);
        GENOTYPES.add(sizeOne);
        GENOTYPES.add(sizeTwo);
        GENOTYPES.add(venom);
        GENOTYPES.add(serratedClaw);
        GENOTYPES.add(nocturnalEyes);
        GENOTYPES.add(infraredEyes);
        GENOTYPES.add(xrayEyes);
        GENOTYPES.add(tongue);
        GENOTYPES.add(nose);
        GENOTYPES.add(monsterScent);
        GENOTYPES.add(itemScent);
        GENOTYPES.add(breathShapeOne);
        GENOTYPES.add(breathShapeTwo);
        GENOTYPES.add(magicOne);
        GENOTYPES.add(magicTwo);
        GENOTYPES.add(magicThree);
        GENOTYPES.add(bellyPlating);
        GENOTYPES.add(scales);
        GENOTYPES.add(plateScales);
        GENOTYPES.add(featherScales);
        GENOTYPES.add(spikeLength);
        GENOTYPES.add(spikeLocation);
        GENOTYPES.add(spikeArms);

        //Phenotypes
        String[] longTailOne = {"LL"};
        String[] longTailTwo = {"MM"};
        String[] mediumTailOne = {"Ll"};
        String[] mediumTailTwo = {"Mm"};
        String[] shortTailOne = {"mm"};
        String[] shortTailTwo = {"ll"};
        String[] spikedTail = {"ee"};
        String[] cudgeledTail = {"cc"};
        String[] bladedTail = {"bb"};
        String[] bigWingOne = {"WW"};
        String[] bigWingTwo = {"XX"};
        String[] mediumWingOne = {"Ww"};
        String[] mediumWingTwo = {"Xx"};
        String[] smallWingOne = {"ww"};
        String[] smallWingTwo = {"xx"};
        String[] featheredWings = {"bb"};
        String[] insectoidWings = {"II"};
        String[] fairyWings = {"ff"};
        String[] ramHorn = {"rr"};
        String[] spikedHorns = {"ss"};
        String[] crownHorn = {"cc"};
        String[] longBodyOne = {"LL"};
        String[] longBodyTwo = {"MM"};
        String[] mediumBodyOne = {"Ll"};
        String[] mediumBodyTwo = {"Mm"};
        String[] shortBodyOne = {"ll"};
        String[] shortBodyTwo = {"mm"};
        String[] muscularBodyOne = {"BB"};
        String[] muscularBodyTwo = {"CC"};
        String[] averageBodyOne = {"Bb"};
        String[] averageBodyTwo = {"Cc"};
        String[] thinBodyOne = {"bb"};
        String[] thinBodyTwo = {"cc"};
        String[] largeSizeOne = {"SS"};
        String[] largeSizeTwo = {"TT"};
        String[] mediumSizeOne = {"Ss"};
        String[] mediumSizeTwo = {"Tt"};
        String[] smallSizeOne = {"ss"};
        String[] smallSizeTwo = {"tt"};
        String[] venomous = {"vv"};
        String[] nocturnalEyed = {"nn"};
        String[] infraredEyed = {"ii"};
        String[] xrayEyed = {"xx"};
        String[] shortClawed = {"CC","Cc"};
        String[] longClawed = {"cc"};
        String[] serratedClaws = {"ss"};
        String[] prehensileTongue = {"tt"};
        String[] strongNose = {"nn"};
        String[] monsterScents = {"ss"};
        String[] itemScents = {"tt"};
        String[] lineShape = {"bb"};
        String[] male = {"XY"};
        String[] female = {"XX"};

        Map tailLong = new HashMap();
        tailLong.put("tailLength", 5);
        PHENOTYPES.add(new Phenotype("Long Tail One", longTailOne, tailLong));
        PHENOTYPES.add(new Phenotype("Long Tail Two", longTailTwo, tailLong));

        Map tailMed = new HashMap();
        tailMed.put("tailLength", 2.5);
        PHENOTYPES.add(new Phenotype("Medium Tail One", mediumTailOne, tailMed));
        PHENOTYPES.add(new Phenotype("Medium Tail Two", mediumTailTwo, tailMed));

        Map tailShort = new HashMap();
        tailShort.put("tailLength", 0);
        PHENOTYPES.add(new Phenotype("Short Tail One", shortTailOne, tailShort));
        PHENOTYPES.add(new Phenotype("Short Tail Two", shortTailTwo, tailShort));

        PHENOTYPES.add(new Phenotype("Male",male));
        PHENOTYPES.add(new Phenotype("Female",female));

    }


}
