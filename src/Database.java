import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {
    //Genotypes
    ArrayList<String[]> GENOTYPES = new ArrayList<>();
    ArrayList<Phenotype> PHENOTYPES = new ArrayList<>();

    public Database() {
        //Genotypes
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
        GENOTYPES.add(tailLengthsOne);
        GENOTYPES.add(tailLengthsTwo);
        GENOTYPES.add(spikeTail);
        GENOTYPES.add(cudgelTail);
        GENOTYPES.add(bladeTail);
        GENOTYPES.add(wingSizeOne);
        GENOTYPES.add(wingSizeTwo);
        GENOTYPES.add(featherWings);
        GENOTYPES.add(insectWings);
        GENOTYPES.add(faerieWings);
        GENOTYPES.add(legs);
        GENOTYPES.add(spikeArms);
        GENOTYPES.add(clawsLength);
        GENOTYPES.add(serratedClaw);
        GENOTYPES.add(ramHorns);
        GENOTYPES.add(spikeHorns);
        GENOTYPES.add(crownHorns);
        GENOTYPES.add(nose);
        GENOTYPES.add(monsterScent);
        GENOTYPES.add(itemScent);
        GENOTYPES.add(nocturnalEyes);
        GENOTYPES.add(infraredEyes);
        GENOTYPES.add(xrayEyes);
        GENOTYPES.add(tongue);
        GENOTYPES.add(venom);
        GENOTYPES.add(breathShapeOne);
        GENOTYPES.add(breathShapeTwo);
        GENOTYPES.add(sex);
        GENOTYPES.add(buildOne);
        GENOTYPES.add(buildTwo);
        GENOTYPES.add(sizeOne);
        GENOTYPES.add(sizeTwo);
        GENOTYPES.add(magicOne);
        GENOTYPES.add(magicTwo);
        GENOTYPES.add(magicThree);
        GENOTYPES.add(scales);
        GENOTYPES.add(bellyPlating);
        GENOTYPES.add(plateScales);
        GENOTYPES.add(featherScales);
        GENOTYPES.add(spikeLength);
        GENOTYPES.add(spikeLocation);
        GENOTYPES.add(bodyLengthOne);
        GENOTYPES.add(bodyLengthTwo);

        //Phenotypes
        String[] longTailOne = {"LL"};
        String[] longTailTwo = {"MM"};
        String[] mediumTailOne = {"Ll"};
        String[] mediumTailTwo = {"Mm"};
        String[] shortTailTwo = {"mm"};
        String[] shortTailOne = {"ll"};
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
     // String[] shortClawed = {"CC","Cc"};
        String[] longClawed = {"cc"};
        String[] serratedClaws = {"ss"};
        String[] prehensileTongue = {"tt"};
        String[] strongNose = {"nn"};
        String[] monsterScents = {"ss"};
        String[] itemScents = {"tt"};
        String[] lineShape = {"bb"};
        String[] male = {"XY"};
        String[] female = {"XX"};

        Map<String, Integer>tailLong = new HashMap<>();
        tailLong.put("tailLength", 10);
        PHENOTYPES.add(new Phenotype("Long Tail One", longTailOne, tailLong));
        PHENOTYPES.add(new Phenotype("Long Tail Two", longTailTwo, tailLong));

        Map<String, Integer>tailMed = new HashMap<>();
        tailMed.put("tailLength", 5);
        PHENOTYPES.add(new Phenotype("Medium Tail One", mediumTailOne, tailMed));
        PHENOTYPES.add(new Phenotype("Medium Tail Two", mediumTailTwo, tailMed));

        Map<String, Integer>tailShort = new HashMap<>();
        tailShort.put("tailLength", 0);
        PHENOTYPES.add(new Phenotype("Short Tail One", shortTailOne, tailShort));
        PHENOTYPES.add(new Phenotype("Short Tail Two", shortTailTwo, tailShort));

        Map<String, Integer>spikeTailM = new HashMap<>();
        spikeTailM.put("spikeTail", 1);
        PHENOTYPES.add(new Phenotype("Spike Tail", spikedTail, spikeTailM));

        Map<String, Integer>cudgelTailM = new HashMap<>();
        cudgelTailM.put("cudgelTail", 1);
        PHENOTYPES.add(new Phenotype("Cudgel Tail", cudgeledTail, cudgelTailM));

        Map<String, Integer>bladeTailM = new HashMap<>();
        bladeTailM.put("bladeTail", 1);
        PHENOTYPES.add(new Phenotype("Blade Tail", bladedTail, bladeTailM));

        Map<String, Integer>wingLong = new HashMap<>();
        wingLong.put("wingLength", 10);
        PHENOTYPES.add(new Phenotype("Long Wing One", bigWingOne, wingLong));
        PHENOTYPES.add(new Phenotype("Long Wing Two", bigWingTwo, wingLong));

        Map<String, Integer>wingMed = new HashMap<>();
        wingMed.put("wingLength", 5);
        PHENOTYPES.add(new Phenotype("Medium Wing One", mediumWingOne, wingMed));
        PHENOTYPES.add(new Phenotype("Medium Wing Two", mediumWingTwo, wingMed));

        Map<String, Integer>wingShort = new HashMap<>();
        wingShort.put("wingLength", 0);
        PHENOTYPES.add(new Phenotype("Short Wing One", smallWingOne, wingShort));
        PHENOTYPES.add(new Phenotype("Short Wing Two", smallWingTwo, wingShort));

        Map<String, Integer>featheredWingsM = new HashMap<>();
        featheredWingsM.put("featheredWings", 1);
        PHENOTYPES.add(new Phenotype("Feathered Wings", featheredWings, featheredWingsM));

        Map<String, Integer>insectoidWingsM = new HashMap<>();
        insectoidWingsM.put("insectoidWings", 1);
        PHENOTYPES.add(new Phenotype("Insect Wings", insectoidWings, insectoidWingsM));

        Map<String, Integer>fairyWingsM = new HashMap<>();
        fairyWingsM.put("fairyWings", 1);
        PHENOTYPES.add(new Phenotype("Fairy Wings", fairyWings, fairyWingsM));

        Map<String, Integer>spikedHornsM = new HashMap<>();
        spikedHornsM.put("spikedHorns", 1);
        PHENOTYPES.add(new Phenotype("Spiked Horns", spikedHorns, spikedHornsM));

        Map<String, Integer>ramHornsM = new HashMap<>();
        ramHornsM.put("ramHorns", 1);
        PHENOTYPES.add(new Phenotype("Ram Horns", ramHorn, ramHornsM));

        Map<String, Integer>crownHornsM = new HashMap<>();
        crownHornsM.put("crownHorns", 1);
        PHENOTYPES.add(new Phenotype("Crown Horns", crownHorn, crownHornsM));

        Map<String, Integer>bodyLong = new HashMap<>();
        bodyLong.put("bodyLength", 10);
        PHENOTYPES.add(new Phenotype("Long Body One", longBodyOne, bodyLong));
        PHENOTYPES.add(new Phenotype("Long Body Two", longBodyTwo, bodyLong));

        Map<String, Integer>bodyMed = new HashMap<>();
        bodyMed.put("bodyLength", 5);
        PHENOTYPES.add(new Phenotype("Medium Body One", mediumBodyOne, bodyMed));
        PHENOTYPES.add(new Phenotype("Medium Body Two", mediumBodyTwo, bodyMed));

        Map<String, Integer>bodyShort = new HashMap<>();
        bodyShort.put("bodyLength", 0);
        PHENOTYPES.add(new Phenotype("Short Body One", shortBodyOne, bodyShort));
        PHENOTYPES.add(new Phenotype("Short Body Two", shortBodyTwo, bodyShort));

        Map<String, Integer>buildMuscular = new HashMap<>();
        buildMuscular.put("build", 10);
        PHENOTYPES.add(new Phenotype("Muscular Build One", muscularBodyOne, buildMuscular));
        PHENOTYPES.add(new Phenotype("Muscular Build Two", muscularBodyTwo, buildMuscular));

        Map<String, Integer>buildAverage = new HashMap<>();
        buildAverage.put("build", 5);
        PHENOTYPES.add(new Phenotype("Average Build One", averageBodyOne, buildAverage));
        PHENOTYPES.add(new Phenotype("Average Build Two", averageBodyTwo, buildAverage));

        Map<String, Integer>buildThin = new HashMap<>();
        buildThin.put("build", 0);
        PHENOTYPES.add(new Phenotype("Thin Build One", thinBodyOne, buildThin));
        PHENOTYPES.add(new Phenotype("Thin Build Two", thinBodyTwo, buildThin));

        Map<String, Integer>sizeLarge = new HashMap<>();
        sizeLarge.put("size", 10);
        PHENOTYPES.add(new Phenotype("Large Size One", largeSizeOne, sizeLarge));
        PHENOTYPES.add(new Phenotype("Large Size Two", largeSizeTwo, sizeLarge));

        Map<String, Integer>sizeMedium = new HashMap<>();
        sizeMedium.put("size", 5);
        PHENOTYPES.add(new Phenotype("Medium Size One", mediumSizeOne, sizeMedium));
        PHENOTYPES.add(new Phenotype("Medium Size Two", mediumSizeTwo, sizeMedium));

        Map<String, Integer>sizeSmall = new HashMap<>();
        sizeSmall.put("size", 0);
        PHENOTYPES.add(new Phenotype("Small Size One", smallSizeOne, sizeSmall));
        PHENOTYPES.add(new Phenotype("Small Size Two", smallSizeTwo, sizeSmall));

        Map<String, Integer>venomousM = new HashMap<>();
        venomousM.put("venom", 1);
        PHENOTYPES.add(new Phenotype("Venom", venomous, venomousM));

        Map<String, Integer>nocturnalEyedM = new HashMap<>();
        nocturnalEyedM.put("nocturnalEyes", 1);
        PHENOTYPES.add(new Phenotype("Nocturnal Eyes", nocturnalEyed, nocturnalEyedM));

        Map<String, Integer>infraredEyedM = new HashMap<>();
        infraredEyedM.put("infraredEyes", 1);
        PHENOTYPES.add(new Phenotype("Infrared Eyes", infraredEyed, infraredEyedM));

        Map<String, Integer>xrayEyedM = new HashMap<>();
        xrayEyedM.put("xrayEyes", 1);
        PHENOTYPES.add(new Phenotype("X-ray Eyes", xrayEyed, xrayEyedM));

        Map<String, Integer>claws = new HashMap<>();
        claws.put("longClaws", 1);
        PHENOTYPES.add(new Phenotype("Long Claws", longClawed, claws));

        Map<String, Integer>serratedClawsM = new HashMap<>();
        serratedClawsM.put("serratedClaws", 1);
        PHENOTYPES.add(new Phenotype("Serrated Claws", serratedClaws, serratedClawsM));

        Map<String, Integer>prehensileTongueM = new HashMap<>();
        prehensileTongueM.put("prehensileTongue", 1);
        PHENOTYPES.add(new Phenotype("Prehensile Tongue", prehensileTongue, prehensileTongueM));

        Map<String, Integer>strongNoseM = new HashMap<>();
        strongNoseM.put("strongNose", 1);
        PHENOTYPES.add(new Phenotype("Strong Nose", strongNose, strongNoseM));

        Map<String, Integer>monsterScentsM = new HashMap<>();
        monsterScentsM.put("monsterScent", 1);
        PHENOTYPES.add(new Phenotype("Monster Scent", monsterScents, monsterScentsM));

        Map<String, Integer>itemScentsM = new HashMap<>();
        itemScentsM.put("itemScent", 1);
        PHENOTYPES.add(new Phenotype("Item Scent", itemScents, itemScentsM));

        Map<String, Integer>lineShapeM = new HashMap<>();
        lineShapeM.put("lineShape", 1);
        PHENOTYPES.add(new Phenotype("Line Shape", lineShape, lineShapeM));

        Map<String, Integer>maleSex = new HashMap<>();
        maleSex.put("sex", 0);
        PHENOTYPES.add(new Phenotype("Male", male, maleSex));

        Map<String, Integer>femaleSex = new HashMap<>();
        femaleSex.put("sex", 1);
        PHENOTYPES.add(new Phenotype("Female", female, femaleSex));
    }


}
