package com.babeltron.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Calendar;

/**
 * @author  Rafael Bemerguy
 * @since   27/06/2015
 */
public class ProjectMember {
    private long id;
    private Calendar dateAssigned;
    private Member member;
    private Project project;
    private boolean unassigned;
    private Calendar dateUnassigned;

    public ProjectMember() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(Calendar dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean isUnassigned() {
        return unassigned;
    }

    public void setUnassigned(boolean unassigned) {
        this.unassigned = unassigned;
    }

    public Calendar getDateUnassigned() {
        return dateUnassigned;
    }

    public void setDateUnassigned(Calendar dateUnassigned) {
        this.dateUnassigned = dateUnassigned;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("dateAssigned", dateAssigned)
                .append("member", member)
                .append("project", project)
                .append("unassigned", unassigned)
                .append("dateUnassigned", dateUnassigned)
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
        ProjectMember rhs = (ProjectMember) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.dateAssigned, rhs.dateAssigned)
                .append(this.member, rhs.member)
                .append(this.project, rhs.project)
                .append(this.unassigned, rhs.unassigned)
                .append(this.dateUnassigned, rhs.dateUnassigned)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(dateAssigned)
                .append(member)
                .append(project)
                .append(unassigned)
                .append(dateUnassigned)
                .toHashCode();
    }
}
