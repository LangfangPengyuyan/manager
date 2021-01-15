package com.shengde.e3mall.dao;

import com.shengde.e3mall.entity.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbItemDesc)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-07 11:46:07
 */
public interface TbItemDescDao {

    /**
     * 通过ID查询单条数据
     *
     * @param itemId 主键
     * @return 实例对象
     */
    TbItemDesc queryById(Integer itemId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbItemDesc> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbItemDesc 实例对象
     * @return 对象列表
     */
    List<TbItemDesc> queryAll(TbItemDesc tbItemDesc);

    /**
     * 新增数据
     *
     * @param tbItemDesc 实例对象
     * @return 影响行数
     */
    int insert(TbItemDesc tbItemDesc);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItemDesc> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbItemDesc> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItemDesc> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbItemDesc> entities);

    /**
     * 修改数据
     *
     * @param tbItemDesc 实例对象
     * @return 影响行数
     */
    int update(TbItemDesc tbItemDesc);

    /**
     * 通过主键删除数据
     *
     * @param itemId 主键
     * @return 影响行数
     */
    int deleteById(Integer itemId);

}