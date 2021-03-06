package com.jd.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    Collections.sort(names, Comparator.comparing(String::length).reversed());
    names.forEach(name -> System.out.print(name + " "));
    System.out.println();

    Collections.sort(names, new Comparator<String>() {

      @Override
      public int compare(String a, String b) {
        return b.compareTo(a);
      }
    });

    Collections.sort(names, (String a, String b) -> {
      return b.compareTo(a);
    });

    Collections.sort(names, (String a, String b) -> b.compareTo(a));

    Collections.sort(names, (a, b) -> b.compareTo(a));

    names.stream().forEach((x) -> System.out.println(x + " "));
  }
}
