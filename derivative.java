package w1;

public class derivative {
	public static double result;
	
	
	
	
		public static double func(double x) {
				
				return     (3.14*x*x/2) + (0.002/x); // write here your on function
				
				}
	
  
	public static double turev(double x) {
		double dx = 0.000000000000001;
		result = (func(x+dx)-func(x))/(dx);
		return result;
    }
    
    
    
    public static void main(String[] args) {
		
		System.out.print(turev(5);// write calculate number
		
		
	}
}
