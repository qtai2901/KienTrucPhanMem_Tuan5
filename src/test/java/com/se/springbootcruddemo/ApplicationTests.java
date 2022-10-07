package com.se.springbootcruddemo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.se.springbootcruddemo.entity.ChungNhan;
import com.se.springbootcruddemo.entity.ChuyenBay;
import com.se.springbootcruddemo.entity.MayBay;
import com.se.springbootcruddemo.entity.NhanVien;
import com.se.springbootcruddemo.respository.ChuyenBayRespository;
import com.se.springbootcruddemo.service.ChungNhanService;
import com.se.springbootcruddemo.service.ChuyenBayService;
import com.se.springbootcruddemo.service.MayBayService;
import com.se.springbootcruddemo.service.NhanVienService;
import com.se.springbootcruddemo.serviceImpl.ChungNhanServiceImpl;
import com.se.springbootcruddemo.serviceImpl.ChuyenBayServiceImpl;
import com.se.springbootcruddemo.serviceImpl.MayBayServiceImpl;
import com.se.springbootcruddemo.serviceImpl.NhanVienServiceImpl;

@SpringBootTest
class ApplicationTests {
	
	@Test
	void contextLoads() {
	}

}
