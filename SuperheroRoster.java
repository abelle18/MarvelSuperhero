public class SuperheroRoster {

    public static void main(String[] args) {
        // creating arrays
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};

        // looping by hero
        System.out.println("Superhero Roster");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println(" ");
        }

        // hero search
        System.out.println("Search for Hero: Iron Man");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");

        // calculating avg. power
        double averagePower = calculateAvgPower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);

        // superhero object array
        System.out.println("\nSuperhero object");
        Superhero[] heroes = new Superhero[3];
        for (int i = 0; i < heroNames.length; i++) {
            heroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            heroes[i].PrintHero();
        }
    }

    // search hero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero found:");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found: " + target);
        }
    }

    // avg. power calculation
    public static double calculateAvgPower(int[] powerLevels) {
        int sum = 0;
        for (int i = 0; i < powerLevels.length; i++) {
    		sum += powerLevels[i];
	}
        return (double) sum / powerLevels.length;
    }
}
