package icu.bleuweb.web.pojo;

/**
 * @description: customer bean
 * @author: wxy
 * @create: 2021-07-28 16:00
 **/

public class Customer {
    private long id;
    private String name;
    private String city;
    public Customer() {}
    public Customer(long id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
