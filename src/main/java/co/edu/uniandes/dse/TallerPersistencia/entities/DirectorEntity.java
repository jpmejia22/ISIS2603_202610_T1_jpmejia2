package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DirectorEntity extends BaseEntity{
    private String nombre;
    private String biografia;
    @OneToMany(
        mappedBy = "director", fetch =FetchType.LAZY)
    List<PeliculaEntity> director = new ArrayList<>();
}
