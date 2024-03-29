package com.cooksys.groupfinal.services;

import java.util.List;
import java.util.Set;

import com.cooksys.groupfinal.dtos.*;
import jakarta.transaction.Transactional;

public interface CompanyService {

	Set<FullUserDto> getAllUsers(Long id);

	Set<AnnouncementResponseDto> getAllAnnouncements(Long id);

	Set<TeamDto> getAllTeams(Long id);

	Set<ProjectDto> getAllProjects(Long companyId, Long teamId);

    void deleteCompanyById(Long companyId, UserRequestDto userRequestDto);

	Set<CompanyDto> getAllCompanies();

	CompanyDto createCompany(CompanyRequestDto companyRequestDto);

	CompanyDto getCompanyById(Long companyId);

	CompanyResponseDto updateCompany(Long companyId, CompanyRequestDto companyRequestDto);

	CompanyTeamResponseDto createTeam(Long companyId, TeamRequestDto teamRequestDto);

	CompanyTeamResponseDto updateTeam(Long companyId, Long teamId, TeamRequestDto teamRequestDto);

	CompanyTeamResponseDto deleteTeam(Long companyId, Long teamId, UserRequestDto userRequestDto);

	@Transactional
	FullUserDto addUserToCompany(Long companyId, UserCompanyRequestDto userCompanyRequestDto);
}
