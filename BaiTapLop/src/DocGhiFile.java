import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
	private List<CanBo> list;
	public List<CanBo> docfile() {
		list = new ArrayList<>(); 
		try {
			FileInputStream fis = new FileInputStream("D:\\docfile.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(true) {
				Object object = ois.readObject();
				if(object != null) {
					list.add((CanBo) object);
				}
				else {
					
					break;
					
				}
			}
			fis.close();
			ois.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}
	
	public void ghifile(List<CanBo> list) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\docfile.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (CanBo canBo : list) {
				oos.writeObject(canBo);
			}
			fos.close();
			oos.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void addCanBo(CanBo canBo) {
		try {
			FileWriter fw = new FileWriter(new File("D:\\docfile.bin"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void removeCanBo(CanBo canbo) {
		try {
			list.remove(canbo);
			
			ghifile(list);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	public void suaCanBo(CanBo canBo) {
		list.remove(canBo);
		list.add(canBo);
		ghifile(list);
		try {
			FileInputStream fis = new FileInputStream("");
			DataInputStream dis = new DataInputStream(fis);
			String s ="";
			while(true) {
				s = dis.readLine();
				if(s == null)
					break;
			}
		}catch(Exception ex) {
			
		}
	}
	
}
