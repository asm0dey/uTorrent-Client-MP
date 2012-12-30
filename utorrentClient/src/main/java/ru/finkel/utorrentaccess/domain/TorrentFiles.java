
package ru.finkel.utorrentaccess.domain;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "build",
    "files"
})
public class TorrentFiles {

    @JsonProperty("build")
    private Integer build;
    @JsonProperty("files")
    private List<FilesObject> files = new ArrayList<>();
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("build")
    public Integer getBuild() {
        return build;
    }

    @JsonProperty("build")
    public void setBuild(Integer build) {
        this.build = build;
    }

    public TorrentFiles withBuild(Integer build) {
        this.build = build;
        return this;
    }

    @JsonProperty("files")
    public List<FilesObject> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<FilesObject> files) {
        this.files = files;
    }

    public TorrentFiles withFiles(List<FilesObject> files) {
        this.files = files;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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
