package com.gjing.controller;

import cn.gjing.annotation.NotNull;
import cn.gjing.result.ResultVo;
import com.gjing.domain.Company;
import com.gjing.service.CompanyService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Gjing
 * @description TODO
 * @date 2019/7/24
 **/
@RestController
public class CompanyController {
    @Resource
    private CompanyService companyService;

    @PostMapping("/company")
    @ApiOperation(value = "添加公司", httpMethod = "POST")
    @NotNull
    public ResultVo saveCompany(Company company) {
        return ResultVo.success(companyService.saveCompany(company));
    }

    @GetMapping("/company/{id}")
    @ApiOperation(value = "通过id查询", httpMethod = "GET")
    public ResultVo findCompanyById(@PathVariable("id") Integer id) {
        return ResultVo.success(companyService.findById(id));
    }

    @GetMapping("/company_list")
    @ApiOperation(value = "查询公司列表", httpMethod = "GET")
    public ResultVo findCompanyList() {
        return ResultVo.success(companyService.findCompanyList());
    }

    @DeleteMapping("/company/{id}")
    @ApiOperation(value = "删除公司", httpMethod = "DELETE")
    public ResultVo deleteCompany(@PathVariable("id") Integer id) {
        return ResultVo.success(companyService.deleteCompany(id));
    }

    @PutMapping("/company")
    @ApiOperation(value = "修改公司信息", httpMethod = "PUT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "companyId", value = "公司id", required = true, dataType = "int", paramType = "Query"),
            @ApiImplicitParam(name = "companyName", value = "公司名", required = true, dataType = "String", paramType = "Query")
    })
    public ResultVo updateCompany(Integer companyId, String companyName) {
        return ResultVo.success(companyService.updateCompany(companyId, companyName));
    }
}
