/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProjectDAO;
import controller.TaskDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;
import util.ButtonColumnCellRederer;
import util.StatusColumnCellRenderer;
import util.TaskTableModel;

/**
 *
 * @author Maisa
 */
public class MainScreen extends javax.swing.JFrame {

    DefaultListModel projectsModel;
    TaskTableModel tasksModel;

    ProjectDAO projectDAO;
    TaskDAO taskDAO;

    public MainScreen() {
        initComponents();
        setApplicationIcon();

        initDataAccessObjects();
        initComponentsModel();

        decorateJTableTasks();
        centralizeMainScreen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSubTitle = new javax.swing.JLabel();
        jLabelInfos = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jScrollPaneProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanelTasksTollBar = new javax.swing.JPanel();
        jLabelTasksToolBarTitle = new javax.swing.JLabel();
        jLabelTasksToolBarAdd = new javax.swing.JLabel();
        jPanelProjectsToolBar = new javax.swing.JPanel();
        jLabelProjectsToolBarTitle = new javax.swing.JLabel();
        jLabelProjectsToolBarAdd = new javax.swing.JLabel();
        jPanelEmptyTasks = new javax.swing.JPanel();
        jPanelEmptyTasksLayout = new javax.swing.JPanel();
        jLabelEmptyTasksTitle = new javax.swing.JLabel();
        jLabelEmptyTasksSubTitle = new javax.swing.JLabel();
        jLabelEmptyTasksImage = new javax.swing.JLabel();

        jScrollPaneTasks.setBorder(null);

        jTableTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setFocusable(false);
        jTableTasks.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowHorizontalLines(false);
        jTableTasks.setShowVerticalLines(false);
        jTableTasks.getTableHeader().setReorderingAllowed(false);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todo App");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 800));

        jPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));
        jPanelToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelToolBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        jLabelToolBarTitle.setText("  App Tarefas");
        jLabelToolBarTitle.setToolTipText("");

        jLabelToolBarSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelToolBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarSubTitle.setText("Anote tudo, não esqueça nada");

        jLabelInfos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInfosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                    .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToolBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelInfos)))
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInfos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelToolBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelToolBarSubTitle)
                .addGap(15, 15, 15))
        );

        jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPaneProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects)
                .addContainerGap())
        );

        jPanelTasksTollBar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTasksTollBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTasksToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTasksToolBarTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTasksToolBarTitle.setText("Tarefas");

        jLabelTasksToolBarAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTasksToolBarAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelTasksToolBarAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTasksToolBarAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksTollBarLayout = new javax.swing.GroupLayout(jPanelTasksTollBar);
        jPanelTasksTollBar.setLayout(jPanelTasksTollBarLayout);
        jPanelTasksTollBarLayout.setHorizontalGroup(
            jPanelTasksTollBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksTollBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTasksToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTasksToolBarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTasksTollBarLayout.setVerticalGroup(
            jPanelTasksTollBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTasksToolBarAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTasksToolBarTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanelProjectsToolBar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjectsToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectsToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectsToolBarTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelProjectsToolBarTitle.setText("Projetos");

        jLabelProjectsToolBarAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProjectsToolBarAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelProjectsToolBarAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsToolBarAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsToolBarLayout = new javax.swing.GroupLayout(jPanelProjectsToolBar);
        jPanelProjectsToolBar.setLayout(jPanelProjectsToolBarLayout);
        jPanelProjectsToolBarLayout.setHorizontalGroup(
            jPanelProjectsToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectsToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProjectsToolBarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelProjectsToolBarLayout.setVerticalGroup(
            jPanelProjectsToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProjectsToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(jLabelProjectsToolBarAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelEmptyTasks.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmptyTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEmptyTasks.setLayout(new java.awt.BorderLayout());

        jPanelEmptyTasksLayout.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEmptyTasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEmptyTasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyTasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyTasksTitle.setText("Nenhuma Tarefa por aqui :D");

        jLabelEmptyTasksSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEmptyTasksSubTitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabelEmptyTasksSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyTasksSubTitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        jLabelEmptyTasksImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyTasksImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        javax.swing.GroupLayout jPanelEmptyTasksLayoutLayout = new javax.swing.GroupLayout(jPanelEmptyTasksLayout);
        jPanelEmptyTasksLayout.setLayout(jPanelEmptyTasksLayoutLayout);
        jPanelEmptyTasksLayoutLayout.setHorizontalGroup(
            jPanelEmptyTasksLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmptyTasksImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEmptyTasksSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEmptyTasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelEmptyTasksLayoutLayout.setVerticalGroup(
            jPanelEmptyTasksLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyTasksLayoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEmptyTasksImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyTasksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyTasksSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEmptyTasks.add(jPanelEmptyTasksLayout, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjectsToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasksTollBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEmptyTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectsToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTasksTollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEmptyTasks, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTasksToolBarAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTasksToolBarAddMouseClicked
        // TODO add your handling code here:
        int indexSeletecProject = jListProjects.getSelectedIndex();
        if (indexSeletecProject != -1) {
            TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, true);

            Project project = (Project) projectsModel.get(jListProjects.getSelectedIndex());

            taskDialogScreen.setProject(project);
            taskDialogScreen.setVisible(true);

            taskDialogScreen.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    int projectIndex = jListProjects.getSelectedIndex();
                    Project project = (Project) projectsModel.get(projectIndex);
                    loadTasks(project.getId());
                }
            });
        } else {
            JOptionPane.showMessageDialog(rootPane, "Voc� deve escolher um projeto para essa tarefa", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelTasksToolBarAddMouseClicked

    private void jLabelProjectsToolBarAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectsToolBarAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, true);
        projectDialogScreen.setVisible(true);

        projectDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });

    }//GEN-LAST:event_jLabelProjectsToolBarAddMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        // TODO add your handling code here:
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
    }//GEN-LAST:event_jListProjectsMouseClicked

    private void jLabelInfosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInfosMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Develop by Marcio Michelluzzi");
    }//GEN-LAST:event_jLabelInfosMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:

        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = tasksModel.getTasks().get(rowIndex);

        switch (columnIndex) {
            case 1:
                break;
            case 3:
                taskDAO.update(task);
                break;
            case 4:
                JOptionPane.showMessageDialog(rootPane, "Editar a tarefa");
                break;
            case 5:
                taskDAO.removeById(task.getId());
                tasksModel.getTasks().remove(task);
                
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                break;
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEmptyTasksImage;
    private javax.swing.JLabel jLabelEmptyTasksSubTitle;
    private javax.swing.JLabel jLabelEmptyTasksTitle;
    private javax.swing.JLabel jLabelInfos;
    private javax.swing.JLabel jLabelProjectsToolBarAdd;
    private javax.swing.JLabel jLabelProjectsToolBarTitle;
    private javax.swing.JLabel jLabelTasksToolBarAdd;
    private javax.swing.JLabel jLabelTasksToolBarTitle;
    private javax.swing.JLabel jLabelToolBarSubTitle;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanelEmptyTasks;
    private javax.swing.JPanel jPanelEmptyTasksLayout;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelProjectsToolBar;
    private javax.swing.JPanel jPanelTasksTollBar;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPaneProjects;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    private void initDataAccessObjects() {
        projectDAO = new ProjectDAO();
        taskDAO = new TaskDAO();
    }

    private void loadProjects() {
        List<Project> projects = projectDAO.getAll();

        projectsModel.clear();

        for (int i = 0; i < projects.size(); i++) {
            projectsModel.addElement(projects.get(i));
        }
        jListProjects.setModel(projectsModel);
    }

    private void loadTasks(int projectId) {
        List<Task> tasks = taskDAO.getByProjectId(projectId);

        tasksModel.setTasks(tasks);
        showJTableTasks(!tasks.isEmpty());
    }

    private void showJTableTasks(boolean isEmptyTable) {
        if (isEmptyTable) {
            if (jPanelEmptyTasksLayout.isVisible()) {
                jPanelEmptyTasksLayout.setVisible(false);
                jPanelEmptyTasks.remove(jPanelEmptyTasksLayout);
            }

            jPanelEmptyTasks.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanelEmptyTasks.getWidth(), jPanelEmptyTasks.getHeight());
        } else {
            if (jScrollPaneTasks.isVisible()) {
                jScrollPaneTasks.setVisible(false);
                jPanelEmptyTasks.remove(jScrollPaneTasks);
            }

            jPanelEmptyTasks.add(jPanelEmptyTasksLayout);
            jPanelEmptyTasksLayout.setVisible(true);
            jPanelEmptyTasksLayout.setSize(jPanelEmptyTasks.getWidth(), jPanelEmptyTasks.getHeight());
        }
    }

    private void decorateJTableTasks() {
        //To style table header
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setOpaque(false);
        jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));

        //Auto sort dos items da jTable
        jTableTasks.setAutoCreateRowSorter(true);

        //Add event 
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
                int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());

                if (columnIndex == 3) {
                    Task task = tasksModel.getTasks().get(rowIndex);
                    taskDAO.update(task);
                }
            }
        });

//        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                int row = jTableTasks.rowAtPoint(evt.getPoint());
//                int col = jTableTasks.columnAtPoint(evt.getPoint());
//                if (row >= 0 && col == 0) {
//                    JOptionPane.showMessageDialog(rootPane, "teste");
//
//                }
//            }
//        });;
    }

    private void centralizeMainScreen() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponentsModel() {
        projectsModel = new DefaultListModel();
        loadProjects();

        tasksModel = new TaskTableModel();
        jTableTasks.setModel(tasksModel);
        jTableTasks.getColumnModel().getColumn(2).setCellRenderer(new StatusColumnCellRenderer());
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRederer("edit"));
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRederer("delete"));

        if (!projectsModel.isEmpty()) {
            jListProjects.setSelectedIndex(0);
            int projectIndex = jListProjects.getSelectedIndex();
            Project project = (Project) projectsModel.get(projectIndex);
            loadTasks(project.getId());
        }

    }

    private void setApplicationIcon() {
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\inspect1\\Desktop\\L�gica de programa��o III\\Workspace\\TodoApp\\bin\\resources\\tick\\tick.png");
        this.setIconImage(icon);
    }
}
