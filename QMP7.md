## Como usuarie de QueMePongo quiero ver todas las prendas que tengo en mi guardarropas desde el navegador para poder administrarlas

GET /usuario/{idUsuario}/guardarropas/{idGuardarropas}/prendas

##### Como body del request podria restringirse que campos mostrar en el body de la respuesta

Código respuesta:
- 200 : Prendas encontradas
- 404 : ruta no encontrada

```
Body respuesta (JSON):
[
    {
    "id_prenda": 155,
    "tipo": "pantalon",
    "material": "algodón",
    "color": "255,255,255"
  },  
  demas prendas que hayan en el guardarropas
  ... 
]
```

## Como usuario de QueMePongo, quiero crear una prenda desde el navegador

POST /guardarropas/{idGuardarropas}/prendas

##### body del request tendria que ser un JSON con la estructura de una prenda

```
Body request (JSON):
{
    "id_prenda": 155,
    "tipo": "pantalon",
    "material": "algodón",
    "color": "255,255,255"
}
```

```
Body respuesta (JSON):
{
    "id_prenda": 155,
    "tipo": "pantalon",
    "material": "algodón",
    "color": "255,255,255"
}
```

Código respuesta:
200 - Prenda creada
400 - Algun dato esta mal
401 - No hay usr logueado
403 - User no tiene permisos

## Como usuarie de QueMePongo quiero ver una prenda en particular que tengo en mi guardarropas para poder editarla

GET /guardarropas/{idGuardarropas}/prendas/{idPrendas}

##### Algo en el body request? 

Código respuesta:
200 : Prenda encontrada
404 : Prenda no encontrada

```
Body respuesta con parametro 157 (JSON):
{
    "id_prenda": 157,
    "tipo": "pantalon",
    "material": "algodón",
    "color": "255,255,255"
}
```

## Como usuarie de QueMePongo, quiero poder eliminar una prenda de mi guardarropas

DELETE /guardarropas/{idGuardarropas}/prendas/{idPrendas}

##### Creo que no habria necesidad de body request

Código respuesta:
200 : Ok, Prenda encontrada y eliminada
404 : Prenda no encontrada

BODY RESPUESTA

## Como usuarie de QueMePongo, quiero poder ver mis eventos para administrarlos

GET /usuario/{idUsuario}/eventos

###### Como body del request podria restringirse que campos mostrar en el body de la respuesta

Código respuesta:
200 : Eventos encontrados
404 : Eventos no encontrados

```Json (Ejemplo)
[
    {
        "id_evento": 1,
        demas campos del evento
        ...
    }
    ,
    ...
]  
```

# Como usuarie de QueMePongo, quiero poder abrir las sugerencias de prendas para un evento en mi navegador

GET /usuario/{idUsuario}/eventos/{idEvento}/sugerencias

###### Como body del request podria restringirse que campos mostrar en el body de la respuesta

Código respuesta:
200 : Sugerencias encontradas
404 : Sugerencias no encontradas

```json
[
    {
    "id_sugerencia": 1,
    demas campos de la sugerencia
    ...
  },
  ...
]
```