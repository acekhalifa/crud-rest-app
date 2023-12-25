package com.springboot.cruddemo.exception;

public class EmployeeErrorResponse {
    private int statusCode;
    private String errMsg;
    private long timeStamp;

    public EmployeeErrorResponse(){}

    public EmployeeErrorResponse(int statusCode, String errMsg, long timeStamp) {
        this.statusCode = statusCode;
        this.errMsg = errMsg;
        this.timeStamp = timeStamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
