
package ru.finkel.utorrentaccess.domain;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "build",
    "label",
    "torrents",
    "torrentc",
    "rssfeeds",
    "rssfilters"
})
public class TorrentList {

    @JsonProperty("build")
    private Integer build;
    @JsonProperty("label")
    private List<Object> label = new ArrayList<>();
    @JsonProperty("torrents")
    private List<SingleListTorrent> torrents = new ArrayList<>();
    @JsonProperty("torrentc")
    private String torrentc;
    @JsonProperty("rssfeeds")
    private List<Object> rssfeeds = new ArrayList<>();
    @JsonProperty("rssfilters")
    private List<Object> rssfilters = new ArrayList<>();
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("build")
    public Integer getBuild() {
        return build;
    }

    @JsonProperty("build")
    public void setBuild(Integer build) {
        this.build = build;
    }

    public TorrentList withBuild(Integer build) {
        this.build = build;
        return this;
    }

    @JsonProperty("label")
    public List<Object> getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(List<Object> label) {
        this.label = label;
    }

    public TorrentList withLabel(List<Object> label) {
        this.label = label;
        return this;
    }

    @JsonProperty("torrents")
    public List<SingleListTorrent> getTorrents() {
        return torrents;
    }

    @JsonProperty("torrents")
    public void setTorrents(List<SingleListTorrent> torrents) {
        this.torrents = torrents;
    }

    public TorrentList withTorrents(List<SingleListTorrent> torrents) {
        this.torrents = torrents;
        return this;
    }

    @JsonProperty("torrentc")
    public String getTorrentc() {
        return torrentc;
    }

    @JsonProperty("torrentc")
    public void setTorrentc(String torrentc) {
        this.torrentc = torrentc;
    }

    public TorrentList withTorrentc(String torrentc) {
        this.torrentc = torrentc;
        return this;
    }

    @JsonProperty("rssfeeds")
    public List<Object> getRssfeeds() {
        return rssfeeds;
    }

    @JsonProperty("rssfeeds")
    public void setRssfeeds(List<Object> rssfeeds) {
        this.rssfeeds = rssfeeds;
    }

    public TorrentList withRssfeeds(List<Object> rssfeeds) {
        this.rssfeeds = rssfeeds;
        return this;
    }

    @JsonProperty("rssfilters")
    public List<Object> getRssfilters() {
        return rssfilters;
    }

    @JsonProperty("rssfilters")
    public void setRssfilters(List<Object> rssfilters) {
        this.rssfilters = rssfilters;
    }

    public TorrentList withRssfilters(List<Object> rssfilters) {
        this.rssfilters = rssfilters;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
