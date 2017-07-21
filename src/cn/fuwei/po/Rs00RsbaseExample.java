package cn.fuwei.po;

import java.util.ArrayList;
import java.util.List;

public class Rs00RsbaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Rs00RsbaseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRenameeIsNull() {
            addCriterion("reNamee is null");
            return (Criteria) this;
        }

        public Criteria andRenameeIsNotNull() {
            addCriterion("reNamee is not null");
            return (Criteria) this;
        }

        public Criteria andRenameeEqualTo(String value) {
            addCriterion("reNamee =", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeNotEqualTo(String value) {
            addCriterion("reNamee <>", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeGreaterThan(String value) {
            addCriterion("reNamee >", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeGreaterThanOrEqualTo(String value) {
            addCriterion("reNamee >=", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeLessThan(String value) {
            addCriterion("reNamee <", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeLessThanOrEqualTo(String value) {
            addCriterion("reNamee <=", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeLike(String value) {
            addCriterion("reNamee like", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeNotLike(String value) {
            addCriterion("reNamee not like", value, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeIn(List<String> values) {
            addCriterion("reNamee in", values, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeNotIn(List<String> values) {
            addCriterion("reNamee not in", values, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeBetween(String value1, String value2) {
            addCriterion("reNamee between", value1, value2, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenameeNotBetween(String value1, String value2) {
            addCriterion("reNamee not between", value1, value2, "renamee");
            return (Criteria) this;
        }

        public Criteria andRenamecodeIsNull() {
            addCriterion("reNameCode is null");
            return (Criteria) this;
        }

        public Criteria andRenamecodeIsNotNull() {
            addCriterion("reNameCode is not null");
            return (Criteria) this;
        }

        public Criteria andRenamecodeEqualTo(String value) {
            addCriterion("reNameCode =", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeNotEqualTo(String value) {
            addCriterion("reNameCode <>", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeGreaterThan(String value) {
            addCriterion("reNameCode >", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeGreaterThanOrEqualTo(String value) {
            addCriterion("reNameCode >=", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeLessThan(String value) {
            addCriterion("reNameCode <", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeLessThanOrEqualTo(String value) {
            addCriterion("reNameCode <=", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeLike(String value) {
            addCriterion("reNameCode like", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeNotLike(String value) {
            addCriterion("reNameCode not like", value, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeIn(List<String> values) {
            addCriterion("reNameCode in", values, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeNotIn(List<String> values) {
            addCriterion("reNameCode not in", values, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeBetween(String value1, String value2) {
            addCriterion("reNameCode between", value1, value2, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRenamecodeNotBetween(String value1, String value2) {
            addCriterion("reNameCode not between", value1, value2, "renamecode");
            return (Criteria) this;
        }

        public Criteria andRstypeIsNull() {
            addCriterion("rsType is null");
            return (Criteria) this;
        }

        public Criteria andRstypeIsNotNull() {
            addCriterion("rsType is not null");
            return (Criteria) this;
        }

        public Criteria andRstypeEqualTo(String value) {
            addCriterion("rsType =", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeNotEqualTo(String value) {
            addCriterion("rsType <>", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeGreaterThan(String value) {
            addCriterion("rsType >", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeGreaterThanOrEqualTo(String value) {
            addCriterion("rsType >=", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeLessThan(String value) {
            addCriterion("rsType <", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeLessThanOrEqualTo(String value) {
            addCriterion("rsType <=", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeLike(String value) {
            addCriterion("rsType like", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeNotLike(String value) {
            addCriterion("rsType not like", value, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeIn(List<String> values) {
            addCriterion("rsType in", values, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeNotIn(List<String> values) {
            addCriterion("rsType not in", values, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeBetween(String value1, String value2) {
            addCriterion("rsType between", value1, value2, "rstype");
            return (Criteria) this;
        }

        public Criteria andRstypeNotBetween(String value1, String value2) {
            addCriterion("rsType not between", value1, value2, "rstype");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctIsNull() {
            addCriterion("total_strg_cpct is null");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctIsNotNull() {
            addCriterion("total_strg_cpct is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctEqualTo(Integer value) {
            addCriterion("total_strg_cpct =", value, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctNotEqualTo(Integer value) {
            addCriterion("total_strg_cpct <>", value, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctGreaterThan(Integer value) {
            addCriterion("total_strg_cpct >", value, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_strg_cpct >=", value, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctLessThan(Integer value) {
            addCriterion("total_strg_cpct <", value, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctLessThanOrEqualTo(Integer value) {
            addCriterion("total_strg_cpct <=", value, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctIn(List<Integer> values) {
            addCriterion("total_strg_cpct in", values, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctNotIn(List<Integer> values) {
            addCriterion("total_strg_cpct not in", values, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctBetween(Integer value1, Integer value2) {
            addCriterion("total_strg_cpct between", value1, value2, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andTotalStrgCpctNotBetween(Integer value1, Integer value2) {
            addCriterion("total_strg_cpct not between", value1, value2, "totalStrgCpct");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceIsNull() {
            addCriterion("localProvince is null");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceIsNotNull() {
            addCriterion("localProvince is not null");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceEqualTo(String value) {
            addCriterion("localProvince =", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceNotEqualTo(String value) {
            addCriterion("localProvince <>", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceGreaterThan(String value) {
            addCriterion("localProvince >", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("localProvince >=", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceLessThan(String value) {
            addCriterion("localProvince <", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceLessThanOrEqualTo(String value) {
            addCriterion("localProvince <=", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceLike(String value) {
            addCriterion("localProvince like", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceNotLike(String value) {
            addCriterion("localProvince not like", value, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceIn(List<String> values) {
            addCriterion("localProvince in", values, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceNotIn(List<String> values) {
            addCriterion("localProvince not in", values, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceBetween(String value1, String value2) {
            addCriterion("localProvince between", value1, value2, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalprovinceNotBetween(String value1, String value2) {
            addCriterion("localProvince not between", value1, value2, "localprovince");
            return (Criteria) this;
        }

        public Criteria andLocalcityIsNull() {
            addCriterion("localCity is null");
            return (Criteria) this;
        }

        public Criteria andLocalcityIsNotNull() {
            addCriterion("localCity is not null");
            return (Criteria) this;
        }

        public Criteria andLocalcityEqualTo(String value) {
            addCriterion("localCity =", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityNotEqualTo(String value) {
            addCriterion("localCity <>", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityGreaterThan(String value) {
            addCriterion("localCity >", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityGreaterThanOrEqualTo(String value) {
            addCriterion("localCity >=", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityLessThan(String value) {
            addCriterion("localCity <", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityLessThanOrEqualTo(String value) {
            addCriterion("localCity <=", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityLike(String value) {
            addCriterion("localCity like", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityNotLike(String value) {
            addCriterion("localCity not like", value, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityIn(List<String> values) {
            addCriterion("localCity in", values, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityNotIn(List<String> values) {
            addCriterion("localCity not in", values, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityBetween(String value1, String value2) {
            addCriterion("localCity between", value1, value2, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcityNotBetween(String value1, String value2) {
            addCriterion("localCity not between", value1, value2, "localcity");
            return (Criteria) this;
        }

        public Criteria andLocalcountyIsNull() {
            addCriterion("localCounty is null");
            return (Criteria) this;
        }

        public Criteria andLocalcountyIsNotNull() {
            addCriterion("localCounty is not null");
            return (Criteria) this;
        }

        public Criteria andLocalcountyEqualTo(String value) {
            addCriterion("localCounty =", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyNotEqualTo(String value) {
            addCriterion("localCounty <>", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyGreaterThan(String value) {
            addCriterion("localCounty >", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyGreaterThanOrEqualTo(String value) {
            addCriterion("localCounty >=", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyLessThan(String value) {
            addCriterion("localCounty <", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyLessThanOrEqualTo(String value) {
            addCriterion("localCounty <=", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyLike(String value) {
            addCriterion("localCounty like", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyNotLike(String value) {
            addCriterion("localCounty not like", value, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyIn(List<String> values) {
            addCriterion("localCounty in", values, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyNotIn(List<String> values) {
            addCriterion("localCounty not in", values, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyBetween(String value1, String value2) {
            addCriterion("localCounty between", value1, value2, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocalcountyNotBetween(String value1, String value2) {
            addCriterion("localCounty not between", value1, value2, "localcounty");
            return (Criteria) this;
        }

        public Criteria andLocaltownIsNull() {
            addCriterion("localTown is null");
            return (Criteria) this;
        }

        public Criteria andLocaltownIsNotNull() {
            addCriterion("localTown is not null");
            return (Criteria) this;
        }

        public Criteria andLocaltownEqualTo(String value) {
            addCriterion("localTown =", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownNotEqualTo(String value) {
            addCriterion("localTown <>", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownGreaterThan(String value) {
            addCriterion("localTown >", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownGreaterThanOrEqualTo(String value) {
            addCriterion("localTown >=", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownLessThan(String value) {
            addCriterion("localTown <", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownLessThanOrEqualTo(String value) {
            addCriterion("localTown <=", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownLike(String value) {
            addCriterion("localTown like", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownNotLike(String value) {
            addCriterion("localTown not like", value, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownIn(List<String> values) {
            addCriterion("localTown in", values, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownNotIn(List<String> values) {
            addCriterion("localTown not in", values, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownBetween(String value1, String value2) {
            addCriterion("localTown between", value1, value2, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocaltownNotBetween(String value1, String value2) {
            addCriterion("localTown not between", value1, value2, "localtown");
            return (Criteria) this;
        }

        public Criteria andLocalvillageIsNull() {
            addCriterion("localVillage is null");
            return (Criteria) this;
        }

        public Criteria andLocalvillageIsNotNull() {
            addCriterion("localVillage is not null");
            return (Criteria) this;
        }

        public Criteria andLocalvillageEqualTo(String value) {
            addCriterion("localVillage =", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageNotEqualTo(String value) {
            addCriterion("localVillage <>", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageGreaterThan(String value) {
            addCriterion("localVillage >", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageGreaterThanOrEqualTo(String value) {
            addCriterion("localVillage >=", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageLessThan(String value) {
            addCriterion("localVillage <", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageLessThanOrEqualTo(String value) {
            addCriterion("localVillage <=", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageLike(String value) {
            addCriterion("localVillage like", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageNotLike(String value) {
            addCriterion("localVillage not like", value, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageIn(List<String> values) {
            addCriterion("localVillage in", values, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageNotIn(List<String> values) {
            addCriterion("localVillage not in", values, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageBetween(String value1, String value2) {
            addCriterion("localVillage between", value1, value2, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalvillageNotBetween(String value1, String value2) {
            addCriterion("localVillage not between", value1, value2, "localvillage");
            return (Criteria) this;
        }

        public Criteria andLocalcodeIsNull() {
            addCriterion("localCode is null");
            return (Criteria) this;
        }

        public Criteria andLocalcodeIsNotNull() {
            addCriterion("localCode is not null");
            return (Criteria) this;
        }

        public Criteria andLocalcodeEqualTo(String value) {
            addCriterion("localCode =", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeNotEqualTo(String value) {
            addCriterion("localCode <>", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeGreaterThan(String value) {
            addCriterion("localCode >", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("localCode >=", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeLessThan(String value) {
            addCriterion("localCode <", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeLessThanOrEqualTo(String value) {
            addCriterion("localCode <=", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeLike(String value) {
            addCriterion("localCode like", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeNotLike(String value) {
            addCriterion("localCode not like", value, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeIn(List<String> values) {
            addCriterion("localCode in", values, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeNotIn(List<String> values) {
            addCriterion("localCode not in", values, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeBetween(String value1, String value2) {
            addCriterion("localCode between", value1, value2, "localcode");
            return (Criteria) this;
        }

        public Criteria andLocalcodeNotBetween(String value1, String value2) {
            addCriterion("localCode not between", value1, value2, "localcode");
            return (Criteria) this;
        }

        public Criteria andIdprovinceIsNull() {
            addCriterion("idProvince is null");
            return (Criteria) this;
        }

        public Criteria andIdprovinceIsNotNull() {
            addCriterion("idProvince is not null");
            return (Criteria) this;
        }

        public Criteria andIdprovinceEqualTo(String value) {
            addCriterion("idProvince =", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceNotEqualTo(String value) {
            addCriterion("idProvince <>", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceGreaterThan(String value) {
            addCriterion("idProvince >", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("idProvince >=", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceLessThan(String value) {
            addCriterion("idProvince <", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceLessThanOrEqualTo(String value) {
            addCriterion("idProvince <=", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceLike(String value) {
            addCriterion("idProvince like", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceNotLike(String value) {
            addCriterion("idProvince not like", value, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceIn(List<String> values) {
            addCriterion("idProvince in", values, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceNotIn(List<String> values) {
            addCriterion("idProvince not in", values, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceBetween(String value1, String value2) {
            addCriterion("idProvince between", value1, value2, "idprovince");
            return (Criteria) this;
        }

        public Criteria andIdprovinceNotBetween(String value1, String value2) {
            addCriterion("idProvince not between", value1, value2, "idprovince");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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