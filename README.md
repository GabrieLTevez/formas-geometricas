# Formas Geométricas

Programa em Java, executado no terminal, que demonstra os pilares da **Programação Orientada a Objetos** (herança, polimorfismo, abstração e encapsulamento) por meio do cadastro e da consulta de formas geométricas 2D e 3D.

## Funcionalidades

Menu interativo com as opções:

| Opção | Descrição |
|-------|-----------|
| 1 | Cadastrar uma forma (2D ou 3D) |
| 2 | Mostrar descrições de todas as formas |
| 3 | Mostrar áreas (formas bidimensionais) |
| 4 | Mostrar volumes (formas tridimensionais) |
| 5 | Verificar interseções entre círculos e entre esferas |
| 0 | Sair |

### Formas disponíveis

- **Bidimensionais:** Círculo, Quadrado, Triângulo
- **Tridimensionais:** Esfera, Cubo, Tetraedro

## Estrutura do projeto

```
formas-geometricas/
├── README.md
├── .gitignore
└── src/a1/
    ├── Main.java                 # Ponto de entrada
    ├── Menu1.java                # Menu e interação com o usuário
    ├── Forma.java                # Classe abstrata base (cor, x, y)
    ├── FormaBidimensional.java   # Abstrata: obterArea()
    ├── Circulo.java
    ├── Quadrado.java
    ├── Triangulo.java
    ├── FormaTridimensional.java  # Abstrata: z e obterVolume()
    ├── Esfera.java
    ├── Cubo.java
    └── Tetraedro.java
```

### Hierarquia de classes

```
Forma (abstract)
├── FormaBidimensional (abstract)
│   ├── Circulo
│   ├── Quadrado
│   └── Triangulo
└── FormaTridimensional (abstract)
    ├── Esfera
    ├── Cubo
    └── Tetraedro
```

## Como executar

Requisito: **JDK 8 ou superior**.

```bash
# 1. Clonar o repositório
git clone https://github.com/GabrieLTevez/formas-geometricas.git
cd formas-geometricas

# 2. Compilar
javac -d bin src/a1/*.java

# 3. Executar
java -cp bin a1.Main
```

## Conceitos de POO aplicados

- **Abstração:** `Forma`, `FormaBidimensional` e `FormaTridimensional` são classes abstratas.
- **Herança:** cada forma específica estende sua categoria (2D ou 3D).
- **Polimorfismo:** `exibirDescricao()`, `obterArea()` e `obterVolume()` são sobrescritos em cada subclasse.
- **Encapsulamento:** atributos privados com acesso via getters.

## Autor

Seu Nome — [GitHub](https://github.com/SEU-USUARIO)
