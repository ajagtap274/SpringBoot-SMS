package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
		// TODO Auto-generated method stub
		@Id
		public Long rollNo;
		
		@Column
		public String fname;
		@Column
		public String lname;
		@Column
		public int maths;
		@Column
		public int sci;
		@Column
		public int eng;
		@Column
		public double percentage;
		@Column
		public boolean fail;
		
		
		public Long getRollNo() {
			return rollNo;
		}

		public void setRollNo(Long rollNo) {
			this.rollNo = rollNo;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public int getMaths() {
			return maths;
		}

		public void setMaths(int maths) {
			this.maths = maths;
		}

		public int getSci() {
			return sci;
		}

		public void setSci(int sci) {
			this.sci = sci;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public double getPercentage() {
			return percentage;
		}

		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}

		public boolean isFail() {
			return fail;
		}

		public void setFail(boolean fail) {
			this.fail = fail;
		}

		public Student(Long rollNo, String fname, String lname, int maths, int sci, int eng, double percentage,
				boolean fail) {
			super();
			this.rollNo = rollNo;
			this.fname = fname;
			this.lname = lname;
			this.maths = maths;
			this.sci = sci;
			this.eng = eng;
			this.percentage = percentage;
			this.fail = fail;
		}

		public Student()
		{
			
		}
		
		
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname + ", maths=" + maths + ", sci="
					+ sci + ", eng=" + eng + ", percentage=" + percentage + ", fail=" + fail + "]";
		}

		
		
		
		
		
		
		
		

}
