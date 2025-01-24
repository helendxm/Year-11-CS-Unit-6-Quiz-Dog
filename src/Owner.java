public class Owner {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Owner(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }

//    public static void main(String[] args){
//        Owner owner = new Owner("Helen","Dai", "63661076");
//        System.out.println(owner.getFirstName());
//        System.out.println(owner.getLastName());
//        System.out.println(owner.getPhoneNumber());
//
//    }
}
