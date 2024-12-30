package com.andy.diagnostico_api.Controller;

import com.andy.diagnostico_api.Entity.Diagnostico;
import com.andy.diagnostico_api.Service.Impl.ServiceImplDiagnostico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/diagnosticos", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class ControllerDiagnostico {

    @Autowired
    @Qualifier("diagnosticoServiceImpl")
    private ServiceImplDiagnostico serviceImplDiagnostico;

    @GetMapping
    public List<Diagnostico> getAllDiagnosticos() {
        return serviceImplDiagnostico.getAllDiagnosticos();
    }

    @GetMapping(path = "/{id}")
    public Optional<Diagnostico> getDiagnosticoById(@PathVariable Integer id) {
        return serviceImplDiagnostico.getDiagnosticoById(id);
    }

    @PostMapping
    public Diagnostico createDiagnostico(@RequestBody Diagnostico diagnostico) {
        return serviceImplDiagnostico.createDiagnostico(diagnostico);
    }

    @PutMapping(path = "/{id}")
    public Diagnostico updateDiagnostico(@PathVariable Integer id, @RequestBody Diagnostico diagnostico) {
        return serviceImplDiagnostico.updateDiagnostico(id, diagnostico);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteDiagnostico(@PathVariable Integer id) {
        serviceImplDiagnostico.deleteDiagnostico(id);
    }

}
