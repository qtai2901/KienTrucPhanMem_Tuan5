package com.se.springbootcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootcruddemo.entity.ChuyenBay;
import com.se.springbootcruddemo.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyen-bay")
public class ChuyenBayController {
	
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/findByGaDen={gaDi}")
	public List<Object[]> findByGaDen(@PathVariable String gaDi){
		List<Object[]> ds= chuyenBayService.findByGaDen(gaDi);
		return ds;
	}
	
	@GetMapping("/findByDoDaiDBNhoHon10000VaLoHon8000")
	public List<Object[]>findByDoDaiDBNhoHon10000VaLoHon8000(){
		List<Object[]> ds= chuyenBayService.findByDoDaiDBNhoHon10000VaLoHon8000();
		return ds;
	}
	
	@GetMapping("/findBySGtoBMT")
	public List<Object[]> findBySGtoBMT(){
		List<Object[]> ds= chuyenBayService.findBySGtoBMT();
		return ds;
	}
	
	@GetMapping("/sumCBFromSG")
	public int sumCBFromSG() {
		 return chuyenBayService.sumCBFromSG();
	}
	
	
	@GetMapping("/findCBByMBAirbusA320")
	public List<Object[]> findCBByMBAirbusA320(){
		List<Object[]> ds= chuyenBayService.findCBByMBAirbusA320();
		return ds;
	}
	
	@GetMapping("/findDBFromAtoBAndToA")
	public List<Object[]> findDBFromAtoBAndToA(){
		List<Object[]> ds= chuyenBayService.findDBFromAtoBAndToA();
		return ds;
	}
	
	@GetMapping("/countChuyenBayKhoiHanh")
	public List<Object[]> countChuyenBayKhoiHanh(){
		List<Object[]> ds= chuyenBayService.countChuyenBayKhoiHanh();
		return ds;
	}
	
	@GetMapping("/tongChiPhiPhaiTra")
	public List<Object[]> tongChiPhiPhaiTra(){
		List<Object[]> ds= chuyenBayService.tongChiPhiPhaiTra();
		return ds;
	}
	
	@GetMapping("/findCBKHTruoc12h")
	public List<Object[]> findCBKHTruoc12h(){
		List<Object[]> ds= chuyenBayService.findCBKHTruoc12h();
		return ds;
	}
	
	@GetMapping("/countDiaDiemKhoiHanhTruoc12h")
	public List<Object[]> countDiaDiemKhoiHanhTruoc12h(){
		List<Object[]> ds= chuyenBayService.countDiaDiemKhoiHanhTruoc12h();
		return ds;
	}
	
	@GetMapping("/findCBDuocLaiBoiBoeing")
	public List<Object[]> findCBDuocLaiBoiBoeing(){
		List<Object[]> ds= chuyenBayService.findCBDuocLaiBoiBoeing();
		return ds;
	}

}
