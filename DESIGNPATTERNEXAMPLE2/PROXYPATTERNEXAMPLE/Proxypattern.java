public class Proxypattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
     

        System.out.println("First time displaying photo1:");
        image1.display(); 

        System.out.println("\nSecond time displaying photo1:");
        image1.display(); 

        
    }
}