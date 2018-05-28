package com.kinky;

import java.sql.SQLException;

import org.h2.tools.Server;

/**
 * 
 * @author Loy Fu qq群 540553957  http://www.17jee.com
 * @since 1.8
 * @version 3.0.0
 * 
 */
public class MainDb {
    public static void main(String[] args) throws SQLException {

        String[] arg = { "-tcp", "-tcpAllowOthers" };
        Server server = Server.createTcpServer(arg);
        server.start();

		System.out.println("JVM running for");
    }

}

