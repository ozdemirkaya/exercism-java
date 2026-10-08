# Log Levels

This exercise is part of the Java track on Exercism.

Bu egzersiz Exercism Java öğrenme yolunun bir parçasıdır.

---

# English

## Task 1 — Get message from a log line

Implement the static `LogLevels.message()` method to return the message from a log line.

Any leading or trailing whitespace should be removed.

### Examples

```java
LogLevels.message("[ERROR]: Invalid operation");
// => "Invalid operation"
```

```java
LogLevels.message("[WARNING]:  Disk almost full\r\n");
// => "Disk almost full"
```

---

## Task 2 — Get log level from a log line

Implement the static `LogLevels.logLevel()` method to return the log level from a log line.

The log level should be returned in lowercase.

### Example

```java
LogLevels.logLevel("[ERROR]: Invalid operation");
// => "error"
```

---

## Task 3 — Reformat a log line

Implement the static `LogLevels.reformat()` method.

The method should reformat the log line by putting:

- The message first.
- The log level after the message.
- The log level inside parentheses.

### Example

```java
LogLevels.reformat("[INFO]: Operation completed");
// => "Operation completed (info)"
```

---

# Türkçe

## Görev 1 — Log satırından mesajı al

Log satırındaki mesajı döndüren statik `LogLevels.message()` metodunu oluştur.

Mesajın başındaki ve sonundaki gereksiz boşluklar kaldırılmalıdır.

### Örnekler

```java
LogLevels.message("[ERROR]: Invalid operation");
// => "Invalid operation"
```

```java
LogLevels.message("[WARNING]:  Disk almost full\r\n");
// => "Disk almost full"
```

---

## Görev 2 — Log satırından log seviyesini al

Log satırındaki log seviyesini döndüren statik `LogLevels.logLevel()` metodunu oluştur.

Log seviyesi küçük harflerle döndürülmelidir.

### Örnek

```java
LogLevels.logLevel("[ERROR]: Invalid operation");
// => "error"
```

---

## Görev 3 — Log satırını yeniden biçimlendir

Statik `LogLevels.reformat()` metodunu oluştur.

Metot log satırını şu şekilde yeniden biçimlendirmelidir:

- Önce mesaj gelmelidir.
- Mesajdan sonra log seviyesi gelmelidir.
- Log seviyesi parantez içinde yer almalıdır.

### Örnek

```java
LogLevels.reformat("[INFO]: Operation completed");
// => "Operation completed (info)"
```