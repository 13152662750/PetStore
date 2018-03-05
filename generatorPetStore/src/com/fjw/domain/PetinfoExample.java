package com.fjw.domain;

import java.util.ArrayList;
import java.util.List;

public class PetinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetinfoExample() {
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

        public Criteria andPetIdIsNull() {
            addCriterion("pet_id is null");
            return (Criteria) this;
        }

        public Criteria andPetIdIsNotNull() {
            addCriterion("pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetIdEqualTo(Integer value) {
            addCriterion("pet_id =", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotEqualTo(Integer value) {
            addCriterion("pet_id <>", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThan(Integer value) {
            addCriterion("pet_id >", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_id >=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThan(Integer value) {
            addCriterion("pet_id <", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("pet_id <=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdIn(List<Integer> values) {
            addCriterion("pet_id in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotIn(List<Integer> values) {
            addCriterion("pet_id not in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdBetween(Integer value1, Integer value2) {
            addCriterion("pet_id between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_id not between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andPetNameIsNull() {
            addCriterion("pet_name is null");
            return (Criteria) this;
        }

        public Criteria andPetNameIsNotNull() {
            addCriterion("pet_name is not null");
            return (Criteria) this;
        }

        public Criteria andPetNameEqualTo(String value) {
            addCriterion("pet_name =", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotEqualTo(String value) {
            addCriterion("pet_name <>", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThan(String value) {
            addCriterion("pet_name >", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThanOrEqualTo(String value) {
            addCriterion("pet_name >=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThan(String value) {
            addCriterion("pet_name <", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThanOrEqualTo(String value) {
            addCriterion("pet_name <=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLike(String value) {
            addCriterion("pet_name like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotLike(String value) {
            addCriterion("pet_name not like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameIn(List<String> values) {
            addCriterion("pet_name in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotIn(List<String> values) {
            addCriterion("pet_name not in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameBetween(String value1, String value2) {
            addCriterion("pet_name between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotBetween(String value1, String value2) {
            addCriterion("pet_name not between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetSexIsNull() {
            addCriterion("pet_sex is null");
            return (Criteria) this;
        }

        public Criteria andPetSexIsNotNull() {
            addCriterion("pet_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPetSexEqualTo(String value) {
            addCriterion("pet_sex =", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotEqualTo(String value) {
            addCriterion("pet_sex <>", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexGreaterThan(String value) {
            addCriterion("pet_sex >", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexGreaterThanOrEqualTo(String value) {
            addCriterion("pet_sex >=", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLessThan(String value) {
            addCriterion("pet_sex <", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLessThanOrEqualTo(String value) {
            addCriterion("pet_sex <=", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLike(String value) {
            addCriterion("pet_sex like", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotLike(String value) {
            addCriterion("pet_sex not like", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexIn(List<String> values) {
            addCriterion("pet_sex in", values, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotIn(List<String> values) {
            addCriterion("pet_sex not in", values, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexBetween(String value1, String value2) {
            addCriterion("pet_sex between", value1, value2, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotBetween(String value1, String value2) {
            addCriterion("pet_sex not between", value1, value2, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetStrengthIsNull() {
            addCriterion("pet_strength is null");
            return (Criteria) this;
        }

        public Criteria andPetStrengthIsNotNull() {
            addCriterion("pet_strength is not null");
            return (Criteria) this;
        }

        public Criteria andPetStrengthEqualTo(Integer value) {
            addCriterion("pet_strength =", value, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthNotEqualTo(Integer value) {
            addCriterion("pet_strength <>", value, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthGreaterThan(Integer value) {
            addCriterion("pet_strength >", value, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_strength >=", value, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthLessThan(Integer value) {
            addCriterion("pet_strength <", value, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthLessThanOrEqualTo(Integer value) {
            addCriterion("pet_strength <=", value, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthIn(List<Integer> values) {
            addCriterion("pet_strength in", values, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthNotIn(List<Integer> values) {
            addCriterion("pet_strength not in", values, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthBetween(Integer value1, Integer value2) {
            addCriterion("pet_strength between", value1, value2, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetStrengthNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_strength not between", value1, value2, "petStrength");
            return (Criteria) this;
        }

        public Criteria andPetCuteIsNull() {
            addCriterion("pet_cute is null");
            return (Criteria) this;
        }

        public Criteria andPetCuteIsNotNull() {
            addCriterion("pet_cute is not null");
            return (Criteria) this;
        }

        public Criteria andPetCuteEqualTo(Integer value) {
            addCriterion("pet_cute =", value, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteNotEqualTo(Integer value) {
            addCriterion("pet_cute <>", value, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteGreaterThan(Integer value) {
            addCriterion("pet_cute >", value, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_cute >=", value, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteLessThan(Integer value) {
            addCriterion("pet_cute <", value, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteLessThanOrEqualTo(Integer value) {
            addCriterion("pet_cute <=", value, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteIn(List<Integer> values) {
            addCriterion("pet_cute in", values, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteNotIn(List<Integer> values) {
            addCriterion("pet_cute not in", values, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteBetween(Integer value1, Integer value2) {
            addCriterion("pet_cute between", value1, value2, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetCuteNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_cute not between", value1, value2, "petCute");
            return (Criteria) this;
        }

        public Criteria andPetLoveIsNull() {
            addCriterion("pet_love is null");
            return (Criteria) this;
        }

        public Criteria andPetLoveIsNotNull() {
            addCriterion("pet_love is not null");
            return (Criteria) this;
        }

        public Criteria andPetLoveEqualTo(Integer value) {
            addCriterion("pet_love =", value, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveNotEqualTo(Integer value) {
            addCriterion("pet_love <>", value, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveGreaterThan(Integer value) {
            addCriterion("pet_love >", value, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_love >=", value, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveLessThan(Integer value) {
            addCriterion("pet_love <", value, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveLessThanOrEqualTo(Integer value) {
            addCriterion("pet_love <=", value, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveIn(List<Integer> values) {
            addCriterion("pet_love in", values, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveNotIn(List<Integer> values) {
            addCriterion("pet_love not in", values, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveBetween(Integer value1, Integer value2) {
            addCriterion("pet_love between", value1, value2, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetLoveNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_love not between", value1, value2, "petLove");
            return (Criteria) this;
        }

        public Criteria andPetIntroIsNull() {
            addCriterion("pet_intro is null");
            return (Criteria) this;
        }

        public Criteria andPetIntroIsNotNull() {
            addCriterion("pet_intro is not null");
            return (Criteria) this;
        }

        public Criteria andPetIntroEqualTo(String value) {
            addCriterion("pet_intro =", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroNotEqualTo(String value) {
            addCriterion("pet_intro <>", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroGreaterThan(String value) {
            addCriterion("pet_intro >", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroGreaterThanOrEqualTo(String value) {
            addCriterion("pet_intro >=", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroLessThan(String value) {
            addCriterion("pet_intro <", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroLessThanOrEqualTo(String value) {
            addCriterion("pet_intro <=", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroLike(String value) {
            addCriterion("pet_intro like", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroNotLike(String value) {
            addCriterion("pet_intro not like", value, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroIn(List<String> values) {
            addCriterion("pet_intro in", values, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroNotIn(List<String> values) {
            addCriterion("pet_intro not in", values, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroBetween(String value1, String value2) {
            addCriterion("pet_intro between", value1, value2, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetIntroNotBetween(String value1, String value2) {
            addCriterion("pet_intro not between", value1, value2, "petIntro");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameIsNull() {
            addCriterion("pet_owner_name is null");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameIsNotNull() {
            addCriterion("pet_owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameEqualTo(String value) {
            addCriterion("pet_owner_name =", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameNotEqualTo(String value) {
            addCriterion("pet_owner_name <>", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameGreaterThan(String value) {
            addCriterion("pet_owner_name >", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("pet_owner_name >=", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameLessThan(String value) {
            addCriterion("pet_owner_name <", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("pet_owner_name <=", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameLike(String value) {
            addCriterion("pet_owner_name like", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameNotLike(String value) {
            addCriterion("pet_owner_name not like", value, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameIn(List<String> values) {
            addCriterion("pet_owner_name in", values, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameNotIn(List<String> values) {
            addCriterion("pet_owner_name not in", values, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameBetween(String value1, String value2) {
            addCriterion("pet_owner_name between", value1, value2, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerNameNotBetween(String value1, String value2) {
            addCriterion("pet_owner_name not between", value1, value2, "petOwnerName");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailIsNull() {
            addCriterion("pet_owner_email is null");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailIsNotNull() {
            addCriterion("pet_owner_email is not null");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailEqualTo(String value) {
            addCriterion("pet_owner_email =", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailNotEqualTo(String value) {
            addCriterion("pet_owner_email <>", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailGreaterThan(String value) {
            addCriterion("pet_owner_email >", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("pet_owner_email >=", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailLessThan(String value) {
            addCriterion("pet_owner_email <", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailLessThanOrEqualTo(String value) {
            addCriterion("pet_owner_email <=", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailLike(String value) {
            addCriterion("pet_owner_email like", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailNotLike(String value) {
            addCriterion("pet_owner_email not like", value, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailIn(List<String> values) {
            addCriterion("pet_owner_email in", values, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailNotIn(List<String> values) {
            addCriterion("pet_owner_email not in", values, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailBetween(String value1, String value2) {
            addCriterion("pet_owner_email between", value1, value2, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetOwnerEmailNotBetween(String value1, String value2) {
            addCriterion("pet_owner_email not between", value1, value2, "petOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andPetPasswordIsNull() {
            addCriterion("pet_password is null");
            return (Criteria) this;
        }

        public Criteria andPetPasswordIsNotNull() {
            addCriterion("pet_password is not null");
            return (Criteria) this;
        }

        public Criteria andPetPasswordEqualTo(String value) {
            addCriterion("pet_password =", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordNotEqualTo(String value) {
            addCriterion("pet_password <>", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordGreaterThan(String value) {
            addCriterion("pet_password >", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pet_password >=", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordLessThan(String value) {
            addCriterion("pet_password <", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordLessThanOrEqualTo(String value) {
            addCriterion("pet_password <=", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordLike(String value) {
            addCriterion("pet_password like", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordNotLike(String value) {
            addCriterion("pet_password not like", value, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordIn(List<String> values) {
            addCriterion("pet_password in", values, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordNotIn(List<String> values) {
            addCriterion("pet_password not in", values, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordBetween(String value1, String value2) {
            addCriterion("pet_password between", value1, value2, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPasswordNotBetween(String value1, String value2) {
            addCriterion("pet_password not between", value1, value2, "petPassword");
            return (Criteria) this;
        }

        public Criteria andPetPicIsNull() {
            addCriterion("pet_pic is null");
            return (Criteria) this;
        }

        public Criteria andPetPicIsNotNull() {
            addCriterion("pet_pic is not null");
            return (Criteria) this;
        }

        public Criteria andPetPicEqualTo(String value) {
            addCriterion("pet_pic =", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicNotEqualTo(String value) {
            addCriterion("pet_pic <>", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicGreaterThan(String value) {
            addCriterion("pet_pic >", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicGreaterThanOrEqualTo(String value) {
            addCriterion("pet_pic >=", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicLessThan(String value) {
            addCriterion("pet_pic <", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicLessThanOrEqualTo(String value) {
            addCriterion("pet_pic <=", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicLike(String value) {
            addCriterion("pet_pic like", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicNotLike(String value) {
            addCriterion("pet_pic not like", value, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicIn(List<String> values) {
            addCriterion("pet_pic in", values, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicNotIn(List<String> values) {
            addCriterion("pet_pic not in", values, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicBetween(String value1, String value2) {
            addCriterion("pet_pic between", value1, value2, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetPicNotBetween(String value1, String value2) {
            addCriterion("pet_pic not between", value1, value2, "petPic");
            return (Criteria) this;
        }

        public Criteria andPetTypeIsNull() {
            addCriterion("pet_type is null");
            return (Criteria) this;
        }

        public Criteria andPetTypeIsNotNull() {
            addCriterion("pet_type is not null");
            return (Criteria) this;
        }

        public Criteria andPetTypeEqualTo(Integer value) {
            addCriterion("pet_type =", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeNotEqualTo(Integer value) {
            addCriterion("pet_type <>", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeGreaterThan(Integer value) {
            addCriterion("pet_type >", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_type >=", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeLessThan(Integer value) {
            addCriterion("pet_type <", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pet_type <=", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeIn(List<Integer> values) {
            addCriterion("pet_type in", values, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeNotIn(List<Integer> values) {
            addCriterion("pet_type not in", values, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeBetween(Integer value1, Integer value2) {
            addCriterion("pet_type between", value1, value2, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_type not between", value1, value2, "petType");
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