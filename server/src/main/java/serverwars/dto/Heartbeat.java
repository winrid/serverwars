package serverwars.dto;

public class Heartbeat {

    private String userId;
    private String token;
    private String hackRecord;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getHackRecord() {
        return hackRecord;
    }

    public void setHackRecord(String hackRecord) {
        this.hackRecord = hackRecord;
    }
}
