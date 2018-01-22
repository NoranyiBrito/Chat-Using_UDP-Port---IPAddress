import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;



public class SendChat {

    static DatagramSocket mySocket = null;
  
 public SendChat() {
	
 }
	
	
 public SendChat(DatagramSocket socket) {
	
		mySocket = socket;
	
 }
 
 
 
	public void send(String msg, InetAddress destinationAddress, int port) {

		
		byte[] buffer = new byte[1000];

		
			String message = msg;
			buffer = message.getBytes();
			
			try {
				DatagramPacket packet = new DatagramPacket(buffer, 
														   message.length(),
														   destinationAddress,
														   port);
        
         
				
         
         
				System.out.println("Sending message = " + message);
				
				mySocket.send(packet);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(-1);
			}
			
			
		
	}
	
  
	
}
