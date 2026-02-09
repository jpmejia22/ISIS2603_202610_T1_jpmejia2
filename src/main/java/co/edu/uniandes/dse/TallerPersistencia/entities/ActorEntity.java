package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class ActorEntity extends BaseEntity{
    private String nombre;
    private String nacionalidad;
    @ManyToMany(
        mappedBy = "actores", fetch =FetchType.LAZY)
    List<PeliculaEntity> actores = new ArrayList<>();
}
