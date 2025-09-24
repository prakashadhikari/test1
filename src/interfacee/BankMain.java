package interfacee;

public class BankMain {

	public static void main(String[] args) {
		Bank sbi = new SBI();
		Bank hdfc = new HDFC();
	
		
		System.out.println("SBI Rate of Interest: " + sbi.rateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + hdfc.rateOfInterest() + "%");

	}

}
