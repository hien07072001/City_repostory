package com.codegym.cms.repository;

import com.codegym.cms.model.Province;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProvinceRepository extends CrudRepository<Province, Long> {
}