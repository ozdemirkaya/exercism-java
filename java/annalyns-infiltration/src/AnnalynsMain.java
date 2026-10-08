public class AnnalynsMain {
    public static void main(String[] args) {
        // Task 1 Testi: canFastAttack
        System.out.println("=== Task 1 ===");
        boolean knightIsAwake = true;
        System.out.println("Beklenen: false | Sonuç: " + AnnalynsInfiltration.canFastAttack(knightIsAwake));
        System.out.println("Beklenen: true  | Sonuç: " + AnnalynsInfiltration.canFastAttack(false));

        // Task 2 Testi: canSpy
        System.out.println("\n=== Task 2 ===");
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println("Beklenen: true  | Sonuç: " + AnnalynsInfiltration.canSpy(false, archerIsAwake, prisonerIsAwake));
        System.out.println("Beklenen: false | Sonuç: " + AnnalynsInfiltration.canSpy(false, false, false));

        // Task 3 Testi: canSignalPrisoner
        System.out.println("\n=== Task 3 ===");
        archerIsAwake = false;
        prisonerIsAwake = true;
        System.out.println("Beklenen: true  | Sonuç: " + AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println("Beklenen: false | Sonuç: " + AnnalynsInfiltration.canSignalPrisoner(true, prisonerIsAwake));

        // Task 4 Testi: canFreePrisoner
        System.out.println("\n=== Task 4 ===");
        // Senaryo: Okçu uyanık, köpek yok -> kurtarılamaz
        System.out.println("Beklenen: false | Sonuç: " + AnnalynsInfiltration.canFreePrisoner(false, true, false, false));
        // Senaryo: Köpek var, okçu uyuyor -> kurtarılır
        System.out.println("Beklenen: true  | Sonuç: " + AnnalynsInfiltration.canFreePrisoner(true, false, false, true));
        // Senaryo: Köpek yok, gardiyanlar uyuyor, tutsak uyanık -> kurtarılır
        System.out.println("Beklenen: true  | Sonuç: " + AnnalynsInfiltration.canFreePrisoner(false, false, true, false));
    }
}