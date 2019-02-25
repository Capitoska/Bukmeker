package by.bntu.fitr.povt.enotes.model;

import java.util.ArrayList;

public  class Databases {
    public static int MAX_BANNED_PLAYER= 5;
    private static   Integer[] banUsers = new Integer[MAX_BANNED_PLAYER];
    private static   int countOfOBannerUsers;

    private Databases() { }

    public static void addBanuser(int idUser){
        banUsers[countOfOBannerUsers] = idUser;
        countOfOBannerUsers++;

    }


    public static void removeBanuser(int idUser){
        for(int i = 0; i< countOfOBannerUsers-1; i++){
            if(banUsers[i] == idUser && i!=countOfOBannerUsers-1) {
                for(;i<countOfOBannerUsers-2;i++){
                    banUsers[i] = banUsers[i+1];
                }
                countOfOBannerUsers--;
                break;
            }
        }
    }
}
