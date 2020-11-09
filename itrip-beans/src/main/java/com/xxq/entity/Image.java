package com.xxq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 图片表
    */
@ApiModel(value="com-xxq-entity-Image")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_image")
public class Image implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 图片类型(0:酒店图片1:房间图片2:评论图片)
     */
    @TableField(value = "type")
    @ApiModelProperty(value="图片类型(0:酒店图片1:房间图片2:评论图片)")
    private String type;

    /**
     * 关联id
     */
    @TableField(value = "target_id")
    @ApiModelProperty(value="关联id")
    private Long targetId;

    /**
     * 图片s上传顺序位置
     */
    @TableField(value = "position")
    @ApiModelProperty(value="图片s上传顺序位置")
    private Integer position;

    /**
     * 图片地址
     */
    @TableField(value = "img_url")
    @ApiModelProperty(value="图片地址")
    private String imgUrl;

    @TableField(value = "creation_date")
    @ApiModelProperty(value="")
    private Date creationDate;

    @TableField(value = "created_by")
    @ApiModelProperty(value="")
    private Long createdBy;

    @TableField(value = "modify_date")
    @ApiModelProperty(value="")
    private Date modifyDate;

    @TableField(value = "modified_by")
    @ApiModelProperty(value="")
    private Long modifiedBy;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value="逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}