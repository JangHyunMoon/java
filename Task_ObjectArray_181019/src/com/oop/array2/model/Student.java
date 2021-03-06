package com.oop.array2.model;

public class Student {

	private String name;
	private int grade;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private double avg;
	// 이름 학년 국 수 영 합 평균
	public Student() {}
	
	public Student(String name, int grade, int kor, int math, int eng) {
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	// eng, sum, avg

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}
	
}
