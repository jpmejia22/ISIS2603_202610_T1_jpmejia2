package co.edu.uniandes.dse.TallerPersistencia.entities;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity{
    private String titulo;
    private Integer anioLanzamiento;
    @ManyToOne
    DirectorEntity director;
    @ManyToMany(
        mappedBy = "peliculas", fetch =FetchType.LAZY)
    List<ActorEntity> peliculas = new ArrayList<>();
}