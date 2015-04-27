/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.swing.ImageIcon;

/**
 *
 * @author Enis Lushtaku
 */
public class Firma
{
    private String name;
    private ImageIcon logo;

    public Firma(String name, ImageIcon logo)
    {
        this.name = name;
        this.logo = logo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ImageIcon getLogo()
    {
        return logo;
    }

    public void setLogo(ImageIcon logo)
    {
        this.logo = logo;
    }
    
}
