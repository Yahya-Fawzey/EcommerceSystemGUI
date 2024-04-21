import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class secondpanel extends EcommerceSystem {
    private JPanel panel1;
    private JButton tShirtButton;
    private JButton smartPhoneButton;
    private JButton OOPButton;
    int counter = 0;
    int[] array_of_choices ;
    public void output(){
        float tshirtCost= 19.99F*array_of_choices[0];
        float oopCost = 39.99F*array_of_choices[1];
        float smartphoneCost= 55.99F*array_of_choices[2];
        float totalCost = tshirtCost+oopCost+smartphoneCost;
        String newLine = System.getProperty("line.separator");
        String result ="Order's summary:"+newLine+
                "T-Shirt("+array_of_choices[0]+ "):"+tshirtCost+"$"+newLine+
        "OOP("+array_of_choices[1]+"):"+oopCost+"$"+newLine+
        "Smartphone("+array_of_choices[2]+"):"+smartphoneCost+"$"+newLine+
                "Total:"+totalCost+"$";
        JOptionPane.showMessageDialog(null, result);
    }
    public secondpanel(int nProducts,int id){
        setContentPane(panel1);
        setTitle("Welcome");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        String choice ;
        array_of_choices = new int[3];

        smartPhoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter==nProducts)return;
                String choice = "Smart Phone";
                ++counter;
                ++array_of_choices[0];
                if(counter==nProducts){
                    output();
                    setVisible(false);
                }
            }
        });
        OOPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter==nProducts)return;
                String choice = "OOP";
                ++counter;
                ++array_of_choices[1];
                if(counter==nProducts){
                    output();
                    setVisible(false);
                }
            }
        });
        tShirtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter==nProducts)return;
                String choice = "T-Shirt";
                ++counter;
                ++array_of_choices[2];
                if(counter==nProducts){
                    output();
                    setVisible(false);
                }
            }

        });







    }
}
