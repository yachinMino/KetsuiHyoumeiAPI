package com.rakyooooo.restapi.repository;

import com.rakyooooo.restapi.entity.KetsuiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  KetsuiRepository extends JpaRepository<KetsuiEntity, Long> {

}
