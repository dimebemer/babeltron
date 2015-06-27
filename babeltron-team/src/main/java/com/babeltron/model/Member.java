package com.babeltron.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author  Rafael Bemerguy
 * @since   27/06/2015
 */
public class Member {

    // Personal data
    private int id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String skype;
    private String residence;
    private Language nativeLanguage;
    private MemberDetails memberDetails;

    // EMPTY CONSTRUCTOR

    public Member() {
    }

    // GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public Language getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(Language nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public MemberDetails getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetails memberDetails) {
        this.memberDetails = memberDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("username", username)
                .append("password", password)
                .append("email", email)
                .append("skype", skype)
                .append("residence", residence)
                .append("nativeLanguage", nativeLanguage)
                .append("memberDetails", memberDetails)
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
        Member rhs = (Member) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.name, rhs.name)
                .append(this.username, rhs.username)
                .append(this.password, rhs.password)
                .append(this.email, rhs.email)
                .append(this.skype, rhs.skype)
                .append(this.residence, rhs.residence)
                .append(this.nativeLanguage, rhs.nativeLanguage)
                .append(this.memberDetails, rhs.memberDetails)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(name)
                .append(username)
                .append(password)
                .append(email)
                .append(skype)
                .append(residence)
                .append(nativeLanguage)
                .append(memberDetails)
                .toHashCode();
    }
}
