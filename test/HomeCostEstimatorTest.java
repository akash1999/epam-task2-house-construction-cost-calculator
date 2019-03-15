import org.junit.Test;
import static org.junit.Assert.*;

import estimator.*;

public class HomeCostEstimatorTest {
    
    @Test
    public void testStandardMaterialHouse() {
        HomeCostEstimator homeCostEstimator = new HomeCostEstimator();
        
        double result;
        
        result = homeCostEstimator.estimateCost(Material.STANDARD, 200, false);
        assertEquals(240000, result, 0.001);
        
        result = homeCostEstimator.estimateCost(Material.STANDARD, -200, false);
        assertEquals(-240000, result, 0.001);
        
        result = homeCostEstimator.estimateCost(Material.STANDARD, 200, true);
        assertEquals(240000, result, 0.001);
    }
    
    @Test
    public void testAboveStandardMaterialHouse() {
        HomeCostEstimator homeCostEstimator = new HomeCostEstimator();
        
        double result;
        
        result = homeCostEstimator.estimateCost(Material.ABOVE_STANDARD, 10, false);
        assertEquals(15000, result, 0.001);
        
        result = homeCostEstimator.estimateCost(Material.ABOVE_STANDARD, -10, false);
        assertEquals(-15000, result, 0.001);
        
        result = homeCostEstimator.estimateCost(Material.ABOVE_STANDARD, 10, true);
        assertEquals(15000, result, 0.001);
    }
    
    @Test
    public void testHighStandardMaterialHouse() {
        HomeCostEstimator homeCostEstimator = new HomeCostEstimator();
        
        double result;
        
        result = homeCostEstimator.estimateCost(Material.HIGH_STANDARD, 10, false);
        assertEquals(18000, result, 0.001);
        
        result = homeCostEstimator.estimateCost(Material.HIGH_STANDARD, -10, false);
        assertEquals(-18000, result, 0.001);
        
        result = homeCostEstimator.estimateCost(Material.HIGH_STANDARD, 10, true);
        assertEquals(25000, result, 0.001);
    }
}
