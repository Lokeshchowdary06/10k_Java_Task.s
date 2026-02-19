package com.day3;

class CartItem{
	int itemId;
	String itemName;
	double pricesFromSellers[]=new double[3];
	CartItem(int itemId,String itemName,double[] pricesFromSellers)
	{
		this.itemId=itemId;
		this.itemName=itemName;
		this.pricesFromSellers=pricesFromSellers;
	}
	public double leastPrice()
	{
		double lowPrice=pricesFromSellers[0];
		for(double lp:pricesFromSellers)
		{
			if(lp<lowPrice)
				lowPrice=lp;
		}
		return lowPrice;
	}
}
class ShoppingCart {
		CartItem items[]= new CartItem[5];
		public void displayCart()
		{
			for(CartItem ci:items)
			{
				if(ci !=null)
				{
					System.out.println("Cart Items:"+ci.itemName+"\nLowest Price:"+ci.leastPrice());
				}
				else
				{
					System.out.println("End Of the Cart");
					break;
				}
			}
		}
		public double calculateTotalCost()
		{
			double tc=0.0d;
			for(CartItem ci:items)
			{
				if(ci != null)
				{
					tc+=ci.leastPrice();
				}
			}
			return tc;
		}
}

public class Main {
	public static void main(String[] args) {
		ShoppingCart sc1= new ShoppingCart();
        sc1.items[0] = new CartItem(101, "Laptop", new double[]{700, 650, 680});
        sc1.items[1] = new CartItem(102, "Phone", new double[]{500, 520, 490}); 
        sc1.displayCart();
        System.out.println("Total Cost: " + sc1.calculateTotalCost());
	}
}
