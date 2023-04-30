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
        System.out.println("Pig Zzz");
    }

    @Override
    public void run() {
        System.out.println("Pig run");
    }
}

class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bark bark");
    }

    public  void sleep() {
        System.out.println("Dog ZZZ");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }


}
