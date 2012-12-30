package ru.finkel.utorrentaccess.domain;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude( JsonInclude.Include.NON_NULL )
@Generated( "com.googlecode.jsonschema2pojo" )
@JsonPropertyOrder( { "build", "props" } )
public class SingleTorrent {

	@JsonProperty( "build" )
	private Integer build;
	@JsonProperty( "props" )
	@Valid
	private List<Prop> props = new ArrayList<Prop>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty( "build" )
	public Integer getBuild() {
		return build;
	}

	@JsonProperty( "build" )
	public void setBuild( Integer build ) {
		this.build = build;
	}

	public SingleTorrent withBuild( Integer build ) {
		this.build = build;
		return this;
	}

	@JsonProperty( "props" )
	public List<Prop> getProps() {
		return props;
	}

	@JsonProperty( "props" )
	public void setProps( List<Prop> props ) {
		this.props = props;
	}

	public SingleTorrent withProps( List<Prop> props ) {
		this.props = props;
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString( this );
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode( this );
	}

	@Override
	public boolean equals( Object other ) {
		return EqualsBuilder.reflectionEquals( this, other );
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties( String name, Object value ) {
		this.additionalProperties.put( name, value );
	}

}
