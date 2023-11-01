public class Glass {
    public static void main(String[] args) {
        final int glassVolume = 200; // - милилитров вмещает стакан
        final double filledVolume = 66.5; // - процентов
        final double glassFilled = glassVolume * filledVolume / 100; // - милитров

        System.out.println("Обьем стакана " + glassVolume + " милилитров");
        System.out.println("Стaкан заполнен на " + filledVolume + " процентов");
        System.out.println(glassFilled + " милилитров воды в стакане");
    }
}