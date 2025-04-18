package jp.co.hasegawa.sample.motocatalog3.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.hasegawa.sample.motocatalog3.beans.Motorcycle;

@Mapper
public interface MotorcycleMapper {

    /**
     * バイク情報を全検索する。
     * @return　バイク情報リスト
     */
    public List<Motorcycle> selectAll();
}
