package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class FashionDesigner {

    //USE OF SINGLETON PATTERN
    private static FashionDesigner instance;
    private String password;

    private FashionDesigner() {
        this.password = "store123";
    }

    public static FashionDesigner getInstance() {
        if (instance == null) {
            instance = new FashionDesigner();
        }
        return instance;
    }

    public String getPassword() {
        return password;
    }

}
