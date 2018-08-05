package cn.com.cintel.pojo;

import java.io.Serializable;
import java.util.Date;

public class BUser implements Serializable {
    private String ID;

    private String LOGIN_NAME;

    private String LOGIN_PWD;

    private String USER_NAME;

    private String NICKNAME;

    private Integer LEVEL;

    private Integer IS_ADMIN;

    private String IDCARD;

    private String MOBILE_PHONE;

    private String EMAIL;

    private Integer STATE;

    private String REMARK;

    private Integer ENTITY_TYPE;

    private String ENTITY_ID;

    private Date CREATE_TIME;

    private Date UPDATE_TIME;

    private Date VERIFY_TIME;

    private String VERIFY_PERSON_ID;

    private Integer DEL_SIGN;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLOGIN_NAME() {
        return LOGIN_NAME;
    }

    public void setLOGIN_NAME(String LOGIN_NAME) {
        this.LOGIN_NAME = LOGIN_NAME;
    }

    public String getLOGIN_PWD() {
        return LOGIN_PWD;
    }

    public void setLOGIN_PWD(String LOGIN_PWD) {
        this.LOGIN_PWD = LOGIN_PWD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getNICKNAME() {
        return NICKNAME;
    }

    public void setNICKNAME(String NICKNAME) {
        this.NICKNAME = NICKNAME;
    }

    public Integer getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(Integer LEVEL) {
        this.LEVEL = LEVEL;
    }

    public Integer getIS_ADMIN() {
        return IS_ADMIN;
    }

    public void setIS_ADMIN(Integer IS_ADMIN) {
        this.IS_ADMIN = IS_ADMIN;
    }

    public String getIDCARD() {
        return IDCARD;
    }

    public void setIDCARD(String IDCARD) {
        this.IDCARD = IDCARD;
    }

    public String getMOBILE_PHONE() {
        return MOBILE_PHONE;
    }

    public void setMOBILE_PHONE(String MOBILE_PHONE) {
        this.MOBILE_PHONE = MOBILE_PHONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public Integer getSTATE() {
        return STATE;
    }

    public void setSTATE(Integer STATE) {
        this.STATE = STATE;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public Integer getENTITY_TYPE() {
        return ENTITY_TYPE;
    }

    public void setENTITY_TYPE(Integer ENTITY_TYPE) {
        this.ENTITY_TYPE = ENTITY_TYPE;
    }

    public String getENTITY_ID() {
        return ENTITY_ID;
    }

    public void setENTITY_ID(String ENTITY_ID) {
        this.ENTITY_ID = ENTITY_ID;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public Date getUPDATE_TIME() {
        return UPDATE_TIME;
    }

    public void setUPDATE_TIME(Date UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }

    public Date getVERIFY_TIME() {
        return VERIFY_TIME;
    }

    public void setVERIFY_TIME(Date VERIFY_TIME) {
        this.VERIFY_TIME = VERIFY_TIME;
    }

    public String getVERIFY_PERSON_ID() {
        return VERIFY_PERSON_ID;
    }

    public void setVERIFY_PERSON_ID(String VERIFY_PERSON_ID) {
        this.VERIFY_PERSON_ID = VERIFY_PERSON_ID;
    }

    public Integer getDEL_SIGN() {
        return DEL_SIGN;
    }

    public void setDEL_SIGN(Integer DEL_SIGN) {
        this.DEL_SIGN = DEL_SIGN;
    }
}