package ru.finkel.utorrentaccess.domain;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude( JsonInclude.Include.NON_NULL )
@Generated( "com.googlecode.jsonschema2pojo" )
@JsonPropertyOrder( { "hash", "trackers", "ulrate", "dlrate", "superseed", "dht", "pex", "seed_override", "seed_ratio", "seed_time", "ulslots",
		"seed_num" } )
public class Prop {

	@JsonProperty( "hash" )
	private String hash;
	@JsonProperty( "trackers" )
	private String trackers;
	@JsonProperty( "ulrate" )
	private Integer ulrate;
	@JsonProperty( "dlrate" )
	private Integer dlrate;
	@JsonProperty( "superseed" )
	private Integer superseed;
	@JsonProperty( "dht" )
	private Integer dht;
	@JsonProperty( "pex" )
	private Integer pex;
	@JsonProperty( "seed_override" )
	private Integer seed_override;
	@JsonProperty( "seed_ratio" )
	private Integer seed_ratio;
	@JsonProperty( "seed_time" )
	private Integer seed_time;
	@JsonProperty( "ulslots" )
	private Integer ulslots;
	@JsonProperty( "seed_num" )
	private Integer seed_num;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty( "hash" )
	public String getHash() {
		return hash;
	}

	@JsonProperty( "hash" )
	public void setHash( String hash ) {
		this.hash = hash;
	}

	public Prop withHash( String hash ) {
		this.hash = hash;
		return this;
	}

	@JsonProperty( "trackers" )
	public String getTrackers() {
		return trackers;
	}

	@JsonProperty( "trackers" )
	public void setTrackers( String trackers ) {
		this.trackers = trackers;
	}

	public Prop withTrackers( String trackers ) {
		this.trackers = trackers;
		return this;
	}

	@JsonProperty( "ulrate" )
	public Integer getUlrate() {
		return ulrate;
	}

	@JsonProperty( "ulrate" )
	public void setUlrate( Integer ulrate ) {
		this.ulrate = ulrate;
	}

	public Prop withUlrate( Integer ulrate ) {
		this.ulrate = ulrate;
		return this;
	}

	@JsonProperty( "dlrate" )
	public Integer getDlrate() {
		return dlrate;
	}

	@JsonProperty( "dlrate" )
	public void setDlrate( Integer dlrate ) {
		this.dlrate = dlrate;
	}

	public Prop withDlrate( Integer dlrate ) {
		this.dlrate = dlrate;
		return this;
	}

	@JsonProperty( "superseed" )
	public Integer getSuperseed() {
		return superseed;
	}

	@JsonProperty( "superseed" )
	public void setSuperseed( Integer superseed ) {
		this.superseed = superseed;
	}

	public Prop withSuperseed( Integer superseed ) {
		this.superseed = superseed;
		return this;
	}

	@JsonProperty( "dht" )
	public Integer getDht() {
		return dht;
	}

	@JsonProperty( "dht" )
	public void setDht( Integer dht ) {
		this.dht = dht;
	}

	public Prop withDht( Integer dht ) {
		this.dht = dht;
		return this;
	}

	@JsonProperty( "pex" )
	public Integer getPex() {
		return pex;
	}

	@JsonProperty( "pex" )
	public void setPex( Integer pex ) {
		this.pex = pex;
	}

	public Prop withPex( Integer pex ) {
		this.pex = pex;
		return this;
	}

	@JsonProperty( "seed_override" )
	public Integer getSeed_override() {
		return seed_override;
	}

	@JsonProperty( "seed_override" )
	public void setSeed_override( Integer seed_override ) {
		this.seed_override = seed_override;
	}

	public Prop withSeed_override( Integer seed_override ) {
		this.seed_override = seed_override;
		return this;
	}

	@JsonProperty( "seed_ratio" )
	public Integer getSeed_ratio() {
		return seed_ratio;
	}

	@JsonProperty( "seed_ratio" )
	public void setSeed_ratio( Integer seed_ratio ) {
		this.seed_ratio = seed_ratio;
	}

	public Prop withSeed_ratio( Integer seed_ratio ) {
		this.seed_ratio = seed_ratio;
		return this;
	}

	@JsonProperty( "seed_time" )
	public Integer getSeed_time() {
		return seed_time;
	}

	@JsonProperty( "seed_time" )
	public void setSeed_time( Integer seed_time ) {
		this.seed_time = seed_time;
	}

	public Prop withSeed_time( Integer seed_time ) {
		this.seed_time = seed_time;
		return this;
	}

	@JsonProperty( "ulslots" )
	public Integer getUlslots() {
		return ulslots;
	}

	@JsonProperty( "ulslots" )
	public void setUlslots( Integer ulslots ) {
		this.ulslots = ulslots;
	}

	public Prop withUlslots( Integer ulslots ) {
		this.ulslots = ulslots;
		return this;
	}

	@JsonProperty( "seed_num" )
	public Integer getSeed_num() {
		return seed_num;
	}

	@JsonProperty( "seed_num" )
	public void setSeed_num( Integer seed_num ) {
		this.seed_num = seed_num;
	}

	public Prop withSeed_num( Integer seed_num ) {
		this.seed_num = seed_num;
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
