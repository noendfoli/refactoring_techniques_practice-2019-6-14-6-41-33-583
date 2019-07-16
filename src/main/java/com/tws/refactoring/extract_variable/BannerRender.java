package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean isIeOnMac = (platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"));
        if (isIeOnMac) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
