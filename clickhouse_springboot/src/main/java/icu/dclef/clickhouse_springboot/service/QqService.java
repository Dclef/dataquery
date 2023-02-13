package icu.dclef.clickhouse_springboot.service;

import icu.dclef.clickhouse_springboot.entity.Qq;
import icu.dclef.clickhouse_springboot.query.QqQuery;
import icu.dclef.clickhouse_springboot.util.PageList;

import java.util.List;

/**
 * (Qq)表服务接口
 *
 * @author dclef
 * @since 2023-02-13 18:43:36
 */
public interface QqService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Qq queryById(String qq);

    /**
     * 查询所有
     *
     * @return 对象列表
     */
    List<Qq> queryAll();
    List<Qq>queryQq(String qq);
    /**
     * 分页查询
     *
     * @param query 筛选条件
     * @return 查询结果
     */
    PageList<Qq> queryPage(QqQuery query);

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
     * @return 是否成功
     */
    boolean deleteById();

}
