/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Firma;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Enis Lushtaku
 */
public class FirmaTableModel extends AbstractTableModel
{
    
    private LinkedList<Firma> firmenliste;
    public final static String[] spaltennamen =
    {
        "Firma", "Firmenlogo"
    };
    
    public FirmaTableModel()
    {
        firmenliste = new LinkedList<>();
    }
    
    @Override
    public int getRowCount()
    {
        return firmenliste.size();
    }
    
    @Override
    public int getColumnCount()
    {
        return spaltennamen.length;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return spaltennamen[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Firma f = firmenliste.get(rowIndex);
        switch (columnIndex)
        {
            case 0: return f.getName();
            case 1: return f.getLogo();
            default: return null;
        }
    }
    
    public void addFirma(Firma f)
    {
        firmenliste.add(f);
        this.fireTableDataChanged();
    }
    
    public void deleteFirma(int row)
    {
        firmenliste.remove(row);
        this.fireTableDataChanged();
    }
}
