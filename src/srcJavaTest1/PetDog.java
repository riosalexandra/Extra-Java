// 6. Create a PetDog class that inherits from Pet.
public class PetDog extends Pet implements Companion {


//    7. In PetDog, create a boolean instance variable, trained.
    private boolean trained;


//    9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
//    --asking for us to create a getter on the trained property
    public boolean isTrained() {
        return trained;
    }


//   8.  Write a constructor for PetDog that sets its name, type, and trained properties.
    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

//a part of the solution for problem10-- a part of the code needed to correctly have PetDog class implement Companion interface
//    ----The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
    @Override
    public String snuggle() {
        return this.getName() + " wants to snuggle";
    }
}
