# API REST para Diagnóstico

Este proyecto contiene una API REST desarrollada en Java utilizando Spring Boot. La API gestiona los datos relacionados con los diagnósticos a través de varios endpoints.

## Resumen de Endpoints
| Método HTTP | Endpoint                        | Descripción                                          | Detalle de la solicitud                                                                                                      |
|-------------|---------------------------------|------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|
| GET         | `/diagnosticos`                 | Obtiene todos los diagnósticos                       | `http://localhost:8080/diagnosticos`                                                                                         |
| GET         | `/diagnosticos/{id}`            | Obtiene un diagnóstico por ID                        | `http://localhost:8080/diagnosticos/1`                                                                                       |
| POST        | `/diagnosticos`                 | Crea un nuevo diagnóstico                            | `http://localhost:8080/diagnosticos` <br> **body**: `{ "dsDiagnostico": "Nuevo diagnostico", "tpDiagnostico": "1" }`         |
| PUT         | `/diagnosticos/{id}`            | Actualiza un diagnóstico existente                   | `http://localhost:8080/diagnosticos/1` <br> **body**: `{ "dsDiagnostico": "Diagnostico Actualizado", "tpDiagnostico": "2" }` |
| DELETE      | `/diagnosticos/{id}`            | Elimina un diagnóstico                               | `http://localhost:8080/diagnosticos/1`                                                                                       |
