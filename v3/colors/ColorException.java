package ivt5.omgtu.v3.colors;

public class ColorException extends Exception {
    private ColorErrorCode colorErrorCode;

    public ColorException(ColorErrorCode errorCode){
        super(errorCode.getErrorString());
        this.colorErrorCode =errorCode;
    }

    public ColorException(Throwable cause) {
        super(cause);
    }
    public ColorErrorCode getErrorCode(){
        return colorErrorCode;
    }
}
