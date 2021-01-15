package com.shengde.e3mall.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbItemParamItem)实体类
 *
 * @author makejava
 * @since 2020-12-07 11:46:10
 */
public class TbItemParamItem implements Serializable {
    private static final long serialVersionUID = -32821746393759597L;

    private Integer id;

    private Integer itemId;

    private Date created;

    private Date updated;

    private String paramData;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

}