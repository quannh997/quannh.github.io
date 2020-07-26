package vn.t3h.lesson7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

	public static void main(String[] args) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("hoTen", "Nguyen A");
		jsonObj.put("ngaySinh", "06/12/1997");
		jsonObj.put("gioiTinh", "Nu");
		
		String jsonObjtoString = jsonObj.toJSONString();
		System.out.println("Json as String: " + jsonObjtoString);
		WriteFile.toFile("tennv.json", jsonObjtoString);

		
		//Json Array ghi nhieu obj, doc du lieu tu file se luu vao js array
//		JSONArray JArray = new JSONArray();
//		JArray.add(jsonObj)
	}

}
