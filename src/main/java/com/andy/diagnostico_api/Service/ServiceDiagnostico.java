package com.andy.diagnostico_api.Service;

import com.andy.diagnostico_api.Entity.Diagnostico;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ServiceDiagnostico  {
    public abstract List<Diagnostico> getAllDiagnosticos();
    public Optional<Diagnostico> getDiagnosticoById(Integer id);
    public abstract Diagnostico createDiagnostico(Diagnostico diagnostico);
    public abstract Diagnostico updateDiagnostico(Integer id, Diagnostico diagnostico);
    public abstract void deleteDiagnostico(Integer id);
}
