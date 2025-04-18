package jp.co.hasegawa.sample.motocatalog3.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * バイクメーカー(ブランド)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    // ブランドID
    private String brandId;
    // ブランド名
    private String brandName;
}
