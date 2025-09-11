
public class InstanceVariable {

    int value = 10;

    public static void main(String[] args) {
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        obj2.value = 20;
        System.out.println("Value: " + obj1.value);
        System.out.println("Value: " + obj2.value);
    }
}
