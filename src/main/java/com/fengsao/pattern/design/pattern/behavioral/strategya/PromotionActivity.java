package com.fengsao.pattern.design.pattern.behavioral.strategya;

/**
 * @description: TODO
 * @date 2021/9/6 17:24
 */
public class PromotionActivity {
    private PromotionActivityStrategy strategy;
    public PromotionActivity(PromotionActivityStrategy promotionActivityStrategy){
        this.strategy = promotionActivityStrategy;
    }
    public void init() {
        if (strategy instanceof LiJianStrategy) {
            System.out.println(11);
        } else if (strategy instanceof ManJianStrategy) {
            System.out.println(22);
        } else {
            System.out.println(33);
            return;
        }
        strategy.init();
    }

    public static void main(String[] args) {
        PromotionActivity activity1 = new PromotionActivity(new LiJianStrategy());
        activity1.init();
    }
}
