package jp.co.hasegawa.sample.motocatalog3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.hasegawa.sample.motocatalog3.beans.Motorcycle;
import jp.co.hasegawa.sample.motocatalog3.beans.Brand;
import jp.co.hasegawa.sample.motocatalog3.mappers.BrandMapper;
import jp.co.hasegawa.sample.motocatalog3.mappers.MotorcycleMapper;

@Service
public class MotosService {

    @Autowired
    MotorcycleMapper motorcycleMapper;

    @Autowired
    BrandMapper brandMapper;

    public List<Motorcycle> getMotos() {
        return motorcycleMapper.selectAll();

    }
    

    public List<Brand> getBrands() {
        return brandMapper.selectAll();
    }
}
