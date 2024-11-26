package com.do_again_first.the_first.Exception;

public enum ErrorCode {
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTED(1002,"User existed"),
    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized exception"),
    USERNAME_INVALID(1003,"Username must be at least 3 characters"),
    INVALID_PASSWORD(1004,"Password must be at least 8 characters"),
    USER_NOT_EXISTED(1005,"User not existed"),
    UNAUTHENTICATED(1006,"UNAUTHENTICATED"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
