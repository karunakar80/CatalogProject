package com.java.demo;

import java.util.List;

public class Sale {

	private int  productId;
	    private int leafCategoryId;
	    private int primaryCategoryId;
	    private Double amount;
	    private int quantity;
		
	    public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public int getLeafCategoryId() {
			return leafCategoryId;
		}
		public void setLeafCategoryId(int leafCategoryId) {
			this.leafCategoryId = leafCategoryId;
		}
		public int getPrimaryCategoryId() {
			return primaryCategoryId;
		}
		public void setPrimaryCategoryId(int primaryCategoryId) {
			this.primaryCategoryId = primaryCategoryId;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Sale(int productId, int leafCategoryId, int primaryCategoryId, Double amount, int quantity) {
			super();
			this.productId = productId;
			this.leafCategoryId = leafCategoryId;
			this.primaryCategoryId = primaryCategoryId;
			this.amount = amount;
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "Sale [productId=" + productId + ", leafCategoryId=" + leafCategoryId + ", primaryCategoryId="
					+ primaryCategoryId + ", amount=" + amount + ", quantity=" + quantity + "]";
		}
	    
	    
        
}
        
	   

		