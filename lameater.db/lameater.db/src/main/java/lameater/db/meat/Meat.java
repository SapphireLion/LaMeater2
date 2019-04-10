package lameater.db.meat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity // Tells Hibernate to make a table out of this class
@Table(name="meats")
public class Meat{
    @Id
    @GeneratedValue
    @Column(name="MEATID")
    private int meatID;
    @Column(name="NAME")
    private String name;
    @Column(name="CATEGORY")
    private String category;
    @Column(name="MINTEMP")
    private int mintemp;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="DESIREDTEMP")
    private int usertemp;


    //Constructor for Meat object
    public Meat(){

    }
    //Getters
    //Getters for meatId
    public int getMeatID(){
        return meatID;
    }

    public void setMeatID(int meatID){
        this.meatID=meatID;
    }

    //Getters for Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    //Getters for Category
    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category=category;
    }

    //Getters for MinTemp
    public int getMinTemp(){
        return mintemp;
    }

    public void setMinTemp(int mintemp){
        this.mintemp=mintemp;
    }

    //Getters for Description
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    //Getters for UserTemp
    public int getUserTemp(){
        return usertemp;
    }

    public void setUserTemp(int usertemp){
        this.usertemp=usertemp;
    }

}