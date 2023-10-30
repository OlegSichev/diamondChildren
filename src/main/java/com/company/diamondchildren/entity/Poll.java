package com.company.diamondchildren.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "POLL")
@Entity
public class Poll {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "START_POLL", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date start_poll;

    @Column(name = "STOP_POLL", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date stop_poll;

    public Date getStop_poll() {
        return stop_poll;
    }

    public void setStop_poll(Date stop_poll) {
        this.stop_poll = stop_poll;
    }

    public Date getStart_poll() {
        return start_poll;
    }

    public void setStart_poll(Date start_poll) {
        this.start_poll = start_poll;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}