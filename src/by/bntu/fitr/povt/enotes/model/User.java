package by.bntu.fitr.povt.enotes.model;

/*
*
*  Реализовать список, добавление и удаление бетов для пользователя.
*  Продумать преимущества випов от простых игроков
*  Создать класс общей информации для администраторов (класс нужен, пока не создам БД)
*
*/

public class User {
    public static final Integer START_BALANCE = 0;
    public static Integer amountBet = 3;
    private final Integer ID = hashCode();

    private boolean ban = false;
    private String login;
    private Integer age;
    private String passwordData;
    private Integer balance = START_BALANCE;

    public User(String login, Integer age, String passwordData) {
        this.login = login;
        this.age = age;
        this.passwordData = passwordData;
    }

    public User(User user){
        this.setAge(user.getAge());
        this.setBan(user.isBan());
        this.setBalance(user.getBalance());
        this.setLogin(user.getLogin());
        this.setPasswordData(user.getPasswordData());
    }
    public boolean isBan() {
        return ban;
    }

    public Integer getID() {
        return ID;
    }

    public static Integer getAmountBet() {
        return amountBet;
    }

    public String getLogin() {
        return login;
    }

    public Integer getAge() {
        return age;
    }

    public String getPasswordData() {
        return passwordData;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void refill(Integer money) {
        this.balance += money;
    }

    public void setPasswordData(String passwordData) {
        this.passwordData = passwordData;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }
}
