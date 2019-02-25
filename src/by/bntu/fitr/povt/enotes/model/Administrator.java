package by.bntu.fitr.povt.enotes.model;

public class Administrator extends User {
    {
        amountBet = Integer.MAX_VALUE;
    }

    public Administrator(String login, Integer age, String passwordData) {
        super(login, age, passwordData);
    }

    public void banPlayer(User user) {
        Databases.addBanuser(user.getID());
        user.setBan(true);

    }

    public void UnbanPlayer(User user) {
        Databases.removeBanuser(user.getID());
        user.setBan(false);
    }

    public Administrator(User user) {
        super(user);
    }

    public Administrator AdminUp(User user){
        //Здесь в дальнейшем удалить пользователя из списка пользователей в БД и добавить в список администраторов.
//        Прописать, когда появятся листы.
        return new Administrator(user);
    }
}
