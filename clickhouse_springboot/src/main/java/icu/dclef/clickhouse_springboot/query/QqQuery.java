package icu.dclef.clickhouse_springboot.query;

import lombok.Data;

/**
 * (Qq)高级查询+分页
 *
 * @author dclef
 * @since 2023-02-13 18:43:35
 */
@Data
public class QqQuery {
    /**
     * 当前页面
     */
    private Integer currentPage = 1;
    /**
     * 页面大小
     */
    private Integer pageSize = 10;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 得到开始指数
     *
     * @return {@link Integer}
     *///计算分页开始索引
    public Integer getBeginIndex() {
        return (this.currentPage - 1) * pageSize;
    }

}

