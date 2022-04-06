package KiranByJava_Simple_Basic;

public class calSimple_Intrest {
	
	 float calsimpleintrest(float p,float n, float r) {
		 float si = p*n*r/100;
		 return si;
	 }

	public static void main(String[] args) {
		calSimple_Intrest x = new calSimple_Intrest();
		 double z = x.calsimpleintrest(5000f, 5f, 10.5f);
		 System.out.println(z);
		
	}

}
