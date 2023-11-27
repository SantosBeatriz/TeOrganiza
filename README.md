# TeOrganiza

## Integrantes do grupo 
[Liste o nome completo de todos os integrantes do grupo com seus respectivos e-mails]
 * Ana Beatriz Vieira Santos Silva - Beatriz.vieira@ufrpe.br - Beatriz0103s@gmail.com
 *  Luiz Gonzaga de Souza Silva - gonzagaluiz931@outlook.com

## Descrição geral do projeto 
Qual a principal funcionalidade do seu sistema? 
~ Este sistema visa proporcionar uma experiência eficiente de gerenciamento de tarefas pessoais, oferecendo funcionalidades essenciais e recursos adicionais para melhorar a produtividade e a organização do usuário.

 1. Quem vai usar o programa? 
~ Usuários que necessitam de organização em suas tarefas cotidianas 

 2. Que serviços são “necessários” (leia-se: importantes para os clientes e usuários)?
~ Cadastrar tarefas
~ Programar e alterar prazo da tarefa
~ Notificação caso esteja próximo do prazo
~ Excluir tarefas
~ Sinalizar o status da tarefa.
 


## Requisitos do projeto:
* **REQ1** -  CRUD de Tarefas: O sistema permite ao usuário realizar operações básicas de Create, Read, Update e Delete para suas tarefas.
* **REQ2** -  Datas de Início e Limite: Ao criar uma tarefa, o sistema solicita ao usuário que defina uma data de início e uma data limite para a conclusão da atividade.
* **REQ3** -  Notificações de Prazo: O sistema notifica o usuário quando o prazo de uma tarefa está se aproximando, garantindo que ele esteja ciente das próximas deadlines.
* **REQ4** -  Mudança de Status: Permite ao usuário alterar o status de uma tarefa, classificando-a como "to do," "doing," ou "done."
* **REQ5** -  Categorias e Prioridades: Os usuários podem categorizar suas tarefas e atribuir prioridades, facilitando a organização e identificação das atividades mais importantes.
* **REQ6** -  Notificações Personalizadas: Além das notificações de prazo, os usuários podem personalizar preferências de notificação, como lembretes específicos para determinadas tarefas ou horários do dia.
* **REQ7** -  Integração com Calendário: Integração com aplicativos de calendário populares, como Google Calendar, para sincronização automática de tarefas e prazos.
* **REQ8** -  Histórico de Atividades: Mantém um histórico das atividades concluídas, permitindo que os usuários revisem suas conquistas e visualizem seu progresso ao longo do tempo.
* **REQ9** -  Estatísticas de Produtividade: Fornece estatísticas e gráficos que mostram o tempo médio gasto em tarefas, número de tarefas concluídas, entre outros, para análise do desempenho.
* **REQ10** - Compartilhamento de Tarefas: Adiciona a capacidade de compartilhar tarefas com outros usuários, facilitando a colaboração em projetos ou a delegação de responsabilidades.

## Classes Java Iniciais:
*	Task (Tarefa):
Atributos: ID, descrição, data de início, data limite, status, categoria, prioridade.
Métodos: Criar, atualizar, excluir, definir status.
*	User (Usuário):
Atributos: ID, nome de usuário, senha, preferências de notificação.
Métodos: Autenticar, gerenciar tarefas, visualizar estatísticas.
*	NotificationService (Serviço de Notificação):
Métodos: Enviar notificações de prazo.
*	TaskManager (Gerenciador de Tarefas):
Métodos: CRUD de tarefas, gerar relatórios estatísticos, integrar com o calendário.
*	TaskHistory (Histórico de Tarefas):
Métodos: Registrar tarefas concluídas, recuperar histórico.


