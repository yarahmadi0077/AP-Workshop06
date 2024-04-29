class Bird extends Animal {
    private double heightOfFlight ;


    public Bird(String name, int age, String attributes, double heightOfFlight) {
        super(name, age, attributes);
        this.heightOfFlight = heightOfFlight;
    }

    public double getHeightOfFlight() {
        return heightOfFlight;
    }

    public void setHeightOfFlight(double heightOfFlight) {
        if (heightOfFlight > 0)
            this.heightOfFlight = heightOfFlight;
    }
    public String toString(){
        return super.toString() + " " + heightOfFlight;
    }
    public void show(){
        System.out.println(getName() + " " + getAge() + " " + getAttributes()  +"  " + heightOfFlight);
    }
}