#  Simulador de Corrida em Java

Este é um projeto em Java que simula uma corrida entre dois carros diretamente no console.  
A cada rodada, os carros avançam uma distância aleatória até que um deles (ou ambos) atinjam a linha de chegada.

---

## Descrição:

O programa utiliza a classe `Random` para gerar avanços aleatórios (entre 1 e 3 unidades) para cada carro.  
A corrida é exibida no console, com cada carro representado pelo símbolo `#`, movendo-se para frente a cada iteração.

Ao final, o programa anuncia o vencedor ou se houve empate.

---

## Funcionamento:

1. Dois carros (`carro1` e `carro2`) são criados com distância inicial igual a 0.  
2. Um limite de chegada (`distanciaMaxima`) é definido — neste caso, **28 unidades**.  
3. Em cada loop:
   - Cada carro avança uma distância aleatória entre **1 e 3 unidades**.
   - O progresso é impresso no console.
4. Quando um dos carros ultrapassa a distância máxima, a corrida termina.  
5. O programa exibe o resultado:
   - **"Carro 1 ganhou"**
   - **"Carro 2 ganhou"**
   - ou **"Carro 1 e Carro 2 empataram"**

