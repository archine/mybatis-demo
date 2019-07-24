package com.gjing.repository;

import com.gjing.domain.Company;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author Gjing
 * @description TODO
 * @date 2019/7/24
 **/
@Mapper
public interface CompanyDao {

    /**
     * 添加公司
     * @param company 公司对象
     * @return 添加数量
     */
    @Insert("insert into company (company_name) value (#{companyName})")
    int saveCompany(Company company);

    /**
     * 删除公司
     * @param companyId 公司id
     * @return 数量
     */
    @Delete("delete company where id = #{companyId}")
    int deleteCompany(Integer companyId);

    /**
     * 根据id查询
     * @param companyId 公司id
     * @return company
     */
    @Select("select c.company_name,c.company_id from company c where company_id = #{companyId}")
    Map<String,Object> findById(Integer companyId);

    /**
     * 查询公司列表
     * @return 公司列表
     */
    List<Company> findCompanyList();

    /**
     * 更新公司资料
     * @param companyId 公司id
     * @param companyName 公司名
     * @return 数量
     */
    @Update("update company set company_name = #{companyName} where company_id = #{companyId}")
    int updateCompany(Integer companyId, String companyName);
}
