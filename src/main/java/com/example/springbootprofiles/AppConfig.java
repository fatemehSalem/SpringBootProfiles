package com.example.springbootprofiles;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "myapp")
@Validated
public class AppConfig {
    private  String name;

//    @Positive
    private  int version;

    @Valid
    private  Ftp ftp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ftp getFtp() {
        return ftp;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setFtp(Ftp ftp) {
        this.ftp = ftp;
    }

/*    public AppConfig(String name, int version, Ftp ftp){
        this.name = name;
        this.version = version;
        this.ftp = ftp;
    }*/

/*    ------------------FTP-------------*/
    public static class Ftp{
        @NotEmpty
        private String host;
        private String username;
        private String password;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        /*    public Ftp(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }*/
    }
}
