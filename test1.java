package Test;

import java.util.Arrays;
import java.util.List;

public class test1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","hello","world","program","or","examples");
		long total = list.stream().distinct().count();
		System.out.println(total);
	}
}
