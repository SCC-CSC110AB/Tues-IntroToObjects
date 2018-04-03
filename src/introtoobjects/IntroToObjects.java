package introtoobjects;

/**
 *
 * @author john
 */
public class IntroToObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean allTestPass = true;
        Box boxInstance = new Box();
        Box otherBoxInstance = new Box(1.0, 1.0, 1.0);
        
        if (boxInstance.equals(otherBoxInstance) == false) {
            allTestPass = false;
        }
        
        if (boxInstance.getLength() != 1.0) {
            allTestPass = false;
        }
                
        boxInstance.setLength(66.6);
        
        if (boxInstance.getLength() != 66.6) {
            allTestPass = false;
        }
        
        boxInstance.setLength(Box.MAX_LENGTH);
        
        if (boxInstance.getLength() != Box.MAX_LENGTH) {
            allTestPass = false;
        }
        
        boxInstance.setLength(Box.MAX_LENGTH + 1);
        
        if (boxInstance.getLength() != Box.MAX_LENGTH) {
            allTestPass = false;
        }
        
        if (boxInstance.toString().equals(
                "Length: 100.0\nWidth: 1.0\nHeight: 1.0"
        ) == false) {
            allTestPass = false;
        }
        
        otherBoxInstance.setWidth(Box.MAX_WIDTH);
        
        if (boxInstance.equals(otherBoxInstance) == true) {
            allTestPass = false;
        }
        
        if (boxInstance.sameVolumeAs(otherBoxInstance) == false) {
            allTestPass = false;
        }
        
        System.out.println("All tests have passed: " + allTestPass);
    }
    
}
