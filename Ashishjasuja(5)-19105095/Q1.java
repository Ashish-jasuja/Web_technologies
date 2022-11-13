class Mammals{
    void print(){
        System.out.println("I am mammal");
    }
}
class MarineAnimals extends Mammals{
    void print(){
        System.out.println("I am a marine animal");
    }
    void printParent(){
        super.print();
    }
}
class BlueWhale extends MarineAnimals{
    void print(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void printP1(){
        super.print();
    }
    void printP2(){
        super.printParent();
    }
}

public class Q1{
    public static void main(String args[]){
        Mammals MM=new Mammals();
        MarineAnimals MA=new MarineAnimals();
        BlueWhale BW=new BlueWhale();

        MM.print();
        MA.print();
        BW.print();

        BW.printP1();
        BW.printP2();
    }
}
    