package jp.co.hasegawa.sample.motocatalog3.mappers;

import org.apache.ibatis.annotations.Mapper;

import jp.co.hasegawa.sample.motocatalog3.beans.Brand;

import java.util.List;


@Mapper
public interface BrandMapper {
    public List<Brand> selectAll();
    
} 