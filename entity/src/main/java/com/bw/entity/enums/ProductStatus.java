package com.bw.entity.enums;

public enum ProductStatus {
    AUDITING("审核中"),
    IN_SBLL("销售中"),
    LOCKBD("暂停销售"),
    PINISHBD("已结束");

    private String desc;

    ProductStatus(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
