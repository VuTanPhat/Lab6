import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[]args) {
		int sonvfulltime,sonvparttime;
		Scanner sc=new Scanner(System.in);
		ArrayList<Nhanvien> arrNhanvien=new ArrayList<>();
		System.out.println("Nhập thông tin nhân viên fulltime: ");
		sonvfulltime=sc.nextInt();
		System.out.println("NHẬP THÔNG TIN NHÂN VIÊN FULLTIME");
		for(int i=0;i<sonvfulltime;i++) {
			System.out.println("Nhập thông tin nhân viên fulltime thứ "+(i+1)+":");
			nhanvien = new fulltime();
			nhanvien.xuat();
			arrNhanvien.nhap(nhanvien);
		}
        System.out.println("Nhập số nhân viên part time: ");
        sonvparttime=sc.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN PARTTIME");
        for (int i = 0; i < sonvparttime; i++) {
            System.out.println("Nhập thông tin nhân viên part time thứ " + (i + 1) + ": ");
            nhanvien = new parttime();
            nhanvien.xuatThongTin();
            arrNhanvien.add(nhanvien);
        }
         
        System.out.println("THÔNG TIN NHÂN VIÊN");
        for (Nhanvien nv : arrNhanvien) {
            nhanvien.tinhluong();
            System.out.println(Nhanvien.toString());
        }
    }
   
}
