package Java;

import java.math.MathContext;
import java.util.Scanner;

public class Java {
	 public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.printf("Nhap n : ");
		n =sc.nextInt();
		int a[]= new int[n];
		NhapHam(a,n);
		XuatHam(a,n);
		TBC(a,n);
		VTMin(a,n);
		SNT(a,n);
		SapXep(a,n);
		XuatHam(a,n);

	}
	public static void NhapHam(int a[] , int n) {
		for(int i=0;i<n;i++) {
			System.out.printf("a["+i+"] = ");
			a[i] = sc.nextInt();
			System.out.println(" ");
			
		}
	}
	public static void XuatHam(int a[] , int n) {
		System.out.printf("Mang vua nhap la : ");
		for(int i=0;i<n;i++) {
			System.out.printf(" "+a[i]);
		}
	}
	public static void TBC(int a[] , int n) {
		int Tong=0;
		float Tbc=0;
		int dem=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==1&&i%2==0) {
				dem++;
				Tong+=a[i];
				Tbc=(float)Tong/dem;
			}
			
		}
		System.out.println("");
		System.out.println("TBC = " + Tbc);
		
	}
	public static void VTMin(int a[] , int n) {

		int min=a[0];
		System.out.printf("Vi tri cac so nho nhat la : " );
		for(int i=1;i<n;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		for( int i=0;i<n;i++) {
			if(min==a[i]) {
				System.out.printf(" "+(i+1));
			}		
		}	
	}	
	public static void SNT(int a[] , int n) {
		int dem=0;
		for(int i=0;i<n;i++) {
			for(int j=2;j<=(int) Math.sqrt(a[i]);j++) {
				if(a[i]%j!=0||a[i]==2||a[i]==3) {
					dem++;
				}
			}
		}
		if(dem>0) {
			System.out.printf(" So nguyen to trong mang la: ");
			for(int i=0;i<n;i++) {
				if(a[i]==2) {
					System.out.printf(" "+a[i]);
				}
				if(a[i]==3) {
					System.out.printf(" "+a[i]);
				}
				for(int j=2;j<=(int) Math.sqrt(a[i]);j++) {
					
					if(a[i]%j!=0) {
						System.out.printf(" "+a[i]);
					}
				}
			}
		}else {
			System.out.println("Mang khong co so nguyen to");
		}
	}
	public static void SapXep(int a[] , int n) {
		for( int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int tg=a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}
	}

	
	

}
