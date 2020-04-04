package tv.kuzmin.example1.userauthcontrolapi;


public interface RemoteAuthService
{
    UserInfo login(String login, String passwordHash);
}
