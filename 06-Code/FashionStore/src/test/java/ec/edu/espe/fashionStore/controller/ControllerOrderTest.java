package ec.edu.espe.fashionStore.controller;

import ec.edu.espe.fashionstore.model.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class ControllerOrderTest {
    
    public ControllerOrderTest() {
    }

    /**
     * Test of CreateOrder method, of class ControllerOrder.
     */
    @Test
    public void testCreateOrder() {
        System.out.println("CreateOrder");
        Order order = null;
        ControllerOrder.CreateOrder(order);
    }
    
}
