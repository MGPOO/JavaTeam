package ec.edu.espe.fashionStore.controller;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.fashionstore.model.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class ControllerTest {
    
    public ControllerTest() {
    }

    /**
     * Test of insertDocumentMongo method, of class Controller.
     */
    @Test
    public void testInsertDocumentMongo() {
        System.out.println("insertDocumentMongo");
        MongoDatabase database = null;
        Order order = null;
        Controller.insertDocumentMongo(database, order);
    }

    /**
     * Test of readMongo method, of class Controller.
     */
    @Test
    public void testReadMongo() {
        System.out.println("readMongo");
        MongoDatabase database = null;
        int id = 0;
        Order expResult = null;
        Order result = Controller.readMongo(database, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of noRepeatOrder method, of class Controller.
     */
    @Test
    public void testNoRepeatOrder() {
        System.out.println("noRepeatOrder");
        MongoDatabase database = null;
        int id = 0;
        boolean existOrder = false;
        boolean expResult = false;
        boolean result = Controller.noRepeatOrder(database, id, existOrder);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateMongo method, of class Controller.
     */
    @Test
    public void testUpdateMongo() {
        System.out.println("updateMongo");
        MongoDatabase database = null;
        Order order = null;
        Controller.updateMongo(database, order);
    }

    /**
     * Test of deleteMongo method, of class Controller.
     */
    @Test
    public void testDeleteMongo() {
        System.out.println("deleteMongo");
        MongoDatabase database = null;
        Order order = null;
        Controller.deleteMongo(database, order);
    }
    
}
