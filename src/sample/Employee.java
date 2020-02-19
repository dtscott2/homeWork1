package sample;

import java.util.UUID;

public class Employee implements Worker
{

    public String firstName;
    public String lastName;
    public UUID id;



    public boolean isActive;

    @Override
    public String toString()
    {
        return this.firstName + " " + this.lastName;
    }


    @Override
    public void hire()
    {
        isActive = true;
    }

    @Override
    public void fire()
    {
        isActive = false;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}
