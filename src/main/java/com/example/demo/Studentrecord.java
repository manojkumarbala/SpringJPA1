package src.main.java.com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentrecord {
    @Id
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studentrecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
