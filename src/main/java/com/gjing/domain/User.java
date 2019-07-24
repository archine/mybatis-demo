package com.gjing.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Gjing
 * @description TODO
 * @date 2019/7/24
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;

    private Integer companyId;

    private String userName;

    private Integer userAge;

    private Date createTime;
}
