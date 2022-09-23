package com.java.demo;

public class CatalogTest {
	 private Sale sales;
	    private Category category;

	    public Sale getSales() {
	        return sales;
	    }

	    public void setSales(Sale sales) {
	        this.sales = sales;
	    }

	    public Category getCategory() {
	        return category;
	    }

	    public void setCategory(Category category) {
	        this.category = category;
	    }

	    public CatalogTest(Sale sales, Category category) {
	        this.sales = sales;
	        this.category = category;
	    }

	}


