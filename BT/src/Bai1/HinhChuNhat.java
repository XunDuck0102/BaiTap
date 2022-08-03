package Bai1;

public class HinhChuNhat {
	private int chieudai;
	private int chieurong;
	

	public int getChieudai() {
		do {
		if(chieudai<=0) {
			System.out.println("Nhap lai chieu dai: ");
			}else {
				return chieudai;
			}
		}
		
	}
	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}
	public int getChieurong() {
		if(chieurong<=0) {
			return 0;
		}else return chieurong;
	}
	public void setChieurong(int chieurong) {
		this.chieurong = chieurong;
	}
	

}
