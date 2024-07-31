public class Quicksort {
    public static void quickSort(Customerorder[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Customerorder[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                Customerorder temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Customerorder temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Customerorder[] orders = {
                new Customerorder(1, "JONSNOW", 250),
                new Customerorder(2, "DANAERYS", 150),
                new Customerorder(3, "SNOW", 350),
                new Customerorder(4, "JAMIE", 200)
        };

        System.out.println("Before Sorting:");
        for (Customerorder order : orders) {
            System.out.println(order);
        }

        quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Sorting:");
        for (Customerorder order : orders) {
            System.out.println(order);
        }
    }
}