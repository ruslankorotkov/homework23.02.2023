import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание №1");
        List<Integer> list1 = new ArrayList<>(Set.of(1, 21, 32, 4, 25, 26, 2, 27, 82, 83, 93, 54, 14, 56));
        System.out.println("Минимальное число: " + list1.stream().min(Comparator.naturalOrder()).get());
        System.out.println("Максимальное число: " + list1.stream().max(Comparator.naturalOrder()).get());
    }

    public static void task2() {
        System.out.println("Задание №2");
        List<Integer> list = new ArrayList<>(Set.of(1, 21, 32, 4, 25, 26, 2, 27, 82, 83, 93, 54, 14, 56));
        System.out.println("Количество четных чисел: " + list.stream().filter(e -> e % 2 == 0).count());
    }
}