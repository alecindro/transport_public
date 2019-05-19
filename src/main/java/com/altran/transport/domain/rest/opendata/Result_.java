
package com.altran.transport.domain.rest.opendata;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Result_ implements Serializable
{

    private String id;
    private NotesTranslated notesTranslated;
    private String geolocation;
    private String code;
    @JsonProperty("url_tornada")
    private UrlTornada urlTornada;
    private String datasetFieldsDescription;
    private String fuente;
    private boolean _private;
    private long numTags;
    private String api;
    private String frequency;
    private String updateString;
    private TitleTranslated titleTranslated;
    private String metadataModified;
    private String author;
    private String authorEmail;
    private boolean isopen;
    private String state;
    private String version;
    private String observations;
    private List<Object> relationshipsAsObject = null;
    private String department;
    private String creatorUserId;
    private String type;
    private List<Resource> resources = null;
    private long numResources;
    private List<Tag> tags = null;
    private String fechaPublicacion;
    private String loadType;
    private List<Object> groups = null;
    private String licenseId;
    private List<Object> relationshipsAsSubject = null;
    private String licenseTitle;
    private Organization organization;
    private String name;
    private String url;
    private String notes;
    private String ownerOrg;
    private String tag;
    private String licenseUrl;
    private String historical;
    private String title;
    private String revisionId;
    private String dateDeactivationInformed;
    private List<Extra> extras = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8471190302412249182L;

    public NotesTranslated getNotesTranslated() {
        return notesTranslated;
    }

    public void setNotesTranslated(NotesTranslated notesTranslated) {
        this.notesTranslated = notesTranslated;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UrlTornada getUrlTornada() {
        return urlTornada;
    }

    public void setUrlTornada(UrlTornada urlTornada) {
        this.urlTornada = urlTornada;
    }

    public String getDatasetFieldsDescription() {
        return datasetFieldsDescription;
    }

    public void setDatasetFieldsDescription(String datasetFieldsDescription) {
        this.datasetFieldsDescription = datasetFieldsDescription;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public boolean isPrivate() {
        return _private;
    }

    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public long getNumTags() {
        return numTags;
    }

    public void setNumTags(long numTags) {
        this.numTags = numTags;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getUpdateString() {
        return updateString;
    }

    public void setUpdateString(String updateString) {
        this.updateString = updateString;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TitleTranslated getTitleTranslated() {
        return titleTranslated;
    }

    public void setTitleTranslated(TitleTranslated titleTranslated) {
        this.titleTranslated = titleTranslated;
    }

    public String getMetadataModified() {
        return metadataModified;
    }

    public void setMetadataModified(String metadataModified) {
        this.metadataModified = metadataModified;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public List<Object> getRelationshipsAsObject() {
        return relationshipsAsObject;
    }

    public void setRelationshipsAsObject(List<Object> relationshipsAsObject) {
        this.relationshipsAsObject = relationshipsAsObject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public long getNumResources() {
        return numResources;
    }

    public void setNumResources(long numResources) {
        this.numResources = numResources;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public List<Object> getRelationshipsAsSubject() {
        return relationshipsAsSubject;
    }

    public void setRelationshipsAsSubject(List<Object> relationshipsAsSubject) {
        this.relationshipsAsSubject = relationshipsAsSubject;
    }

    public String getLicenseTitle() {
        return licenseTitle;
    }

    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getHistorical() {
        return historical;
    }

    public void setHistorical(String historical) {
        this.historical = historical;
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

    public String getDateDeactivationInformed() {
        return dateDeactivationInformed;
    }

    public void setDateDeactivationInformed(String dateDeactivationInformed) {
        this.dateDeactivationInformed = dateDeactivationInformed;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
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
		result = prime * result + (_private ? 1231 : 1237);
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((api == null) ? 0 : api.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((authorEmail == null) ? 0 : authorEmail.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((creatorUserId == null) ? 0 : creatorUserId.hashCode());
		result = prime * result + ((datasetFieldsDescription == null) ? 0 : datasetFieldsDescription.hashCode());
		result = prime * result + ((dateDeactivationInformed == null) ? 0 : dateDeactivationInformed.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((extras == null) ? 0 : extras.hashCode());
		result = prime * result + ((fechaPublicacion == null) ? 0 : fechaPublicacion.hashCode());
		result = prime * result + ((frequency == null) ? 0 : frequency.hashCode());
		result = prime * result + ((fuente == null) ? 0 : fuente.hashCode());
		result = prime * result + ((geolocation == null) ? 0 : geolocation.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((historical == null) ? 0 : historical.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isopen ? 1231 : 1237);
		result = prime * result + ((licenseId == null) ? 0 : licenseId.hashCode());
		result = prime * result + ((licenseTitle == null) ? 0 : licenseTitle.hashCode());
		result = prime * result + ((licenseUrl == null) ? 0 : licenseUrl.hashCode());
		result = prime * result + ((loadType == null) ? 0 : loadType.hashCode());
		result = prime * result + ((metadataModified == null) ? 0 : metadataModified.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((notesTranslated == null) ? 0 : notesTranslated.hashCode());
		result = prime * result + (int) (numResources ^ (numResources >>> 32));
		result = prime * result + (int) (numTags ^ (numTags >>> 32));
		result = prime * result + ((observations == null) ? 0 : observations.hashCode());
		result = prime * result + ((organization == null) ? 0 : organization.hashCode());
		result = prime * result + ((ownerOrg == null) ? 0 : ownerOrg.hashCode());
		result = prime * result + ((relationshipsAsObject == null) ? 0 : relationshipsAsObject.hashCode());
		result = prime * result + ((relationshipsAsSubject == null) ? 0 : relationshipsAsSubject.hashCode());
		result = prime * result + ((resources == null) ? 0 : resources.hashCode());
		result = prime * result + ((revisionId == null) ? 0 : revisionId.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((titleTranslated == null) ? 0 : titleTranslated.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((updateString == null) ? 0 : updateString.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((urlTornada == null) ? 0 : urlTornada.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		Result_ other = (Result_) obj;
		if (_private != other._private)
			return false;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (api == null) {
			if (other.api != null)
				return false;
		} else if (!api.equals(other.api))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (authorEmail == null) {
			if (other.authorEmail != null)
				return false;
		} else if (!authorEmail.equals(other.authorEmail))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (creatorUserId == null) {
			if (other.creatorUserId != null)
				return false;
		} else if (!creatorUserId.equals(other.creatorUserId))
			return false;
		if (datasetFieldsDescription == null) {
			if (other.datasetFieldsDescription != null)
				return false;
		} else if (!datasetFieldsDescription.equals(other.datasetFieldsDescription))
			return false;
		if (dateDeactivationInformed == null) {
			if (other.dateDeactivationInformed != null)
				return false;
		} else if (!dateDeactivationInformed.equals(other.dateDeactivationInformed))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (extras == null) {
			if (other.extras != null)
				return false;
		} else if (!extras.equals(other.extras))
			return false;
		if (fechaPublicacion == null) {
			if (other.fechaPublicacion != null)
				return false;
		} else if (!fechaPublicacion.equals(other.fechaPublicacion))
			return false;
		if (frequency == null) {
			if (other.frequency != null)
				return false;
		} else if (!frequency.equals(other.frequency))
			return false;
		if (fuente == null) {
			if (other.fuente != null)
				return false;
		} else if (!fuente.equals(other.fuente))
			return false;
		if (geolocation == null) {
			if (other.geolocation != null)
				return false;
		} else if (!geolocation.equals(other.geolocation))
			return false;
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
			return false;
		if (historical == null) {
			if (other.historical != null)
				return false;
		} else if (!historical.equals(other.historical))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isopen != other.isopen)
			return false;
		if (licenseId == null) {
			if (other.licenseId != null)
				return false;
		} else if (!licenseId.equals(other.licenseId))
			return false;
		if (licenseTitle == null) {
			if (other.licenseTitle != null)
				return false;
		} else if (!licenseTitle.equals(other.licenseTitle))
			return false;
		if (licenseUrl == null) {
			if (other.licenseUrl != null)
				return false;
		} else if (!licenseUrl.equals(other.licenseUrl))
			return false;
		if (loadType == null) {
			if (other.loadType != null)
				return false;
		} else if (!loadType.equals(other.loadType))
			return false;
		if (metadataModified == null) {
			if (other.metadataModified != null)
				return false;
		} else if (!metadataModified.equals(other.metadataModified))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (notesTranslated == null) {
			if (other.notesTranslated != null)
				return false;
		} else if (!notesTranslated.equals(other.notesTranslated))
			return false;
		if (numResources != other.numResources)
			return false;
		if (numTags != other.numTags)
			return false;
		if (observations == null) {
			if (other.observations != null)
				return false;
		} else if (!observations.equals(other.observations))
			return false;
		if (organization == null) {
			if (other.organization != null)
				return false;
		} else if (!organization.equals(other.organization))
			return false;
		if (ownerOrg == null) {
			if (other.ownerOrg != null)
				return false;
		} else if (!ownerOrg.equals(other.ownerOrg))
			return false;
		if (relationshipsAsObject == null) {
			if (other.relationshipsAsObject != null)
				return false;
		} else if (!relationshipsAsObject.equals(other.relationshipsAsObject))
			return false;
		if (relationshipsAsSubject == null) {
			if (other.relationshipsAsSubject != null)
				return false;
		} else if (!relationshipsAsSubject.equals(other.relationshipsAsSubject))
			return false;
		if (resources == null) {
			if (other.resources != null)
				return false;
		} else if (!resources.equals(other.resources))
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
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
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
		if (updateString == null) {
			if (other.updateString != null)
				return false;
		} else if (!updateString.equals(other.updateString))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (urlTornada == null) {
			if (other.urlTornada != null)
				return false;
		} else if (!urlTornada.equals(other.urlTornada))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Result_ [id=" + id + ", notesTranslated=" + notesTranslated + ", geolocation=" + geolocation + ", code="
				+ code + ", urlTornada=" + urlTornada + ", datasetFieldsDescription=" + datasetFieldsDescription
				+ ", fuente=" + fuente + ", _private=" + _private + ", numTags=" + numTags + ", api=" + api
				+ ", frequency=" + frequency + ", updateString=" + updateString + ", titleTranslated=" + titleTranslated
				+ ", metadataModified=" + metadataModified + ", author=" + author + ", authorEmail=" + authorEmail
				+ ", isopen=" + isopen + ", state=" + state + ", version=" + version + ", observations=" + observations
				+ ", relationshipsAsObject=" + relationshipsAsObject + ", department=" + department + ", creatorUserId="
				+ creatorUserId + ", type=" + type + ", resources=" + resources + ", numResources=" + numResources
				+ ", tags=" + tags + ", fechaPublicacion=" + fechaPublicacion + ", loadType=" + loadType + ", groups="
				+ groups + ", licenseId=" + licenseId + ", relationshipsAsSubject=" + relationshipsAsSubject
				+ ", licenseTitle=" + licenseTitle + ", organization=" + organization + ", name=" + name + ", url="
				+ url + ", notes=" + notes + ", ownerOrg=" + ownerOrg + ", tag=" + tag + ", licenseUrl=" + licenseUrl
				+ ", historical=" + historical + ", title=" + title + ", revisionId=" + revisionId
				+ ", dateDeactivationInformed=" + dateDeactivationInformed + ", extras=" + extras
				+ ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
