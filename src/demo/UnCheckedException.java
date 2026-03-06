package demo;

public class UnCheckedException extends  RuntimeException{
    private int code;


    public UnCheckedException(String message) {
        super(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
