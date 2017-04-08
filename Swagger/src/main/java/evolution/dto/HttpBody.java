package evolution.dto;

import java.util.List;

public class HttpBody {
	private List<String> tags;
	private String summary;
	private String description;
	private String operationId;
	private List<String> consumes;
	private List<String> produces;
	private List<Parameter> parameters;
	private Responses responses;
	private List<Object> security;
	
	public List<String> getConsumes() {
		return consumes;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getOperationId() {
		return operationId;
	}
	
	public List<Parameter> getParameters() {
		return parameters;
	}
	
	public List<String> getProduces() {
		return produces;
	}
	
	public Responses getResponses() {
		return responses;
	}
	
	public List<Object> getSecurity() {
		return security;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public List<String> getTags() {
		return tags;
	}
	
	public void setConsumes(List<String> consumes) {
		this.consumes = consumes;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	
	public void setProduces(List<String> produces) {
		this.produces = produces;
	}
	
	public void setResponses(Responses responses) {
		this.responses = responses;
	}
	
	public void setSecurity(List<Object> security) {
		this.security = security;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return "HttpBody [tags=" + tags + ", summary=" + summary + ", description=" + description + ", operationId="
				+ operationId + ", consumes=" + consumes + ", produces=" + produces + ", parameters=" + parameters
				+ ", responses=" + responses + ", security=" + security + "]";
	}
}
