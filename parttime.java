import java.util.Scanner;
public class parttime extends Nhanvien {
	int giolamviec;
	public void nhanvienparttime(int giolamviec ){
		this.giolamviec=giolamviec;
		}
	public int getGiolamviec(){
		return giolamviec;
		}   
	public void setGiolamviec(int giolamviec){
		this.giolamviec=giolamviec;
		}
	@Override
	public long tinhluong(){
		return getLuong()* getGiolamviec();
		}
	public void nhap(){
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.println("nhập số giờ làm thêm");
		giolamviec= sc.nextInt();
		}
	public void xuat(){
		super.xuat();
		System.out.println("giờ làm việc là"+ getGiolamviec());
		}
}