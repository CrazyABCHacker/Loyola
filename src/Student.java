public class Student extends Person{
    Student(String name, int age){
        super(name, age);

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){this.age = age;}

    public String getName(){
        return name;
    }
    public int getAge(){return age;}

    @Override
    public String toString() {
        return super.toString();
    }
}
