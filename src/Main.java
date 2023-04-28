import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static void task1(){
            //task1
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 8, 4, 5, 5, 6, 7));
            for (Integer num : nums) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("--------------");
        }

        public static void task2() {
            //task2
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 8, 4, 5, 5, 6, 7));
            List<Integer> evenNums = new ArrayList<>();
            for (Integer num : nums) {
                if (num % 2 == 0) {
                    evenNums.add(num);
                }
            }

            List<Integer> evenNumsSorted = new ArrayList<>();
            int a = evenNums.get(0);
            for (int i = 0; i < evenNums.size(); i++) {
                if (a <= evenNums.get(i)) {
                    a = evenNums.get(i);
                }
            }

            for (int i = 0; i < (a + 1); i++) {
                if (evenNums.contains(i)) {
                    evenNumsSorted.add(i);
                    i++;
                }
            }

            System.out.println(evenNumsSorted);
            System.out.println("--------------");

        }

        public static void task3() {
            //task3
            List<String> words = new ArrayList<>(List.of("egor",
                    "egor",
                    "yulya"));

            Set<String> wordsSorted = new HashSet<>();

            for (String word : words) {
                if (words.contains(word) ) {
                    wordsSorted.add(word);
                }
            }
            System.out.println(wordsSorted);
            System.out.println("--------------");
        }

        public static void task4() {
            //task4
            List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
            Map<String, Integer> duplicates = new HashMap<>();
            for (String string : strings) {
                if (duplicates.containsKey(string)) {
                    duplicates.put(string, duplicates.get(string) + 1);
                } else {
                    duplicates.put(string, 1);
                }
            }
            System.out.println(duplicates);

        }

    }