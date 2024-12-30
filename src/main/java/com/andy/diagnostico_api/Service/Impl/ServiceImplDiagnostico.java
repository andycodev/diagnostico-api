package com.andy.diagnostico_api.Service.Impl;

import com.andy.diagnostico_api.Entity.Diagnostico;
import com.andy.diagnostico_api.Repository.RepositoryDiagnostico;
import com.andy.diagnostico_api.Service.ServiceDiagnostico;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service("diagnosticoServiceImpl")
@Transactional
public class ServiceImplDiagnostico implements ServiceDiagnostico {

    @Autowired
    @Qualifier("diagnosticoRepository")
    private RepositoryDiagnostico repositoryDiagnostico;

    @Override
    public List<Diagnostico> getAllDiagnosticos() {
        return (List<Diagnostico>) repositoryDiagnostico.findAll();
    }

    @Override
    public Optional<Diagnostico> getDiagnosticoById(Integer id) {
        return repositoryDiagnostico.findById(id);
    }

    @Override
    public Diagnostico createDiagnostico(Diagnostico diagnostico) {
        return repositoryDiagnostico.save(diagnostico);
    }

    @Override
    public Diagnostico updateDiagnostico(Integer id, Diagnostico diagnostico) {
        if (!repositoryDiagnostico.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Diagnostico no encontrado con el cd_diagnostico: " + id);
        }
        diagnostico.setCdDiagnostico(id);
        return repositoryDiagnostico.save(diagnostico);
    }

    public void deleteDiagnostico(Integer id) {
        if(!repositoryDiagnostico.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Diagnostico no encontrado con el cd_diagnostico: " + id);
        }
        repositoryDiagnostico.deleteById(id);
    }

}
