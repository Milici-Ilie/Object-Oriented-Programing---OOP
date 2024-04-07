public class Main {
    public static void main(String[] args) {

        Car car = new Car();// always make sure when creating objects to add the "new" and the name of the class followed by ();

        car.setMake("Mercedes-Benz");// calling the method using "this" key word 🔑🔑🔑 and assign new value to the method
        car.setModel("GLS");// calling the method using "this" key word 🔑🔑🔑 and assign new value to the method
        car.setColor("White");// calling the method using "this" key word 🔑🔑🔑 and assign new value to the method
        car.setDoors(4);// calling the method using "this" key word 🔑🔑🔑 and assign new value to the method
        car.setConvertible(true);// calling the method using "this" key word 🔑🔑🔑 and assign new value to the method

        System.out.println("make = " + car.getMake());//calling only some specific parts from the method
        System.out.println("model = " + car.getModel());

        car.describeCar();// calling the entire method with the String


        Car targa = new Car();// creating a new class

        targa.setMake("Volvo");
        targa.setModel("XC90");
        targa.setColor("Black");
        targa.setDoors(4);
        targa.setConvertible(true);

        targa.describeCar();//calling the class
    }
}
