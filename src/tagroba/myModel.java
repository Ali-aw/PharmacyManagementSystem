
package tagroba;

import javax.swing.table.DefaultTableModel;


public class myModel extends DefaultTableModel {

    public myModel() {
        super();
    }

    @Override
    public Class<?> getColumnClass(int c) {
        return switch (c) {
            case 4 -> Boolean.class;
            case 0, 3 -> String.class;
            default -> String.class;
        };

    }
}
