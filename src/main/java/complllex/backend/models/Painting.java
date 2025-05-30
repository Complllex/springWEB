package complllex.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "paintings")
@Access(AccessType.FIELD)
public class Painting {

    public Painting() { }

    public Painting(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public int id;

    @Column(name = "name", nullable = false)
    public String name;

    @ManyToOne
    @JoinColumn(name = "artistid")
    public Artist artist;

    @ManyToOne
    @JoinColumn(name = "museumid")
    public Museum museum;

    @Column(name = "year", nullable = false)
    public int year;
}
