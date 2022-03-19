# TestingApp

## Automatización de página de registro uTest
Durante el desarrollo de la automatización del registro, tuve algunos problemas con elementos que detectaba como deshabilitados o que no se podian interactuar, dada mi poca experiencia con las herramientas, tuve que recurrir a algunas ayudas que encontre en la web especificamente `Stack Overflow`.

Intente basarme en las guias facilitadas por `Choucair`, durante la implementación tuve algunos inconvenientes separando cada paso en distintas pruebas, por lo cual la prueba principal es un poco grande, adicional a esto intente implementar una prueba para validar el usuario registrado, pero por cuestiones de tiempo no alcance a obtener el resultado esperado, de igual manera la deje en el código.

## Historia de Usuario
#Formulario de registro para usuarios nuevos

Tipo: historia de usuario
Prioridad: critica
Estado: pendiente

Descripción: como usuario final quiero poder crear un nuevo usuario
en el formulario, con mis datos personales.

Alcance:
|  |  |
| ------------- | ------------- |
| Paginas afectadas | Formulario de registro |
| Móvil  | Si  |
| Escritorio  | Si |
| Sitio web   | utest.com |

Criterios de aceptación

1.	Dado el formulario de registro
Cuando el usuario nuevo ingresa información que no cumple con la validación del campo en el registro del formulario
Entonces los campos deben mostrarse los mensajes de error

2.	Dado el formulario de registro
Cuando el usuario complete los datos de registro
Entonces debe quedar guardada su información en el sistema
