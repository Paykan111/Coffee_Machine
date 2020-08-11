class Cat {
    String name;
    int age;
    static int counter;
    // write static and instance variables

    public Cat(String name, int age) {
        counter+=1;
        if (Cat.getNumberOfCats()>5){
            System.out.println("You have too many cats");
        }
        else {
            this.name = name;
            this.age = age;
        }
        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}