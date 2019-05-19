
package com.altran.transport.domain.rest.opendata;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result implements Serializable
{
	
    private long count;
    private String sort;
    private Facets facets;
    private List<Result_> results = null;
    private SearchFacets searchFacets;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5266214796636138750L;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public List<Result_> getResults() {
        return results;
    }

    public void setResults(List<Result_> results) {
        this.results = results;
    }

    public SearchFacets getSearchFacets() {
        return searchFacets;
    }

    public void setSearchFacets(SearchFacets searchFacets) {
        this.searchFacets = searchFacets;
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
		result = prime * result + (int) (count ^ (count >>> 32));
		result = prime * result + ((facets == null) ? 0 : facets.hashCode());
		result = prime * result + ((results == null) ? 0 : results.hashCode());
		result = prime * result + ((searchFacets == null) ? 0 : searchFacets.hashCode());
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
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
		Result other = (Result) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (count != other.count)
			return false;
		if (facets == null) {
			if (other.facets != null)
				return false;
		} else if (!facets.equals(other.facets))
			return false;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		if (searchFacets == null) {
			if (other.searchFacets != null)
				return false;
		} else if (!searchFacets.equals(other.searchFacets))
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Result [count=" + count + ", sort=" + sort + ", facets=" + facets + ", results=" + results
				+ ", searchFacets=" + searchFacets + ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
