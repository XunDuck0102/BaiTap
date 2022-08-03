package Bai1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HinhChuNhat S = new HinhChuNhat();
		int chieudai;
		System.out.println("Nhap chieu dai : ");
		S.setChieudai(chieudai= sc.nextInt());
		System.out.println(S.getChieudai());
		int chieurong;
		S.setChieurong(chieurong =sc.nextInt());
		
		
	}

}
