public class ShapeFactory {

    private static String[] types = new String[]{"Circle", "Triangle", "Square", "Pentagon"};

    /**
     * Creates a shape object of the specified type
     * 

     */
    public static Shape makeShape(String type, int centerx, int centery,
            int radius) {
     if (type.equals("Circle")) {
   return new Circle(centerx, centery, radius);  
   
  }

  else if (type.equals("Square")) {
   return new Square(centerx, centery, radius);  
  }
        else if (type.equals("Triangle")) {
         return new Triangle(centerx, centery, radius);  
        }
        else if (type.equals("Pentagon")) {
         return new Pentagon(centerx, centery, radius); 
        }
        return null;
    }
    
    public static String[] getTypes() {
        return types;
    }
}