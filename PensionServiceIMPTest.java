package sem12122.sse3305.service;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class PensionServiceIMPTest {

	@Test
	void epTC1() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("31"); // 0
		test.add("3"); // 1
		test.add("1958");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("160");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("10");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = "0";
		String actBenefit = output.get(2);
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 45);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "Mar, 2003");
			
		} 


	
	
	@Test
	void epTC2() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1968");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);

		String expBenefit = output.get(2);
		String actBenefit = "1";
		assertEquals(expBenefit, actBenefit);
		
			
	}
	
	@Test
	void epTC3() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1954");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1999");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "2";
		assertEquals(expBenefit, actBenefit);
			
		
	}
	
	@Test
	void epTC4() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1964");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1999");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "1";
		assertEquals(expBenefit, actBenefit);
		
	}
	
	@Test
	void epTC5() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("21"); // 0
		test.add("9"); // 1
		test.add("1952");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("21");// harisara //12
		test.add("3");// bulansara //13
		test.add("2008");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 55);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "Sep, 2006");

	}
	
	@Test
	void epTC6() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2007");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "1";
		assertEquals(expBenefit, actBenefit);

	}
	
	
	@Test
	void epTC7() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1948");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "2";
		assertEquals(expBenefit, actBenefit);

	}
	
	@Test
	void epTC8() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "1";
		assertEquals(expBenefit, actBenefit);
			

	}
	
	@Test
	void epTC9() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("11"); // 1
		test.add("1958");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("10");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 44);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "Nov, 2003");

	}
	
	@Test
	void epTC10() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "1";
		assertEquals(expBenefit, actBenefit);
			
	}
	@Test
	void epTC11() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1954");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1999");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "2";
		assertEquals(expBenefit, actBenefit);
			
	}
	@Test
	void epTC12() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1964");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1999");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
		String actBenefit = "1";
		assertEquals(expBenefit, actBenefit);
	}
	
	@Test
	void epTC13() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("21"); // 0
		test.add("9"); // 1
		test.add("1952");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("21");// harisara //12
		test.add("3");// bulansara //13
		test.add("2008");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 55);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "Sep, 2006");

	}
	
	@Test
	void epTC14() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2007");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
	   
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);

	}
	
	@Test
	void epTC15() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1948");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
			

	}
	
	@Test
	void epTC16() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
			
	}
	
	@Test
	void epTC17() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("11"); // 1
		test.add("1958");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("10");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 44);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "Nov, 2003");
	}
	
	@Test
	void epTC18() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);

	}
	
	@Test
	void epTC19() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1954");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1999");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
	}
	
	@Test
	void epTC20() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1964");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1999");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
	}
	
	@Test
	void epTC21() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("5"); // 1
		test.add("1952");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("4");// bulansara //13
		test.add("2008");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 55);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "May, 2006");
			
	}
	
	@Test
	void epTC22() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2007");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
			
	}
	
	@Test
	void epTC23() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1948");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
			
	}
	
	@Test
	void epTC24() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1968");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
	}
	
	@Test
	void epTC25() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("31"); // 0
		test.add("10"); // 1
		test.add("1952");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("10");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 50);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "Oct, 2007");


	}
	
	@Test
	void epTC26() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1968");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
	}
	
	@Test
	void epTC27() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1949");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1997");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
			
	}
	
	@Test
	void epTC28() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1964");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("1999");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
			

	}
	
	@Test
	void epTC29() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1953");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("4");// bulansara //13
		test.add("2008");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1250);
		assertEquals(actGratuity, 56250);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 55);
		assertEquals(servicePeriod, 150);
		assertEquals(pensionDate, "Jan, 2007");
			
		

	}
	
	@Test
	void epTC30() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1972");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2007");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
			
	}
	
	@Test
	void epTC31() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("1"); // 1
		test.add("1948");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("15");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
			
	}
	
	@Test
	void epTC32() throws ParseException { 

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("1"); // 1
		test.add("1968");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("1");// bulansara //13
		test.add("2003");// tahunsara //14
		test.add("L");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);

	}

	
	//BVA Approach - Pension Age & Service Period
	@Test
	void bvaTC1() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("8"); // 1
		test.add("1966");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("8");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double servicePeriod, retirementAge;
		String pensionDate;
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
        
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 39);
		assertEquals(servicePeriod, 119);
		assertEquals(pensionDate, "Aug, 2020");

	}
	
	@Test
	void bvaTC2() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("9"); // 1
		test.add("1966");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("9");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double servicePeriod, retirementAge;
		String pensionDate;
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
        
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 39);
		assertEquals(servicePeriod, 120);
		assertEquals(pensionDate, "Sep, 2021");

	}
	
	
	@Test
	void bvaTC3() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("31"); // 0
		test.add("9"); // 1
		test.add("1966");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("10");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double servicePeriod, retirementAge;
		String pensionDate;
		
		String expBenefit = output.get(2);
        String actBenefit = "1";
        assertEquals(expBenefit, actBenefit);
        
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 39);
		assertEquals(servicePeriod, 121);
		assertEquals(pensionDate, "Aug, 2021");

	}
	
	@Test
	void bvaTC4() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("8"); // 1
		test.add("1965");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("8");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double servicePeriod, retirementAge;
		String pensionDate;
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
        
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 40);
		assertEquals(servicePeriod, 119);
		assertEquals(pensionDate, "Aug, 2019");

	}
	
	@Test
	void bvaTC5() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("8"); // 1
		test.add("1965");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("9");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double servicePeriod, retirementAge;
		String pensionDate;
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
        
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 40);
		assertEquals(servicePeriod, 120);
		assertEquals(pensionDate, "Aug, 2020");

	}
	
	@Test
	void bvaTC6() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("9"); // 1
		test.add("1965");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("10");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1008.33);
		assertEquals(actGratuity, 45375);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 40);
		assertEquals(servicePeriod, 121);
		assertEquals(pensionDate, "Sep, 2020");

	}
	
	@Test
	void bvaTC7() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("8"); // 1
		test.add("1964");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("8");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double servicePeriod, retirementAge;
		String pensionDate;
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
        
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 41);
		assertEquals(servicePeriod, 119);
		assertEquals(pensionDate, "Aug, 2018");

	}
	
	@Test
	void bvaTC8() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("8"); // 1
		test.add("1964");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("9");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double servicePeriod, retirementAge;
		String pensionDate;
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
        
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 41);
		assertEquals(servicePeriod, 120);
		assertEquals(pensionDate, "Aug, 2019");

	}
	
	@Test
	void bvaTC9() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("30"); // 0
		test.add("8"); // 1
		test.add("1964");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("30");// harisara //12
		test.add("10");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double actPension, actGratuity, actCash, servicePeriod, retirementAge;
		String pensionDate;

		String expBenefit = output.get(2);
		String actBenefit = "0";
		assertEquals(expBenefit, actBenefit);
		
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
	    assertEquals(actPension, 1008.33);
		assertEquals(actGratuity, 45375);
		assertEquals(actCash, 26500);
		
		retirementAge = Double.parseDouble(output.get(1));
	    servicePeriod = Double.parseDouble(output.get(3));
	    pensionDate = output.get(7);
		assertEquals(retirementAge, 41);
		assertEquals(servicePeriod, 121);
		assertEquals(pensionDate, "Aug, 2019");

	}
	
	//Control Structure Testing : Branch/Condition Coverage
	@Test
	void cstBC1() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("10"); // 0
		test.add("10"); // 1
		test.add("1964");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("5");// harisara //12
		test.add("5");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double retirementAgeYear, retirementAgeMonth;
		
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
        
		retirementAgeYear = Double.parseDouble(output.get(1));
		retirementAgeMonth =  Double.parseDouble(output.get(0));
		assertEquals(retirementAgeYear, 40);
		assertEquals(retirementAgeMonth, 6);


	}
	
	@Test
	void cstBC2() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1964");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("10");// harisara //12
		test.add("10");// bulansara //13
		test.add("2004");// tahunsara //14
		test.add("F");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double retirementAgeYear, retirementAgeMonth;
		
		
		String expBenefit = output.get(2);
        String actBenefit = "2";
        assertEquals(expBenefit, actBenefit);
        
		retirementAgeYear = Double.parseDouble(output.get(1));
		retirementAgeMonth =  Double.parseDouble(output.get(0));
		assertEquals(retirementAgeYear, 40);
		assertEquals(retirementAgeMonth, 5);
	} 
	
	@Test
	void cstBC3() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1964");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("10");// harisara //12
		test.add("10");// bulansara //13
		test.add("2004");// tahunsara //14
		test.add("L");// jantina //15
		test.add("Y");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double retirementAgeYear, retirementAgeMonth;
		
		
		String expBenefit = output.get(2);
        String actBenefit = "0";
        assertEquals(expBenefit, actBenefit);
        
	} 
	
	@Test
	void cstBC4() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1964");// tahunlahir //2
		test.add("31");// 3
		test.add("3");// 4
		test.add("1991");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("10");// harisara //12
		test.add("10");// bulansara //13
		test.add("2004");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double retirementAgeYear, retirementAgeMonth;
		
		
		String expBenefit = output.get(2);
        String actBenefit = "0";
        assertEquals(expBenefit, actBenefit);
        
	} 
	
	@Test
	void cstBC5() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1964");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("10");// harisara //12
		test.add("10");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double retirementAgeYear, retirementAgeMonth;
		
		String expBenefit = output.get(2);
        String actBenefit = "0";
        assertEquals(expBenefit, actBenefit);
        
	} 
	
	@Test
	void cstBC6() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1964");// tahunlahir //2
		test.add("10");// 3
		test.add("10");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("5");// harisara //12
		test.add("5");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double retirementAgeYear, retirementAgeMonth;
		
		String expBenefit = output.get(2);
        String actBenefit = "0";
        assertEquals(expBenefit, actBenefit);
        
	} 
	
	@Test
	void cstBC7() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1964");// tahunlahir //2
		test.add("5");// 3
		test.add("5");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("150");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("10");// harisara //12
		test.add("10");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double retirementAgeYear, retirementAgeMonth;
		
		String expBenefit = output.get(2);
        String actBenefit = "0";
        assertEquals(expBenefit, actBenefit);
        
	} 
	
	@Test
	void cstBC8() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1990");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("300");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("10");// harisara //12
		test.add("10");// bulansara //13
		test.add("2030");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double actPension, actGratuity, actCash, servicePeriod;

		servicePeriod = Double.parseDouble(output.get(3));
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
		assertEquals(servicePeriod, 420);
	    assertEquals(actPension, 3000);
		assertEquals(actGratuity, 157500);
		assertEquals(actCash, 26500);
		
	} 
	
	@Test
	void cstBC9() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("5"); // 0
		test.add("5"); // 1
		test.add("1970");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("100");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("10");// harisara //12
		test.add("10");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		double actPension, actGratuity, actCash, servicePeriod;

		servicePeriod = Double.parseDouble(output.get(3));
        actPension = Double.parseDouble(output.get(4));
		actGratuity = Double.parseDouble(output.get(5));
		actCash = Double.parseDouble(output.get(6));
		assertEquals(servicePeriod, 120);

        
	} 
	
	@Test
	void cstBC10() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("0"); // 0
		test.add("1"); // 1
		test.add("1970");// tahunlahir //2
		test.add("5");// 3
		test.add("5");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("100");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("0");// harisara //12
		test.add("1");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String pensionDate;
        pensionDate = output.get(7);
		assertEquals(pensionDate, "Dec, 2024");
        
	} 
	
	@Test
	void cstBC11() throws ParseException { // Age= 35, Service= 75

		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1"); // 0
		test.add("0"); // 1
		test.add("1970");// tahunlahir //2
		test.add("21");// 3
		test.add("9");// 4
		test.add("1995");// tahunkerja //5
		test.add("5000");// gaji //6
		test.add("300");// allowance //7
		test.add("100");// gajicuti //8
		test.add("0");// cutihari //9
		test.add("0");// cutibulan //10
		test.add("0");// cutitahun //11
		test.add("1");// harisara //12
		test.add("0");// bulansara //13
		test.add("2005");// tahunsara //14
		test.add("P");// jantina //15
		test.add("N");// istimewa //16
		ArrayList<String> output = pc.kirapencen(test);
		
		String pensionDate;
        pensionDate = output.get(7);
		assertEquals(pensionDate, "Dec, 2024");
        
	}
}


