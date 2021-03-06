package me.imtt.oa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 请假单处理记录
 */
public class LeaveDealRecord {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 请假单编号
     */
    private Integer leaveVoucherId;

    /**
     * 处理人编号
     */
    private String dealSn;

    /**
     * 处理时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date dealTime;

    /**
     * 处理类型
     */
    private String dealWay;

    /**
     * 处理结果
     */
    private String dealResult;

    /**
     * 描述
     */
    private String comment;

    /**
     * 处理人
     */
    private Employee dealer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeaveVoucherId() {
        return leaveVoucherId;
    }

    public void setLeaveVoucherId(Integer leaveVoucherId) {
        this.leaveVoucherId = leaveVoucherId;
    }

    public String getDealSn() {
        return dealSn;
    }

    public void setDealSn(String dealSn) {
        this.dealSn = dealSn;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealWay() {
        return dealWay;
    }

    public void setDealWay(String dealWay) {
        this.dealWay = dealWay;
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Employee getDealer() {
        return dealer;
    }

    public void setDealer(Employee dealer) {
        this.dealer = dealer;
    }
}