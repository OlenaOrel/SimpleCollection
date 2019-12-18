import array_list.SimpleArray;

public class Main {

    public static void main(String[] args) {

        SimpleArray<String> array = new SimpleArray<>();

        array.add("John");
        array.add("Mark");
        array.add("Oleg");
        array.add("Tom");
        array.add("Vova");

        System.out.println("Array: ");
        printArrayElements(array);
        System.out.println("Tom: " + array.get(3));
        System.out.println("remove: Jone, Tom");
        array.delete(0);
        array.delete(2);
        printArrayElements(array);
    }

    private static void printArrayElements(SimpleArray<String> array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
