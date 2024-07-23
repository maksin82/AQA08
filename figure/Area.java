package figure;

public interface Area {

     default double calculateArea(double[] arr) {
          double area = 0;
          for (double a:arr) {
               if (area==0) {
                    area+=a;
               } else area*=a;
          }
          return area;
     }
}
