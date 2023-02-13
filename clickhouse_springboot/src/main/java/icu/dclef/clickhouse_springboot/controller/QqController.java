package icu.dclef.clickhouse_springboot.controller;

import icu.dclef.clickhouse_springboot.entity.Qq;
import icu.dclef.clickhouse_springboot.query.QqQuery;
import icu.dclef.clickhouse_springboot.service.QqService;
import icu.dclef.clickhouse_springboot.util.PageList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Qq)表控制层
 *
 * @author dclef
 * @since 2023-02-13 18:43:36
 */
@Api(tags = "模块")
@RestController
@RequestMapping("/qq")
public class QqController {
    /**
     * 服务对象
     */
    @Resource
    private QqService qqService;

    /**
     * 分页查询
     *
     * @param query 筛选条件
     * @return 查询结果
     */
    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.GET, produces = "application/json")
    public PageList<Qq> page(QqQuery query) {
        return qqService.queryPage(query);
    }


    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @ApiOperation(value = "查询单条数据")
    @RequestMapping(value = "/{qq}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Qq> queryById(@PathVariable("qq") String qq) {
        return ResponseEntity.ok(this.qqService.queryById(qq));
    }

    @GetMapping("/qeuryqq")
    public List<Qq> queryQq(@RequestParam("qq") String qq) {
        return qqService.queryQq(qq);
    }


}

