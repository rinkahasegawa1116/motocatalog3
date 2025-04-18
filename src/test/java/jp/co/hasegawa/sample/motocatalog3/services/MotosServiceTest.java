package jp.co.hasegawa.sample.motocatalog3.services;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.hasegawa.sample.motocatalog3.Motocatalog3Application;
import jp.co.hasegawa.sample.motocatalog3.beans.Motorcycle;


@SpringBootTest(classes = Motocatalog3Application.class)
public class MotosServiceTest {

    @Autowired
    MotosService motosService;

    @Test
    void バイク情報を全件検索できる() {
        List<Motorcycle> motos = motosService.getMotos();
        //検索結果の件数を確認
        assertThat(motos.size()).isEqualTo(2);
        //検索結果の各項目の確認
        Motorcycle moto = motos.get(0); //1件目
        assertThat(moto).isNotNull();
        assertThat(moto.getMotoNo()).isEqualTo(1);
        assertThat(moto.getMotoName()).isEqualTo("CB400SF");
        assertThat(moto.getPrice()).isEqualTo(850000);
        assertThat(moto.getBrand().getBrandName()).isEqualTo("Honda");

    }
    
}
