package vn.t3h.lesson5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.lang.*;

public class baitap1 {
	public static final int record = 20000;
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		//add
		long startAddArr = System.currentTimeMillis();
		for(int i=0;i<=record;i++) {
			arrList.add("Record #" +i);
		}
		long totalTunesFirAddArr = System.currentTimeMillis() - startAddArr;
		System.out.println(totalTunesFirAddArr);
		
		long startAddLink =System.currentTimeMillis();
		for(int i=0;i<=record;i++) {
			linkedList.add("Record #" +i);
		}
		long totalTunesFirAddLink = System.currentTimeMillis() - startAddLink;
		 System.out.println(totalTunesFirAddLink);
		 
		 
		 //edit
		 long startEditArr = System.currentTimeMillis();
			for(int i=0;i<=record;i++) {
				arrList.set(i,"EDIT #" + i);
			}
		 long totalTunesFirEditArr = System.currentTimeMillis() - startEditArr;
		 System.out.println(totalTunesFirEditArr);
		 
		 long startEditLink = System.currentTimeMillis();
			for(int i=0;i<=record;i++) {
				linkedList.set(i,"EDIT #" + i);
			}
		 long totalTunesFirEditLink = System.currentTimeMillis() - startEditLink;
		 System.out.println(totalTunesFirEditLink);
		 
		 
		 //remove
		 long startRemoveArr = System.currentTimeMillis();
			for(int i=0;i< record;i++) {
				arrList.remove(0);
			}
		 long totalTunesFirRemoveArr = System.currentTimeMillis() - startRemoveArr;
		 System.out.println("Thoi gian xoa arr " + totalTunesFirRemoveArr);
		 
		 long startRemoveLinked = System.currentTimeMillis();
			for(int i=0;i<record;i++) {
				linkedList.remove(0);
			}
		 long totalTunesFirRemoveLink = System.currentTimeMillis() - startRemoveLinked;
		 System.out.println("Thoi gian xoa linked " +totalTunesFirRemoveLink);
	}
}