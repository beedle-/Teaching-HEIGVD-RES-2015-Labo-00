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
public class Trumpet extends IInstrument
{
    public Trumpet()
    {
        super(50, "golden");
    }
    
    public String play()
    {
        return "pouet";
    }
}
