package com.dxj.module.system.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
* @author Sinkiang
* @date 2019-03-25
*/
@Data
public class DeptDTO implements Serializable {

    private Long id;

    private String name;

    private Boolean enabled;

    private Long pid;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DeptDTO> children;

    private Timestamp createTime;

    public String getLabel() {
        return name;
    }
}
