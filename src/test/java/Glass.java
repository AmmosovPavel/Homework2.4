public class Glass {
    public static void main(String[] args) {
        final int GLASS_VOLUME = 200; // - милилитров вмещает стакан
        final double FILLED_VOLLUME = 75; // - процентов
        final double GLASS_FILLED = GLASS_VOLUME * FILLED_VOLLUME / 100; // - милитров
        System.out.println("Обьем стакана " + GLASS_VOLUME + " милилитров");
        System.out.println("Стaкан заполнен на " + FILLED_VOLLUME + " процентов");
        System.out.println(GLASS_FILLED + " милилитров воды в стакане");

    }
}