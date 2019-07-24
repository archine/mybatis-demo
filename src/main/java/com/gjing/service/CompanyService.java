package com.gjing.service;

import com.gjing.domain.Company;
import com.gjing.repository.CompanyDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Gjing
 * @description TODO
 * @date 2019/7/24
 **/
@Service
public class CompanyService {
    @Resource
    private CompanyDao companyDao;

    /**
     * 添加公司
     *
     * @param company 公司对象
     * @return 添加数量
     */
    public Integer saveCompany(Company company) {
        return companyDao.saveCompany(company);
    }

    /**
     * 删除公司
     *
     * @param companyId 公司id
     * @return 数量
     */
    public Integer deleteCompany(Integer companyId) {
        return companyDao.deleteCompany(companyId);
    }

    /**
     * 更新公司资料
     *
     * @param companyId   公司id
     * @param companyName 公司名
     * @return 数量
     */
    public Integer updateCompany(Integer companyId, String companyName) {
        return companyDao.updateCompany(companyId, companyName);
    }

    /**
     * 查询公司列表
     *
     * @return 公司列表
     */
    public List<Company> findCompanyList() {
        return companyDao.findCompanyList();
    }

    /**
     * 根据id查询
     *
     * @param companyId 公司id
     * @return company
     */
    public Map<String, Object> findById(Integer companyId) {
        return companyDao.findById(companyId);
    }

}
