package fatalvirus.service;

import fatalvirus.model.SungJukVO;

public class SungJukService {

	public int getTotal(SungJukVO sj) {
		int tot = sj.getKor() 
				+ sj.getEng() 
				+ sj.getMat();
		sj.setTot(tot);
		
		return tot;
	}

	public double getAverage(SungJukVO sj) {
		double avg = (double)sj.getTot() / 3;
		sj.setAvg(avg);
		
		return avg;
	}
	
	public String getGrade(SungJukVO sj) {
		String grd = "F";
		switch ( (int)sj.getAvg() / 10 ) {
		case 10:
		case 9:
			grd = "A";
			break;
		case 8:
			grd = "B";
			break;
		case 7:
			grd = "C";
			break;
		case 6:
			grd = "D";
			break;
		};
		sj.setgrd(grd);
		return grd;
	}
}
