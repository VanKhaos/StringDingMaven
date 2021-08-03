package de.thunderfrog;

public class MyAppInfo {
    /**
     * Information about the App
     *
     * @param appName    App Title Name
     * @param appAuthor  App Creator
     * @param appVersion App Version
     */
    public static void createAppInfo(String appName, String appAuthor, String appVersion) {
        MyApp app = new MyApp();
        app.setAppName(appName);
        app.setAppAuthor(appAuthor);
        app.setAppVersion(appVersion);

        System.out.println("AppName: " + app.getAppName());
        System.out.println("AppAuthor: " + app.getAppAuthor());
        System.out.println("AppVersion " + app.getAppVersion());
    }
}