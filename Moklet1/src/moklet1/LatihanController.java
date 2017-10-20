/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moklet1;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class LatihanController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField absen;
    @FXML
    private TextField kelas;
    @FXML
    private TextField jurusan;
    @FXML
    private TextField telp;
    @FXML
    private Button proses;
      @FXML
    private TextArea printan;
      @FXML
    private Button hapus;

    @FXML
    void hapus(ActionEvent event) {
        nama.setText("");
        alamat.setText("");
        absen.setText("");
        kelas.setText("");
        jurusan.setText("");
        telp.setText("");
        printan.setText("");
    }

@FXML
    void proses(ActionEvent event) {
    String name = nama.getText();
    String address = alamat.getText();
    String abcent = absen.getText();
    String klas = kelas.getText();
    String jurus = jurusan.getText();
    String telepon = telp.getText();
    
    printan.setText(" Nama : " + name +"\n Alamat : "+address + "\n Kelas : " + klas+"\n Absen :" +abcent+"\n Jurusan : "+jurus+"\n No.Telepon : "+telepon);
    }/**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
