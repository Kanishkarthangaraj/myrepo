package com.example.myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//example1
public class StreamMain {
//   static List<String> Places=new ArrayList();
//   public static List getPlaces() {
//	   Places.add("nepal,kathmandu");
//	   Places.add("tamilnade,karur");
//	   Places.add("india,delhi");
//	   Places.add("kerala,munhar");
//	   Places.add("kochi,wonderla");
//	   return Places;
//   }
   public static void main(String[]args) {
//	   List<String> myPlaces=getPlaces();
//	   System.out.println("Places in india:");
//	   myPlaces.stream()
//	   .filter((p)->p.startsWith("india"))
//	   .map((p) -> p.toUpperCase())
//	   .sorted()
//	   .forEach((p)->System.out.println(p));
//	   List<String>names=Arrays.asList("reflection","collection","Stream","State");
//	   System.out.println("forEach:");
//	   names.stream().forEach(System.out::println); 
//	   
//   List<String>sNames=names.stream()
//		   .filter(name -> name.startsWith("S"))
//		   .collect(Collectors.toList());
//   System.out.println("\ncollect(name staring with 's'):");
//   sNames.forEach(System.out::println);
//   
//        List<Integer> prices = Arrays.asList(100, 200, 300, 400, 500);
//       double gstRate = 0.12;
//
//      
	   
	   
	   List<Integer> prices = Arrays.asList(30932, 200, 300, 400, 500);
       double gstRate = 0.18;
//       prices.forEach(price -> {
//         double priceWithGST = price + (price * gstRate);
//         System.out.printf("Price: %d, Price with 12%% GST: %.2f%n", price, priceWithGST);
//     });

       for (int price : prices) {
           double priceWithGST = price + (price * gstRate);
           System.out.printf("Price: %d, Price with 12%% GST: %.2f%n", price, priceWithGST);
       }
}
}
//example2
