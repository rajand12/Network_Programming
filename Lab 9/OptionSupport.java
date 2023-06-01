//Write a program to list all supported socket options for the different types of network channels.
import java.io.IOException;
import java.io.*;
import java.net.*;
import java.nio.channels.*;
public class OptionSupport {
    public static void main(String[] args) throws IOException {
        PrintOptions(SocketChannel.open());
        PrintOptions(ServerSocketChannel.open());
        PrintOptions(AsynchronousSocketChannel.open());
        PrintOptions(AsynchronousServerSocketChannel.open());
        PrintOptions(DatagramChannel.open());
    }
    
        private static void PrintOptions(NetworkChannel channel) throws IOException{
            System.out.println(channel.getClass().getSimpleName() + "supports:" ); 
            for (SocketOption<?> option : channel.supportedOptions()){
                System.out.println(option.name() + ": " + channel.getOption(option));
            }
            System.out.println();
            channel.close();
        }   

}
