package prjava41munoz192;
import java.net.*;
public class Prjava41munoz192 {
     public static void main(String[] args) {
// TODO code application logic here

System.out.println("Projecte de cognom19");

System.out.println("versió 0.2 del projecte prjava41cognom19");

try {

InetAddress addr = InetAddress.getLocalHost();

String ipAddr = addr.getHostAddress();

String hostname = addr.getHostName();

System.out.println("hostname="+hostname);

System.out.println("Adreça IP: " + ipAddr);

System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));

System.out.println("Carpeta Personal: " + System.getProperty("user.home"));

System.out.println("Sistema operatiu: " + System.getProperty("os.name"));

System.out.println("Versió OS: " + System.getProperty("os.version"));

}

catch (UnknownHostException e) {

e.printStackTrace();

}

}
    
}