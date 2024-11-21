package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JLabel addDetails, religion, category, income, educationQualification, occupation, pan, aadhar, senior, existAcc;
    JRadioButton yesSenior, noSenior, yes, no;
    JTextField panTextField, aadharTextField;
    JComboBox diffReligion, diffCategory, diffIncome, diffEducation, diffOccupation;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        addDetails = new JLabel("Page2: Additional Details");
        addDetails.setFont(new Font("Raleway", Font.BOLD, 35));
        addDetails.setBounds(450, 20, 600, 40);
        add(addDetails);

        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 25));
        religion.setBounds(180, 70, 400, 30);
        add(religion);
        String valReligion[] = {"Hindu", "Muslim", "Christian", "Jain", "Other"};
        diffReligion = new JComboBox(valReligion);
        diffReligion.setBounds(500, 70, 400, 30);
        diffReligion.setBackground(Color.WHITE);
        add(diffReligion);

        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 25));
        category.setBounds(180, 120, 400, 40);
        add(category);
        String valCategory[] = {"OBS", "St", "SC", "Genral", "Other"};
        diffCategory = new JComboBox(valCategory);
        diffCategory.setBounds(500, 120, 400, 30);
        diffCategory.setBackground(Color.WHITE);
        add(diffCategory);

        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 25));
        income.setBounds(180, 170, 400, 40);
        add(income);
        String valIncome[] = {"Null", "<150000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        diffIncome = new JComboBox(valIncome);
        diffIncome.setBounds(500, 170, 400, 30);
        diffIncome.setBackground(Color.WHITE);
        add(diffIncome);

        educationQualification = new JLabel("Education Qualification:");
        educationQualification.setFont(new Font("Raleway", Font.BOLD, 25));
        educationQualification.setBounds(180, 220, 400, 40);
        add(educationQualification);
        String valEducation[] = {"Non Graduate", "Graduate", "Post Graduate", "Doctrate", "Other"};
        diffEducation = new JComboBox(valEducation);
        diffEducation.setBounds(500, 220, 400, 30);
        diffEducation.setBackground(Color.WHITE);
        add(diffEducation);

        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 25));
        occupation.setBounds(180, 270, 400, 40);
        add(occupation);
        String valOcuupation[] = {"Student", "Bussiness", "Salaried", "Self-Employed", "Retiered", "Others"};
        diffOccupation = new JComboBox(valOcuupation);
        diffOccupation.setBounds(500, 270, 400, 30);
        diffOccupation.setBackground(Color.WHITE);
        add(diffOccupation);

        pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 25));
        pan.setBounds(180, 320, 400, 40);
        add(pan);
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 25));
        panTextField.setBounds(500, 320, 400, 30);
        add(panTextField);

        aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 25));
        aadhar.setBounds(180, 370, 400, 40);
        add(aadhar);
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 25));
        aadharTextField.setBounds(500, 370, 400, 30);
        add(aadharTextField);

        senior = new JLabel("Senior Citizen Number:");
        senior.setFont(new Font("Raleway", Font.BOLD, 25));
        senior.setBounds(180, 420, 400, 40);
        add(senior);
        yesSenior = new JRadioButton("Yes");
        yesSenior.setBounds(500, 420, 100, 40);
        yesSenior.setBackground(Color.white);
        add(yesSenior);
        noSenior = new JRadioButton("No");
        noSenior.setBounds(800, 420, 100, 40);
        noSenior.setBackground(Color.white);
        add(noSenior);

        existAcc = new JLabel("Existing Account");
        existAcc.setFont(new Font("Raleway", Font.BOLD, 25));
        existAcc.setBounds(180, 470, 400, 40);
        add(existAcc);
        yes = new JRadioButton("Yes");
        yes.setBounds(500, 470, 100, 40);
        yes.setBackground(Color.white);
        add(yes);
        no = new JRadioButton("No");
        no.setBounds(800, 470, 100, 40);
        no.setBackground(Color.white);
        add(no);

        // Group radio buttons to ensure only one can be selected at a time
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(yesSenior);
        seniorGroup.add(noSenior);
        
        ButtonGroup existAccGroup = new ButtonGroup();
        existAccGroup.add(yes);
        existAccGroup.add(no);

        JButton next = new JButton("Next");
        next.setBounds(900, 520, 100, 40);
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);  // Adding action listener to the button
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(1200, 700);
        setLocation(350, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) diffReligion.getSelectedItem();
        String scategory = (String) diffCategory.getSelectedItem();
        String sincome = (String) diffIncome.getSelectedItem();
        String seducation = (String) diffEducation.getSelectedItem();
        String soccupation = (String) diffOccupation.getSelectedItem();

        String seniorCitizen = null;
        if (yesSenior.isSelected()) {
            seniorCitizen = "Yes";
        } else if (noSenior.isSelected()) {
            seniorCitizen = "No";
        }

        String existingaccount = null;
        if (yes.isSelected()) {
            existingaccount = "Yes";
        } else if (no.isSelected()) {
            existingaccount = "No";
        }

        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try {
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo (formno, religion, Category, Income, EducationQuali, Aadhar, Pan_Card, SeniorCitizen, Existing_Account) VALUES('" 
                            + formno + "', '" 
                            + sreligion + "', '" 
                            + scategory + "', '" 
                            + sincome + "', '" 
                            + seducation + "', '" 
                            + saadhar + "', '" 
                            + span + "', '" 
                            + seniorCitizen + "', '" 
                            + existingaccount + "')";
            c.s.executeUpdate(query);
            
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
            // Move to the next form or next page
            // new SignupThree(formno).setVisible(true); // Uncomment if there's a SignupThree class
            // setVisible(false); // Close current frame
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
