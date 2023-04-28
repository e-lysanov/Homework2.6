import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
            List<Integer> nums2 = new ArrayList<>();
            for (Integer num : nums) {
                if (num % 2 == 0) {
                    nums2.add(num);
                }
            }

            List<Integer> nums3 = new ArrayList<>();
            int a = nums2.get(0);
            for (int i = 0; i < nums2.size(); i++) {
                if (a <= nums2.get(i)) {
                    a = nums2.get(i);
                }
            }

            for (int i = 0; i < (a + 1); i++) {
                if (nums2.contains(i)) {
                    nums3.add(i);
                    i++;
                }
            }

            System.out.println(nums3);
            System.out.println("--------------");

        }

        public static void task3() {
            //task3
            List<String> words = new ArrayList<>(List.of("egor",
                    "egor",
                    "yulya"));

            List<String> words2 = new ArrayList<>();
            for (String word : words) {
                if (words.contains(word) && !words2.contains(word)) {
                    words2.add(word);
                }
            }
            System.out.println(words2);
            System.out.println("--------------");
        }

    }