package sample03;

import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SungJukImpl implements SungJuk {

	private SungJukDTO sungJukDTO = null ; //필드, 초기화

	
	
	
//	public SungJuckImpl(SungJukDTO sungJukDTO) {
//		super();
//		this.sungJukDTO = sungJukDTO;
//	}

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath());
		
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/ 3.0);
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO.getName()+ "\t" +
						   sungJukDTO.getKor()+ "\t" + 
						   sungJukDTO.getEng()+ "\t" + 
						   sungJukDTO.getMath() + "\t" +
						   sungJukDTO.getTot() + "\t" + 
						   sungJukDTO.getAvg());
		
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("국어 입력 : ");
		int kor = scan.nextInt();
		
		System.out.println("영어 입력 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 입력 : ");
		int math = scan.nextInt();
		
		sungJukDTO.setName(name);
		sungJukDTO.setKor(kor);
		sungJukDTO.setEng(eng);
		sungJukDTO.setMath(math);
		
	}

}




















