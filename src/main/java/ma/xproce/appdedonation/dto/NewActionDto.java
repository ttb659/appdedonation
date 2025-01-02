package ma.xproce.appdedonation.dto;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewActionDto {
    private Long id;
    private String titre;
    private String description;
    private Date dateCreation;
    private int montant;
    private String etat;


}
