package com.gjing.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author Gjing
 * @description TODO
 * @date 2019/7/24
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private Integer companyId;

    private String companyName;

    private List<User> userList;

    private Date createTime;
}
