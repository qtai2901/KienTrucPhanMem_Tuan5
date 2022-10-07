package com.se.springbootcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootcruddemo.entity.NhanVien;
import com.se.springbootcruddemo.service.NhanVienService;

@RestController
@RequestMapping("/nhan-vien")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/findByLuongNhoHon10000")
	public List<Object[]> findByLuongNhoHon10000(){
		List<Object[]> ds = nhanVienService.findByLuongNhoHon10000();
		return ds;
	}
	
	@GetMapping("/sum-luong")
	public int sumLuong() {
		return nhanVienService.sumLuong();
	}
	
	
	@GetMapping("/findBymaMB747")
	public List<Object[]> findBymaMB747(){
		List<Object[]> ds = nhanVienService.findBymaMB747();
		return ds;
		
	}
	
	@GetMapping("/findMaByNVLaiBoeingVaAirbus")
	public List<Object[]> findMaByNVLaiBoeingVaAirbus(){
		List<Object[]> ds = nhanVienService.findMaByNVLaiBoeingVaAirbus();
		return ds;
		
	}
	
	@GetMapping("/findTenByNVLaiBoeing")
	public List<Object[]> findTenByNVLaiBoeing(){
		List<Object[]> ds = nhanVienService.findTenByNVLaiBoeing();
		return ds;
	}
	
	@GetMapping("/findMaNVChiLaiDuoc3LoaiMayBay")
	public List<Object[]> findMaNVChiLaiDuoc3LoaiMayBay(){
		List<Object[]> ds = nhanVienService.findMaNVChiLaiDuoc3LoaiMayBay();
		return ds;
	}
	
	@GetMapping("/findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay")
	public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay(){
		List<Object[]> ds = nhanVienService.findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
		return ds;
	}
	
	@GetMapping("/findMaNVAndCountLoaiMayBayCoTheLai")
	public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai(){
		List<Object[]> ds = nhanVienService.findMaNVAndCountLoaiMayBayCoTheLai();
		return ds;
	}
	
	
	@GetMapping("/findNVKhongPhaiPhiCong")
	public List<Object[]> findNVKhongPhaiPhiCong(){
		List<Object[]> ds = nhanVienService.findNVKhongPhaiPhiCong();
		return ds;
	}
	
	@GetMapping("/findNVMaxLuong")
	public List<Object[]> findNVMaxLuong(){
		List<Object[]> ds = nhanVienService.findNVMaxLuong();
		return ds;
	}
	
	@GetMapping("/tongSoLuongPhaiTra")
	public int tongSoLuongPhaiTra() {
		return nhanVienService.tongSoLuongPhaiTra();
	}
	
}
