package com.java.demo;

import java.util.List;

public class Category {
	 private int id;
	    private String name;
	    private List<Category> children;
	    private int totalSales;
	    private int totalQuantity;
		
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Category> getChildren() {
			return children;
		}
		public void setChildren(List<Category> children) {
			this.children = children;
		}
		public int getTotalSales() {
			return totalSales;
		}
		public void setTotalSales(int totalSales) {
			this.totalSales = totalSales;
		}
		public int getTotalQuantity() {
			return totalQuantity;
		}
		public void setTotalQuantity(int totalQuantity) {
			this.totalQuantity = totalQuantity;
		}
		public Category(int id, String name, List<Category> children, int totalSales, int totalQuantity) {
			super();
			this.id = id;
			this.name = name;
			this.children = children;
			this.totalSales = totalSales;
			this.totalQuantity = totalQuantity;
		}
		@Override
		public String toString() {
			return "Category [id=" + id + ", name=" + name + ", children=" + children + ", totalSales=" + totalSales
					+ ", totalQuantity=" + totalQuantity + "]";
		}
		public Category(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		

	    
	    
}