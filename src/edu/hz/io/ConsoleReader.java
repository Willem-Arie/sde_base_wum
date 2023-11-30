package edu.hz.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thismethodwillreadtheconsoleorsomething {

    // go get some groceries this afternoon
    public String readLine() {
        try {
            // line that the console will be reading
            String elephant = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            return elephant;
        } catch (IOException var2) {
            return "Gibberish input detected";
        }
    }
}