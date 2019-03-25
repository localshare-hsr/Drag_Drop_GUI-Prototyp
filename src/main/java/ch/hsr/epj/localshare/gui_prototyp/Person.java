package ch.hsr.epj.localshare.gui_prototyp;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty firstName = new SimpleStringProperty(this, "firstName");

    //return Firstname Value
    public String getFirstName() {
        return firstName.get();
    }

    //returns StringProperty Object
    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
