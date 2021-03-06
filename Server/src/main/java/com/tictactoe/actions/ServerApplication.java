package com.tictactoe.actions;

import com.tictactoe.database.DatabaseConnection;
import com.tictactoe.database.playerModel.PlayerModel;

import java.net.ServerSocket;


public class ServerApplication {
    private static DatabaseConnection db;
    private static ServerSocket serverSocket;

    public static void setDB() {
        db = new DatabaseConnection();
        PlayerModel.getPlayers();
    }

    public static DatabaseConnection getDB() {
        return db;
    }

    public static void setServerSocket(ServerSocket serverSocket1) {
        serverSocket = serverSocket1;
    }

    public static ServerSocket getServerSocket() {
        return serverSocket;
    }

}
