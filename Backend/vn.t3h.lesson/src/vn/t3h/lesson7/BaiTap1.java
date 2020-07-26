package vn.t3h.lesson7;
import java.util.Iterator;
import java.util.Queue;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import  vn.t3h.lesson6.baitap.Customer;
import  vn.t3h.lesson6.baitap.QueueMain;


// Ghi du lieu trong queue vao file
public class BaiTap1 {
	public static void main(String[] args) {
		Queue<Customer> listInQueue = QueueMain.createCustomer();
		System.out.println("listInQueue: "+ listInQueue.size());
		JSONArray jArray = new JSONArray();
		Iterator<Customer> its = listInQueue.iterator();
		while (its.hasNext()) {
			var customer = its.next();
			
			JSONObject jObj = new JSONObject();
			jObj.put("callID", customer.callId);
			jObj.put("name", customer.name);
			jObj.put("callTime", customer.callTime);
			jObj.put("musicName", customer.musicName);

			jArray.add(jObj);
			
//			jArray.add(customer);
			}
		System.out.println("listinQueue str : " + jArray.toString() );
		System.out.println("Done !");
	}
}
