package gmzgarena;

import gmzgarena.Laptop;
import gmzgarena.Smartphone;
import gmzgarena.Product;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	ArrayList<Product> productList = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		menu();
		System.out.println("Thank You for using the app!");
	}

	private void menu() {
		// TODO Auto-generated method stub
		int choice = 0;
		do {
			System.out.println("GmzGarena");
			System.out.println("===============");
			System.out.println("1. Add new Product");
			System.out.println("2. View Product list");
			System.out.println("3. Delete Product");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choice = scan.nextInt(); scan.nextLine();
			
			switch (choice) {
			case 1:
				addProduct();
				break;
			case 2:
				viewProduct();
				break;
			case 3:
				deleteProduct();
				break;
			
                        case 4: 
                                System.out.println("Thanks");
                                break;
                        }
			
		} while (choice != 5);
	}

	private void deleteProduct() {
		// TODO Auto-generated method stub
		if (productList.isEmpty()) {
			System.out.println("no product data");
			return;
		}
		viewProduct();
		Integer delete;
		
		do {
			System.out.print("Input No to delete[1.." + productList.size() + "]: ");
			delete = scan.nextInt(); scan.nextLine();			
		} while (delete < 0 || delete > productList.size());
		
		productList.remove(delete-1);
		
		System.out.println("Product removed!");
	}

	private void viewProduct() {
//		 TODO Auto-generated method stub
		if(productList.isEmpty()) {
			System.out.println("No Product data");
			return;
		}
		
		int no = 1;
		System.out.println("===============================================================");
                System.out.println("|ID     | Name      |   Memory      |   Graphic | Protection | Price");
                System.out.println("===============================================================");
		for (Product product : productList) {
			if (product instanceof Laptop) {
				System.out.print("ID: " + product.getId());
				System.out.print(" Name: " + product.getName());
                                System.out.print(" Graphic: " + ((Laptop) product).getGraphic());
                                System.out.print(" Protection: - " );
				System.out.println(" Price: Rp." + (product.getMemory()*100000+(((Laptop) product).getGraphicPrice())));
			} else {
				System.out.print(" ID: " + product.getId());
				System.out.print(" Name: " + product.getName());
                                System.out.print(" Graphic: -" );
                                System.out.print(" Protection: " + ((Smartphone) product).getProtect());
				System.out.println(" Price: Rp." + (product.getMemory()*120000+ 300000 +((Smartphone) product).getProtectPrice()));
				
			}
			System.out.println("===============================================================");
			no++;
		}
	}

	private void addProduct() {
		// TODO Auto-generated method stub
		String type;
		String name;
		Integer memory = 0;
                Integer mod = 0;
		String graphic;
		String id;
                String protect;
                int graphicPrice =0;
                int protectPrice =0;

		
		System.out.println("======================");
		do {
                        System.out.println("1. Laptop");
                        System.out.println("2. Smartphone");
                        System.out.println("3. Exit");
			type = scan.nextLine();	
		} while (!type.equals("1") && !type.equals("2"));
		
		do {
			System.out.print("Product Name [More than 5 character]: ");
			name = scan.nextLine();			
		} while ((name.length() < 5 || name.length() > 99));
		
		do {
			System.out.print("Memory [Must be even and more than 1]: ");
			memory = scan.nextInt();
                        mod = (memory%2); // udah coba modulus ka cuma error
		} while (memory < 1 && memory == 3 && memory == 5 && memory == 7 && memory != 9 && memory != 11 && memory != 13 && memory != 15 );

		if (type.equals("1")) {
			do {
			System.out.print("Graphic [Nvida | Intel | Amdi] [Case Sensitive]: ");
			graphic =  scan.nextLine();
		} while (!graphic.equals("Nvida") && !graphic.equals("Intel") && !graphic.equals("Amdi"));
			
			id = generateID(type);
			if (!graphic.equals("Nvida")) {
                        graphicPrice = 800000;
                    }else if (!graphic.equals("Amdi")) {
                        graphicPrice = 700000;
                    }else if (!graphic.equals("Intel")) {
                        graphicPrice = 500000;
                    }
			Product newLaptop = new Laptop(id, name, memory, graphic, graphicPrice);
			
			productList.add(newLaptop);
		} else {
			do {
			System.out.print("Protection glass[Gorilla | Dragontrail | Concore]: ");
			protect =  scan.nextLine();
		} while (!protect.equals("Gorilla") && !protect.equals("Dragontrail") && !protect.equals("Concore"));
			
			id = generateID(type);
                        if (!protect.equals("Gorilla")) {
                        protectPrice = 200000;
                    }else if (!protect.equals("Dragontrail")) {
                        protectPrice = 500000;
                    }else if (!protect.equals("Concore")) {
                        protectPrice = 300000;
                    }
			Product newSmartphone = new Smartphone(id, name, memory, protect, protectPrice);
			
			productList.add(newSmartphone);
		}
		
	}


	private String generateID(String type) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		Integer x = r.nextInt(10);
		Integer y = r.nextInt(10);
		Integer z = r.nextInt(10);
		
		
		String id = "";
		
		if (type.equals("1")) {
			id = "Lap" + x.toString() + y.toString() + z.toString();
		} else {
			id = "Sma" + x.toString() + y.toString() + z.toString();
		}
		
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
