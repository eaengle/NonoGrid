/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.nanogrid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.WindowListener;
import java.awt.font.LineMetrics;
import java.io.File;
import java.lang.reflect.Array;
import static javafx.application.Platform.exit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.OK_OPTION;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import nanogridgame.NanoGridBoard;
import nanogridgame.NanoGridGame;
import nanogridgame.NanoGridParameters;

/**
 *
 * @author Gateway1
 */
public class NanoGridUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NanoGridUI() {
        initComponents();
        initCustom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuBarMain = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuLoadGame = new javax.swing.JMenuItem();
        menuSaveGame = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuLoadPuzzle = new javax.swing.JMenuItem();
        menuSavePuzzle = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        menuSettings = new javax.swing.JMenu();
        menuOptions = new javax.swing.JMenuItem();
        menuRefresh = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nano Grid");
        setResizable(false);
        setSize(new java.awt.Dimension(100, 100));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        menuFile.setText("File");

        menuLoadGame.setText("Load Game...");
        menuLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoadGameActionPerformed(evt);
            }
        });
        menuFile.add(menuLoadGame);

        menuSaveGame.setText("Save Game...");
        menuSaveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveGameActionPerformed(evt);
            }
        });
        menuFile.add(menuSaveGame);
        menuFile.add(jSeparator1);

        menuLoadPuzzle.setText("Load Puzzle..");
        menuLoadPuzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoadPuzzleActionPerformed(evt);
            }
        });
        menuFile.add(menuLoadPuzzle);

        menuSavePuzzle.setText("Save Puzzle...");
        menuSavePuzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSavePuzzleActionPerformed(evt);
            }
        });
        menuFile.add(menuSavePuzzle);
        menuFile.add(jSeparator2);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuBarMain.add(menuFile);

        menuSettings.setText("Settings");

        menuOptions.setText("Grid Options...");
        menuOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionsActionPerformed(evt);
            }
        });
        menuSettings.add(menuOptions);

        menuRefresh.setText("Refresh Puzzle");
        menuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRefreshActionPerformed(evt);
            }
        });
        menuSettings.add(menuRefresh);

        menuBarMain.add(menuSettings);

        setJMenuBar(menuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    GridSizeDialog GridDialog;


    private void menuOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionsActionPerformed
        GridDialog.setUI(this);
        GridDialog.setVisible(true);
    }//GEN-LAST:event_menuOptionsActionPerformed

    private void menuLoadPuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoadPuzzleActionPerformed
        File loadFile = getBoardFile();
        Game.loadBoard(loadFile);
        Game.resetBoard(loadFile);
        Settings = Game.getSettings();
        redraw();

    }//GEN-LAST:event_menuLoadPuzzleActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        verifyExit();
    }//GEN-LAST:event_menuExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        verifyExit();
    }//GEN-LAST:event_formWindowClosing

    private void menuSaveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveGameActionPerformed
        saveGame();
    }//GEN-LAST:event_menuSaveGameActionPerformed

    private void menuLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoadGameActionPerformed
        File loadFile = getBoardFile();
        Game.loadBoard(loadFile);
        Settings = Game.getSettings();
        redraw();
        placeMarks();
    }//GEN-LAST:event_menuLoadGameActionPerformed

    private void menuSavePuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSavePuzzleActionPerformed
        saveGame();
    }//GEN-LAST:event_menuSavePuzzleActionPerformed

    private void menuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRefreshActionPerformed
        reset();
    }//GEN-LAST:event_menuRefreshActionPerformed
    
   
    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
       
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
       
    }//GEN-LAST:event_formMouseExited

    boolean MouseDown = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        MouseDown = true;
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        MouseDown = false;
    }//GEN-LAST:event_formMouseReleased

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
            java.util.logging.Logger.getLogger(NanoGridUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NanoGridUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NanoGridUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NanoGridUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new NanoGridUI().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuLoadGame;
    private javax.swing.JMenuItem menuLoadPuzzle;
    private javax.swing.JMenuItem menuOptions;
    private javax.swing.JMenuItem menuRefresh;
    private javax.swing.JMenuItem menuSaveGame;
    private javax.swing.JMenuItem menuSavePuzzle;
    private javax.swing.JMenu menuSettings;
    // End of variables declaration//GEN-END:variables
    private void setColor(JTextPane pane, Color bgColor) {
        UIDefaults defaults = new UIDefaults();
        defaults.put("TextPane[Enabled].backgroundPainter", bgColor);
        pane.putClientProperty("Nimbus.Overrides", defaults);
        pane.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
        pane.setBackground(bgColor);
        updateTextPane(pane);
    }

    private void initCustom() {
        
        Settings = new NanoGridParameters();
        Settings.Columns = 5;
        Settings.Rows = 5;
        GridDialog = new GridSizeDialog(this, true);
        GridDialog.setUI(this);
        setup();

    }

    public void reset() {
        createGame();
        setPanes();
        redrawGrid();
        displayGame(false);
    }

    void redraw() {
         
        setPanes();
        redrawGrid();
        
        displayGame(false);
        
    }

    public void setup() {
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        createGame();
        setPanes();
        
        displayGame(false);
       
    }
    JTextPane[][] Panes;
    JTextPane[] RowPanes;
    JTextPane[] ColPanes;
    JTextPane Corner;
    
    private void setPanes() {
        
        Panes = new JTextPane[Settings.Columns][Settings.Rows];
        ColPanes = new JTextPane[Settings.Columns];
        RowPanes = new JTextPane[Settings.Rows];
        
        GroupLayout layout = (GroupLayout) mainPanel.getLayout();
        layout.setAutoCreateGaps(true);

        GroupLayout.ParallelGroup hGroup = layout.createParallelGroup();
        layout.setHorizontalGroup(hGroup);
        
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addPreferredGap(ComponentPlacement.RELATED, 1, 1);
        layout.setVerticalGroup(vGroup);
        int rowWidth = getRowWidth();
        int colHeight = getColHeight();
        int cellSize = getCellSize();
        for (int row = 0; row < Settings.Rows + 1; row++) {
            GroupLayout.SequentialGroup h1Group = layout.createSequentialGroup();
            h1Group.addPreferredGap(ComponentPlacement.RELATED, 1, 1);
            hGroup.addGroup(h1Group);
            
            GroupLayout.ParallelGroup v1Group = layout.createParallelGroup();
            vGroup.addGroup(v1Group);
            
            for (int col = 0; col < Settings.Columns + 1; col++) {
                JTextPane pane = createPane();
                if (col > 0 && row > 0) {
                    Panes[col - 1][row - 1] = pane;
                    h1Group.addComponent(pane, cellSize, cellSize, cellSize);
                    v1Group.addComponent(pane, cellSize, cellSize, cellSize);
                } else if (col == 0 && row > 0) {
                    RowPanes[row - 1] = pane;
                    StyledDocument doc = pane.getStyledDocument();
                    SimpleAttributeSet align = new SimpleAttributeSet();
                    StyleConstants.setAlignment(align, StyleConstants.ALIGN_RIGHT);
                    doc.setParagraphAttributes(0, doc.getLength(), align, false);
                    h1Group.addComponent(pane, rowWidth, rowWidth, rowWidth);
                    v1Group.addComponent(pane, cellSize, cellSize, cellSize);
                } else if (row == 0 && col > 0) {
                    ColPanes[col - 1] = pane;
                    h1Group.addComponent(pane, cellSize, cellSize, cellSize);
                    v1Group.addComponent(pane, colHeight, colHeight, colHeight);
                } else {
                    Corner =pane;
                    h1Group.addComponent(pane, rowWidth, rowWidth, rowWidth);
                    v1Group.addComponent(pane, colHeight, colHeight, colHeight);
                }

            }
        }

        resize();
    }

    private void jTextPaneMousePressed(MouseEvent evt) {
        MouseDown =true;
        JTextPane pane = (JTextPane) evt.getComponent();
        pane = getPane(pane);
        cellClicked(pane);
    }
    
    private void jTextPaneMouseReleased(MouseEvent evt) {
        MouseDown =false;
       
    }

    
    private void jTextPaneMouseEntered(MouseEvent evt) {
        JTextPane pane = (JTextPane) evt.getComponent();
        pane = getPane(pane);
        if (pane != null) {
            if(MouseDown){
                cellClicked(pane);
            }
        }
    }

    private void jTextPaneMouseExited(MouseEvent evt) {
        JTextPane pane = (JTextPane) evt.getComponent();
        pane = getPane(pane);
        if (pane != null) {
           //PaneEntered = false;
           
        }
    }

    private JTextPane createPane() {
        JTextPane pane = new javax.swing.JTextPane();
        updateTextPane(pane);
        pane.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextPaneMouseEntered(evt);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextPaneMouseExited(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextPaneMouseReleased(evt);
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextPaneMousePressed(evt);
            }

            
            
           
        });

        return pane;
    }

    void redrawGrid() {

        mainPanel.removeAll();
        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 381, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 257, Short.MAX_VALUE)
        );
        setPanes();
        repaint();
        //resize();
    }

    NanoGridGame Game;
    public NanoGridParameters Settings;

    public void createGame() {
        Game = new NanoGridGame(Settings);
        Game.create();
        Game.getBoard().printBoard(System.out);
    }

    public void displayGame(boolean show) {

        NanoGridBoard board = Game.getBoard();
        displayColumnCounts();
        displayRowCounts();
        for (int r = 0; r < Settings.Rows; r++) {
            
            for (int c = 0; c < Settings.Columns; c++) {

                JTextPane pane = Panes[c][r];

                if (show && pane.getText().equals(String.valueOf(NanoGridBoard.FillChar))) {
                    pane.setForeground(Color.green);
                    setColor(pane, Color.green);

                } else if (show && board.getCell(c, r) == NanoGridBoard.FillChar) {
                    setCell(pane);
                } else if (show) {
                    setClear(pane);
                }
            }
        }
    }

    private void displayColumnCounts() {
        for (JTextPane p : ColPanes) {
            p.setText("");
        }
        NanoGridBoard board = Game.getBoard();
        Integer[][] ccnts = board.getColumnCounts();
                
        for (int i = 0 ;  i < ccnts.length;  i++) {
            String txt = getColumnText(i,ccnts);
            ColPanes[i].setText(txt);
        }
    }
    
    public String getColumnText(int col,Integer[][] ccnts){
        StringBuilder sb = new StringBuilder();
        Integer[] cols = ccnts[col];
        int cmax = Game.getBoard().getMaxColumnCounts();
        for (int c = 0; c < cmax; c++) {
            int idx = cols.length-cmax+c;
            if(idx >= 0)
            {
                if (idx != 0)
                    sb.append("\n");
                sb.append(cols[idx].toString());
            }
            else
            {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    private void displayRowCounts() {
        for (JTextPane p : RowPanes) {
            p.setText("");
        }
        NanoGridBoard board = Game.getBoard();
        Integer[][] rcnts = board.getRowCounts();
        for(int r =0;r < rcnts.length;r++)  {      
            String txt = getRowText(r, rcnts);
            RowPanes[r].setText(txt);
        }
    }

    private String getRowText(int r, Integer[][] rcnts) {
        Integer[] row = rcnts[r];
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row.length; i++) {
            if(i>0)
                sb.append(" ");
            sb.append(row[i].toString());
        }
        return sb.toString();
    }

    private void updateTextPane(JTextPane pane) {
        Font f = getBoardFont();
        pane.setFont(f);
        StyledDocument doc = pane.getStyledDocument();
        SimpleAttributeSet align = new SimpleAttributeSet();
        StyleConstants.setAlignment(align, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), align, false);
        pane.setEditable(false);
        pane.setBorder(null);
        pane.setSelectedTextColor(new java.awt.Color(255, 153, 153));
        pane.setFocusable(false);
    }

    private JTextPane getPane(JTextPane pane) {
        for (int c = 0; c < Settings.Columns; c++) {
            for (int r = 0; r < Settings.Rows; r++) {
                if (Panes[c][r] == pane) {
                    return pane;
                }
            }
        }
        return null;
    }

    private int[] getBoardCoord(JTextPane pane) {
        for (int c = 0; c < Settings.Columns; c++) {
            for (int r = 0; r < Settings.Rows; r++) {
                if (Panes[c][r] == pane) {
                    return new int[]{c, r};
                }
            }
        }
        return null;
    }

    private void winGame() {
        JOptionPane.showMessageDialog(this,
                "You Won the Game",
                "You Won!",
                JOptionPane.OK_OPTION);
        displayGame(true);
    }

    private void setClear(JTextPane pane) {
        int[] coord = getBoardCoord(pane);
        pane.setText(" ");
        setColor(pane, Color.white);
        pane.setForeground(Color.black);
        Game.clearCell(coord[0], coord[1]);
    }

    private void setMark(JTextPane pane) {
        int[] coord = getBoardCoord(pane);
        pane.setText(String.valueOf(NanoGridBoard.MarkChar));
        setColor(pane, Color.white);
        pane.setForeground(Color.red);
        Game.setMark(coord[0], coord[1]);
    }

    private void setCell(JTextPane pane) {
        int[] coord = getBoardCoord(pane);
        pane.setText(String.valueOf(NanoGridBoard.FillChar));
        setColor(pane, Color.black);
        pane.setForeground(Color.black);
        Game.setCell(coord[0], coord[1]);
    }

    private void verifyExit() {
        Object[] options = {"OK", "CANCEL"};
        int ans = JOptionPane.showConfirmDialog(this, "Quit? Are you sure?", "Warning",
                OK_CANCEL_OPTION, WARNING_MESSAGE);
        if (ans == OK_OPTION) {
            dispose();
        }

    }

    private void saveGame() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Nanogrid Save Files", "xml");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            Game.saveGame(file);
        }
    }

    private File getBoardFile() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Nanogrid Save Files", "xml");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile();
        }
        return null;
    }

    private void placeMarks() {
        char[][] board = Game.getPlayColumns();
        for (int c = 0; c < board.length; c++) {
            for (int r = 0; r < board.length; r++) {
                JTextPane pane = Panes[c][r];
                if (board[c][r] == NanoGridBoard.FillChar) {
                    setCell(pane);
                } else if (board[c][r] == NanoGridBoard.MarkChar) {
                    setMark(pane);
                } else {
                    setClear(pane);
                }

            }
        }

    }

    private void resize() {
        this.setResizable(true);
        int rowWidth = getRowWidth();
        int colHeight = getColHeight();
        int cellSize = getCellSize();
        int menuHgt = menuBarMain.getHeight();
        int titleHeight = 30;
        int bufHgt = (int)(5*(double)Settings.Rows)+25;
        int bufWdt = (int)(5*(double)Settings.Columns)+35;
        int wdt = rowWidth+cellSize*Settings.Columns+Settings.Columns+bufWdt;
        int hgt = colHeight+cellSize*Settings.Rows+Settings.Rows+menuHgt+titleHeight+bufHgt;
        setSize(new java.awt.Dimension(wdt,hgt));
        
   }

    private Font getBoardFont() {
        return new Font("Consolas", Font.BOLD, 14);
    }

    private int getRowWidth() {
        Font f = getBoardFont();
        Graphics g = this.getGraphics();
        int max = 0;
        Integer[][] rcnts = Game.getBoard().getRowCounts();
        FontMetrics metrics = g.getFontMetrics(f);
        for(int r=0;r<Settings.Rows;r++){
            String txt = getRowText(r,rcnts);
            int wdt = metrics.stringWidth(txt);
            if(wdt>max){
                max = wdt;
            }
            
        }
        return max+5;
    }

    private int getColHeight() {
         Font f = getBoardFont();
        Graphics g = this.getGraphics();
        int max =0;
        int cnt = Game.getBoard().getMaxColumnCounts();
        FontMetrics metrics = g.getFontMetrics(f);
        max = metrics.getHeight()*cnt;
        return max;
    }

    private int getCellSize() {
         Font f = getBoardFont();
        Graphics g = this.getGraphics();
        FontMetrics metrics = g.getFontMetrics(f);
        int hgt = metrics.getHeight();
        return hgt+2;
    }

    private void cellClicked(JTextPane pane) {
        if (pane != null) {

            String tx = pane.getText();
            if (tx.equals("X")) {
                setClear(pane);
            } else if (tx.equals("#")) {
                setMark(pane);
            } else {
                setCell(pane);
            }
            if (Game.checkWin()) {
                winGame();
            }
        }
    }
}
