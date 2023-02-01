public class Cat extends Animal implements Sayable,Dreamable{
    public Cat(String name, int weight, int gender) {
        super(name, weight, gender);
    }

    @Override
    public void say() {
        System.out.println("cat said myau,myau");
    }

    @Override
    public void dream() {
        System.out.println("cat very like dream");
    }

   
}
