package tableperclass;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="tbc2")
public class C extends A {

    String valueTwo;

    public String getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(String valueTwo) {
        this.valueTwo = valueTwo;
    }
}
