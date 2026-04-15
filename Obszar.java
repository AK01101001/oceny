package dev.end.oceny;

public class Obszar {
    private String name;
    private int image;
    private boolean urbanized;
    private int TDAmmount;
    private Faction ownership;
    public enum Faction{
        Huanglong,
        OrderOfTheDeep,
        BlackShores,
        Fractsidus,
        SpacetrekCollective

    }

    public Obszar(String name, int image, boolean urbanized, int TDAmmount, Faction ownership) {
        this.name = name;
        this.image = image;
        this.urbanized = urbanized;
        this.TDAmmount = TDAmmount;
        this.ownership = ownership;
    }

    public String getName() {
        return name;
    }

    public String isUrbanized() {
        return urbanized?"is urbanized":"isn't urbanized";
    }

    public String getTDAmmount() {
        return "Ammount of TD: "+ String.valueOf(TDAmmount) ;
    }

    public String getOwnership() {
        return "controled by: "+ ownership.toString() ;
    }
    public Faction getFaction() {
        return ownership ;
    }

    public int getImage() {
        return image;
    }
}
