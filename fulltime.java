import java.util.Scanner;
public class fulltime extends Nhanvien {
	int loaichucvu, ngaylamthem;
	
	public void nhanvienfulltime(int loaichucvu,int ngaylamthem ){
		this.loaichucvu=loaichucvu;
		this.ngaylamthem=ngaylamthem;
		}
	public int getLoaichucvu(){       
		return loaichucvu;
		}
	public void setLoaichucvu(int loaichucvu) {
	this.loaichucvu=loaichucvu;
	}
	public int getNgaylamthem(){      
		return ngaylamthem;       
		}
	public void setNgaylamthem(int ngaylamthem){
		this.ngaylamthem=ngaylamthem;
		}
	@Override
	public long tinhluong(){
		return getLuong()*getNgaylamthem();
		}
	public void nhap(){
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.println("nhập chức vụ");
		loaichucvu= sc.nextInt();
		System.out.println("nhập ngày làm thêm");
		ngaylamthem= sc.nextInt();
	    }
	public void xuat(){
		super.xuat();
		System.out.println("loại chức vụ là"+getLoaichucvu());   
		}
	}
