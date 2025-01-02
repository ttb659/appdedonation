package ma.xproce.appdedonation.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "donateur")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Donateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String prenom;
    private String eval;

    @OneToMany(mappedBy = "donateur",fetch = FetchType.LAZY)
    private Collection<Don> dons;
}
