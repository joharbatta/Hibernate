package tableperclass;


import javax.persistence.*;
//table per class
//3 table bnega
@Entity(name="tbc")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class A {

    @Id
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
