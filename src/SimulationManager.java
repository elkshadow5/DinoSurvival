public class SimulationManager {
    
    private final int minSimLength = 500;
    private final int maxSimLength = 5000;
    private int simulationLength;
    
    public void loop() {
        setSimulationLength();
        System.out.println(getSimulationLength());
        
        do {
            //what is life
            System.out.println("begin loop");
            
            
            simulationLength -= 1;
        } while (simulationLength > 0);
    }
    
    public void setSimulationLength() {
        simulationLength = (int)Math.random() * maxSimLength;
        checkSimLength();
    }
    
    public void checkSimLength() {
        if(simulationLength<minSimLength) {
            simulationLength=minSimLength;
        }
    }
    
    public int getSimulationLength() {
        return simulationLength;
    }
}
