/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grant
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Login = new javax.swing.JLayeredPane();
        login_main = new javax.swing.JPanel();
        loginMainHeader = new javax.swing.JLabel();
        loginMainsubHeader = new javax.swing.JLabel();
        doctorLoginButton = new javax.swing.JButton();
        patientLoginButton = new javax.swing.JButton();
        login_doctor = new javax.swing.JPanel();
        doctorLoginHeader = new javax.swing.JLabel();
        doctorLoginSubmit = new javax.swing.JButton();
        loginCancel = new javax.swing.JButton();
        doctorLoginNameLabel = new javax.swing.JLabel();
        DoctorLoginNameField = new javax.swing.JTextField();
        doctorLoginPassLabel = new javax.swing.JLabel();
        doctorLoginPassField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login.setBackground(new java.awt.Color(255, 204, 153));

        login_main.setBackground(new java.awt.Color(153, 255, 204));

        loginMainHeader.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loginMainHeader.setText("Efferent Patient Care");

        loginMainsubHeader.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loginMainsubHeader.setText("Login");

        doctorLoginButton.setText("Doctor");
        doctorLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginButtonActionPerformed(evt);
            }
        });

        patientLoginButton.setText("Patient");

        javax.swing.GroupLayout login_mainLayout = new javax.swing.GroupLayout(login_main);
        login_main.setLayout(login_mainLayout);
        login_mainLayout.setHorizontalGroup(
            login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_mainLayout.createSequentialGroup()
                .addGroup(login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_mainLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(loginMainsubHeader))
                    .addGroup(login_mainLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(loginMainHeader)))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(login_mainLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(doctorLoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(patientLoginButton)
                .addGap(74, 74, 74))
        );
        login_mainLayout.setVerticalGroup(
            login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginMainHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginMainsubHeader)
                .addGap(84, 84, 84)
                .addGroup(login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginButton)
                    .addComponent(patientLoginButton))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        login_doctor.setBackground(new java.awt.Color(204, 255, 204));

        doctorLoginHeader.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        doctorLoginHeader.setText("Doctor Login");

        doctorLoginSubmit.setText("Submit");

        loginCancel.setText("Cancel");
        loginCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCancelActionPerformed(evt);
            }
        });

        doctorLoginNameLabel.setText("Name");

        doctorLoginPassLabel.setText("Password");

        doctorLoginPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_doctorLayout = new javax.swing.GroupLayout(login_doctor);
        login_doctor.setLayout(login_doctorLayout);
        login_doctorLayout.setHorizontalGroup(
            login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_doctorLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(loginCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doctorLoginSubmit)
                .addGap(84, 84, 84))
            .addGroup(login_doctorLayout.createSequentialGroup()
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_doctorLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(doctorLoginHeader))
                    .addGroup(login_doctorLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorLoginPassLabel)
                            .addComponent(doctorLoginNameLabel))
                        .addGap(52, 52, 52)
                        .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoctorLoginNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorLoginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        login_doctorLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DoctorLoginNameField, doctorLoginPassField});

        login_doctorLayout.setVerticalGroup(
            login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_doctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorLoginHeader)
                .addGap(46, 46, 46)
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginNameLabel)
                    .addComponent(DoctorLoginNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginPassLabel)
                    .addComponent(doctorLoginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginSubmit)
                    .addComponent(loginCancel))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(login_doctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(login_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Login.setLayer(login_main, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login.setLayer(login_doctor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login)
        );

        pack();
    }// </editor-fold>                        

    private void doctorLoginPassFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void doctorLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        login_main.setVisible(false);
        login_doctor.setVisible(true);
    }                                                 

    private void loginCancelActionPerformed(java.awt.event.ActionEvent evt) {                                            
        login_doctor.setVisible(false);
        login_main.setVisible(true);
    }                                           

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField DoctorLoginNameField;
    private javax.swing.JLayeredPane Login;
    private javax.swing.JButton doctorLoginButton;
    private javax.swing.JLabel doctorLoginHeader;
    private javax.swing.JLabel doctorLoginNameLabel;
    private javax.swing.JPasswordField doctorLoginPassField;
    private javax.swing.JLabel doctorLoginPassLabel;
    private javax.swing.JButton doctorLoginSubmit;
    private javax.swing.JButton loginCancel;
    private javax.swing.JLabel loginMainHeader;
    private javax.swing.JLabel loginMainsubHeader;
    private javax.swing.JPanel login_doctor;
    private javax.swing.JPanel login_main;
    private javax.swing.JButton patientLoginButton;
    // End of variables declaration                   
}
