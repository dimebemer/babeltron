package com.babeltron.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * @author  Rafael Bemerguy
 * @since   27/06/2015
 */
public class Project {
    private int id;
    private String title;
    private String description;
    private Language language;
    private LanguagePair languagePair;
    private List<ProjectMember> projectMembers;
    private String account;
    private String password;
    private boolean active;

    // CONSTRUCTOR

    public Project() {
    }

    //GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<ProjectMember> getProjectMembers() {
        return projectMembers;
    }

    public void setProjectMembers(List<ProjectMember> projectMembers) {
        this.projectMembers = projectMembers;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LanguagePair getLanguagePair() {
        return languagePair;
    }

    public void setLanguagePair(LanguagePair languagePair) {
        this.languagePair = languagePair;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("description", description)
                .append("language", language)
                .append("languagePair", languagePair)
                .append("projectMembers", projectMembers)
                .append("account", account)
                .append("password", password)
                .append("active", active)
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
        Project rhs = (Project) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.title, rhs.title)
                .append(this.description, rhs.description)
                .append(this.language, rhs.language)
                .append(this.languagePair, rhs.languagePair)
                .append(this.projectMembers, rhs.projectMembers)
                .append(this.account, rhs.account)
                .append(this.password, rhs.password)
                .append(this.active, rhs.active)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(title)
                .append(description)
                .append(language)
                .append(languagePair)
                .append(projectMembers)
                .append(account)
                .append(password)
                .append(active)
                .toHashCode();
    }
}
