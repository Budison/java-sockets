package com.epam.jap.sockettask;

import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * @author Kevin Nowak
 */
public class MainTest {
    @Test
    public void responseTest() throws IOException {
        Client client = new Client();
        client.startConnection("127.0.0.1", 8080);
        String response = client.sendMessage("Hello server");
        assertEquals("Hello client", response);
    }
}
