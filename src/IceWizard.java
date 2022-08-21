public class IceWizard extends Wizard
{
    // 1) instance vars
    int snowballs;
    boolean iceSpear;
    String gollumName;

    // 2) constructor
    public IceWizard (double speed, int power, String name, int snowballs, boolean iceSpear, String gollumName)
    {
        super(speed, power, name);
        this.snowballs = snowballs;
        this.iceSpear = iceSpear;
        this.gollumName = gollumName;
    }

    // 4) getters
    public String getName()
    {
        return super.getName();
    }

    public int getSnowballs()
    {
        return snowballs;
    }

    public boolean getIceSpear()
    {
        return iceSpear;
    }

    public String getGollumName()
    {
        return gollumName;
    }

    public String getElement()
    {
        return "Ice";
    }

    // 5) setters
    public void setSnowballs(int snowballs)
    {
        this.snowballs = snowballs;
    }

    public void setIceSpear(boolean iceSpear)
    {
        this.iceSpear = iceSpear;
    }

    public void setGollumName(String gollumName)
    {
        this.gollumName = gollumName;
    }

    // 6) brains

    // 3) toString()
    @Override
    public String toString()
    {
        return "Ice Wizard {" +
                "Name: " + name +
                ", Number of snowballs: " + snowballs +
                ", Has ice spear: " + iceSpear +
                ", Ice gollum name: " + gollumName +  "}";
    } // end toString()

} // end IceWizard class
