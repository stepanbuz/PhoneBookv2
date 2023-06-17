class Person {
    private String name;
    private String surname;
    private String phone;
    private String age;
    private String gender;
    private String type;

    public Person(String name, String surname, String phone, String age, String gender, String type) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){return this.name + "=" + this.surname + "=" + this.phone+ "=" + this.age+ "=" + this.type + "=" + this.gender;}
    public String inFo(){return this.name + "=" + this.surname + "=" + this.phone+ "=" + this.age+ "=" + this.type + "=" + this.gender;}
}
