import java.util.Scanner;

public class RoomArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Worked Example 
//		roomArea(sc);
		
		
		/*Exercise 1
		
//		Example 1 
//		float[] numbers  = {8.2f, 50.4f, -8.6f};
		
		
//		Example 2
//		float[] numbers  = {65.3f, -87.256f, 3.24f};
		
//		Example 3 
//		float[] numbers  = {3.57f, 2.45f, 8.56f};
		 
		float result = numberAverage(numbers);
		
		System.out.print(result);
		
		*/
		
		/* Exercise 2 */
//		euroToSterlingAndDollar(214.91f);
		
		/*Exercise 3 */
//		milesToKm(put float number here ex: 18.659f);
		
		/*Exercise 4*/
		
		gardenLawnArea( 11.7f, 8.5f);
		
	}
	
	public static void gardenLawnArea(float gardenLength, float gardenWidth) {
		 float pricePerSquareUnit = 3.75f;
		 
		 float gardenArea = gardenLength * gardenWidth;
		 
		 float fullPrice = pricePerSquareUnit * gardenArea;
		 
		 System.out.printf("The total cost for reseeding the lawn for %.2f square units is: %.2f euros", gardenArea, fullPrice);
		
	}

	public static void milesToKm(float miles) {
		float kmConvert = 1.609f;
		
		float result = miles * kmConvert ;
		
		System.out.println(miles +" in Miles is " + result + " in km");
		
	}

	public static void roomArea ( Scanner sc) {
		
		System.out.println("Enter length of the room:");
		
		float roomLength = sc.nextFloat();
		
		System.out.println("Enter width of the room");
		
		float roomWidth = sc.nextFloat();
		
		float roomSum  = roomLength * roomWidth;
		
		System.out.println("The room area is: " + roomSum + "square units");
	}
	
	public static float numberAverage (float[] numbers) {
		
		float sum = 0f;
				
		for (int i = 0 ; i < numbers.length; i ++) {
			
			sum += numbers[i];
			
		}
		
		float average = sum / numbers.length ; 
		
		return average ;
		
	}
	
	public static void euroToSterlingAndDollar (float euro) {
		
		float dollarConvert = 1.3469f;
		float sterlingConvert = 0.851713671f;
		
		float[] result = {(euro*dollarConvert), (euro*sterlingConvert)};
		
		float dollar = result[0];
		float sterling = result[1];
		
		System.out.println(euro + " Euro is equal to :");
		System.out.println("Dollar: $" + dollar);
		System.out.print("Sterling: £ " + sterling);
	}
	
	

}
