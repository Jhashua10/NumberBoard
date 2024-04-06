/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josh.numberboard;

import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Client {
    private String name;
    private int ID;
    private int winNumber;
    private int phoneNumber;

    public Client(String name, int ID, int winNumber, int phoneNumber) {
        this.name = name;
        this.ID = ID;
        this.winNumber = winNumber;
        this.phoneNumber = phoneNumber;
    }

    public Client() {}

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getWinNumber() {
        return winNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setWinNumber(int winNumber) {
        this.winNumber = winNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    
    
}
