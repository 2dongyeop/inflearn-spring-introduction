package hello.hellospring.domain;

public class Member {
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
