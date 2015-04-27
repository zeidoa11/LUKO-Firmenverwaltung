/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Enis Lushtaku
 */
public class FirmaTableRenderer implements TableCellRenderer
{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setForeground(Color.BLACK);
        if(value instanceof String)
        {
            label.setText(value.toString());
        }
        if(value instanceof ImageIcon)
        {
            label.setIcon(new ImageIcon(value.toString()));
            label.setHorizontalAlignment(JLabel.CENTER);
        }
        return label;
    }
    
}
