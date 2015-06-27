package com.babeltron.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * @author  Rafael Bemerguy
 * @since   27/06/2015
 */
public class QualityLevel {
    private int id;
    private String level;
    private List<Member> members;

    public QualityLevel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("level", level)
                .append("members", members)
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
        QualityLevel rhs = (QualityLevel) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.level, rhs.level)
                .append(this.members, rhs.members)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(level)
                .append(members)
                .toHashCode();
    }
}
