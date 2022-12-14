package javaOOP.interfaceClass;

public class HasBrandImpl implements HasBrand{
    private String brandName;
    private Integer yearEstablished;
    private Integer totalemployee;

    public HasBrandImpl(String brandName, Integer yearEstablished, Integer totalemployee) {
        this.brandName = brandName;
        this.yearEstablished = yearEstablished;
        this.totalemployee = totalemployee;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }

    @Override
    public Integer getYearEstablised() {
        return this.yearEstablished;
    }

    @Override
    public Integer getEmployee() {
        return this.totalemployee;
    }
}


