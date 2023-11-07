import java.util.*;

interface StateTax{
	double stateTax();
}
class Haryana implements StateTax {
	public double stateTax() {
		return 1500.0;
	}
}
class UP implements StateTax{
	public double stateTax() {
		return 2500.0;
	}
}

public class ques2 {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state name");
		ques2 c = new ques2();
		Package p = c.getClass().getPackage();
		String pName=p.getName();
		String state = sc.next();
		Class obj = Class.forName(pName+"."+state);
		StateTax refer = (StateTax)obj.newInstance();
		calculateTax(refer);
	}
	static void calculateTax(StateTax data) {
		double central_Tax = 3500.0;
		double state_Tax = data.stateTax();
		double total_Tax = state_Tax + central_Tax;
		System.out.println("The total Tax of the state is =" +  total_Tax);
	}

}
