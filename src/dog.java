public class dog extends Animal implements Sayable,Dreamable{
    public dog(String name, int weight, int gender) {
        super(name, weight, gender);
    }

    @Override
    public void say() {
        System.out.println("dog said gav gav");
    }

    @Override
    public void dream() {
        System.out.println("dog like dream on day");
    }
}
