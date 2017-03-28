package com.example;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import org.springframework.data.cassandra.mapping.Column;

@Table(value="BILL_OF_LANDING")
public class BillOfLanding {
    @PrimaryKey
    private String id;
    @Column("TOTAL_CONTAINER_COUNT")
    private int conatinerCount;
    @Column("IS_LIVE_COUNTRY")
    private boolean isLiveCountry;
    
    public BillOfLanding() {
        super();
    }
    
    public BillOfLanding(String id, int conatinerCount, boolean isLiveCountry) {
        super();
        this.id = id;
        this.conatinerCount = conatinerCount;
        this.isLiveCountry = isLiveCountry;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getConatinerCount() {
        return conatinerCount;
    }
    public void setConatinerCount(int conatinerCount) {
        this.conatinerCount = conatinerCount;
    }
    public boolean isLiveCountry() {
        return isLiveCountry;
    }
    public void setLiveCountry(boolean isLiveCountry) {
        this.isLiveCountry = isLiveCountry;
    }
    
    

}
