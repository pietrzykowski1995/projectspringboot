package pl.atos.finalworkshop.user;

public interface UserServiceInteface {

    User findByUserName(String name);

    void saveUser(User user);
}