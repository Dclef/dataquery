package icu.dclef.clickhouse_springboot.mapper;

import icu.dclef.clickhouse_springboot.entity.Qq;
import icu.dclef.clickhouse_springboot.query.QqQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Qq)表数据库访问层
 *
 * @author dclef
 * @since 2023-02-13 18:43:35
 */
@Mapper
public interface QqMapper {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Qq queryById();

    /**
     * 查询所有
     *
     * @return 对象列表
     */
    List<Qq> queryAll();

    /**
     * 查询指定行数据
     *
     * @param query 查询条件
     * @return 对象列表
     */
    List<Qq> query(QqQuery query);

    List<Qq>queryQq(String qq);
    /**
     * 统计总行数
     *
     * @param query 查询条件
     * @return 总行数
     */
    long count(QqQuery query);

    /**
     * 新增数据
     */
    void insert(Qq qq);


    /**
     * 修改数据
     */
    void update(Qq qq);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById();

}

