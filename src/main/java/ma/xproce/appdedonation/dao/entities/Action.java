package ma.xproce.appdedonation.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "action")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private Date dateCreation;
    private int montant;
    private String etat; // PREPARATION? OUVERTE? SUSPENDUE? TERMINEE

    @ManyToOne
    private Organisateur organisateur;

    @OneToMany(mappedBy = "action",fetch = FetchType.LAZY)
    private Collection<Don> dons;

    public Collection<Don> getDons() {
        return dons;
    }
}
