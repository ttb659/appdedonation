package ma.xproce.appdedonation.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "organisateur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Organisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;

    @OneToMany(mappedBy = "organisateur")
    private Collection<Action> actions;

}
