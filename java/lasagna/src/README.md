# Cook Your Lasagna

This exercise is part of the Java track on Exercism.

Bu egzersiz Exercism Java öğrenme yolunun bir parçasıdır.

---

# English

## Task 1 — Define the expected oven time in minutes

Define the `expectedMinutesInOven()` method that does not take any parameters and returns how many minutes the lasagna should be in the oven.

According to the cooking book, the expected oven time is **40 minutes**.

### Example

```java
Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40
```

---

## Task 2 — Calculate the remaining oven time in minutes

Define the `remainingMinutesInOven()` method that takes the actual number of minutes the lasagna has been in the oven as a parameter.

The method should return how many minutes the lasagna still needs to remain in the oven, based on the expected oven time from the previous task.

### Example

```java
Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10
```

---

## Task 3 — Calculate the preparation time in minutes

Define the `preparationTimeInMinutes()` method that takes the number of layers added to the lasagna as a parameter.

Assume that each layer takes **2 minutes** to prepare.

The method should return the total preparation time in minutes.

### Example

```java
Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4
```

---

## Task 4 — Calculate the total working time in minutes

Define the `totalTimeInMinutes()` method that takes two parameters:

- The number of layers added to the lasagna.
- The number of minutes the lasagna has already spent in the oven.

The method should return the total amount of time spent working on the lasagna.

The total working time is the sum of:

- The preparation time.
- The time the lasagna has already spent in the oven.

### Example

```java
Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26
```

---

# Türkçe

## Görev 1 — Beklenen fırında pişme süresini belirle

Herhangi bir parametre almayan `expectedMinutesInOven()` metodunu tanımla.

Bu metot lazanyanın fırında toplam kaç dakika kalması gerektiğini döndürmelidir.

Tarife göre lazanyanın beklenen fırında pişme süresi **40 dakikadır**.

### Örnek

```java
Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40
```

---

## Görev 2 — Fırında kalan süreyi hesapla

Lazanyanın şu ana kadar fırında kaldığı dakika sayısını parametre olarak alan `remainingMinutesInOven()` metodunu tanımla.

Metot, önceki görevde belirlenen toplam fırında pişme süresini dikkate alarak lazanyanın fırında daha kaç dakika kalması gerektiğini döndürmelidir.

### Örnek

```java
Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10
```

---

## Görev 3 — Hazırlık süresini hesapla

Lazanyaya eklenen katman sayısını parametre olarak alan `preparationTimeInMinutes()` metodunu tanımla.

Her bir katmanı hazırlamanın **2 dakika** sürdüğünü varsay.

Metot toplam hazırlık süresini dakika cinsinden döndürmelidir.

### Örnek

```java
Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4
```

---

## Görev 4 — Toplam çalışma süresini hesapla

İki parametre alan `totalTimeInMinutes()` metodunu tanımla:

- Lazanyaya eklenen katman sayısı.
- Lazanyanın şu ana kadar fırında kaldığı dakika sayısı.

Metot, lazanyayı hazırlamak için toplamda kaç dakika harcandığını döndürmelidir.

Toplam süre şu iki sürenin toplamıdır:

- Hazırlık süresi.
- Lazanyanın şu ana kadar fırında geçirdiği süre.

### Örnek

```java
Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26
```