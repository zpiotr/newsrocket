package app.newsrocket;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;

public class FTP {
    public static void main(String[] args) throws IOException {
        FTPClient client = new FTPClient();
        client.connect("45.77.141.243", 21);
        client.enterLocalPassiveMode();
        client.login("FTP", "");

        if (!FTPReply.isPositiveCompletion(client.getReplyCode())) {
            client.deleteFile("del");
        }
    }
}
