
package com.altran.transport.domain.rest.opendata;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DescriptionTranslated implements Serializable
{

    private String ca;
    private String en;
    private String es;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6842685311833008048L;

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
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
		result = prime * result + ((ca == null) ? 0 : ca.hashCode());
		result = prime * result + ((en == null) ? 0 : en.hashCode());
		result = prime * result + ((es == null) ? 0 : es.hashCode());
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
		DescriptionTranslated other = (DescriptionTranslated) obj;
		if (ca == null) {
			if (other.ca != null)
				return false;
		} else if (!ca.equals(other.ca))
			return false;
		if (en == null) {
			if (other.en != null)
				return false;
		} else if (!en.equals(other.en))
			return false;
		if (es == null) {
			if (other.es != null)
				return false;
		} else if (!es.equals(other.es))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DescriptionTranslated [ca=" + ca + ", en=" + en + ", es=" + es + "]";
	}
    
    

}
