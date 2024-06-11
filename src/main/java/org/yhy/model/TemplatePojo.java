package org.yhy.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TemplatePojo implements Serializable {
    private static final long serialVersionUID = 1L;
    String id;
    String templateContent;
}
