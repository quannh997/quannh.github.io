package vn.t3h.lesson7;

import java.time.LocalDate;

public class WriteUtils {
	private boolean isAppend = false;
	private String path;
	
	public static WriteUtils createFolder(String dir) throws Exception{ 
		var wUtils = new WriteUtils();
		if(dir == null | dir.isEmpty())
			throw new Exception("Thu muc tao khong duoc rong");
		LocalDate lDate = LocalDate.now();
		
		
		String path = System.getProperty("user.dir")+ dir + "/" + lDate.getMonth().getValue() + lDate.getYear();
		
		wUtils.path = path;
		return wUtils;
	}
	
	public String getPath() {
		return this.path;
	}
}
