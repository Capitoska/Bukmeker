package by.bntu.fitr.povt.enotes.controller;

import by.bntu.fitr.povt.enotes.model.Administrator;
import by.bntu.fitr.povt.enotes.model.Player;

public class Main {
    public static void main(String[] args) {
        Administrator administrator = new Administrator("Capitoska", 18, "Nv3216345666");
        Player player1 = new Player("Jon", 22, "1234");
        Player player2 = new Player("Vanya", 22, "1234");
        Player player3 = new Player("Makc", 22, "1234");
        Player player4 = new Player("Masha", 22, "1234");
        Player player5 = new Player("Vika", 22, "1234");
        Player player6 = new Player("Jerry", 22, "1234");

        administrator.banPlayer(player1);
        administrator.banPlayer(player2);
        administrator.banPlayer(player3);
        administrator.banPlayer(player4);
        administrator.banPlayer(player5);
        administrator.UnbanPlayer(player3);
        administrator.banPlayer(player6);
        System.out.println(player3.isBan());
    }
}
