package ua.com.alevel;

public class Main {
    public static void main(String[] args){
        PropertyBind propertyBind = new PropertyBind();
        AppProperties appProperties = new AppProperties();
        appProperties = (AppProperties) propertyBind.initializeProperties(appProperties);
        System.out.println(appProperties);
    }
}
