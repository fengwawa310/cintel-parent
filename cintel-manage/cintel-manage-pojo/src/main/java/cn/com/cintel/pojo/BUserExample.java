package cn.com.cintel.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BUserExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELike(String value) {
            addCriterion("LOGIN_NAME like", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDIsNull() {
            addCriterion("LOGIN_PWD is null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDIsNotNull() {
            addCriterion("LOGIN_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDEqualTo(String value) {
            addCriterion("LOGIN_PWD =", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDNotEqualTo(String value) {
            addCriterion("LOGIN_PWD <>", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDGreaterThan(String value) {
            addCriterion("LOGIN_PWD >", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PWD >=", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDLessThan(String value) {
            addCriterion("LOGIN_PWD <", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PWD <=", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDLike(String value) {
            addCriterion("LOGIN_PWD like", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDNotLike(String value) {
            addCriterion("LOGIN_PWD not like", value, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDIn(List<String> values) {
            addCriterion("LOGIN_PWD in", values, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDNotIn(List<String> values) {
            addCriterion("LOGIN_PWD not in", values, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDBetween(String value1, String value2) {
            addCriterion("LOGIN_PWD between", value1, value2, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andLOGIN_PWDNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PWD not between", value1, value2, "LOGIN_PWD");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEEqualTo(String value) {
            addCriterion("USER_NAME =", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThan(String value) {
            addCriterion("USER_NAME <", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELike(String value) {
            addCriterion("USER_NAME like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotLike(String value) {
            addCriterion("USER_NAME not like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIn(List<String> values) {
            addCriterion("USER_NAME in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEEqualTo(String value) {
            addCriterion("NICKNAME =", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELessThan(String value) {
            addCriterion("NICKNAME <", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELike(String value) {
            addCriterion("NICKNAME like", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotLike(String value) {
            addCriterion("NICKNAME not like", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIn(List<String> values) {
            addCriterion("NICKNAME in", values, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andLEVELIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLEVELIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLEVELEqualTo(Integer value) {
            addCriterion("LEVEL =", value, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELNotEqualTo(Integer value) {
            addCriterion("LEVEL <>", value, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELGreaterThan(Integer value) {
            addCriterion("LEVEL >", value, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL >=", value, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELLessThan(Integer value) {
            addCriterion("LEVEL <", value, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL <=", value, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELIn(List<Integer> values) {
            addCriterion("LEVEL in", values, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELNotIn(List<Integer> values) {
            addCriterion("LEVEL not in", values, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL between", value1, value2, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andLEVELNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL not between", value1, value2, "LEVEL");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINIsNull() {
            addCriterion("IS_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINIsNotNull() {
            addCriterion("IS_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINEqualTo(Integer value) {
            addCriterion("IS_ADMIN =", value, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINNotEqualTo(Integer value) {
            addCriterion("IS_ADMIN <>", value, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINGreaterThan(Integer value) {
            addCriterion("IS_ADMIN >", value, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ADMIN >=", value, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINLessThan(Integer value) {
            addCriterion("IS_ADMIN <", value, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ADMIN <=", value, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINIn(List<Integer> values) {
            addCriterion("IS_ADMIN in", values, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINNotIn(List<Integer> values) {
            addCriterion("IS_ADMIN not in", values, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINBetween(Integer value1, Integer value2) {
            addCriterion("IS_ADMIN between", value1, value2, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIS_ADMINNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ADMIN not between", value1, value2, "IS_ADMIN");
            return (Criteria) this;
        }

        public Criteria andIDCARDIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIDCARDIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIDCARDEqualTo(String value) {
            addCriterion("IDCARD =", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDGreaterThan(String value) {
            addCriterion("IDCARD >", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDLessThan(String value) {
            addCriterion("IDCARD <", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDLike(String value) {
            addCriterion("IDCARD like", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotLike(String value) {
            addCriterion("IDCARD not like", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDIn(List<String> values) {
            addCriterion("IDCARD in", values, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONEIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONEIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONEEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONENotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONEGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONEGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONELessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONELessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONELike(String value) {
            addCriterion("MOBILE_PHONE like", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONENotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONEIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONENotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONEBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILE_PHONENotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "MOBILE_PHONE");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andSTATEIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andSTATEIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSTATEEqualTo(Integer value) {
            addCriterion("STATE =", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThan(Integer value) {
            addCriterion("STATE >", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThan(Integer value) {
            addCriterion("STATE <", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEIn(List<Integer> values) {
            addCriterion("STATE in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "STATE");
            return (Criteria) this;
        }

        public Criteria andREMARKIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andREMARKIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andREMARKEqualTo(String value) {
            addCriterion("REMARK =", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThan(String value) {
            addCriterion("REMARK >", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThan(String value) {
            addCriterion("REMARK <", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLike(String value) {
            addCriterion("REMARK like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotLike(String value) {
            addCriterion("REMARK not like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKIn(List<String> values) {
            addCriterion("REMARK in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "REMARK");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPEIsNull() {
            addCriterion("ENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPEIsNotNull() {
            addCriterion("ENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPEEqualTo(Integer value) {
            addCriterion("ENTITY_TYPE =", value, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPENotEqualTo(Integer value) {
            addCriterion("ENTITY_TYPE <>", value, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPEGreaterThan(Integer value) {
            addCriterion("ENTITY_TYPE >", value, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_TYPE >=", value, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPELessThan(Integer value) {
            addCriterion("ENTITY_TYPE <", value, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPELessThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_TYPE <=", value, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPEIn(List<Integer> values) {
            addCriterion("ENTITY_TYPE in", values, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPENotIn(List<Integer> values) {
            addCriterion("ENTITY_TYPE not in", values, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPEBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_TYPE between", value1, value2, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_TYPENotBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_TYPE not between", value1, value2, "ENTITY_TYPE");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDIsNull() {
            addCriterion("ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDIsNotNull() {
            addCriterion("ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDEqualTo(String value) {
            addCriterion("ENTITY_ID =", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDNotEqualTo(String value) {
            addCriterion("ENTITY_ID <>", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDGreaterThan(String value) {
            addCriterion("ENTITY_ID >", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_ID >=", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDLessThan(String value) {
            addCriterion("ENTITY_ID <", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_ID <=", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDLike(String value) {
            addCriterion("ENTITY_ID like", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDNotLike(String value) {
            addCriterion("ENTITY_ID not like", value, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDIn(List<String> values) {
            addCriterion("ENTITY_ID in", values, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDNotIn(List<String> values) {
            addCriterion("ENTITY_ID not in", values, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDBetween(String value1, String value2) {
            addCriterion("ENTITY_ID between", value1, value2, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andENTITY_IDNotBetween(String value1, String value2) {
            addCriterion("ENTITY_ID not between", value1, value2, "ENTITY_ID");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMEIsNull() {
            addCriterion("VERIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMEIsNotNull() {
            addCriterion("VERIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMEEqualTo(Date value) {
            addCriterion("VERIFY_TIME =", value, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMENotEqualTo(Date value) {
            addCriterion("VERIFY_TIME <>", value, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMEGreaterThan(Date value) {
            addCriterion("VERIFY_TIME >", value, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("VERIFY_TIME >=", value, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMELessThan(Date value) {
            addCriterion("VERIFY_TIME <", value, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMELessThanOrEqualTo(Date value) {
            addCriterion("VERIFY_TIME <=", value, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMEIn(List<Date> values) {
            addCriterion("VERIFY_TIME in", values, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMENotIn(List<Date> values) {
            addCriterion("VERIFY_TIME not in", values, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMEBetween(Date value1, Date value2) {
            addCriterion("VERIFY_TIME between", value1, value2, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_TIMENotBetween(Date value1, Date value2) {
            addCriterion("VERIFY_TIME not between", value1, value2, "VERIFY_TIME");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDIsNull() {
            addCriterion("VERIFY_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDIsNotNull() {
            addCriterion("VERIFY_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDEqualTo(String value) {
            addCriterion("VERIFY_PERSON_ID =", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDNotEqualTo(String value) {
            addCriterion("VERIFY_PERSON_ID <>", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDGreaterThan(String value) {
            addCriterion("VERIFY_PERSON_ID >", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_PERSON_ID >=", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDLessThan(String value) {
            addCriterion("VERIFY_PERSON_ID <", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_PERSON_ID <=", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDLike(String value) {
            addCriterion("VERIFY_PERSON_ID like", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDNotLike(String value) {
            addCriterion("VERIFY_PERSON_ID not like", value, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDIn(List<String> values) {
            addCriterion("VERIFY_PERSON_ID in", values, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDNotIn(List<String> values) {
            addCriterion("VERIFY_PERSON_ID not in", values, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDBetween(String value1, String value2) {
            addCriterion("VERIFY_PERSON_ID between", value1, value2, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andVERIFY_PERSON_IDNotBetween(String value1, String value2) {
            addCriterion("VERIFY_PERSON_ID not between", value1, value2, "VERIFY_PERSON_ID");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNIsNull() {
            addCriterion("DEL_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNIsNotNull() {
            addCriterion("DEL_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNEqualTo(Integer value) {
            addCriterion("DEL_SIGN =", value, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNNotEqualTo(Integer value) {
            addCriterion("DEL_SIGN <>", value, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNGreaterThan(Integer value) {
            addCriterion("DEL_SIGN >", value, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEL_SIGN >=", value, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNLessThan(Integer value) {
            addCriterion("DEL_SIGN <", value, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNLessThanOrEqualTo(Integer value) {
            addCriterion("DEL_SIGN <=", value, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNIn(List<Integer> values) {
            addCriterion("DEL_SIGN in", values, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNNotIn(List<Integer> values) {
            addCriterion("DEL_SIGN not in", values, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNBetween(Integer value1, Integer value2) {
            addCriterion("DEL_SIGN between", value1, value2, "DEL_SIGN");
            return (Criteria) this;
        }

        public Criteria andDEL_SIGNNotBetween(Integer value1, Integer value2) {
            addCriterion("DEL_SIGN not between", value1, value2, "DEL_SIGN");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}