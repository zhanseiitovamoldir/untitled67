//package MyApplication.Packet;
//
//import MyApplication.Packet.Function.*;
//import MyApplication.addComponents.Food;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.util.ArrayList;
//
//public class Admin extends JPanel {
//    private BossFrame frame = null;
//
//    private Tabletest table;
//    private JScrollPane pane;
//    private Object columns[] = {"ID", "NAME", "ingredients", "cook", "type"};
//
//    private ArrayList<Food> fooks = null;
//
//    private myJLabels idl, nl, ingredientl, cookl, typel;
//    private TextFields idf, nf;
//    private JArea ingredientA,cookA;
//    private myComboBox type;
//    private String foods[] = {"","ТОРТ", "ВЫПЕЧКА", "САЛАТ"};
//
//    private Buttons addb;
//
//    public Admin(BossFrame frame){
//        this.frame = frame;
//
//        setSize(900, 700);
//        setLayout(null);
//        setBackground(Color.white);
//
//        table = new Tabletest(columns);
//        pane = new JScrollPane(table);
//        pane.setBounds(0, 0, 500, 200);
//        add(pane);
//        updateTable();
//
//        table.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int rowind = table.getSelectedRow();
//                idf.setText(table.model.getValueAt(rowind, 0).toString());
//                nf.setText(table.model.getValueAt(rowind, 1).toString());
//                ingredientA.setText(table.model.getValueAt(rowind, 2).toString());
//                cookA.setText(table.model.getValueAt(rowind, 3).toString());
//                type.setSelectedItem(table.model.getValueAt(rowind, 4).toString());
//
//            }
//
//            public void mousePressed(MouseEvent e) {
//            }
//            public void mouseReleased(MouseEvent e) {
//            }
//            public void mouseEntered(MouseEvent e) {
//
//            }
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });
//
//
//        idl = new myJLabels("id: ", 35, 200);
//        add(idl);
//        nl = new myJLabels("Имя блюда : ", 35, 240);
//        add(nl);
//        ingredientl = new myJLabels("Ингредиенты: ", 35, 280);
//        add(ingredientl);
//        cookl= new myJLabels("Приготовление: ", 35, 320);
//        add(cookl);
//        typel = new myJLabels("Виды: ", 35, 360);
//        add(typel);
//
//
//        idf = new TextFields(70, 200);
//        add(idf);
//        nf = new TextFields(70, 240);
//        add(nf);
//        ingredientA = new JArea(70, 280);
//        add(ingredientA);
//        cookA = new JArea(70, 320);
//        add(cookA);
//        type = new myComboBox ("foods",70, 360);
//        add(type);
//
//
//
//        addb = new Buttons ("ADD", 300, 400);
//        add(addb);
//        addb.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Food food = new Food(null, nf.getText(), ingredientA.getText(), cookA.getText(),type.getSelectedItem().toString());
//                frame.clientSocket.addFood(food);
//
//                JOptionPane.showMessageDialog(frame, "YOUR BOOK IS ADDED");
//                updateTable();
//            }
//        });
//
////        delb = new Buttons ("DELETE", 300, 450);
////        add(delb);
////        delb.addActionListener(new ActionListener() {
////            public void actionPerformed(ActionEvent e) {
////               Food food = new Food();
////                food.setId(Long.valueOf(idf.getText()));
////
////                boolean removed = frame.clientSocket.removeFood(ood);
////                if(removed){
////                    JOptionPane.showMessageDialog(frame, "BOOK is removed");
////                    updateTable();
////                }
////                else
////                    JOptionPane.showMessageDialog(frame, "SOME PROBLEMS");
////            }
////        });
//   }
//
//    public void updateTable(){
//        //OCHIWAEM table, a to on sam ne chistit
//        while (table.model.getRowCount() > 0){
//            table.model.removeRow(0);
//        }
//
////        foods = frame.clientSocket.getAllFoods();
////        for(Food f : foods){
////            table.model.addRow(new Object[]{f.getId(), f.getName(), f.getIngredients(), f.getCooking(), f.getType()});
////        }
//    }
//}
//
