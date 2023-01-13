package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class ClotheCatalogue {
    
    private ClothModel clothModel;
    
    public ClotheCatalogue(){
        clothModel= new ClothModel();
    }

    /**
     * @return the clothModel
     */
    public ClothModel getClothModel() {
        return clothModel;
    }

    /**
     * @param clothModel the clothModel to set
     */
    public void setClothModel(ClothModel clothModel) {
        this.clothModel = clothModel;
    }

 }

