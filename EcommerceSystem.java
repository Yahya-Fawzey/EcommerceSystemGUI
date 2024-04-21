import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class EcommerceSystem extends JFrame{
    private JPanel welcoming;
    private JLabel cmmrcwelc;
    private JTextField idfield;
    private JLabel askid;
    private JLabel askname;
    private JTextField namefield;
    private JTextField addressfield;
    private JLabel askaddress;
    private JTextField nfield;
    private JLabel askn;
    private JButton btnok;
    private JButton btnclear;

    public EcommerceSystem(){
        setContentPane(welcoming);
        setTitle("Welcome");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        int nProducts = 0;

        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idfield.getText());
                String name = namefield.getText();
                String address = addressfield.getText();
                int nProducts = Integer.parseInt(nfield.getText());
                secondpanel p1 = new secondpanel(nProducts,id);
                p1.setVisible(true);
                Product[] products = new Product[nProducts];


            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idfield.setText("");
                namefield.setText("");
                addressfield.setText("");
                nfield.setText("");
            }
        });

    }



    public static void main(String[] args) {
        EcommerceSystem commercesystem = new EcommerceSystem();
        Scanner scan = new Scanner(System.in);
        ElectronicProduct e1 = new ElectronicProduct(1,"smartphone", 599.9F,"Samsung",1);
        ClothingProduct c1 = new ClothingProduct(2,"T-shirt",19.99F,"Medium","Cotton");
        BookProduct b1 = new BookProduct(3,"OOP",39.99F,"O’Reilly","X Publications");



    }
}