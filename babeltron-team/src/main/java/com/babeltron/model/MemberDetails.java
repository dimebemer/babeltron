package com.babeltron.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Calendar;
import java.util.List;

/**
 * @author  Rafael Bemerguy
 * @since   27/06/2015
 */
public class MemberDetails {

    private int id;
    private Member member;

    // Project data
    private List<ProjectMember> projectMembers;
    private Calendar dateHired;
    private PayMethod payMethod;

    // Optional project data
    private QualityLevel qualityLevel;
    private String specialStatus;
    private boolean dismissed;
    private Calendar dateDismissed;
    private ReasonFired reasonFired;
    private String personalReasonFired;

    public MemberDetails() {
    }

    public List<ProjectMember> getProjectMembers() {
        return projectMembers;
    }

    public void setProjectMembers(List<ProjectMember> projectMembers) {
        this.projectMembers = projectMembers;
    }

    public Calendar getDateHired() {
        return dateHired;
    }

    public void setDateHired(Calendar dateHired) {
        this.dateHired = dateHired;
    }

    public boolean isDismissed() {
        return dismissed;
    }

    public void setDismissed(boolean dismissed) {
        this.dismissed = dismissed;
    }

    public String getSpecialStatus() {
        return specialStatus;
    }

    public void setSpecialStatus(String specialStatus) {
        this.specialStatus = specialStatus;
    }

    public ReasonFired getReasonFired() {
        return reasonFired;
    }

    public void setReasonFired(ReasonFired reasonFired) {
        this.reasonFired = reasonFired;
    }

    public String getPersonalReasonFired() {
        return personalReasonFired;
    }

    public void setPersonalReasonFired(String personalReasonFired) {
        this.personalReasonFired = personalReasonFired;
    }

    public QualityLevel getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(QualityLevel qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public Calendar getDateDismissed() {
        return dateDismissed;
    }

    public void setDateDismissed(Calendar dateDismissed) {
        this.dateDismissed = dateDismissed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("member", member)
                .append("projectMembers", projectMembers)
                .append("dateHired", dateHired)
                .append("payMethod", payMethod)
                .append("qualityLevel", qualityLevel)
                .append("specialStatus", specialStatus)
                .append("dismissed", dismissed)
                .append("dateDismissed", dateDismissed)
                .append("reasonFired", reasonFired)
                .append("personalReasonFired", personalReasonFired)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        MemberDetails rhs = (MemberDetails) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.member, rhs.member)
                .append(this.projectMembers, rhs.projectMembers)
                .append(this.dateHired, rhs.dateHired)
                .append(this.payMethod, rhs.payMethod)
                .append(this.qualityLevel, rhs.qualityLevel)
                .append(this.specialStatus, rhs.specialStatus)
                .append(this.dismissed, rhs.dismissed)
                .append(this.dateDismissed, rhs.dateDismissed)
                .append(this.reasonFired, rhs.reasonFired)
                .append(this.personalReasonFired, rhs.personalReasonFired)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(member)
                .append(projectMembers)
                .append(dateHired)
                .append(payMethod)
                .append(qualityLevel)
                .append(specialStatus)
                .append(dismissed)
                .append(dateDismissed)
                .append(reasonFired)
                .append(personalReasonFired)
                .toHashCode();
    }
}