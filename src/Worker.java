public class Worker extends Person{
    Worker(String name, int age){
        super(name, age);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
