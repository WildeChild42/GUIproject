/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildegui;

import java.util.List;
/**
 *
 * @author DylanWilde
 */
public class repChooser 
{
    public SalesRep chooseRepre(List<SalesRep> rep)
    {
        SalesRep repre = null;
        for (SalesRep sr : rep)
        {
            if (repre == null)
            {
                repre = sr;
            }
          
            
        }
            return repre;
        }
    }



    



