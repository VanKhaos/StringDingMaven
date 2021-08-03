package de.thunderfrog;

public class AppName {

    private String appName;
    private String appVersion;
    private String appAuthor;

    public AppName(String appName, String appVersion, String appAuthor) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appAuthor = appAuthor;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppAuthor() {
        return appAuthor;
    }

    public void setAppAuthor(String appAuthor) {
        this.appAuthor = appAuthor;
    }
}
