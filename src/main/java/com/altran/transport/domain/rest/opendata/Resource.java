
package com.altran.transport.domain.rest.opendata;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Resource implements Serializable
{

    private Object cacheLastUpdated;
    private String packageId;
    private boolean datastoreActive;
    private String id;
    private Object size;
    private String state;
    private String apiAccessNumber;
    private String apiAccessNumberAbsolute;
    private String tokenRequired;
    private String hash;
    private String description;
    private String format;
    private String downloads;
    private Object mimetypeInner;
    private Object urlType;
    private String columnTypes;
    private String fileVolum;
    private Object mimetype;
    private Object cacheUrl;
    private String name;
    private String created;
    private String url;
    private String downloadsAbsolute;
    private String mapVisualizationRes;
    private String qa;
    private Object lastModified;
    private long position;
    private String revisionId;
    private Object resourceType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7904468681825323986L;

    public Object getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    public void setCacheLastUpdated(Object cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public boolean isDatastoreActive() {
        return datastoreActive;
    }

    public void setDatastoreActive(boolean datastoreActive) {
        this.datastoreActive = datastoreActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getApiAccessNumber() {
        return apiAccessNumber;
    }

    public void setApiAccessNumber(String apiAccessNumber) {
        this.apiAccessNumber = apiAccessNumber;
    }

    public String getApiAccessNumberAbsolute() {
        return apiAccessNumberAbsolute;
    }

    public void setApiAccessNumberAbsolute(String apiAccessNumberAbsolute) {
        this.apiAccessNumberAbsolute = apiAccessNumberAbsolute;
    }

    public String getTokenRequired() {
        return tokenRequired;
    }

    public void setTokenRequired(String tokenRequired) {
        this.tokenRequired = tokenRequired;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    public Object getMimetypeInner() {
        return mimetypeInner;
    }

    public void setMimetypeInner(Object mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    public Object getUrlType() {
        return urlType;
    }

    public void setUrlType(Object urlType) {
        this.urlType = urlType;
    }

    public String getColumnTypes() {
        return columnTypes;
    }

    public void setColumnTypes(String columnTypes) {
        this.columnTypes = columnTypes;
    }

    public String getFileVolum() {
        return fileVolum;
    }

    public void setFileVolum(String fileVolum) {
        this.fileVolum = fileVolum;
    }

    public Object getMimetype() {
        return mimetype;
    }

    public void setMimetype(Object mimetype) {
        this.mimetype = mimetype;
    }

    public Object getCacheUrl() {
        return cacheUrl;
    }

    public void setCacheUrl(Object cacheUrl) {
        this.cacheUrl = cacheUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDownloadsAbsolute() {
        return downloadsAbsolute;
    }

    public void setDownloadsAbsolute(String downloadsAbsolute) {
        this.downloadsAbsolute = downloadsAbsolute;
    }

    public String getMapVisualizationRes() {
        return mapVisualizationRes;
    }

    public void setMapVisualizationRes(String mapVisualizationRes) {
        this.mapVisualizationRes = mapVisualizationRes;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public Object getLastModified() {
        return lastModified;
    }

    public void setLastModified(Object lastModified) {
        this.lastModified = lastModified;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public Object getResourceType() {
        return resourceType;
    }

    public void setResourceType(Object resourceType) {
        this.resourceType = resourceType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
