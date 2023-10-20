/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.frames;
import java.awt.CardLayout;
import src.frames.components.buttonsidebar;
import src.models.*;
/**
 *
 * Home Frame
 */
public class Home extends Frame {

    /**
     * the current user
     */
    private user user;

    /**
     * the button that is currently active
     */
    private buttonsidebar activeButton;

    /**
     * the cardlayout of the mainPanel
     */
    private CardLayout card;
    
    /**
     * Constructor to create a new Home Frame
     * @param user
     */
    public Home(user user) {
        this.user = user;
        initComponents();
        card = (CardLayout)mainPanel.getLayout();
        winButton.init(this, background,false);
        dragPanel.init(this, background,sidepanel.getWidth());
        
        dashboardPanel.init(user);
        btnHome.setActivated(true);
        btnHome.setNormalColor(sidepanel.getBackground());
        btnHome.setBackground(btnHome.getNormalColor().brighter());
        activeButton = btnHome;
        
        if(!user.isAdmin()){
            btnAdmin.setVisible(false);
        }
        
        sidepanel.setRound(50);
        background.setRound(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new src.frames.components.background();
        winButton = new src.frames.components.headButton.WinButton();
        dragPanel = new src.frames.components.dragPanel();
        sidepanel = new src.frames.components.background();
        lblAppIcon = new javax.swing.JLabel();
        btnHome = new src.frames.components.buttonsidebar();
        iconHome = new javax.swing.JLabel();
        btnLogOut = new src.frames.components.buttonsidebar();
        iconLogOut = new javax.swing.JLabel();
        btnAdmin = new src.frames.components.buttonsidebar();
        iconAdmin = new javax.swing.JLabel();
        btnCreateAppointment = new src.frames.components.buttonsidebar();
        iconCreateAppointment = new javax.swing.JLabel();
        btnUserEdit = new src.frames.components.buttonsidebar();
        iconUserEdit = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        dashboardPanel = new src.frames.tabs.Dashboard();
        createAppointmentPanel = new src.frames.tabs.createAppointment();
        profilPanel = new src.frames.tabs.Profil();
        adminPanel = new src.frames.tabs.Admin();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(248, 249, 254));

        javax.swing.GroupLayout dragPanelLayout = new javax.swing.GroupLayout(dragPanel);
        dragPanel.setLayout(dragPanelLayout);
        dragPanelLayout.setHorizontalGroup(
            dragPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dragPanelLayout.setVerticalGroup(
            dragPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        sidepanel.setBackground(new java.awt.Color(15, 95, 83));

        lblAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/appicon-90x90.png"))); // NOI18N

        btnHome.setBackground(new java.awt.Color(15, 95, 83));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });

        iconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons/icons8-zuhause-24.png"))); // NOI18N

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconHome)
                .addGap(22, 22, 22))
        );

        btnLogOut.setBackground(new java.awt.Color(15, 95, 83));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogOutMousePressed(evt);
            }
        });

        iconLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons/icons8-ausgang-24.png"))); // NOI18N

        javax.swing.GroupLayout btnLogOutLayout = new javax.swing.GroupLayout(btnLogOut);
        btnLogOut.setLayout(btnLogOutLayout);
        btnLogOutLayout.setHorizontalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnLogOutLayout.setVerticalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconLogOut)
                .addGap(22, 22, 22))
        );

        btnAdmin.setBackground(new java.awt.Color(15, 95, 83));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdminMousePressed(evt);
            }
        });

        iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons/icons8-administrator-männlich-24.png"))); // NOI18N

        javax.swing.GroupLayout btnAdminLayout = new javax.swing.GroupLayout(btnAdmin);
        btnAdmin.setLayout(btnAdminLayout);
        btnAdminLayout.setHorizontalGroup(
            btnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAdminLayout.setVerticalGroup(
            btnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconAdmin)
                .addGap(22, 22, 22))
        );

        btnCreateAppointment.setBackground(new java.awt.Color(15, 95, 83));
        btnCreateAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCreateAppointmentMousePressed(evt);
            }
        });

        iconCreateAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons/icons8-hinzufügen-24.png"))); // NOI18N

        javax.swing.GroupLayout btnCreateAppointmentLayout = new javax.swing.GroupLayout(btnCreateAppointment);
        btnCreateAppointment.setLayout(btnCreateAppointmentLayout);
        btnCreateAppointmentLayout.setHorizontalGroup(
            btnCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCreateAppointmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconCreateAppointment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCreateAppointmentLayout.setVerticalGroup(
            btnCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCreateAppointmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconCreateAppointment)
                .addGap(22, 22, 22))
        );

        btnUserEdit.setBackground(new java.awt.Color(15, 95, 83));
        btnUserEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUserEditMousePressed(evt);
            }
        });

        iconUserEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons/icons8-useredit-24.png"))); // NOI18N

        javax.swing.GroupLayout btnUserEditLayout = new javax.swing.GroupLayout(btnUserEdit);
        btnUserEdit.setLayout(btnUserEditLayout);
        btnUserEditLayout.setHorizontalGroup(
            btnUserEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUserEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnUserEditLayout.setVerticalGroup(
            btnUserEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUserEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconUserEdit)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAppIcon))
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAppIcon)
                .addGap(18, 18, 18)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        mainPanel.setBackground(new java.awt.Color(248, 249, 254));
        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(dashboardPanel, "dashboard");
        mainPanel.add(createAppointmentPanel, "createAppointment");
        mainPanel.add(profilPanel, "profil");
        mainPanel.add(adminPanel, "admin");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(dragPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dragPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Switch to Dashboard
     * @param evt 
     */
    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        if(activeButton != (buttonsidebar)evt.getSource()){
            activeButton.deactivate();
            activeButton = btnHome;
        }
        dashboardPanel.init(user);
        card.show(mainPanel, "dashboard");
    }//GEN-LAST:event_btnHomeMousePressed

    /**
     * Return to Dashboard
     * This method is called by tabs to update the Appointments
     */
    public void returnHome(){
        activeButton.deactivate();
        activeButton = btnHome;
        activeButton.setActivated(true);
        activeButton.setBackground(activeButton.getNormalColor().brighter());
        dashboardPanel.init(user);
        card.show(mainPanel, "dashboard");
    }
    /**
     * Switch to Create Appointment Tab
     * @param evt 
     */
    private void btnCreateAppointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAppointmentMousePressed
        if(activeButton != (buttonsidebar)evt.getSource()){
            activeButton.deactivate();
            activeButton = btnCreateAppointment;
        }
        createAppointmentPanel.card.show(createAppointmentPanel.mainPanel, "appointmentPanel");
        createAppointmentPanel.init(user,this);
        card.show(mainPanel, "createAppointment");
    }//GEN-LAST:event_btnCreateAppointmentMousePressed
    /**
     * Switch to Profil Tab
     * @param evt 
     */
    private void btnUserEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserEditMousePressed
        if(activeButton != (buttonsidebar)evt.getSource()){
            activeButton.deactivate();
            activeButton = btnUserEdit;
        }
        profilPanel.card.show(profilPanel.mainPanel, "userPanel");
        profilPanel.init(user);
        card.show(mainPanel, "profil");
    }//GEN-LAST:event_btnUserEditMousePressed
    /**
     * Switch to Admin Tab
     * Only works when the user is an admin
     * @param evt 
     */
    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
        if(activeButton != (buttonsidebar)evt.getSource()){
            activeButton.deactivate();
            activeButton = btnAdmin;
        }
        adminPanel.init(user);
        card.show(mainPanel, "admin");
    }//GEN-LAST:event_btnAdminMousePressed
    /**
     * Close Frame and open Login Frame
     * @param evt 
     */
    private void btnLogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMousePressed
        activeButton.deactivate();
        setVisible(false);
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogOutMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private src.frames.tabs.Admin adminPanel;
    private src.frames.components.background background;
    private src.frames.components.buttonsidebar btnAdmin;
    private src.frames.components.buttonsidebar btnCreateAppointment;
    private src.frames.components.buttonsidebar btnHome;
    private src.frames.components.buttonsidebar btnLogOut;
    private src.frames.components.buttonsidebar btnUserEdit;
    private src.frames.tabs.createAppointment createAppointmentPanel;
    private src.frames.tabs.Dashboard dashboardPanel;
    private src.frames.components.dragPanel dragPanel;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconCreateAppointment;
    private javax.swing.JLabel iconHome;
    private javax.swing.JLabel iconLogOut;
    private javax.swing.JLabel iconUserEdit;
    private javax.swing.JLabel lblAppIcon;
    private javax.swing.JPanel mainPanel;
    private src.frames.tabs.Profil profilPanel;
    private src.frames.components.background sidepanel;
    private src.frames.components.headButton.WinButton winButton;
    // End of variables declaration//GEN-END:variables
}