package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		/** ���� �Ͻÿ� **/ 
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		/** ���� �Ͻÿ� **/ 
	}
	
	public DiscountSale(DiscountSale originalObject) {
		/** ���� �Ͻÿ� **/ 
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		/** ���� �Ͻÿ� **/ 
	}
	
	public double getDiscount() {
		/** ���� �Ͻÿ� **/ 
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		/** ���� �Ͻÿ� **/ 
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		/** ���� �Ͻÿ� **/ 
	}
	
	
	public DiscountSale clone() {
		/** ���� �Ͻÿ�....  �ӽû����� ��� **/ 
	}
}