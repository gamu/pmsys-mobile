## **Структура сущностей бэкенда**

### **1. Пользователь (User)**
- **Поля:**
  - `id: UUID`
  - `username: String`
  - `password: String (захешированный)`
  - `role: String` (например, "Руководитель" или "Специалист")
  - `createdAt: Timestamp`
  - `updatedAt: Timestamp`

- **Отношения:**
  - Один пользователь может быть ответственным за несколько инцидентов.

---

### **2. Инцидент (Incident)**
- **Поля:**
  - `id: UUID`
  - `title: String` (краткое описание)
  - `description: String` (детальное описание)
  - `attachments: List<String>` (ссылки на вложения)
  - `deadline: Timestamp`
  - `status: String` (например, "Открыт", "В работе", "Закрыт")
  - `priority: String` (например, "Зеленый", "Оранжевый", "Красный", "Бордовый")
  - `assignedTo: UUID` (ссылка на пользователя-ответственного)
  - `createdAt: Timestamp`
  - `updatedAt: Timestamp`

- **Отношения:**
  - Принадлежит одному ответственному пользователю.

---

### **3. План работ (WorkPlan)**
- **Поля:**
  - `id: UUID`
  - `month: String` (например, "Февраль 2025")
  - `tasks: List<Task>` (список задач)
  - `createdBy: UUID` (ссылка на руководителя)
  - `createdAt: Timestamp`
  - `updatedAt: Timestamp`

- **Отношения:**
  - Один план связан с несколькими задачами.

---

### **4. Задача (Task)**
- **Поля:**
  - `id: UUID`
  - `workPlanId: UUID` (ссылка на план работ)
  - `title: String` (название задачи)
  - `description: String`
  - `hoursLogged: Float` (количество затраченных часов)
  - `createdAt: Timestamp`
  - `updatedAt: Timestamp`

- **Отношения:**
  - Связана с одним планом работ.

---

### **5. Оповещение (Notification)**
- **Поля:**
  - `id: UUID`
  - `userId: UUID` (получатель уведомления)
  - `incidentId: UUID` (ссылка на инцидент)
  - `message: String` (текст уведомления)
  - `isRead: Boolean` (прочитано или нет)
  - `sentAt: Timestamp`

---

## Диаграмма классов приложения

![](./images/pmsys_mobile_classes.svg)
