package name.arche.demo.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:config.properties")
@ConfigurationProperties(prefix = "name.arche")
public class Config {
    private String version;
    private String date;
    private String author;


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Config{" +
                "version='" + version + '\'' +
                ", date='" + date + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
