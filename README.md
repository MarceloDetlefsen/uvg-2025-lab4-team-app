# TeamApp - Ejercicio de GitHub con Android y Compose

## 🎯 Objetivo
Este ejercicio tiene como objetivo practicar **colaboración con Git y GitHub** dentro de un proyecto Android nativo con **Kotlin y Jetpack Compose**.  
Los estudiantes trabajarán en equipo, utilizando ramas, commits, Pull Requests y revisiones de código, simulando un flujo de trabajo real.

## 🚀 Instrucciones
1. Crea un fork del repositorio de GitHub y clonalo en tu computadora.
2. Crea una rama con tu nombre o con el nombre de la funcionalidad que te corresponda (ejemplo: `feature/nombre-lista`).
3. Implementa la parte del proyecto que te fue asignada (modelo, repositorio, UI, etc.).
4. Haz commits pequeños y descriptivos de tus cambios.
5. Abre un Pull Request (PR) hacia la rama `develop`. Otro compañero debe revisarlo antes de hacer merge.
6. Una vez que todas las *features* estén integradas en `develop`, el equipo debe abrir un PR final hacia `main` del repositorio original.
7. El repositorio debe incluir:
    - Capturas de pantalla de la app corriendo (lista y detalle).
    - Evidencias de los PRs y revisiones de código.
    - Una breve reflexión en este README sobre lo aprendido.

## 📂 Estructura del proyecto
- `MainActivity.kt`: Contiene la pantalla inicial con un mensaje de bienvenida.
- `strings.xml`: Archivo de recursos de texto.
- `develop` branch: Rama donde se integrarán las features antes de pasar a `main`.

## 📝 Entrega
Al finalizar:
- Agrega en este README:
    - Capturas de pantalla de la app funcionando.
    - Explicación de cómo resolvieron los conflictos y organizaron el flujo de trabajo.
    - Reflexión del equipo sobre lo aprendido.

## 📱 Capturas de pantalla de la app funcionando.

![mainscreen](https://github.com/user-attachments/assets/2e0e238a-475b-4418-97e8-7e5d802e0e0b)

![alejandrodescription](https://github.com/user-attachments/assets/dc3b89b6-8673-4b95-8ec5-afc9cdd3e902)

![marcelodescription jgp](https://github.com/user-attachments/assets/00787bc2-165f-4364-bbec-15e602d75e82)

![juliandescripition](https://github.com/user-attachments/assets/3e937ce1-2e6b-4b21-9dcf-e9ff3d4e60fc)

## 🛠️ Organización del flujo de trabajo
Para este laboratorio se dividieron los features a desarrollar entre los distintos integrantes del grupo. De esta manera con cada feature se creó una nueva rama para su desarrollo y posteriormente realizar una pull request hacia la rama develop. De esta manera se controló de mejor manera el contenido desarrollado a la vez que su orden y cada integrante pudo revisar un PR distinto, de manera que los integrantes aprobaran el contenido desarrollado media vez este se haya calificado como correcto hasta completar el desarrollo.

## ❌ Resolución de conflictos
Para resolver los conflictos en primera instancia se identificó el lugar donde se generó. Al navegar al punto del conflicto se contrastaron las diferencias por las que se generó el conflicto, como distintas lineas de código modificadas que fue el conflicto más visto en esta práctica. En este momento decidimos si mantener una de las versiones de la rama, combinarlas o reescribir esa área de conflicto para eliminarlo. Finalmente se completaron los merges y se subieron los cambios realizados. Si bien en esta práctica no hubieron conflictos muy dificultosos de resolver, es una buena práctica para futuros problemas que podrían surgir.

## 🤓☝️ Reflexión sobre lo aprendido
Durante el laboratorio 4 se aprendió a utilizar un flujo de trabajo adecuado en un repositorio. Si bien anteriormente se conocían los pull request, no sabíamos como aplicarlos correctamente. Gracias a esta práctica comprendimos mejor como se trabaja de forma profesional con las ramas en un repositorio, mediante la creación de estas para cada funcionalidad desarrollada. Tambien, es buena practica realizar merges a través de los pull requests para asegurarse de aplicar cambios revisdos.
