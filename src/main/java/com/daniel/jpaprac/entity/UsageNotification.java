package com.daniel.jpaprac.entity;

import com.daniel.jpaprac.converter.StringArrayConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name = "hr_usage_notification", schema = "hyper_report")
@Getter
@Setter
@ToString
//@TypeDef(name = "list-string", typeClass = ArrayList.class)
public class UsageNotification {

    @Id
    private Long id;

    private String title;

    @Convert(converter = StringArrayConverter.class)
    private List<String> emailidlist;

}
