# Annalyn's Infiltration

This exercise is part of the Java track on Exercism.

Bu egzersiz Exercism Java öğrenme yolunun bir parçasıdır.

---

# English

## Task 1 — Check if a fast attack can be made

Implement the static `AnnalynsInfiltration.canFastAttack()` method.

The method takes one boolean parameter indicating whether the knight is awake.

It should return `true` if a fast attack can be made based on the state of the knight. Otherwise, it should return `false`.

### Example

```java
boolean knightIsAwake = true;

AnnalynsInfiltration.canFastAttack(knightIsAwake);
// => false
```

---

## Task 2 — Check if the group can be spied upon

Implement the static `AnnalynsInfiltration.canSpy()` method.

The method takes three boolean parameters indicating whether:

- The knight is awake.
- The archer is awake.
- The prisoner is awake.

The method should return `true` if the group can be spied upon based on the state of the three characters. Otherwise, it should return `false`.

### Example

```java
boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;

AnnalynsInfiltration.canSpy(
    knightIsAwake,
    archerIsAwake,
    prisonerIsAwake
);
// => true
```

---

## Task 3 — Check if the prisoner can be signaled

Implement the static `AnnalynsInfiltration.canSignalPrisoner()` method.

The method takes two boolean parameters indicating whether:

- The archer is awake.
- The prisoner is awake.

The method should return `true` if the prisoner can be signaled based on the state of the two characters. Otherwise, it should return `false`.

### Example

```java
boolean archerIsAwake = false;
boolean prisonerIsAwake = true;

AnnalynsInfiltration.canSignalPrisoner(
    archerIsAwake,
    prisonerIsAwake
);
// => true
```

---

## Task 4 — Check if the prisoner can be freed

Implement the static `AnnalynsInfiltration.canFreePrisoner()` method.

The method takes four boolean parameters.

The first three indicate whether:

- The knight is awake.
- The archer is awake.
- The prisoner is awake.

The last parameter indicates whether Annalyn's pet dog is present.

The method should return `true` if the prisoner can be freed based on the state of the three characters and the presence of Annalyn's pet dog. Otherwise, it should return `false`.

### Example

```java
boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean petDogIsPresent = false;

AnnalynsInfiltration.canFreePrisoner(
    knightIsAwake,
    archerIsAwake,
    prisonerIsAwake,
    petDogIsPresent
);
// => false
```

---

# Türkçe

## Görev 1 — Hızlı saldırı yapılıp yapılamayacağını kontrol et

Statik `AnnalynsInfiltration.canFastAttack()` metodunu oluştur.

Metot, şövalyenin uyanık olup olmadığını belirten bir boolean parametre alır.

Şövalyenin durumuna göre hızlı saldırı yapılabiliyorsa `true`, yapılamıyorsa `false` döndürmelidir.

### Örnek

```java
boolean knightIsAwake = true;

AnnalynsInfiltration.canFastAttack(knightIsAwake);
// => false
```

---

## Görev 2 — Grubun gözetlenip gözetlenemeyeceğini kontrol et

Statik `AnnalynsInfiltration.canSpy()` metodunu oluştur.

Metot üç boolean parametre alır:

- Şövalye uyanık mı?
- Okçu uyanık mı?
- Mahkum uyanık mı?

Metot, bu üç karakterin durumuna göre grup gözetlenebiliyorsa `true`, aksi durumda `false` döndürmelidir.

### Örnek

```java
boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;

AnnalynsInfiltration.canSpy(
    knightIsAwake,
    archerIsAwake,
    prisonerIsAwake
);
// => true
```

---

## Görev 3 — Mahkuma sinyal verilip verilemeyeceğini kontrol et

Statik `AnnalynsInfiltration.canSignalPrisoner()` metodunu oluştur.

Metot iki boolean parametre alır:

- Okçu uyanık mı?
- Mahkum uyanık mı?

Metot, bu iki karakterin durumuna göre mahkuma sinyal verilebiliyorsa `true`, aksi durumda `false` döndürmelidir.

### Örnek

```java
boolean archerIsAwake = false;
boolean prisonerIsAwake = true;

AnnalynsInfiltration.canSignalPrisoner(
    archerIsAwake,
    prisonerIsAwake
);
// => true
```

---

## Görev 4 — Mahkumun kurtarılıp kurtarılamayacağını kontrol et

Statik `AnnalynsInfiltration.canFreePrisoner()` metodunu oluştur.

Metot dört boolean parametre alır.

İlk üç parametre sırasıyla şunları belirtir:

- Şövalye uyanık mı?
- Okçu uyanık mı?
- Mahkum uyanık mı?

Son parametre ise Annalyn'in evcil köpeğinin orada olup olmadığını belirtir.

Metot, üç karakterin durumuna ve Annalyn'in köpeğinin varlığına göre mahkum kurtarılabiliyorsa `true`, aksi durumda `false` döndürmelidir.

### Örnek

```java
boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean petDogIsPresent = false;

AnnalynsInfiltration.canFreePrisoner(
    knightIsAwake,
    archerIsAwake,
    prisonerIsAwake,
    petDogIsPresent
);
// => false
```