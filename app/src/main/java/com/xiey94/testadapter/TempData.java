package com.xiey94.testadapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by xiey on 2019/8/13.
 */
public class TempData {
    public static List<ParentBean> getParentData() {
        List<ParentBean> parentBeans = new ArrayList<>();

        ParentBean parentBean1 = new ParentBean();
        parentBean1.extra = "周一";
        parentBean1.childData = getChildData();
        parentBean1.childData2 = getChildData2();

        ParentBean parentBean2 = new ParentBean();
        parentBean2.extra = "周二";
        parentBean2.childData = getChildData();
        parentBean2.childData2 = getChildData2();

        ParentBean parentBean3 = new ParentBean();
        parentBean3.extra = "周3";
        parentBean3.childData = getChildData();
        parentBean3.childData2 = getChildData2();

        ParentBean parentBean4 = new ParentBean();
        parentBean4.extra = "周4";
        parentBean4.childData = getChildData();
        parentBean4.childData2 = getChildData2();

        ParentBean parentBean5 = new ParentBean();
        parentBean5.extra = "周5";
        parentBean5.childData = getChildData();
        parentBean5.childData2 = getChildData2();

        ParentBean parentBean6 = new ParentBean();
        parentBean6.extra = "周6";
        parentBean6.childData = getChildData();
        parentBean6.childData2 = getChildData2();

        ParentBean parentBean7 = new ParentBean();
        parentBean7.extra = "周7";
        parentBean7.childData = getChildData();
        parentBean7.childData2 = getChildData2();

        ParentBean parentBean8 = new ParentBean();
        parentBean8.extra = "周8";
        parentBean8.childData = getChildData();
        parentBean8.childData2 = getChildData2();

        ParentBean parentBean9 = new ParentBean();
        parentBean9.extra = "周9";
        parentBean9.childData = getChildData();
        parentBean9.childData2 = getChildData2();

        parentBeans.add(parentBean1);
        parentBeans.add(parentBean2);
        parentBeans.add(parentBean3);
        parentBeans.add(parentBean4);
        parentBeans.add(parentBean5);
        parentBeans.add(parentBean6);
        parentBeans.add(parentBean7);
        parentBeans.add(parentBean8);
        parentBeans.add(parentBean9);

        return parentBeans;

    }

    public static List<ChildBean> getChildData() {
        List<ChildBean> parentBeans = new ArrayList<>();

        ChildBean parentBean1 = new ChildBean();
        parentBean1.extra = "11111111";

        ChildBean parentBean2 = new ChildBean();
        parentBean2.extra = "22222222";

        ChildBean parentBean3 = new ChildBean();
        parentBean3.extra = "33333333";

        ChildBean parentBean4 = new ChildBean();
        parentBean4.extra = "44444444";

        parentBeans.add(parentBean1);
        parentBeans.add(parentBean2);
        parentBeans.add(parentBean3);
        parentBeans.add(parentBean4);

        return parentBeans;

    }

    public static List<ChildBean2> getChildData2() {
        List<ChildBean2> parentBeans = new ArrayList<>();

        ChildBean2 parentBean1 = new ChildBean2();
        parentBean1.extra = "两只黄鹂鸣翠柳";

        ChildBean2 parentBean2 = new ChildBean2();
        parentBean2.extra = "一行白鹭上青天";

        ChildBean2 parentBean3 = new ChildBean2();
        parentBean3.extra = "窗含西岭千秋雪";

        ChildBean2 parentBean4 = new ChildBean2();
        parentBean4.extra = "门泊东吴万里船";

        parentBeans.add(parentBean1);
        parentBeans.add(parentBean2);
        parentBeans.add(parentBean3);
        parentBeans.add(parentBean4);

        return parentBeans;

    }
}
