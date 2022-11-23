package com.rakyooooo.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakyooooo.restapi.entity.KetsuiEntity;
import com.rakyooooo.restapi.repository.KetsuiRepository;

@RestController
@RequestMapping("/ketsui")
public class KetsuiController {

	@Autowired
	private KetsuiRepository ketsuiRepository;

	@GetMapping("/findAll")
	public List<KetsuiEntity> findAllketsui() {
		List<KetsuiEntity> ret = ketsuiRepository.findAll();
		return ret;
	}

	@PostMapping
	public KetsuiEntity postKetsui(@RequestBody KetsuiEntity insertEntity) {
		insertEntity.setKetsuiId(123);
		KetsuiEntity ret = ketsuiRepository.save(insertEntity);
		return ret;
	}

}
