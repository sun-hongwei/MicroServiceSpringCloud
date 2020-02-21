package com.sun.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 部门表
 * @author sunhw
 */

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable //必须序列化
{
    /**
     * 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String dName;
    /**
     * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     */
    private String dbSource;

    public Dept(String dname) {
        super();
        this.dName = dname;
    }
}
