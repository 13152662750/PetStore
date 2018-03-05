package com.fjw.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PetdiaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetdiaryExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDiaryIdIsNull() {
            addCriterion("diary_id is null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIsNotNull() {
            addCriterion("diary_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdEqualTo(Integer value) {
            addCriterion("diary_id =", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotEqualTo(Integer value) {
            addCriterion("diary_id <>", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThan(Integer value) {
            addCriterion("diary_id >", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diary_id >=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThan(Integer value) {
            addCriterion("diary_id <", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("diary_id <=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIn(List<Integer> values) {
            addCriterion("diary_id in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotIn(List<Integer> values) {
            addCriterion("diary_id not in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdBetween(Integer value1, Integer value2) {
            addCriterion("diary_id between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diary_id not between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdIsNull() {
            addCriterion("diary_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdIsNotNull() {
            addCriterion("diary_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdEqualTo(Integer value) {
            addCriterion("diary_pet_id =", value, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdNotEqualTo(Integer value) {
            addCriterion("diary_pet_id <>", value, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdGreaterThan(Integer value) {
            addCriterion("diary_pet_id >", value, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diary_pet_id >=", value, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdLessThan(Integer value) {
            addCriterion("diary_pet_id <", value, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("diary_pet_id <=", value, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdIn(List<Integer> values) {
            addCriterion("diary_pet_id in", values, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdNotIn(List<Integer> values) {
            addCriterion("diary_pet_id not in", values, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdBetween(Integer value1, Integer value2) {
            addCriterion("diary_pet_id between", value1, value2, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diary_pet_id not between", value1, value2, "diaryPetId");
            return (Criteria) this;
        }

        public Criteria andDiaryDateIsNull() {
            addCriterion("diary_date is null");
            return (Criteria) this;
        }

        public Criteria andDiaryDateIsNotNull() {
            addCriterion("diary_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryDateEqualTo(Date value) {
            addCriterionForJDBCDate("diary_date =", value, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("diary_date <>", value, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("diary_date >", value, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diary_date >=", value, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateLessThan(Date value) {
            addCriterionForJDBCDate("diary_date <", value, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diary_date <=", value, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateIn(List<Date> values) {
            addCriterionForJDBCDate("diary_date in", values, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("diary_date not in", values, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diary_date between", value1, value2, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diary_date not between", value1, value2, "diaryDate");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleIsNull() {
            addCriterion("diary_title is null");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleIsNotNull() {
            addCriterion("diary_title is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleEqualTo(String value) {
            addCriterion("diary_title =", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleNotEqualTo(String value) {
            addCriterion("diary_title <>", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleGreaterThan(String value) {
            addCriterion("diary_title >", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("diary_title >=", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleLessThan(String value) {
            addCriterion("diary_title <", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleLessThanOrEqualTo(String value) {
            addCriterion("diary_title <=", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleLike(String value) {
            addCriterion("diary_title like", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleNotLike(String value) {
            addCriterion("diary_title not like", value, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleIn(List<String> values) {
            addCriterion("diary_title in", values, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleNotIn(List<String> values) {
            addCriterion("diary_title not in", values, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleBetween(String value1, String value2) {
            addCriterion("diary_title between", value1, value2, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryTitleNotBetween(String value1, String value2) {
            addCriterion("diary_title not between", value1, value2, "diaryTitle");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherIsNull() {
            addCriterion("diary_weather is null");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherIsNotNull() {
            addCriterion("diary_weather is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherEqualTo(String value) {
            addCriterion("diary_weather =", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherNotEqualTo(String value) {
            addCriterion("diary_weather <>", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherGreaterThan(String value) {
            addCriterion("diary_weather >", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("diary_weather >=", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherLessThan(String value) {
            addCriterion("diary_weather <", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherLessThanOrEqualTo(String value) {
            addCriterion("diary_weather <=", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherLike(String value) {
            addCriterion("diary_weather like", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherNotLike(String value) {
            addCriterion("diary_weather not like", value, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherIn(List<String> values) {
            addCriterion("diary_weather in", values, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherNotIn(List<String> values) {
            addCriterion("diary_weather not in", values, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherBetween(String value1, String value2) {
            addCriterion("diary_weather between", value1, value2, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryWeatherNotBetween(String value1, String value2) {
            addCriterion("diary_weather not between", value1, value2, "diaryWeather");
            return (Criteria) this;
        }

        public Criteria andDiaryContextIsNull() {
            addCriterion("diary_context is null");
            return (Criteria) this;
        }

        public Criteria andDiaryContextIsNotNull() {
            addCriterion("diary_context is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryContextEqualTo(String value) {
            addCriterion("diary_context =", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextNotEqualTo(String value) {
            addCriterion("diary_context <>", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextGreaterThan(String value) {
            addCriterion("diary_context >", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextGreaterThanOrEqualTo(String value) {
            addCriterion("diary_context >=", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextLessThan(String value) {
            addCriterion("diary_context <", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextLessThanOrEqualTo(String value) {
            addCriterion("diary_context <=", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextLike(String value) {
            addCriterion("diary_context like", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextNotLike(String value) {
            addCriterion("diary_context not like", value, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextIn(List<String> values) {
            addCriterion("diary_context in", values, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextNotIn(List<String> values) {
            addCriterion("diary_context not in", values, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextBetween(String value1, String value2) {
            addCriterion("diary_context between", value1, value2, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryContextNotBetween(String value1, String value2) {
            addCriterion("diary_context not between", value1, value2, "diaryContext");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicIsNull() {
            addCriterion("diary_is_public is null");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicIsNotNull() {
            addCriterion("diary_is_public is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicEqualTo(Boolean value) {
            addCriterion("diary_is_public =", value, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicNotEqualTo(Boolean value) {
            addCriterion("diary_is_public <>", value, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicGreaterThan(Boolean value) {
            addCriterion("diary_is_public >", value, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("diary_is_public >=", value, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicLessThan(Boolean value) {
            addCriterion("diary_is_public <", value, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicLessThanOrEqualTo(Boolean value) {
            addCriterion("diary_is_public <=", value, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicIn(List<Boolean> values) {
            addCriterion("diary_is_public in", values, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicNotIn(List<Boolean> values) {
            addCriterion("diary_is_public not in", values, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicBetween(Boolean value1, Boolean value2) {
            addCriterion("diary_is_public between", value1, value2, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryIsPublicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("diary_is_public not between", value1, value2, "diaryIsPublic");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyIsNull() {
            addCriterion("diary_last_modify is null");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyIsNotNull() {
            addCriterion("diary_last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyEqualTo(Date value) {
            addCriterion("diary_last_modify =", value, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyNotEqualTo(Date value) {
            addCriterion("diary_last_modify <>", value, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyGreaterThan(Date value) {
            addCriterion("diary_last_modify >", value, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("diary_last_modify >=", value, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyLessThan(Date value) {
            addCriterion("diary_last_modify <", value, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyLessThanOrEqualTo(Date value) {
            addCriterion("diary_last_modify <=", value, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyIn(List<Date> values) {
            addCriterion("diary_last_modify in", values, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyNotIn(List<Date> values) {
            addCriterion("diary_last_modify not in", values, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyBetween(Date value1, Date value2) {
            addCriterion("diary_last_modify between", value1, value2, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryLastModifyNotBetween(Date value1, Date value2) {
            addCriterion("diary_last_modify not between", value1, value2, "diaryLastModify");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorIsNull() {
            addCriterion("diary_author is null");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorIsNotNull() {
            addCriterion("diary_author is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEqualTo(String value) {
            addCriterion("diary_author =", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorNotEqualTo(String value) {
            addCriterion("diary_author <>", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorGreaterThan(String value) {
            addCriterion("diary_author >", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("diary_author >=", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorLessThan(String value) {
            addCriterion("diary_author <", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorLessThanOrEqualTo(String value) {
            addCriterion("diary_author <=", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorLike(String value) {
            addCriterion("diary_author like", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorNotLike(String value) {
            addCriterion("diary_author not like", value, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorIn(List<String> values) {
            addCriterion("diary_author in", values, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorNotIn(List<String> values) {
            addCriterion("diary_author not in", values, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorBetween(String value1, String value2) {
            addCriterion("diary_author between", value1, value2, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorNotBetween(String value1, String value2) {
            addCriterion("diary_author not between", value1, value2, "diaryAuthor");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailIsNull() {
            addCriterion("diary_author_email is null");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailIsNotNull() {
            addCriterion("diary_author_email is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailEqualTo(String value) {
            addCriterion("diary_author_email =", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailNotEqualTo(String value) {
            addCriterion("diary_author_email <>", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailGreaterThan(String value) {
            addCriterion("diary_author_email >", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("diary_author_email >=", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailLessThan(String value) {
            addCriterion("diary_author_email <", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailLessThanOrEqualTo(String value) {
            addCriterion("diary_author_email <=", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailLike(String value) {
            addCriterion("diary_author_email like", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailNotLike(String value) {
            addCriterion("diary_author_email not like", value, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailIn(List<String> values) {
            addCriterion("diary_author_email in", values, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailNotIn(List<String> values) {
            addCriterion("diary_author_email not in", values, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailBetween(String value1, String value2) {
            addCriterion("diary_author_email between", value1, value2, "diaryAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andDiaryAuthorEmailNotBetween(String value1, String value2) {
            addCriterion("diary_author_email not between", value1, value2, "diaryAuthorEmail");
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