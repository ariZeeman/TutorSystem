import java.awt.CardLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 341167849
 */
public class GuiFace extends javax.swing.JFrame {

    /**
     * Creates new form GuiFace
     */
    private final String[] subjectArray = {"Grade 9 English", "Grade 10 English", "Grade 11 English", "Grade 12 English",
        "Grade 9 French(Core)", "Grade 10 French(Core)", "Grade 11 French(Core)", "Grade 12 French(Core)", "Grade 9 French(Immersion)",
        "Grade 10 French(Immersion)", "Grade 11 French(Immersion)", "Grade 12 French(Immersion)", "Grade 9 Math",
        "Grade 10 Math", "Grade 11 Math", "Grade 12 Advanced Functions",
        "Grade 12 Calculus & Vectors", "Grade 9 Science", "Grade 10 Science",
        "Grade 11 Biology", "Grade 11 Physics", "Grade 11 Chemistry", "Grade 12 Biology",
        "Grade 12 Physics", "Grade 12 Chemistry"};
    private final String[] periodArray = {"period 1", "period 2", "period 3", "period 4", "period 5", "after school"};

    public GuiFace() {
        initComponents();
        tutorSubjectDropList.removeAllItems();
        tutorPeriodDropList.removeAllItems();
        peerSubjectDropList.removeAllItems();
        peerPeriodDropList.removeAllItems();
        teacherSubjectDropList.removeAllItems();
        for (int i = 0; i < subjectArray.length; i++) {
            tutorSubjectDropList.addItem(subjectArray[i]);
        }
        tutorPeriodDropList.addItem("Period 1");
        tutorPeriodDropList.addItem("Period 2");
        tutorPeriodDropList.addItem("Period 3");
        tutorPeriodDropList.addItem("Period 4");
        tutorPeriodDropList.addItem("Period 5");
        tutorPeriodDropList.addItem("After School");
        peerSubjectDropList.addItem("Grade 9 English");
        peerSubjectDropList.addItem("Grade 10 English");
        peerSubjectDropList.addItem("Grade 11 English");
        peerSubjectDropList.addItem("Grade 12 English");
        peerSubjectDropList.addItem("Grade 9 French(Core)");
        peerSubjectDropList.addItem("Grade 10 French(Core)");
        peerSubjectDropList.addItem("Grade 11 French(Core)");
        peerSubjectDropList.addItem("Grade 12 French(Core)");
        peerSubjectDropList.addItem("Grade 9 French(Immersion)");
        peerSubjectDropList.addItem("Grade 10 French(Immersion)");
        peerSubjectDropList.addItem("Grade 11 French(Immersion)");
        peerSubjectDropList.addItem("Grade 12 French(Immersion)");
        peerSubjectDropList.addItem("Grade 9 Math");
        peerSubjectDropList.addItem("Grade 10 Math");
        peerSubjectDropList.addItem("Grade 11 Math");
        peerSubjectDropList.addItem("Grade 12 Advanced Functions");
        peerSubjectDropList.addItem("Grade 12 Calculus & Vectors");
        peerSubjectDropList.addItem("Grade 9 Science");
        peerSubjectDropList.addItem("Grade 10 Science");
        peerSubjectDropList.addItem("Grade 11 Biology");
        peerSubjectDropList.addItem("Grade 11 Physics");
        peerSubjectDropList.addItem("Grade 11 Chemistry");
        peerSubjectDropList.addItem("Grade 12 Biology");
        peerSubjectDropList.addItem("Grade 12 Physics");
        peerSubjectDropList.addItem("Grade 12 Chemistry");
        peerPeriodDropList.addItem("Period 1");
        peerPeriodDropList.addItem("Period 2");
        peerPeriodDropList.addItem("Period 3");
        peerPeriodDropList.addItem("Period 4");
        peerPeriodDropList.addItem("Period 5");
        peerPeriodDropList.addItem("After School");
        teacherSubjectDropList.addItem("Grade 9 English");
        teacherSubjectDropList.addItem("Grade 10 English");
        teacherSubjectDropList.addItem("Grade 11 English");
        teacherSubjectDropList.addItem("Grade 12 English");
        teacherSubjectDropList.addItem("Grade 9 French(Core)");
        teacherSubjectDropList.addItem("Grade 10 French(Core)");
        teacherSubjectDropList.addItem("Grade 11 French(Core)");
        teacherSubjectDropList.addItem("Grade 12 French(Core)");
        teacherSubjectDropList.addItem("Grade 9 French(Immersion)");
        teacherSubjectDropList.addItem("Grade 10 French(Immersion)");
        teacherSubjectDropList.addItem("Grade 11 French(Immersion)");
        teacherSubjectDropList.addItem("Grade 12 French(Immersion)");
        teacherSubjectDropList.addItem("Grade 9 Math");
        teacherSubjectDropList.addItem("Grade 10 Math");
        teacherSubjectDropList.addItem("Grade 11 Math");
        teacherSubjectDropList.addItem("Grade 12 Advanced Functions");
        teacherSubjectDropList.addItem("Grade 12 Calculus & Vectors");
        teacherSubjectDropList.addItem("Grade 9 Science");
        teacherSubjectDropList.addItem("Grade 10 Science");
        teacherSubjectDropList.addItem("Grade 11 Biology");
        teacherSubjectDropList.addItem("Grade 11 Physics");
        teacherSubjectDropList.addItem("Grade 11 Chemistry");
        teacherSubjectDropList.addItem("Grade 12 Biology");
        teacherSubjectDropList.addItem("Grade 12 Physics");
        teacherSubjectDropList.addItem("Grade 12 Chemistry");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginText1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameLine = new javax.swing.JTextField();
        passwordLine = new javax.swing.JTextField();
        userameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        teacherRegistryButton = new javax.swing.JButton();
        tutorRegistryButton = new javax.swing.JButton();
        peerRegistryButton = new javax.swing.JButton();
        tutorRegistryPanel = new javax.swing.JPanel();
        tutorTitle = new javax.swing.JLabel();
        tutorBackButton = new javax.swing.JButton();
        tutorSignupButton = new javax.swing.JButton();
        tutorFirstNameField = new javax.swing.JTextField();
        tutorLastNameField = new javax.swing.JTextField();
        tutorFirstNameLabel = new javax.swing.JLabel();
        tutorLastNameLabel = new javax.swing.JLabel();
        tutorEmailLabel = new javax.swing.JLabel();
        tutorEmailField = new javax.swing.JTextField();
        tutorPhoneNumberLabel = new javax.swing.JLabel();
        tutorPhoneNumberField = new javax.swing.JTextField();
        tutorPasswordLabel = new javax.swing.JLabel();
        tutorPasswordField = new javax.swing.JTextField();
        tutorPassConfirmLabel = new javax.swing.JLabel();
        tutorPassConfirmField = new javax.swing.JTextField();
        tutorSubjectDropList = new javax.swing.JComboBox();
        tutorPeriodDropList = new javax.swing.JComboBox();
        tutorPeriodsLabel = new javax.swing.JLabel();
        tutorSubjectLabel = new javax.swing.JLabel();
        peerRegistryPanel = new javax.swing.JPanel();
        peerTitle = new javax.swing.JLabel();
        peerBackButton = new javax.swing.JButton();
        peerLastNameField = new javax.swing.JTextField();
        peerPassConfirmField = new javax.swing.JTextField();
        peerFirstNameLabel = new javax.swing.JLabel();
        peerSubjectDropList = new javax.swing.JComboBox();
        peerLastNameLabel = new javax.swing.JLabel();
        peerPeriodDropList = new javax.swing.JComboBox();
        peerEmailLabel = new javax.swing.JLabel();
        peerPeriodsLabel = new javax.swing.JLabel();
        peerEmailField = new javax.swing.JTextField();
        peerPhoneNumberLabel = new javax.swing.JLabel();
        peerSubjectLabel = new javax.swing.JLabel();
        peerPhoneNumberField = new javax.swing.JTextField();
        peerPasswordLabel = new javax.swing.JLabel();
        peerSignupButton = new javax.swing.JButton();
        peerPasswordField = new javax.swing.JTextField();
        peerFirstNameField = new javax.swing.JTextField();
        peerPassConfirmLabel = new javax.swing.JLabel();
        teacherRegistryPanel = new javax.swing.JPanel();
        teacherTitle = new javax.swing.JLabel();
        teacherBackButton = new javax.swing.JButton();
        teacherPhoneNumberLabel = new javax.swing.JLabel();
        teacherPasswordLabel = new javax.swing.JLabel();
        teacherPassConfirmLabel = new javax.swing.JLabel();
        teacherFirstNameLabel = new javax.swing.JLabel();
        teacherLastNameLabel = new javax.swing.JLabel();
        teacherEmailLabel = new javax.swing.JLabel();
        teacherEmailField = new javax.swing.JTextField();
        teacherLastNameField = new javax.swing.JTextField();
        teacherPhoneNumberField = new javax.swing.JTextField();
        teacherPassConfirmField = new javax.swing.JTextField();
        teacherPasswordField = new javax.swing.JTextField();
        teacherFirstNameField = new javax.swing.JTextField();
        teacherSignupButton = new javax.swing.JButton();
        teacherSubjectLabel = new javax.swing.JLabel();
        teacherSubjectDropList = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePanel.setLayout(new java.awt.CardLayout());

        loginText1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginText1.setText("Welcome to Peer Tutor Coordinator!");

        loginButton.setText("Login");

        userameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        teacherRegistryButton.setText("Teacher Registry ");
        teacherRegistryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherRegistryButtonMouseClicked(evt);
            }
        });

        tutorRegistryButton.setText("Tutor Registry");
        tutorRegistryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutorRegistryButtonMouseClicked(evt);
            }
        });

        peerRegistryButton.setText("Peer Registry");
        peerRegistryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peerRegistryButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(tutorRegistryButton)
                                .addGap(218, 218, 218)
                                .addComponent(peerRegistryButton))
                            .addComponent(passwordLine, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teacherRegistryButton))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(loginText1))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginButton))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usernameLine, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userameLabel))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordLabel)))
                        .addGap(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginText1)
                .addGap(68, 68, 68)
                .addComponent(userameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherRegistryButton)
                    .addComponent(peerRegistryButton)
                    .addComponent(tutorRegistryButton))
                .addContainerGap())
        );

        basePanel.add(loginPanel, "loginPanel");

        tutorTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tutorTitle.setText("Become a tutor:");

        tutorBackButton.setText("Back");
        tutorBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutorBackButtonMouseClicked(evt);
            }
        });

        tutorSignupButton.setText("Sign Up");

        tutorFirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorFirstNameFieldActionPerformed(evt);
            }
        });

        tutorFirstNameLabel.setText("First Name:");

        tutorLastNameLabel.setText("Last Name:");

        tutorEmailLabel.setText("Email:");

        tutorPhoneNumberLabel.setText("Phone Number:");

        tutorPasswordLabel.setText("Password:");

        tutorPassConfirmLabel.setText("Confirm Password:");

        tutorSubjectDropList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tutorPeriodDropList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tutorPeriodsLabel.setText("Periods Available:");

        tutorSubjectLabel.setText("Subject to tutor:");

        javax.swing.GroupLayout tutorRegistryPanelLayout = new javax.swing.GroupLayout(tutorRegistryPanel);
        tutorRegistryPanel.setLayout(tutorRegistryPanelLayout);
        tutorRegistryPanelLayout.setHorizontalGroup(
            tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorRegistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tutorRegistryPanelLayout.createSequentialGroup()
                        .addGap(0, 725, Short.MAX_VALUE)
                        .addComponent(tutorBackButton)
                        .addGap(10, 10, 10))
                    .addGroup(tutorRegistryPanelLayout.createSequentialGroup()
                        .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tutorPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tutorPhoneNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(tutorEmailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tutorLastNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tutorFirstNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tutorPassConfirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(tutorPeriodsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tutorSubjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tutorSubjectDropList, 0, 240, Short.MAX_VALUE)
                            .addComponent(tutorFirstNameField)
                            .addComponent(tutorLastNameField)
                            .addComponent(tutorEmailField)
                            .addComponent(tutorPhoneNumberField)
                            .addComponent(tutorPeriodDropList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tutorPassConfirmField)
                            .addComponent(tutorPasswordField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tutorRegistryPanelLayout.createSequentialGroup()
                        .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tutorTitle)
                            .addComponent(tutorSignupButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tutorRegistryPanelLayout.setVerticalGroup(
            tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorRegistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tutorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutorFirstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutorLastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorEmailLabel)
                    .addComponent(tutorEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorPhoneNumberLabel)
                    .addComponent(tutorPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorPasswordLabel)
                    .addComponent(tutorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorPassConfirmLabel)
                    .addComponent(tutorPassConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorSubjectDropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutorSubjectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tutorRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorPeriodDropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutorPeriodsLabel))
                .addGap(18, 18, 18)
                .addComponent(tutorSignupButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(tutorBackButton)
                .addContainerGap())
        );

        basePanel.add(tutorRegistryPanel, "tutorPanel");

        peerTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        peerTitle.setText("Become a peer:");

        peerBackButton.setText("Back");
        peerBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peerBackButtonMouseClicked(evt);
            }
        });

        peerFirstNameLabel.setText("First Name:");

        peerSubjectDropList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        peerLastNameLabel.setText("Last Name:");

        peerPeriodDropList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        peerEmailLabel.setText("Email:");

        peerPeriodsLabel.setText("Periods Available:");

        peerPhoneNumberLabel.setText("Phone Number:");

        peerSubjectLabel.setText("Select Subject:");

        peerPasswordLabel.setText("Password:");

        peerSignupButton.setText("Sign Up");

        peerFirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peerFirstNameFieldActionPerformed(evt);
            }
        });

        peerPassConfirmLabel.setText("Confirm Password:");

        javax.swing.GroupLayout peerRegistryPanelLayout = new javax.swing.GroupLayout(peerRegistryPanel);
        peerRegistryPanel.setLayout(peerRegistryPanelLayout);
        peerRegistryPanelLayout.setHorizontalGroup(
            peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peerRegistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peerRegistryPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(peerBackButton))
                    .addGroup(peerRegistryPanelLayout.createSequentialGroup()
                        .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peerTitle)
                            .addGroup(peerRegistryPanelLayout.createSequentialGroup()
                                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(peerPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(peerPhoneNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(peerEmailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(peerLastNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(peerFirstNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(peerPassConfirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(peerPeriodsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(peerSubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(peerSubjectDropList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(peerFirstNameField)
                                    .addComponent(peerLastNameField)
                                    .addComponent(peerEmailField)
                                    .addComponent(peerPhoneNumberField)
                                    .addComponent(peerPeriodDropList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(peerPassConfirmField)
                                    .addComponent(peerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(peerSignupButton))
                        .addGap(0, 402, Short.MAX_VALUE)))
                .addContainerGap())
        );
        peerRegistryPanelLayout.setVerticalGroup(
            peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peerRegistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peerTitle)
                .addGap(18, 18, 18)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peerFirstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peerLastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerEmailLabel)
                    .addComponent(peerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerPhoneNumberLabel)
                    .addComponent(peerPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerPasswordLabel)
                    .addComponent(peerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerPassConfirmLabel)
                    .addComponent(peerPassConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerSubjectDropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peerSubjectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peerRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peerPeriodDropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peerPeriodsLabel))
                .addGap(18, 18, 18)
                .addComponent(peerSignupButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(peerBackButton)
                .addContainerGap())
        );

        basePanel.add(peerRegistryPanel, "peerPanel");

        teacherTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        teacherTitle.setText("Become an Admin:");

        teacherBackButton.setText("Back");
        teacherBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherBackButtonMouseClicked(evt);
            }
        });

        teacherPhoneNumberLabel.setText("Phone Number:");

        teacherPasswordLabel.setText("Password:");

        teacherPassConfirmLabel.setText("Confirm Password:");

        teacherFirstNameLabel.setText("First Name:");

        teacherLastNameLabel.setText("Last Name:");

        teacherEmailLabel.setText("Email:");

        teacherFirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherFirstNameFieldActionPerformed(evt);
            }
        });

        teacherSignupButton.setText("Sign Up");

        teacherSubjectLabel.setText("Subject Taught:");

        teacherSubjectDropList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout teacherRegistryPanelLayout = new javax.swing.GroupLayout(teacherRegistryPanel);
        teacherRegistryPanel.setLayout(teacherRegistryPanelLayout);
        teacherRegistryPanelLayout.setHorizontalGroup(
            teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherRegistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherRegistryPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(teacherBackButton))
                    .addGroup(teacherRegistryPanelLayout.createSequentialGroup()
                        .addComponent(teacherSignupButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(teacherRegistryPanelLayout.createSequentialGroup()
                        .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherTitle)
                            .addGroup(teacherRegistryPanelLayout.createSequentialGroup()
                                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teacherSubjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherEmailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherPhoneNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherPassConfirmLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(teacherLastNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherFirstNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(teacherSubjectDropList, 0, 240, Short.MAX_VALUE)
                                    .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(teacherFirstNameField)
                                        .addComponent(teacherLastNameField)
                                        .addComponent(teacherEmailField)
                                        .addComponent(teacherPhoneNumberField)
                                        .addComponent(teacherPassConfirmField)
                                        .addComponent(teacherPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))))
                        .addContainerGap(492, Short.MAX_VALUE))))
        );
        teacherRegistryPanelLayout.setVerticalGroup(
            teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherRegistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherTitle)
                .addGap(28, 28, 28)
                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherRegistryPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherLastNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherEmailLabel)))
                    .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teacherFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(teacherFirstNameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherPhoneNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherPassConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherPassConfirmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(teacherRegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherSubjectDropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSubjectLabel))
                .addGap(88, 88, 88)
                .addComponent(teacherSignupButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(teacherBackButton)
                .addContainerGap())
        );

        basePanel.add(teacherRegistryPanel, "teacherPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tutorBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorBackButtonMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) basePanel.getLayout();
        card.show(basePanel, "loginPanel");//shows login screen panel
    }//GEN-LAST:event_tutorBackButtonMouseClicked

    private void peerBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peerBackButtonMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) basePanel.getLayout();
        card.show(basePanel, "loginPanel");//shows login screen panel
    }//GEN-LAST:event_peerBackButtonMouseClicked

    private void teacherBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherBackButtonMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) basePanel.getLayout();
        card.show(basePanel, "loginPanel");//shows login screen panel
    }//GEN-LAST:event_teacherBackButtonMouseClicked

    private void teacherRegistryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherRegistryButtonMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) basePanel.getLayout();
        card.show(basePanel, "teacherPanel");//shows login screen panel
    }//GEN-LAST:event_teacherRegistryButtonMouseClicked

    private void tutorRegistryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorRegistryButtonMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) basePanel.getLayout();
        card.show(basePanel, "tutorPanel");
    }//GEN-LAST:event_tutorRegistryButtonMouseClicked

    private void peerRegistryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peerRegistryButtonMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) basePanel.getLayout();
        card.show(basePanel, "peerPanel");
    }//GEN-LAST:event_peerRegistryButtonMouseClicked

    private void tutorFirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorFirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorFirstNameFieldActionPerformed

    private void peerFirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peerFirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peerFirstNameFieldActionPerformed

    private void teacherFirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherFirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherFirstNameFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiFace.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFace.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFace.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFace.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginText1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordLine;
    private javax.swing.JButton peerBackButton;
    private javax.swing.JTextField peerEmailField;
    private javax.swing.JLabel peerEmailLabel;
    private javax.swing.JTextField peerFirstNameField;
    private javax.swing.JLabel peerFirstNameLabel;
    private javax.swing.JTextField peerLastNameField;
    private javax.swing.JLabel peerLastNameLabel;
    private javax.swing.JTextField peerPassConfirmField;
    private javax.swing.JLabel peerPassConfirmLabel;
    private javax.swing.JTextField peerPasswordField;
    private javax.swing.JLabel peerPasswordLabel;
    private javax.swing.JComboBox peerPeriodDropList;
    private javax.swing.JLabel peerPeriodsLabel;
    private javax.swing.JTextField peerPhoneNumberField;
    private javax.swing.JLabel peerPhoneNumberLabel;
    private javax.swing.JButton peerRegistryButton;
    private javax.swing.JPanel peerRegistryPanel;
    private javax.swing.JButton peerSignupButton;
    private javax.swing.JComboBox peerSubjectDropList;
    private javax.swing.JLabel peerSubjectLabel;
    private javax.swing.JLabel peerTitle;
    private javax.swing.JButton teacherBackButton;
    private javax.swing.JTextField teacherEmailField;
    private javax.swing.JLabel teacherEmailLabel;
    private javax.swing.JTextField teacherFirstNameField;
    private javax.swing.JLabel teacherFirstNameLabel;
    private javax.swing.JTextField teacherLastNameField;
    private javax.swing.JLabel teacherLastNameLabel;
    private javax.swing.JTextField teacherPassConfirmField;
    private javax.swing.JLabel teacherPassConfirmLabel;
    private javax.swing.JTextField teacherPasswordField;
    private javax.swing.JLabel teacherPasswordLabel;
    private javax.swing.JTextField teacherPhoneNumberField;
    private javax.swing.JLabel teacherPhoneNumberLabel;
    private javax.swing.JButton teacherRegistryButton;
    private javax.swing.JPanel teacherRegistryPanel;
    private javax.swing.JButton teacherSignupButton;
    private javax.swing.JComboBox teacherSubjectDropList;
    private javax.swing.JLabel teacherSubjectLabel;
    private javax.swing.JLabel teacherTitle;
    private javax.swing.JButton tutorBackButton;
    private javax.swing.JTextField tutorEmailField;
    private javax.swing.JLabel tutorEmailLabel;
    private javax.swing.JTextField tutorFirstNameField;
    private javax.swing.JLabel tutorFirstNameLabel;
    private javax.swing.JTextField tutorLastNameField;
    private javax.swing.JLabel tutorLastNameLabel;
    private javax.swing.JTextField tutorPassConfirmField;
    private javax.swing.JLabel tutorPassConfirmLabel;
    private javax.swing.JTextField tutorPasswordField;
    private javax.swing.JLabel tutorPasswordLabel;
    private javax.swing.JComboBox tutorPeriodDropList;
    private javax.swing.JLabel tutorPeriodsLabel;
    private javax.swing.JTextField tutorPhoneNumberField;
    private javax.swing.JLabel tutorPhoneNumberLabel;
    private javax.swing.JButton tutorRegistryButton;
    private javax.swing.JPanel tutorRegistryPanel;
    private javax.swing.JButton tutorSignupButton;
    private javax.swing.JComboBox tutorSubjectDropList;
    private javax.swing.JLabel tutorSubjectLabel;
    private javax.swing.JLabel tutorTitle;
    private javax.swing.JLabel userameLabel;
    private javax.swing.JTextField usernameLine;
    // End of variables declaration//GEN-END:variables
}
