package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class DirectorEntity extends BaseEntity{
    public String nombre;
    public String biografia;

}
