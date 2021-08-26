# keycloak-mercadolibre

Extension de Keycloak para añadir proveedor de identidad de Mercado Libre para realizar Single Sign On.

## Instalacion

Seguir los pasos para configurar en cliente en mercado libre y añadir los endpoints respectivos en la configuración de la
extensión de Keycloak.

Revisar documentación de autenticacion y autorizacion de Mercado libre en Anexos

## Construcción de ejecutable

Para construir el ejecutable, debes de clonar el repositorio y ejecutar 
```
mvn package
```
con eso podrás obtener el ejectuable dentro del directorio "ear/target".

## Anexos

- [Documentación de OAuth2 Mercado Libre](https://developers.mercadolibre.cl/autenticacion-y-autorizacion)
- [Instalación de extensiones en Keycloak](https://www.keycloak.org/docs/12.0/server_development/#_extensions)

## Consideraciones

Esta extension fue probada en Keycloak 12.0.4, debería poder correr en versiones anteriores.
Cualquier detalle, dejar un pull request.

## Agradecimientos

Este proyecto es una refactorizacion del repositorio https://github.com/wadahiro/keycloak-discord para utilizar mercado libre como SSO.

## Autor

- [Juan Carlos Olguín](https://jolguin.tk)