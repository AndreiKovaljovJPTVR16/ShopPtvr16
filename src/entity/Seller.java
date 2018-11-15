/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Seller {
    
    private Integer cash = 0;

    public Seller() {
    }
    
public Seller(Integer cash){
    
    this.cash=cash;
    
} 



    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }
    
    
}