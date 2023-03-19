import java.util.Scanner;

public class Nhanvien {

	private String loainv;
	private String ten;
	private long luong;
	public void nhanvien(String ten,long luong,String loainv)
	{
	        this.ten=ten;
	        this.luong=luong;
	        this.loainv=loainv;
	}
	public String getTen()
	{
		return this.ten;
    }
	public void setTen(String ten) {
		this.ten=ten;
	}
    public long getLuong(){
    	return this.luong;
    }
    public void setLuong(long luong) {
    	this.luong=luong;
	}
    public String getLoainv(){
    	return loainv;
	}
    public void setLoainv(String loainv){
    	this.loainv= loainv;
    }
    public long tinhluong(){
    	return tinhluong(); 
    }
    public void xuatthongtin(){
    	System.out.println("tên"+getTen()+"lương"+getLuong());
    }
    public void nhap(){
    	Scanner sc= new Scanner(System.in);
    	System.out.println("nhập tên: ");
    	ten= sc.nextLine();
    	System.out.println("nhập loại nhân viên: ");
	    loainv= sc.nextLine();
	    System.out.println("nhập lương: ");
	    luong= sc.nextLong();
	    }
    public void xuat(){
    	System.out.println("tên"+getTen());
    	System.out.println("lương"+getLuong());
    	System.out.println("loại nhân viên"+getLoainv());
    	System.out.println("tổng tiền lương là "+tinhluong());
	}
}

