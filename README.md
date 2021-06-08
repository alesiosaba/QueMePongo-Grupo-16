# TP - Que Me Pongo - Grupo 16

## [QMP1] Que Me Pongo - Primera iteración

https://docs.google.com/document/d/1k1f-9AuIohlBGB2soSNePJ6jLxM37_tZeSD-hW_esIQ

#### Primera Iteración [QMP1]

![QMP1 - Diagrama de clases](https://user-images.githubusercontent.com/62452207/116478174-105a3a80-a854-11eb-9a38-71b039b855b7.png)


## [QMP2] Que Me Pongo - Segunda iteración

https://docs.google.com/document/d/10j6XB9zIhl5xox2xBEDEFsgPmueHMkyvLSHcLxl_27Y/edit#

#### Segunda iteración [QMP2]

![QMP2 - Diagrama de Clases](https://user-images.githubusercontent.com/62452207/116488390-a39d6b00-a868-11eb-8034-edf2c56a682e.png)



## [QMP4] Que Me Pongo - Tercera iteración

https://docs.google.com/document/d/1sy9S9EeIQr8fhatKnfTCgOfjVniJDu2viI-Av0gn0xY/edit

#### Tercera iteración [QMP4]

![QMP4 - Diagrama de Clases](https://user-images.githubusercontent.com/62452207/119730402-0d9b3700-be4c-11eb-94a4-d0e3af7139b2.png)

#### CORRECCIÓN - Tercera iteración [QMP4]

![QMP4  - CORRECIÓN](https://user-images.githubusercontent.com/62452207/121094569-382ead80-c7c5-11eb-8805-d2d57922ce13.png)


## [QMP5] Que Me Pongo - Cuarta iteración

https://docs.google.com/document/d/1wS622pMwZrDK9ilL_hEt5bBE04vKUKZILx8cIQ-aQzU/edit

#### Cuarta iteración [QMP5]

![QMP5](https://user-images.githubusercontent.com/62452207/119746401-ca01f680-be66-11eb-9be7-81574d7e8c6e.png)


## [QMP6] Que Me Pongo - Quinta iteración

https://docs.google.com/document/d/1NxqhJj70kt-_4aw-CawlISdJZyedzoOcLAVJAZVZISE/edit

#### Quinta iteración [QMP6]

![QMP6](https://user-images.githubusercontent.com/62452207/121110393-98344c80-c7e3-11eb-80c0-d6f107933286.png)







# java-base-project

Esta es una plantilla de proyecto diseñada para: 

* Java 8. :warning: Si bien el proyecto no lo limita explícitamente, el comando `mvn verify` no funcionará con versiones mas modernas de Java. 
* JUnit 5. :warning: La versión 5 de JUnit es la más nueva del framework y presenta algunas diferencias respecto a la versión "clásica" (JUnit 4). Para mayores detalles, ver: 
  *  [Apunte de herramientas](https://docs.google.com/document/d/1VYBey56M0UU6C0689hAClAvF9ILE6E7nKIuOqrRJnWQ/edit#heading=h.dnwhvummp994)
  *  [Entrada de Blog (en inglés)](https://www.baeldung.com/junit-5-migration) 
  *  [Entrada de Blog (en español)](https://www.paradigmadigital.com/dev/nos-espera-junit-5/)
* Maven 3.3 o superior

# Ejecutar tests

```
mvn test
```

# Validar el proyecto de forma exahustiva

```
mvn clean verify
```

Este comando hará lo siguiente:

 1. Ejecutará los tests
 2. Validará las convenciones de formato mediante checkstyle
 3. Detectará la presencia de (ciertos) code smells
 4. Validará la cobertura del proyecto

# Entrega del proyecto

Para entregar el proyecto, crear un tag llamado `entrega-final`. Es importante que antes de realizarlo se corra la validación
explicada en el punto anterior. Se recomienda hacerlo de la siguiente forma:

```
mvn clean verify && git tag entrega-final && git push origin HEAD --tags
```
