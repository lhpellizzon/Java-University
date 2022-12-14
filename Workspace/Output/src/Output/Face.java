package Output;


public class Face {

	public static void main(String[] args) {
		
//		Declaring each unicode that represents its side on the drawing
		
		String leftUp= "\u256D";
		String leftDown = "\u2570";
		String rightUp = "\u256E";
		String rightDown = "\u256F";
		String straightLine = "\u2500";
		
		
//		Printing eyes
		System.out.println("\t"+leftUp + rightUp + "\t"+leftUp + rightUp);
		System.out.println("\t"+leftDown + rightDown + "\t"+leftDown + rightDown);
		
//		Printing nose
		System.out.println("\t    "+leftUp + rightUp);
		System.out.println("\t    "+leftDown +  rightDown +"\n");
		
//		Printing smile
		System.out.print("\t " + leftDown + straightLine.repeat(6) + rightDown);

	}

}
