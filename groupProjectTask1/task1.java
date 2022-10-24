package groupProjectTask1;

public interface task1 {
    public  void calculateArea (double a);
    public void calculatePerimeter( double b );
    class Circle implements task1 {
        public void calculateArea (double a) {
            System.out.println(" Area of a circle is : " + (3.14*a*a));
        }
        public  void calculatePerimeter (double b) {
            System.out.println(" Area of a circle is : " + (3.14*2 * b));
        }
    }
    class Square implements task1 {

        public void calculateArea (double c) {
            System.out.println(" Area of a circle is : " + (3.14 * c * c));
        }
        public  void calculatePerimeter (double d) {

            System.out.println(" Area of a circle is : " + (d*4));
        }

        public static void main ( String [] args){

            task1 circle= new Circle ();
            circle.calculateArea(20);
            circle.calculatePerimeter(30);
            task1 square=new Square ();
            square.calculateArea(15);
            square.calculatePerimeter(15);
        }
    }

}




