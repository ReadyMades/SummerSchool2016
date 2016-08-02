package baseObjects;

public class Animal implements IAnimal {

    private String mName;

    public String getName() {
        return mName;
    }

    public void setmName(String name) {
        this.mName = name;
    }

    public void voice(){}
}
