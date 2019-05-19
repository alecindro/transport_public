package com.altran.transport.adapter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.altran.transport.domain.rest.opendata.ResponseRest;
import com.altran.transport.domain.rest.opendata.Result_;
import com.altran.transport.dto.DataSetDTO;

@Component
public class DataSetMapper {

	@Value("${app.opendata.default_language}")
	private String defaultLanguague;
	private String language;
	
	public List<DataSetDTO> responseToDTO(ResponseRest responseRest, String language) {
		this.language = language;
		if(language == null) {
			this.language = defaultLanguague;
		}
		return responseRest.getResult().getResults()
				.stream()
				.filter(Objects::nonNull)
				.map(this::toDTO)
				.collect(Collectors.toList());
		
	}
	
	private DataSetDTO toDTO(Result_ result) {
		DataSetDTO dataSetDTO = new DataSetDTO();
		dataSetDTO.setCode(result.getCode());
		dataSetDTO.setOrganization(result.getOrganization() == null ? "" : result.getOrganization().getDescriptionTranslated() == null ? result.getOrganization().getDescription() : result.getOrganization().getDescriptionTranslated().getDescriptionTranslated(language));
		dataSetDTO.setUrl(result.getUrlTornada() == null ? result.getUrl() : result.getUrlTornada().getUrlTranslated(language));
		return dataSetDTO;
	}
}
