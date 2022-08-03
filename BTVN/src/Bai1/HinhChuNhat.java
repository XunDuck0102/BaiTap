package Bai1;

public class HinhChuNhat {
	double dai, rong;
	 public HinhChuNhat(double dai, double rong) {
	        this.dai = dai;
	        this.rong = rong;
	 }
	  public HinhChuNhat() {
	  }
	  public double getRong() {
	        return rong;
	  }
	  public double getDai() {
	        return dai;
	  }
	  public void setRong(double rong) {
		  if(rong >0) {
	            this.rong = rong;
	        } else {
	            this.rong = 1;
	        }
	  }
	   public void setDai(double dai) {
		   if(dai >0) {
	            this.dai = dai;
	        } else {
	            this.dai = 1;
	        }
	  }
	 
	   double tinhDienTich() {
	        return dai * rong;
	  }
	   double tinhChuVi() {
	        return (dai + rong) * 2;
   }

}
