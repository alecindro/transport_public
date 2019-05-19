
package com.altran.transport.domain.rest.opendata;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parent implements Serializable
{

    private String code;
    private String displayName;
    private String description;
    private String created;
    private long packageCount;
    private String imageDisplayUrl;
    private DescriptionTranslated descriptionTranslated;
    private String name;
    private boolean isOrganization;
    private String state;
    private String imageUrl;
    private List<Object> groups = null;
    private String type;
    private String title;
    private String revisionId;
    private TitleTranslated_ titleTranslated;
    private long numFollowers;
    private String id;
    private String approvalStatus;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2174149051857392183L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public long getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(long packageCount) {
        this.packageCount = packageCount;
    }

    public String getImageDisplayUrl() {
        return imageDisplayUrl;
    }

    public void setImageDisplayUrl(String imageDisplayUrl) {
        this.imageDisplayUrl = imageDisplayUrl;
    }

    public DescriptionTranslated getDescriptionTranslated() {
        return descriptionTranslated;
    }

    public void setDescriptionTranslated(DescriptionTranslated descriptionTranslated) {
        this.descriptionTranslated = descriptionTranslated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsOrganization() {
        return isOrganization;
    }

    public void setIsOrganization(boolean isOrganization) {
        this.isOrganization = isOrganization;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public TitleTranslated_ getTitleTranslated() {
        return titleTranslated;
    }

    public void setTitleTranslated(TitleTranslated_ titleTranslated) {
        this.titleTranslated = titleTranslated;
    }

    public long getNumFollowers() {
        return numFollowers;
    }

    public void setNumFollowers(long numFollowers) {
        this.numFollowers = numFollowers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((approvalStatus == null) ? 0 : approvalStatus.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((descriptionTranslated == null) ? 0 : descriptionTranslated.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imageDisplayUrl == null) ? 0 : imageDisplayUrl.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + (isOrganization ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (numFollowers ^ (numFollowers >>> 32));
		result = prime * result + (int) (packageCount ^ (packageCount >>> 32));
		result = prime * result + ((revisionId == null) ? 0 : revisionId.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((titleTranslated == null) ? 0 : titleTranslated.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (approvalStatus == null) {
			if (other.approvalStatus != null)
				return false;
		} else if (!approvalStatus.equals(other.approvalStatus))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (descriptionTranslated == null) {
			if (other.descriptionTranslated != null)
				return false;
		} else if (!descriptionTranslated.equals(other.descriptionTranslated))
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageDisplayUrl == null) {
			if (other.imageDisplayUrl != null)
				return false;
		} else if (!imageDisplayUrl.equals(other.imageDisplayUrl))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (isOrganization != other.isOrganization)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numFollowers != other.numFollowers)
			return false;
		if (packageCount != other.packageCount)
			return false;
		if (revisionId == null) {
			if (other.revisionId != null)
				return false;
		} else if (!revisionId.equals(other.revisionId))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (titleTranslated == null) {
			if (other.titleTranslated != null)
				return false;
		} else if (!titleTranslated.equals(other.titleTranslated))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parent [code=" + code + ", displayName=" + displayName + ", description=" + description + ", created="
				+ created + ", packageCount=" + packageCount + ", imageDisplayUrl=" + imageDisplayUrl
				+ ", descriptionTranslated=" + descriptionTranslated + ", name=" + name + ", isOrganization="
				+ isOrganization + ", state=" + state + ", imageUrl=" + imageUrl + ", groups=" + groups + ", type="
				+ type + ", title=" + title + ", revisionId=" + revisionId + ", titleTranslated=" + titleTranslated
				+ ", numFollowers=" + numFollowers + ", id=" + id + ", approvalStatus=" + approvalStatus
				+ ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
