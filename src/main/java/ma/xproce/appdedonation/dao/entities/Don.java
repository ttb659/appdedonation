package ma.xproce.appdedonation.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "don")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Don {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long don_id;
    private String titre;
    private int montant;
    private String type;

    @ManyToOne
    private Action action;

    @ManyToOne
    private Donateur donateur;

}
