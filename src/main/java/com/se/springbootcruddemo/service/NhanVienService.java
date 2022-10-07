package com.se.springbootcruddemo.service;

import java.util.List;

import com.se.springbootcruddemo.entity.NhanVien;

public interface NhanVienService {
	public List<Object[]> findByLuongNhoHon10000();
	public int sumLuong();
	public List<Object[]> findBymaMB747();
	public List<Object[]> findMaByNVLaiBoeingVaAirbus();
	public List<Object[]> findTenByNVLaiBoeing();
	public List<Object[]> findMaNVChiLaiDuoc3LoaiMayBay();
	public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
	public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai();
	public List<Object[]> findNVKhongPhaiPhiCong();
	public List<Object[]> findNVMaxLuong();
	public int tongSoLuongPhaiTra();
}
