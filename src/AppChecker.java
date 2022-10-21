public class AppChecker {

    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Calculator");
        android.runAndroidApp();
        android.appInfo();

        IphoneApp iphone = new IphoneApp("Stoper");
        iphone.runIphoneApp();
        iphone.appInfo();
    }
}
