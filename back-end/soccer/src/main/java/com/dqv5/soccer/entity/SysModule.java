package com.dqv5.soccer.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 模块
 *
 * @author duq
 * @date 2018/8/18
 */
@Entity
@Table(name = "sys_module")
public class SysModule extends TreeNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 类型 ：0根模块  1子模块
     */
    private String type;
    private Integer parentId;
    /**
     * 层级：从0开始
     */
    private Integer levelNo;
    private String name;
    private String url;
    private Integer orderNo;
    private Date createTime;
    private Date lastModifiedTime;
    @ManyToOne
    private BasicUser createUser;
    @ManyToOne
    private BasicUser modUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(Integer levelNo) {
        this.levelNo = levelNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public BasicUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(BasicUser createUser) {
        this.createUser = createUser;
    }

    public BasicUser getModUser() {
        return modUser;
    }

    public void setModUser(BasicUser modUser) {
        this.modUser = modUser;
    }

}
