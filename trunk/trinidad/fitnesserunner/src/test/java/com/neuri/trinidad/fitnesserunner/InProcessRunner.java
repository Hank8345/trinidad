package com.neuri.trinidad.fitnesserunner;

import com.neuri.trinidad.TestRunner;

import fit.Counts;

public class InProcessRunner {
	public static void main(String[] args) throws Exception {
//		TestRunner tdd=new TestRunner(new FitNesseRepository("src/test/resources"), 
//				new FITTestEngine(),"/tmp/fitnesse");
		TestRunner tdd=new TestRunner(new FitNesseRepository("/opt/fitnesse"), 
				new SlimTestEngine(),"/tmp/fitnesse/slim");

		Counts cs=tdd.runSuite("SlimTest");
		System.err.println("Total right="+cs.right +"; wrong="+cs.wrong+ " exceptions="+cs.exceptions);
	}
}
