/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tankmanagement;


/**
 *
 * @author amelc
 */
public class Tank {
   
    private String name;         
    private String country;      
    private double gunCaliber;   
    private int frontArmor;      
    private int speed;           
    private int crew;            
    private String picture;      

    
    public Tank() {}

    
    public Tank(String name, String country, double gunCaliber, int frontArmor, int speed, int crew, String picture) {
        this.name = name;
        this.country = country;
        this.gunCaliber = gunCaliber;
        this.frontArmor = frontArmor;
        this.speed = speed;
        this.crew = crew;
        this.picture = picture;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getGunCaliber() {
        return gunCaliber;
    }

    public void setGunCaliber(double gunCaliber) {
        this.gunCaliber = gunCaliber;
    }

    public int getFrontArmor() {
        return frontArmor;
    }

    public void setFrontArmor(int frontArmor) {
        this.frontArmor = frontArmor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    
    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", gunCaliber=" + gunCaliber +
                ", frontArmor=" + frontArmor +
                ", speed=" + speed +
                ", crew=" + crew +
                ", picture='" + picture + '\'' +
                '}';
    }
}
