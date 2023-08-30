package org.example;


import static jdk.internal.misc.ThreadFlock.open;

public class NewTest {

    @Test
    void newTest() {
        open("https://github.com/");
    }
}
