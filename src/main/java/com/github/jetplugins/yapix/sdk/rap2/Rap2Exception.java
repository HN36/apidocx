package com.github.jetplugins.yapix.sdk.rap2;

/**
 * Yapi客户端基异常
 */
public class Rap2Exception extends RuntimeException {

    private String path;
    private String msg;

    public Rap2Exception(String path, String msg) {
        super(msg);
        this.path = path;
        this.msg = msg;
    }

    public Rap2Exception(String path, String message, Throwable cause) {
        super(message, cause);
        this.path = path;
    }

    public boolean isNeedAuth() {
        return msg != null && msg.contains("没有访问权限");
    }

    public String getPath() {
        return path;
    }

    public String getMsg() {
        return msg;
    }
}
