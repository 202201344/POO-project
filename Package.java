public class Package {
    private PackagingType type;
    private String code;
  //  private ProductsType productsType;
    public Package(PackagingType type, String code) {
        this.type = type;
        this.code = code;
    }
    
    public PackagingType getType(){
        return type;
    }

    public String getCode(){
        return code;
    }

   // public PackagingType isType(PackagingType packagingType, ProductsType productsType) {
     //   if(ProductsType.CLOTHING == productsType)
      //  return packagingType;
//
  //  }    
     
    @Override
    public String toString() {
        return "Packaging type: " + type + ", Code: " + code;
    }
}
