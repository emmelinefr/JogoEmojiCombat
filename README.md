
# 🥊 EmojiCombat

O **EmojiCombat** é um simulador de lutas desenvolvido em Java, projetado para demonstrar conceitos fundamentais de **Programação Orientada a Objetos (POO)** de forma clara e organizada. O sistema gerencia lutadores, categorias e lutas, aplicando regras de validação e resultados aleatórios.

---

## 🎯 Objetivo do Projeto

O projeto foi criado com foco em:

- Praticar conceitos de POO  
- Demonstrar encapsulamento, classes, métodos e interações entre objetos  
- Criar uma lógica simples e funcional de simulação de combate  
- Servir como projeto base para estudos e evolução futura  

---

## ⚙️ Funcionalidades

- Cadastro de lutadores com:
  - Nome  
  - Nacionalidade  
  - Idade  
  - Altura  
  - Peso  
  - Histórico (vitórias, derrotas e empates)

- Classificação automática por categoria (Leve, Médio, Pesado…)  
- Validação de lutas entre lutadores da mesma categoria  
- Simulação de luta com resultado aleatório  
- Atualização automática das estatísticas após cada combate  
- Exibição estruturada das informações no console  

---

## 🧩 Estrutura do Projeto

```

src/
├── com.backend.emojicombat.logica
│   ├── Lutador.java        // Representa um lutador e seu estado
│   └── Luta.java           // Gerencia validação e execução das lutas
└── com.backend.emojicombat.terminal
└── EmojiCombat.java     // Classe principal (ponto de entrada)

```

---

## ▶️ Como Executar

1. Certifique-se de ter o **Java 17+** instalado.  
2. Importe o projeto em sua IDE de preferência (IntelliJ, Eclipse, VSCode).  
3. Execute o arquivo:

```

EmojiCombat.java

````

4. A simulação será exibida diretamente no console.

---

## 📄 Exemplo de Uso

```java
Luta luta = new Luta();
luta.marcarLuta(lutadorA, lutadorB);
luta.lutar();
````

---

## 🛠 Tecnologias Utilizadas

* **Java 17+**
* Programação Orientada a Objetos

---

## 🚀 Possíveis Evoluções

* Interface gráfica
* Sistema de ranking entre lutadores
* Modo campeonato
* Persistência em banco de dados
* API REST em Spring Boot
* Testes unitários (JUnit)

---

## 📌 Finalidade

Este projeto faz parte do meu portfólio e demonstra minha capacidade em:

* Organizar código
* Implementar lógica orientada a objetos
* Modelar entidades e regras de negócio
* Construir sistemas limpos e extensíveis

