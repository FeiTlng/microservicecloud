package com.oyft.springcloud.entities;

import java.io.Serializable;

public class Dept implements Serializable {
    private static final long serialVersionUID = -401696438381044330L;

    private Long deptNO;
    private String dName;
    private String dbSource;

    public Dept() { }

    public Dept(Long deptNO, String dName, String dbSource) {
        this.deptNO = deptNO;
        this.dName = dName;
        this.dbSource = dbSource;
    }

    public Long getDeptNO() {
        return deptNO;
    }

    public void setDeptNO(Long deptNO) {
        this.deptNO = deptNO;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNO=" + deptNO +
                ", deptName='" + dName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
