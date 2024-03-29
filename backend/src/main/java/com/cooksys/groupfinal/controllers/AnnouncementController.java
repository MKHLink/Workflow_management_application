package com.cooksys.groupfinal.controllers;

import com.cooksys.groupfinal.dtos.*;
import com.cooksys.groupfinal.entities.User;
import org.springframework.web.bind.annotation.*;

import com.cooksys.groupfinal.services.AnnouncementService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/announcements")
@RequiredArgsConstructor
public class AnnouncementController {


	private final AnnouncementService announcementService;

	@PostMapping
	@CrossOrigin(origins="*")
	public AnnouncementResponseDto createAnnouncement(@RequestBody AnnouncementRequestDto announcementRequestDto) {
		return announcementService.createAnnouncement(announcementRequestDto);
	}

	@DeleteMapping("/{announcementId}")
	@CrossOrigin(origins="*")
	public AnnouncementResponseDto deleteAnnouncementById(@PathVariable Long announcementId, @RequestBody UserRequestDto userRequestDto){
		return announcementService.deleteAnnouncementById(announcementId, userRequestDto);
	}

	@PutMapping("/{announcementId}")
	@CrossOrigin(origins="*")
	public AnnouncementResponseDto updateAnnouncementById(@PathVariable Long announcementId, @RequestBody UserRequestDto userRequestDto){
		return announcementService.updateAnnouncementById(announcementId, userRequestDto);
	}

}
