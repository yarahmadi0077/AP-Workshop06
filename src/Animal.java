class Animal {
    private String name;
    private int age;
    private String attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Animal(String name, int age, String attributes) {
        this.name = name;
        this.age = age;
        this.attributes = attributes;
    }
    public String toString(){
        return name + " " + age + " " + attributes ;
    }
    public void show (){
        System.out.println( name + " "  + age + " " + attributes);
    }
}