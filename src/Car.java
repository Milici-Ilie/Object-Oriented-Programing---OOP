public class Car {
    //🚗🚗[ENCAPSULATION]🚗🚗 ... 🚗🚗[ENCAPSULATION]🚗🚗

    private String make = "Volvo";
    private String model = "XC90";
    private String color = "White";
    private int doors = 4;
    private boolean convertible = true;

    //❗❗❗❗❗❗ IMPORTANT - to get all those "Strings" we need to access: Menu, Code, Generate, Getter, select all the files === now check the "Main.java" file
    //❗❗❗❗❗❗ IMPORTANT - to get all those "Strings" we need to access: Menu, Code, Generate, Setter, select all the files === now check the "Main.java" file
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void  setMake(String make){

        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "volvo", "mercedes-benz" -> this.make = make;// using "this" key word 🔑🔑🔑 === now go and check "Main.java" to see how to call the "this" key word method
            default -> {
                this.make = "Unsupported";
            }
        }//converting the strings to lowercase and then check if on of the 3 choices are available, if the choices match we set the "make" equal to the result "make", if not, we display "Unsupported"
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

//    public void setMake(String make) {
//        this.make = make;// using "this" key word 🔑🔑🔑 === now go and check "Main.java" to see how to call the "this" key word method
//    }

    public void describeCar() {
//here we created a String to display all those data when we are calling this function in our "Main.java" file
        System.out.println(doors + " -Door " + color + " " + make + " " + model + " " + (convertible ? "convertible" : " "));
    }
}
