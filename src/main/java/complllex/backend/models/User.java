package complllex.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User {

    public User() { }
    public User(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public int id;

    @Column(name = "login", nullable = false, unique = true)
    public String login;

    @Column(name = "email", nullable = false, unique = true)
    public String email;

    @JsonIgnore
    @Column(name = "password")
    public String password;

    @JsonIgnore
    @Column(name = "salt")
    public String salt;

    @Transient
    public String np;

    @Column(name = "token")
    public String token;

    @Column(name = "activity")
    public LocalDateTime activity;

    @ManyToMany(mappedBy = "users")
    public Set<Museum> museums = new HashSet<>();

    public void addMuseum(Museum m) {
        this.museums.add(m);
        m.users.add(this);
    }

    public void removeMuseum(Museum m) {
        this.museums.remove(m);
        m.users.remove(this);
    }
}
