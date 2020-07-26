package vn.t3h.lesson5;
import java.util.ArrayList;
import java.util.List;

public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var menuLinhVuc = new bai2(10, "Linh Vuc", 0);
		var menuNhaHang = new bai2(11, "Nha Hang", 10);
		var menuKinhDoanh = new bai2(12, "Kinh Doanh", 10);
		var menuDuLich = new bai2(13, "Du Lich", 10);
		
		var menuTinTuc = new bai2(20,"Tin Tuc", 0);
		var menuKyThuaIn = new bai2(24,"Ky Thuat In", 20);
		var menuDoHoa = new bai2(25,"Do Hoa", 20);
		var menuMyThuat = new bai2(26,"My Thuat", 20);

		var listMenus = new ArrayList<bai2>();
		listMenus.add(menuLinhVuc);
		listMenus.add(menuDuLich);
		listMenus.add(menuNhaHang);
		listMenus.add(menuKinhDoanh);

		listMenus.add(menuTinTuc);
		listMenus.add(menuDoHoa);
		listMenus.add(menuKyThuaIn);
		listMenus.add(menuMyThuat);

		var listMenu = arrayDataMenuWithIndent(listMenus, 0, "");
		for (bai2 mn : listMenu) {
			System.out.println("menu name "+ mn.name);
		}
	}
	public static ArrayList<bai2> menuWithIndent = new ArrayList<bai2>();
	public static List<bai2> arrayDataMenuWithIndent(
			ArrayList<bai2> lists, int parentID, String indent ){
		for (bai2 menu :lists) {
			bai2 menuTmp = new bai2();
			if (menu.parentId != parentID) {
				continue;
			}
			menuTmp.id = menu.id;
			menuTmp.name = indent + menu.name;
			menuTmp.parentId = menu.parentId;
			menuWithIndent.add(menuTmp);
			
			arrayDataMenuWithIndent(lists, menu.id, "--");
		}
		return menuWithIndent;
	}
}
