/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Bastien Rouiller
 */
public abstract class IInstrument 
{
    private int soundVolume;
    private String color;
    
    public IInstrument(int soundVolume, String color)
    {
        this.soundVolume = soundVolume;
        this.color = color;
    }
    
    abstract String play();
    public int getSoundVolume(){return soundVolume;}
    public String getColor(){return color;};
}
