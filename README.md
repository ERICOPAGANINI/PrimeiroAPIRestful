# Minha Primeira APIRestful

## Diagrama de Classes
```mermaid
classDiagram
    User "1" --> "1" Account
    User "1" --> "1" Card
    User "1" --> "0..*" Feature
    User "1" --> "0..*" News

    class User {
        -String name
    }

    class Account {
        -String number
        -String agency
        -Float balance
        -Float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -Float limit
    }

    class News {
        -String icon
        -String description
    }
```
