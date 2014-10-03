/**
 * 
 * @author Kevin
 *
 */
public class ElectronicEquipmentTest {
	
	public static void main(String[] args) {
		Computer c = new Computer();
		Cellphone cp = new Cellphone();
		
		System.out.println("-Computer-\n ");
		c.setCost(899.99);
		c.setWeight(4.0);
		c.setManufacturer("Lenovo");
		c.setBattery("5 hrs");
		c.writeOutput();
		
		System.out.println("\n-Cellphone-\n ");
		cp.setCost(99.99);
		cp.setWeight(1.0);
		cp.setManufacturer("Apple");
		cp.setBattery("4 hrs");
		cp.writeOutput();
		
	}
}
