/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;

/**
 *
 * @author sopheakcarl
 */
public class connectionProperty implements Serializable
{
    private String server;
    private String port;
    private String dbName;
    private String username;
    private String password;
    
    public connectionProperty(String server,String port,String dbName,String username,String password)
    {
        this.server=server;
        this.port=port;
        this.dbName=dbName;
        this.username=username;
        this.password=password;
    }
    public String getServer()
    {
        return server;
    }
    public String getport()
    {
        return port;
    }
    public String getDbName()
    {
        return dbName;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    
}
