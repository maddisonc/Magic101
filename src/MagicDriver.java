public class MagicDriver
{
    public static void main(String[] args)
    {
        Wizard w1 = new Wizard(10, 5, "frogster");
        FireWizard fireboy = new FireWizard(6, 50, "Fireboy", 10, true, "Blaze");
        IceWizard icegirl = new IceWizard(6, 50, "Icegirl", 10, true, "Snowflake");
        IceWizard sid = new IceWizard(0.5, 100, "Sid the Sloth", 100, false, "Moose");
        ElecWizard pikachu = new ElecWizard(10, 50, "Pikachu", 10, 5, "Electrabuzz");
        Dragon dragonite = new Dragon("Dragonite", "Unknown");
        Dragon charizard = new Dragon("Charizard", "Fire");

        Wizard [] wizardArr = {fireboy, icegirl, sid, pikachu};
        Dragon [] dragonArr = {dragonite, charizard};

        // prints out wizards
        System.out.println("Wizards:");
        for (Wizard w: wizardArr)
        {
            System.out.println(w);
        }

        // pritns out dragons
        System.out.println("\nDragons:");
        for (Dragon d: dragonArr)
        {
            System.out.println(d);
        }

    } // end main
} // end driver class
