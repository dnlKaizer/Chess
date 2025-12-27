# Xadrez Online – Spring Boot + Angular

## Visão Geral

Este projeto consiste no desenvolvimento de um **jogo de xadrez online**, com **backend em Spring Boot** e **frontend em Angular**, permitindo partidas em tempo real entre jogadores. O foco principal é **implementar corretamente todas as regras oficiais do xadrez**, oferecer **gestão de salas de jogo**, **comunicação em tempo real** e uma **interface moderna e agradável**.

O sistema foi pensado com uma arquitetura modular, visando **manutenibilidade**, **testabilidade** e **possível evolução futura** (ranking, histórico de partidas, IA, etc.).

---

## Objetivos do Projeto

* Implementar fielmente as **regras oficiais do xadrez**
* Permitir partidas **multiplayer em tempo real**
* Gerenciar **salas de jogo** (criação, entrada, saída)
* Controlar **tempo de jogo** (relógio de xadrez)
* Detectar automaticamente **vitórias, derrotas e empates**
* Desenvolver uma **interface intuitiva, responsiva e visualmente agradável**

---

## Regras do Jogo Implementadas

### Movimentação de Peças

* Peão (incluindo **en passant**)
* Torre
* Cavalo
* Bispo
* Rainha
* Rei
* **Promoção de peão**
* **Roque curto e longo**, respeitando todas as restrições

### Estados de Xeque

* Xeque
* Xeque-mate
* Afogamento (stalemate)

---

## Condições de Fim de Jogo

### Vitória

* **Xeque-mate**
* **Vitória por tempo** (oponente excede o tempo)
* **Abandono do oponente**

### Derrota

* Xeque-mate sofrido
* Estouro de tempo
* Abandono / desistência

### Empate

* **Acordo entre os jogadores**
* **Afogamento (stalemate)**
* **Material insuficiente** (ex.: Rei vs Rei, Rei e Bispo vs Rei)
* **Repetição tripla de posição**
* **Regra dos 50 lances** (sem captura ou movimento de peão)

> *Essas condições cobrem todos os finais oficiais previstos pelas regras da FIDE.*

---

## Arquitetura do Sistema

### Backend – Spring Boot

Responsável pela lógica do jogo e comunicação em tempo real.

**Principais responsabilidades:**

* Motor de regras do xadrez
* Validação de jogadas
* Controle de estado da partida
* Gestão de salas
* Controle de tempo
* Detecção de fim de jogo
* Comunicação em tempo real (WebSocket)

**Tecnologias:**

* Java 21+
* Spring Boot
* Spring WebSocket / STOMP
* Spring Security (opcional / futuro)
* JPA / Hibernate (se houver persistência)

---

### Frontend – Angular

Responsável pela interface do usuário e interação com o jogador.

**Principais funcionalidades:**

* Tabuleiro interativo
* Destaque de movimentos válidos
* Atualização em tempo real das jogadas
* Relógio de jogo
* Interface de criação/entrada em salas
* Indicação visual de xeque, xeque-mate e fim de jogo

**Tecnologias:**

* Angular
* TypeScript
* RxJS
* WebSocket
* HTML5 / SCSS

---

## Comunicação em Tempo Real

A comunicação entre jogadores é feita via **WebSocket**, garantindo:

* Atualização instantânea das jogadas
* Sincronização do estado do tabuleiro
* Controle preciso do tempo
* Notificação de eventos (xeque, fim de jogo, abandono)

---

## Funcionalidades Futuras (Roadmap)

* Sistema de login e autenticação
* Ranking e ELO
* Histórico de partidas
* Modo espectador
* Chat entre jogadores
* Partidas contra IA
* Suporte a diferentes controles de tempo (bullet, blitz, rapid)

---

## Como Executar o Projeto

### Backend

```bash
cd backend
./mvnw spring-boot:run
```

### Frontend

```bash
cd frontend
npm install
ng serve
```

---

## Autor

**Danilo Kaizer**
Projeto acadêmico / pessoal com foco em engenharia de software, arquitetura e algoritmos.

---

## Considerações Finais

Este projeto busca não apenas implementar um jogo de xadrez funcional, mas também servir como um **estudo completo de backend, frontend, regras de negócio complexas e sistemas em tempo real**.
