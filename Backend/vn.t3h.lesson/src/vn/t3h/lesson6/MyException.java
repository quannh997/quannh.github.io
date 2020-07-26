package vn.t3h.lesson6;

import java.util.ArrayList;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var data = testEx();
		System.out.println("data: " + data);

	}
	public static String testEx() {
		var arrayList = new ArrayList<String>();
		arrayList.add("NoEx");
		try {
			var data = arrayList.get(0);
			if(data != "NoEx") {
				throw new CustomException("Loi cua ban dinh nghia");
			}
			throw new integerException ("Loi trong Integer");
		}catch(CustomException ex) {
			
			System.out.println("Exception " + ex.getMessage());
		} catch(integerException it) { 
			System.out.println("integerException " + it.getMessage());

		}
		return null;
	}
}
