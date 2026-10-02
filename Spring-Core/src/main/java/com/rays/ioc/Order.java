package com.rays.ioc;

public class Order {

	private Inventry inventry;
	private Payment payment;

	public Inventry getInventry() {
		return inventry;
	}

	public void setInventry(Inventry inventry) {
		this.inventry = inventry;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void makeOrder(int book) {

		int pricePerBook = 100;

		int totalPayingAmt = pricePerBook * book;
		int remainingAmt = payment.pay(totalPayingAmt);
		int remainingstock = inventry.sold(book);

		System.out.println("you order is completed......");
		System.out.println("total paying amount : " + totalPayingAmt);
		System.out.println("total Book ordered  : " + book);
		System.out.println("total remaining balance : " + remainingAmt);
		System.out.println(" remaining book stock: " + remainingstock);

	}

}
