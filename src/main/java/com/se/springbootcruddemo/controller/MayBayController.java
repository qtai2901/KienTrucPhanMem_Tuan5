package com.se.springbootcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootcruddemo.service.MayBayService;


@RestController
@RequestMapping("/may-bay")
public class MayBayController {
	
	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/findByTamBayLonHon10000")
	public List<String> findByTamBayLonHon10000(){
		return mayBayService.findByTamBayLonHon10000();
	}
	
	@GetMapping("/sumMayBayBoeing")
	public int sumMayBayBoeing() {
		return mayBayService.sumMayBayBoeing();
	}
	
	@GetMapping("/findMaByNameNguyen")
	public List<String> findMaByNameNguyen(){
		return mayBayService.findMaByNameNguyen();
	}
	
	@GetMapping("/findLoaiByCBVN280")
	public List<String> findLoaiByCBVN280(){
		return mayBayService.findLoaiByCBVN280();
	}
	
	@GetMapping("/findMaLoaiVaTongPhiCong")
	public List<Object[]> findMaLoaiVaTongPhiCong(){
		return mayBayService.findMaLoaiVaTongPhiCong();
	}
}
