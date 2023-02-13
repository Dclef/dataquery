package icu.dclef.clickhouse_springboot.service.impl;

import icu.dclef.clickhouse_springboot.entity.Qq;
import icu.dclef.clickhouse_springboot.mapper.QqMapper;
import icu.dclef.clickhouse_springboot.query.QqQuery;
import icu.dclef.clickhouse_springboot.util.PageList;
import icu.dclef.clickhouse_springboot.service.QqService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Qq)表服务实现类
 *
 * @author dclef
 * @since 2023-02-13 18:43:36
 */
@Service
public class QqServiceImpl implements QqService {
    @Resource
    private QqMapper qqMapper;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    @Override
    public Qq queryById(String qq) {
        return this.qqMapper.queryById();
    }

    /**
     * 查询所有
     *
     * @return 列表
     */
    @Override
    public List<Qq> queryAll() {
        return this.qqMapper.queryAll();
    }



    /**
     * 分页查询
     *
     * @param query 筛选条件
     * @return 查询结果
     */
    @Override
    public PageList<Qq> queryPage(QqQuery query) {
        // 查询当前页的数据
        List<Qq> rows = qqMapper.query(query);
        //查询总条数
        Long total = qqMapper.count(query);

        return new PageList<>(total, rows);
    }

    @Override
    public List<Qq> queryQq(String qq) {
        return qqMapper.queryQq(qq);
    }

    /**
     * 新增数据
     *
     * @param qq 实例对象
     */
    @Override
    @Transactional
    public void insert(Qq qq) {
        this.qqMapper.insert(qq);
    }

    /**
     * 修改数据
     *
     * @param qq 实例对象
     */
    @Override
    @Transactional
    public void update(Qq qq) {
        this.qqMapper.update(qq);
    }

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.qqMapper.deleteById() > 0;
    }


}
