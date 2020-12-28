package dao;

import model.Login;
import model.User;

public interface Dao {

	public String login(Login log);
	public boolean register(User user);
}
