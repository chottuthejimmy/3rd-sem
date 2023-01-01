/*Develop a java application to implement currency converter (Dollar to INR, EURO to INR, Yen to INR and vice versa),
 distance converter (meter to KM, miles to KM and vice versa),
  time converter (hours to minutes, seconds and vice versa) using packages. */
package Program_6_1;
public class Program_6 {
	
	public static void main(String[] args) {
		// Currency c = new Currency();
		Distance d = new Distance();
		Time t = new Time();
		Currency_c.dtr(); // Static method has been used for Currency class 
		Currency_c.rtd(); //had to rename the class to Currency_c as Currency was already a predefined class
		Currency_c.etr();
		Currency_c.rte();
		Currency_c.ytr();
		d.mtokm();
		d.kmtom();
		d.mitokm();
		d.kmtmi();
		t.htm();
		t.mth();
		t.hts();
		t.sth();
	}
}
