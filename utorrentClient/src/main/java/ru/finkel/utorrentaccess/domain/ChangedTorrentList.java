
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
    "files",
    "label",
    "torrentp",
    "torrentm",
    "torrentc",
    "rssfeedp",
    "rssfeedm",
    "rssfilterp",
    "rssfilterm"
})
public class ChangedTorrentList {

    @JsonProperty("build")
    private Integer build;
    @JsonProperty("files")
    private List<String> files = new ArrayList<>();
    @JsonProperty("label")
    private List<Object> label = new ArrayList<>();
    @JsonProperty("torrentp")
    private List<SingleListTorrent> torrentp = new ArrayList<>();
    @JsonProperty("torrentm")
    private List<String> torrentm = new ArrayList<>();
    @JsonProperty("torrentc")
    private String torrentc;
    @JsonProperty("rssfeedp")
    private List<Object> rssfeedp = new ArrayList<>();
    @JsonProperty("rssfeedm")
    private List<Object> rssfeedm = new ArrayList<>();
    @JsonProperty("rssfilterp")
    private List<Object> rssfilterp = new ArrayList<>();
    @JsonProperty("rssfilterm")
    private List<Object> rssfilterm = new ArrayList<>();
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("build")
    public Integer getBuild() {
        return build;
    }

    @JsonProperty("build")
    public void setBuild(Integer build) {
        this.build = build;
    }

    public ChangedTorrentList withBuild(Integer build) {
        this.build = build;
        return this;
    }

    @JsonProperty("files")
    public List<String> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<String> files) {
        this.files = files;
    }

    public ChangedTorrentList withFiles(List<String> files) {
        this.files = files;
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

    public ChangedTorrentList withLabel(List<Object> label) {
        this.label = label;
        return this;
    }

    @JsonProperty("torrentp")
    public List<SingleListTorrent> getTorrentp() {
        return torrentp;
    }

    @JsonProperty("torrentp")
    public void setTorrentp(List<SingleListTorrent> torrentp) {
        this.torrentp = torrentp;
    }

    public ChangedTorrentList withTorrentp(List<SingleListTorrent> torrentp) {
        this.torrentp = torrentp;
        return this;
    }

    @JsonProperty("torrentm")
    public List<String> getTorrentm() {
        return torrentm;
    }

    @JsonProperty("torrentm")
    public void setTorrentm(List<String> torrentm) {
        this.torrentm = torrentm;
    }

    public ChangedTorrentList withTorrentm(List<String> torrentm) {
        this.torrentm = torrentm;
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

    public ChangedTorrentList withTorrentc(String torrentc) {
        this.torrentc = torrentc;
        return this;
    }

    @JsonProperty("rssfeedp")
    public List<Object> getRssfeedp() {
        return rssfeedp;
    }

    @JsonProperty("rssfeedp")
    public void setRssfeedp(List<Object> rssfeedp) {
        this.rssfeedp = rssfeedp;
    }

    public ChangedTorrentList withRssfeedp(List<Object> rssfeedp) {
        this.rssfeedp = rssfeedp;
        return this;
    }

    @JsonProperty("rssfeedm")
    public List<Object> getRssfeedm() {
        return rssfeedm;
    }

    @JsonProperty("rssfeedm")
    public void setRssfeedm(List<Object> rssfeedm) {
        this.rssfeedm = rssfeedm;
    }

    public ChangedTorrentList withRssfeedm(List<Object> rssfeedm) {
        this.rssfeedm = rssfeedm;
        return this;
    }

    @JsonProperty("rssfilterp")
    public List<Object> getRssfilterp() {
        return rssfilterp;
    }

    @JsonProperty("rssfilterp")
    public void setRssfilterp(List<Object> rssfilterp) {
        this.rssfilterp = rssfilterp;
    }

    public ChangedTorrentList withRssfilterp(List<Object> rssfilterp) {
        this.rssfilterp = rssfilterp;
        return this;
    }

    @JsonProperty("rssfilterm")
    public List<Object> getRssfilterm() {
        return rssfilterm;
    }

    @JsonProperty("rssfilterm")
    public void setRssfilterm(List<Object> rssfilterm) {
        this.rssfilterm = rssfilterm;
    }

    public ChangedTorrentList withRssfilterm(List<Object> rssfilterm) {
        this.rssfilterm = rssfilterm;
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
