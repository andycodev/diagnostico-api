package com.andy.diagnostico_api.Repository;

import com.andy.diagnostico_api.Entity.Diagnostico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("diagnosticoRepository")
public interface RepositoryDiagnostico extends CrudRepository<Diagnostico, Integer> {}
