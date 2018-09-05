/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;
import java.net.InetAddress;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ardania
 */
public class NewClass {
    public  static void main(String[] args)throws UnknownHostException, IOException {
        String host =JOptionPane.showInputDialog("1. IP Address \n2. Nama Host");
        int convert = Integer.parseInt(host);
        switch (convert){
            case 1 : String ip = JOptionPane.showInputDialog("Masukkan IP Address ");
                InetAddress p = InetAddress.getByName(ip);
                if(p.isReachable(3000)){
                    JOptionPane.showMessageDialog(null, ip+" Mempunyai Nama Host "+p.getHostName());
                }else{
                    JOptionPane.showMessageDialog(null, ip+" Tidak ditemukan, Coba Lagi");
                }
            break;

                case 2 : String hostname = JOptionPane.showInputDialog("Masukkan Nama Host ");
                InetAddress coba = InetAddress.getByName(hostname);
                if(coba.isReachable(3000)){
                    JOptionPane.showMessageDialog(null, "IP dari Nama Host "+hostname+" adalah "+coba.getHostAddress());
                }else{
                    JOptionPane.showMessageDialog(null, coba+" Tidak Ditemukan, COba Lagi");
                }
                break;
                default : JOptionPane.showMessageDialog(null, "SALAH");
        }
        System.exit(0);
    }
}
