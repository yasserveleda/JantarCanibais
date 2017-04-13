# JantarCanibais
Solução em Java do problema "Jantar dos Canibais"

Problema:

Suponha que um grupo de N canibais come jantares a partir de uma grande travessa que comporta M porções. Quando alguém quer comer, ele(ela) se serve da travessa, a menos que ela esteja vazia. Se a travessa está vazia, o canibal acorda o cozinheiro e espera até que o cozinheiro coloque mais M porções na travessa. Desenvolva o código para as ações dos canibais e do cozinheiro – seserve (chamada por canibal) e enchetravessa (chamada por cozinheiro). A solução deve evitar deadlock e deve acordar o cozinheiro apenas quando a travessa estiver vazia. Suponha um longo jantar, onde cada canibal continuamente se serve e come, sem se preocupar com as demais na vida de um canibal. Dica: Use a primitiva tryacquire() para checar se um semaphoro esta ou não bloqueado.