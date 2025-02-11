# Монорепозиторий Kotlin Multiplatform с Backend и инфраструктурой

Ниже описана примерная структура монорепозитория, в котором присутствуют следующие части:

- **Kotlin Multiplatform (KMM)**-модуль с общей логикой (модели, бизнес-логика, DTO).
- **Android**-приложение и **iOS**-приложение, использующие общий KMM-модуль.
- **Backend** (например, на Ktor или Spring Boot).
- **Инфраструктурные** файлы (Docker, Kubernetes и т. п.).
- **Документация** по проекту.

---

## Структура репозитория

```plaintext
pmsys-mobile/
│
├─ build.gradle.kts
├─ settings.gradle.kts
│
├─ docs/                // Папка для документации
│
├─ common/              // Общие модули (KMM, domain, DTO и т.д.)
│   └─ shared/          // Kotlin Multiplatform (KMM) модуль
│       ├─ build.gradle.kts
│       └─ src/
│           ├─ commonMain/
│           ├─ androidMain/
│           ├─ iosMain/
│           └─ ...
│
├─ androidApp/          // Android-приложение
│   ├─ build.gradle.kts
│   └─ src/
│       ├─ main/
│       └─ ...
│
├─ iosApp/              // iOS-приложение (Kotlin Native / Xcode)
│   └─build.gradle.kts // (опционально, можно настроить в Xcode)
│
├─ backend/             // Серверная часть (Ktor / Spring Boot и т.п.)
│   ├─ build.gradle.kts
│   └─ src/
│       ├─ main/
│       └─ test/
│
├─ tools/               // Служебные скрипты, CI/CD, прочие утилиты
│   └─ infra/           // Определения IaaS (Docker, Kubernetes и т.п.)
│      └─ docker-compose.yml
│
└─ README.md            // Общая информация о проекте
