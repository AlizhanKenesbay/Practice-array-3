public class Main {
    public static void main(String[] args) {
        int[] array = new int[12];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 31 - 15);
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
    }
}