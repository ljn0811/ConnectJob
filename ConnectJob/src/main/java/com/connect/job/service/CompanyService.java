package com.connect.job.service;

import java.util.List;

import com.connect.job.model.vo.Company;

public interface CompanyService {

	// 기업등록
	int insertCompany(Company com);
	
	// 전체 등록된 기업의 수
	int selectCompanyCount();

	// 기업검색
	List<Company> searchCompany(String keyword);

	// 기업리스트 (지역에 따른)
	List<Company> companyList(Company com, int cPage, int numPerPage);

	// 기업상세 페이지
	Company selectOne(int no);
	
	// 기업 전체 리스트
	List<Company> selectAll(int cPage, int numPerPage);

	// Ajax 기업 수
	int selectAjaxCount(Company com);

	
}
