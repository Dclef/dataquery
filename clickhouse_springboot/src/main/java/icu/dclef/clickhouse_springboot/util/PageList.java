package icu.dclef.clickhouse_springboot.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页工具类
 *
 * @author dclef
 * @since 2023-02-13 18:43:37
 */
@Data
//全参数构造器
@AllArgsConstructor
//无参构造器
@NoArgsConstructor
public class PageList<T> {
    /**
     * 计算总条数
     */
    private Long total;

    /**
     * 列表展示
     */
    private List<T> rows = new ArrayList<>();

}
