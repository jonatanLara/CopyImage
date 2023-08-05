package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Usuario1
 */
public class MainRun extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainRun() {
        initComponents();
        this.setTitle("HACK Paulina || Edgar");
        this.setLocationRelativeTo(null);
        this.setSize(545, 325);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Copiar = new javax.swing.JButton();
        txtUrlJSON = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUrlImagen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSearchJSON = new javax.swing.JButton();
        btnSearchIMG = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtURLSAVE = new javax.swing.JTextField();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 4, 45));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Copiar.setToolTipText("");
        Btn_Copiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Copiar.setBorderPainted(false);
        Btn_Copiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Copiar.setFocusable(false);
        Btn_Copiar.setLabel("COPIAR ARCHIVOS");
        Btn_Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CopiarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Copiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 202, 160, -1));
        getContentPane().add(txtUrlJSON, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, 481, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("URL DEL ARCHIVO JSON");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 520, -1));
        getContentPane().add(txtUrlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 114, 481, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("URL DE LA CARPETA ACTUAL DE LA IMAGEN");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 520, -1));

        btnSearchJSON.setText("Q");
        btnSearchJSON.setToolTipText("");
        btnSearchJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchJSONActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchJSON, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 51, -1, -1));

        btnSearchIMG.setText("Q");
        btnSearchIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIMGActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 114, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("URL DONDE SE GUARDARAN LAS IMAGENES");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, 520, -1));
        jLabel3.getAccessibleContext().setAccessibleName("URL DONDE SE GUARDARÁN LAS IMAGENES");

        getContentPane().add(txtURLSAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 171, 510, -1));

        ProgressBar.setMaximum(0);
        getContentPane().add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 246, 220, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario1\\Documents\\NetBeansProjects\\PaulinaAndEdgarHack\\Imagenes\\Recurso 5.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 202, 491, -1));

        jLabel5.setBackground(new java.awt.Color(0, 4, 45));
        jLabel5.setForeground(new java.awt.Color(0, 4, 45));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario1\\Documents\\NetBeansProjects\\PaulinaAndEdgarHack\\Imagenes\\Recurso 2.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CopiarActionPerformed
        String txtUrlJson = txtUrlJSON.getText();
        String txtUrlImagenes = txtUrlImagen.getText();
        String txtUrlSave = txtURLSAVE.getText();
        System.out.println("_"+txtUrlImagenes);
        if(txtUrlJson.isEmpty() || txtUrlImagenes.isEmpty() || txtUrlSave.isEmpty()){
            JOptionPane optionPane = new JOptionPane("¡NO SE PERMITE QUE DEJES CAMPOS VACIOS, FAVOR DE LLENAR LOS CAMPOS!",JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("NO LO HAGA COMPA, PUEDE SER PEGRILOSOOOO!"); 
            dialog.setAlwaysOnTop(true); // to show top of all other application dialog.setVisible(true); // to visible the dialog
            dialog.setVisible(true);
            //System.out.println("campos vacios");
        }
        else{
            try {
                // Selecciona el archivo
                    leerArchivoJSON(txtUrlJson, txtUrlImagenes,txtUrlSave);
                //printJson(txtUrlJson, txtUrlImagenes, txtUrlSave);

            } catch (IOException ex) {
                Logger.getLogger(MainRun.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(MainRun.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_Btn_CopiarActionPerformed

    private void btnSearchJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchJSONActionPerformed
        // CAPURAR UNA RUTA
        JFileChooser file = new JFileChooser();
        int r = file.showOpenDialog(this);  
        //File fileName = file.getSelectedFile();
        if(r == JFileChooser.APPROVE_OPTION ){
           File archivo = file.getSelectedFile();
           txtUrlJSON.setText(archivo.toString());
        }
        
    }//GEN-LAST:event_btnSearchJSONActionPerformed

    private void btnSearchIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIMGActionPerformed
        // TODO add your handling code here:
        //txtUrlImagenes.setText(txtUrlImagenes.getText());
    }//GEN-LAST:event_btnSearchIMGActionPerformed
    
    public void moverImagenes(String IMG_ORIGEN,String IMGSave, String ID, String numFoto){
       String dirCarpeta = crearCarpeta(ID,IMGSave); //url de la carpeta a donde se guadan las fotos /Imagenes/T1_05202/"
        //C:\\Users\\Usuario1\\Documents\\NetBeansProjects\\PaulinaAndEdgarHack\\fotos\\
        Path origenPath = FileSystems.getDefault().getPath(IMG_ORIGEN+"\\"+numFoto);
        Path destinoPath = FileSystems.getDefault().getPath(dirCarpeta+"/"+numFoto);

        try {
            Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public String crearCarpeta(String Carpeta, String URLSave){
       // String Dest = System.getProperty("user.dir") + "/Imagenes/"+Carpeta; //------------------------------------------------------cambiar
        String Dest = URLSave+"/"+Carpeta;
        File directorio = new File(Dest);
        if(!directorio.exists()){
            if(directorio.mkdirs()){
              //directorio creado
                return Dest;
            }else{
            //ERRR AL CREAR EL DIRECTORIO - YA EXISTE 
                return null;
            }
        }
        return Dest;
    }
    public void leerArchivoJSON(String UrlJson, String URLIMAG, String URLSave) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(UrlJson);//t1.json
        Object obj = parser.parse(reader);//parseamos
        //leermos el primer array de mi json []
        //JSONObject JsonObj = (JSONObject) obj;
        JSONArray array = (JSONArray) obj;
        numeroArchivos(array, URLIMAG, URLSave);
    }
    
    public void numeroArchivos(JSONArray array, String URLIMG,String URLSave) throws IOException{
        int foto_registrada = 0;
        int foto_no_halladas = 0;
        int foto_halladas = 0;
        int foto_faltan = 0;
        String info;
        ExportarExcel excel = new ExportarExcel(URLSave+"/informe.xlsx", "INFORME DE FOTOS");
        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        for(int i = 0; i < array.size(); i++){
            JSONObject ClaveJson = (JSONObject)array.get(i);
            String ID_Monumento = (String) ClaveJson.get("ID Monumento");
            crearCarpeta(ID_Monumento,URLSave);
            foto_registrada = 0;
            foto_faltan = 0;
            foto_no_halladas = 0;
            foto_halladas = 0;
            for (int j = 1; j <= 4; j++) {
                if((String) ClaveJson.get("foto_"+j) != null){
                    foto_registrada ++;
                    if(existeFoto(URLIMG+(String)ClaveJson.get("foto_"+j))){
                       foto_halladas++;
                    }else{
                      foto_no_halladas++;
                    }
                    existeFoto(URLIMG+(String)ClaveJson.get("foto_"+j));
                    moverImagenes(URLIMG,URLSave,ID_Monumento, (String) ClaveJson.get("foto_"+j));
                }else{
                    foto_faltan++;
                }
            } 
            int row = 1+i;
            String arrayContenido [] = {String.valueOf(ID_Monumento),String.valueOf(foto_registrada),String.valueOf(foto_halladas),String.valueOf(foto_no_halladas),String.valueOf(foto_faltan)};
            excel.ContenidoArray(row, arrayContenido);
            progressbar(array.size(), i);
        }
        //creamos el encabezado del documento excel
        String[] encabezado = 
            {"ID Monumentos",
            "Número de fotos registradas en el doc",
            "Número de fotos registradas y halladas en el doc",
            "Número de fotos registradas y No halladas en el doc",
            "Registro de fotos vacíos en el doc"
            };
        excel.encabezadoArray(encabezado);
        //creamos el archivo
        excel.crearArchivo();
    }
    
    public boolean existeFoto(String url){
        File archivo = new File(url);
        boolean foto;
        if (archivo.exists()) {
            if (archivo.isFile()) System.out.println("Es un archivo"); 
            if (archivo.isDirectory()) System.out.println("Es una carpeta");
            foto = true;
        }
        else {
            System.out.println("OJO: ¡¡No existe el archivo de configuración!!");
            foto = false;
        }
        return foto;
    }
    
    public void progressbar(int size, int i){
        Thread hilo = new Thread(){
            @Override
            public void run(){
                //int porcentaje = (i * size) / 100;
                ProgressBar.setMaximum(size);
                ProgressBar.setValue(i);
                System.out.println(i + "% de "+size );
            }
        };hilo.start();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Copiar;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JButton btnSearchIMG;
    private javax.swing.JButton btnSearchJSON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtURLSAVE;
    private javax.swing.JTextField txtUrlImagen;
    private javax.swing.JTextField txtUrlJSON;
    // End of variables declaration//GEN-END:variables

}