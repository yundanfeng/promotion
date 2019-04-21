package cn.ipanel.apps.marketing.campaign.service.service.feign.bean;

import cn.ipanel.apps.marketing.campaign.service.dto.CustomerVO;
import lombok.Data;

/**
 * Created with Intellij IDEA.
 *
 * @author luzh
 * Create: 2018/9/20 下午7:46
 * Modified By:
 * Description:
 */
@Data
public class CheckIsMarketingReq {
    private CustomerVO customerVO;
    private String goodsId;

    public CheckIsMarketingReq(CustomerVO customerVO, String goodsId) {
        this.customerVO = customerVO;
        this.goodsId = goodsId;
    }
}
