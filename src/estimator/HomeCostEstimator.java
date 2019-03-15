package estimator;

public class HomeCostEstimator {
    public float estimateCost(Material material, float area, boolean requireFullyAutomated) {
        float costPerSquareFeet = 0;
        switch (material) {
            case STANDARD:
                costPerSquareFeet = 1200;
                break;
            case ABOVE_STANDARD:
                costPerSquareFeet = 1500;
                break;
            case HIGH_STANDARD:
                if(!requireFullyAutomated) {
                    costPerSquareFeet = 1800;
                } else {
                    costPerSquareFeet = 2500;
                }
        }
        
        return (area * costPerSquareFeet);
    }
}


