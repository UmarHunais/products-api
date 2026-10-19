package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private double fileSizeMB;
    private String downloadUrl;


    public DigitalProduct(){}

    public DigitalProduct(Long id, String name,double price, double fileSizeMB, String downloadUrl){
        super(id,name,price);

        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getdownloadUrl(){
        return downloadUrl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

    public void setdownloadUrl(String downloadUrl){
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double getFileSizeMB){
        this.fileSizeMB = fileSizeMB;
    }
}
