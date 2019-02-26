package com.springboot.springboot.mapper;

import com.springboot.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author yidong
 * @create 2019-02-26-11:41
 */
//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department values(#{id},#{name})")
    public int insertDept(Department deparment);

    @Update("update department set name=#{name} where id=#{id}")
    public int updateDept(Department department);
}
