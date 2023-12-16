**Бизнес-логика:**

* Создание Чата:
Позволяет пользователям создавать новые чаты с уникальными именами.

* Управление Участниками Чата:
Добавление новых участников в чат по их идентификаторам или именам.

* Отправка Сообщений:
Отправка сообщений в чат от определенного пользователя.
Связывание сообщений с конкретным чатом, отправителем и получателем.

* Получение Информации о Чате:
Получение информации о чате по его уникальному идентификатору.
Получение списка участников и сообщений в чате.


Технолиогии:
Java: Основной язык программирования.
Spring Framework (Spring Boot): Используется для создания веб-приложений на Java. Включает инструменты для веб-разработки, управления зависимостями, взаимодействия с базой данных и т. д.
Hibernate (JPA): Предоставляет удобные методы для взаимодействия с базой данных с помощью Java-объектов (ORM).
RESTful API: Вероятно, используется для создания веб-сервисов, обеспечивающих взаимодействие с клиентами посредством HTTP-запросов.
JSON: Формат данных, используемый для обмена информацией между клиентом и сервером. Вероятно, используется для передачи данных между клиентом и сервером.
PostgreSQL: Для хранения данных.



Json 

Создание Чата:
http://localhost:8080/api/createChat
{
  "chatName": "Название чата"
}

Отправка Сообщения:
http://localhost:8080/api/sendMessage
{
    "chatId": 2,
    "senderId": 3,
    "receiverId": 1,
		"content": "Kak dela?"
}
Создание Юзера:
http://localhost:8080/api/createUser
{
    "userName": "Сека"
}

Получения всех сообщения из конкретного чата:
http://localhost:8080/api/chatMessages/2
Get запрос