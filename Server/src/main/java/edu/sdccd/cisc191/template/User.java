package edu.sdccd.cisc191.template;


import java.io.*;

/*
 * includes the implementation of a JavaFX GUI menu using buttons and dialog boxes for user input and displaying messages.
 * methods getValueAtIndexGUI(), setValueAtIndexGUI(), findIndexOfValueGUI(), printAllValuesGUI(), deleteValueAtIndexGUI(), expandArrayGUI(), and shrinkArrayGUI()
 * used to handle the corresponding actions in the GUI interface.
networking functionality is not implemented in this code.
Implementing networking would involve creating a separate class for the server and client,
establishing a network connection, and exchanging data between them using sockets and input/output streams.

 */
class User implements Serializable
{
    private String name;
    public User(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
