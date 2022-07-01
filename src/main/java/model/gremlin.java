package model;

import java.util.Objects;

public class gremlin {
    private String name;
    private Integer age;
    private String color;
    private Boolean isEvil;

    public gremlin(){
    }

    public gremlin(String name, Integer age, String color, Boolean isEvil) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isEvil = isEvil;
    }

    public String getName() {
        return name;
    }

    public gremlin setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public gremlin setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getColor() {
        return color;
    }

    public gremlin setColor(String color) {
        this.color = color;
        return this;
    }

    public Boolean getEvil() {
        return isEvil;
    }

    public gremlin setEvil(Boolean evil) {
        isEvil = evil;
        return this;
    }

    @Override
    public String toString() {
        return "gremlin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isEvil=" + isEvil +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof gremlin)) return false;
        gremlin gremlin = (gremlin) o;
        return Objects.equals(name, gremlin.name) && Objects.equals(age, gremlin.age) && Objects.equals(color, gremlin.color) && Objects.equals(isEvil, gremlin.isEvil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, isEvil);
    }
}
