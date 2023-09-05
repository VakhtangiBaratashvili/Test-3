public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double feetToMeters() {
        return (this.feet * 30.48 + this.inches * 2.54) / 100;
    }

    public double poundsToKilograms() {
        return this.weight / 2.2;
    }

    public double calculateBMI() {
        return poundsToKilograms() / Math.pow(feetToMeters(),2);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Weight: " + this.weight + " pounds" + "\n" +
                "Height: " + this.feet + "ft " + this.inches + "in" + "\n" +
                "BMI: " + calculateBMI();
    }

    /*
        BMI person = new BMI("Vakho",20, 200, 5, 11);
        System.out.println(person);
     */
}
