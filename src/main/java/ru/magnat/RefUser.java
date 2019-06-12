package ru.magnat;

public class RefUser {

    String id;
    String login;
    String password;

    public String getId() {
        return id;
    }

    public void setId(String title) {
        this.id = title;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String singer) {
        this.login = singer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RefUser [id=" + id + ", login=" + login + "]";
    }

}