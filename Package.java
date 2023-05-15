public class Package {
    private String type;
    private String code;
    
    public Package(String type, String code) {
        this.type = type;
        this.code = code;
    }
    
    public String getType(){
        return type;
    }

    public String getCode(){
        return code;
    }

     
    @Override
    public String toString() {
        return "Packaging type: " + type + ", Code: " + code;
    }
}
