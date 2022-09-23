package com.java.demo.mains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java.demo.CatalogTest;
import com.java.demo.Category;
import com.java.demo.CategoryDto;
import com.java.demo.Sale;

public class SalesMain {

	public void buildCategories() {

		Sale al = new Sale(1, 22, 1, 200.20, 12);
		Sale bl = new Sale(2, 24, 2, 400.20, 42);
		Sale cl = new Sale(3, 22, 1, 300.20, 62);
		Sale dl = new Sale(4, 25, 3, 500.20, 29);

		List<Sale> sale = Arrays.asList(al, bl, cl, dl);

		Category gq = new Category(1, "bags", Arrays.asList(new Category(1, "a")), 22, 44);
		Category hq = new Category(2, "chargers", Arrays.asList(new Category(1, "ab")), 60, 55);
		Category mq = new Category(3, "shopings", Arrays.asList(new Category(2, "abc")), 80, 85);
		Category jq = new Category(4, "electrical motars", Arrays.asList(new Category(2, "abcd")), 80, 85);

		
		
		List<Category> klm = Arrays.asList(gq, hq, mq, jq);

		
		//request 1
		Map<Object, Double> collect = sale.stream().collect(
				Collectors.groupingBy(e -> e.getLeafCategoryId(), Collectors.summingDouble(f -> f.getAmount())));

		System.out.println(collect);

		//request 2
		
		klm.stream().filter(e -> e.getTotalQuantity() > 30).forEach(System.out::println);

	}

	public static void main(String args[]) {
		SalesMain s = new SalesMain();
		s.buildCategories();

	}

}
