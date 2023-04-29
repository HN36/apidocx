package io.apidocx.base.sdk.rap2;

public interface Rap2Constants {

    String GetCaptcha = "/rap2_delos/captcha";
    String LoginPath = "/rap2_delos/account/login";

    static boolean isLoginPath(String path) {
        return LoginPath.equals(path);
    }

    static boolean isCaptchaPath(String path) {
        return GetCaptcha.equals(path);
    }
}
