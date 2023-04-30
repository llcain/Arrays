interface   Animal {

    public void animalSound();



    public void sleep();

    public  void run();


}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void run() {
        System.out.println("run run");
    }
}

class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("bark bark");
    }

    public  void sleep() {
        System.out.println("ZZ");
    }

    @Override
    public void run() {
        System.out.println("run run");
    }


}
