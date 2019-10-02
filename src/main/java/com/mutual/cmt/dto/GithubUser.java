package com.mutual.cmt.dto;

/**
 * @author yyuanyan
 * @create 2019 - 10 - 03 - 1:56
 */
public class GithubUser {
    private String login;
    private Long id;
    private String node_id;

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", node_id='" + node_id + '\'' +
                '}';
    }
}
