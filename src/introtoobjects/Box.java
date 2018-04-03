package introtoobjects;

/**
 *
 * @author john
 */
public class Box {
    public static final double MAX_LENGTH = 100.0;
    public static final double MAX_WIDTH = 100.0;
    
    private double length;
    private double width;
    private double height;
    
    public Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }
    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public String toString() {
        return "Length: " + this.length 
                + "\nWidth: " + this.width 
                + "\nHeight: " + this.height;
    }
    
    public boolean equals(Box other) {
        boolean isEqual = this.length == other.length
                && this.width == other.width
                && this.height == other.height;
        
        return isEqual;
    }
    
    public double getVolume() {
        return this.length * this.height * this.width;
    }
    
    public boolean sameVolumeAs(Box other) {
        return this.getVolume() == other.getVolume();
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setLength(double length) {
        if (length <= MAX_LENGTH) {
            this.length = length;
        }
    }
    
    public void setWidth(double width) {
        if (width <= MAX_WIDTH) {
            this.width = width;
        }
    }
}
