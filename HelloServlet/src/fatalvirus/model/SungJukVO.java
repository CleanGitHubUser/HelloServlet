package fatalvirus.model;

public class SungJukVO {

	private int sjno;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grd;
	private String regdate;

	public SungJukVO() {
	}

	public SungJukVO(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void setgrd(String grd) {
		this.grd = grd;
	}
	
	public String getName() {
		return name;
	}


	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
//		tot = kor + eng + mat;
		return tot;
	}
	

	public double getAvg() {
//		avg = (double)tot / 3;
		return avg;
	}

	public String getGrd() {
//		grd = "F";
//		switch ( (int)avg / 10 ) {
//		case 10:
//		case 9:
//			grd = "A";
//			break;
//		case 8:
//			grd = "B";
//			break;
//		case 7:
//			grd = "C";
//			break;
//		case 6:
//			grd = "D";
//			break;
//		};
		return grd;
	}

	public String getRegdate() {
		return regdate;
	}

	public String toString() {
		String fmt = "sjno = %d, name = %s, kor = %d, eng = %d, mat = %d, tot = %d, avrg = %.1f, grd = %s, regdate = %s";
		return String.format(fmt, sjno, name, kor, eng, mat, tot, avg, grd, regdate);
	}



}
