package cn.fuwei.mapper;

import cn.fuwei.po.Rs00Rsbase;
import cn.fuwei.po.Rs00RsbaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Rs00RsbaseMapper {
    int countByExample(Rs00RsbaseExample example);

    int deleteByExample(Rs00RsbaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(Rs00Rsbase record);

    int insertSelective(Rs00Rsbase record);

    List<Rs00Rsbase> selectByExample(Rs00RsbaseExample example);

    Rs00Rsbase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Rs00Rsbase record, @Param("example") Rs00RsbaseExample example);

    int updateByExample(@Param("record") Rs00Rsbase record, @Param("example") Rs00RsbaseExample example);

    int updateByPrimaryKeySelective(Rs00Rsbase record);

    int updateByPrimaryKey(Rs00Rsbase record);
}