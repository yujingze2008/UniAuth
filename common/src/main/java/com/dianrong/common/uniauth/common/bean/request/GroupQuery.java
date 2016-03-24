package com.dianrong.common.uniauth.common.bean.request;

/**
 * Created by Arc on 3/3/2016.
 */
public class GroupQuery extends PageParam  {

    private Integer id;
    private String code;
    private String name;
    private String description;
    private Byte status;
    private Byte userGroupType;
    private Long userId;

    public Integer getId() {
        return id;
    }

    public GroupQuery setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public GroupQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GroupQuery setDescription(String description) {
        this.description = description;
        return this;
    }

    public Byte getStatus() {
        return status;
    }

    public GroupQuery setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Byte getUserGroupType() {
        return userGroupType;
    }

    public GroupQuery setUserGroupType(Byte userGroupType) {
        this.userGroupType = userGroupType;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public GroupQuery setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
