import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        List<Integer> list = new ArrayList<>(Set.of(1, 21, 32, 4, 25, 26, 2, 27, 82, 83, 93, 54, 14, 56));
        findMinMax(list.stream(), Integer::compareTo, (intMin, intMax) -> {
            System.out.println("Задание №1 (доделка)");
            System.out.println("Min: " + intMin);
            System.out.println("Max: " + intMax);
        });

    }

    public static void task1() {
        System.out.println("Задание №1");
        List<Integer> list1 = new ArrayList<>(Set.of(1, 21, 32, 4, 25, 26, 2, 27, 82, 83, 93, 54, 14, 56));
        System.out.println("Минимальное число: " + list1.stream().min(Comparator.naturalOrder()).get());
        System.out.println("Максимальное число: " + list1.stream().max(Comparator.naturalOrder()).get());
    }

    public static void task2() {
        System.out.println("Задание №2");
        List<Integer> list2 = new ArrayList<>(Set.of(1, 21, 32, 4, 25, 26, 2, 27, 82, 83, 93, 54, 14, 56));
        System.out.println("Количество четных чисел: " + list2.stream().filter(e -> e % 2 == 0).count());
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<Integer, Integer> minMaxConsumer) {
        List<Integer> list = (List<Integer>) stream.sorted(order).toList();
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            int intMin = list.stream().min(Comparator.naturalOrder()).get();
            int intMax = list.stream().max(Comparator.naturalOrder()).get();
            minMaxConsumer.accept(intMin, intMax);
        }
    }
}