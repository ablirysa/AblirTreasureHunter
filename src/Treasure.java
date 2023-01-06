public class Treasure {
    public static final String SCEPTOR = "the Mighty Sceptor";
    public static final String CROWN = "the Crown";
    public static final String GEMS = "the Rubies";
    public static final String DUST = "Dust";
    private String treasure;

    public Treasure() {
        int num = (int) (Math.random() * 4) + 1;
        if  (num == 1) {
            treasure = DUST;
        } else if (num == 2) {
            treasure = GEMS;
        } else if (num == 3) {
            treasure = CROWN;
        } else {
            treasure = SCEPTOR;
        }
    }

    public static boolean collectionHasAllTreasures(String collection) {
        boolean hasSceptor = (collection.indexOf(SCEPTOR) != -1);
        boolean hasCrown = (collection.indexOf(CROWN) != -1);
        boolean hasGems = (collection.indexOf(GEMS) != -1);
        return hasSceptor && hasCrown && hasGems;
    }

    public String getTreasure() {
        return treasure;
    }
}
