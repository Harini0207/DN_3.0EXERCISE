public class Bubblesort {
    public static void bubb(Customerorder[] orders){
        int n= orders.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++ ){
                if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice())
                {
                    Customerorder temp= orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        Customerorder[] orders={
                new Customerorder(1,"ROSS",500),
                new Customerorder(2,"RACHEL",400),
                new Customerorder(3,"PHOEBE",300),
                new Customerorder(4,"JOEY",200),
                new Customerorder(5,"CHANDLER",100),
                new Customerorder(5,"MONICA",100)
        };
        System.out.println("before sorting");
        for(Customerorder order:orders){
            System.out.println(order);
        }
        bubb(orders);
        for(Customerorder order:orders){
            System.out.println(order);
        }
    }
}