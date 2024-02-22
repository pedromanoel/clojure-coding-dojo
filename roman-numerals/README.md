# roman-numerals-kata

## Projektaufbau

* Sourcecode: `src/roman/core.clj`
* Tests: `test/roman/core_test.clj`

Einen ersten Test haben wir schonmal in core_test.clj angelegt.

## IDE

Eine vorgefertigte Web-IDE kann mit `lein nightlight` gestartet werden. Unter
[http://localhost:4000](http://localhost:4000) ist die IDE dann zu erreichen.

## Ping-Pong-Ablauf

1. Você escreve um teste com falha.
2. Você passa o teclado para o seu parceiro.
3. Seu parceiro agora escreve código que atende aos testes.
4. Vocês consideram juntos se uma refatoração faz sentido e seu parceiro realiza a refatoração.
5. O processo começa do início com os papéis invertidos, ou seja, seu parceiro agora escreve um teste e então as coisas mudam.
6. O método convert deve ser implementado. É fornecido um número inteiro entre 1 e 50 e gera a representação do número no sistema de numeração romana. A string vazia deve ser retornada para entrada inválida.

Os numerais do sistema de numeração romana são: I (1), V (5) X (10) e 50 (L). Um máximo de três dígitos idênticos são escritos em uma linha, então a regra de subtração se aplica, ou seja, um único I pode ser escrito na frente de um V ou de um X, ou um único X na frente de um L. Por exemplo, a regra da subração produz os números 4 (IV), 9 (IX), 40 (XL).

Mais alguns exemplos: 14 = 10 + 4 (XIV), 39 = 30 + 9 (XXXIX), 44 = 40 + 4 (XLIV).

## Auto-Test

Um die Tests automatisch auszuführen könnt ihr built-in Funktionen eures Editors
verwenden oder das Plugin lein-test-refresh auf der Konsole ausführen:

    lein test-refresh
    
Jede Änderung im Code triggert dieses Plugin und eure Tests werden erneut
ausgeführt.
