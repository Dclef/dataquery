package icu.dclef.clickhouse_springboot.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * (Qq)实体类
 *
 * @author dclef
 * @since 2023-02-13 18:43:35
 */
@Data
//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
public class Qq implements Serializable {
    private static final long serialVersionUID = 492661137554911840L;
    private String qq;

    private String phone;


}

