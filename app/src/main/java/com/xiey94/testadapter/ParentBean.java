package com.xiey94.testadapter;

import java.io.Serializable;
import java.util.List;

/**
 * Create by xiey on 2019/8/13.
 */
public class ParentBean implements Serializable {

    public boolean isSelect;
    public String extra;
    public List<ChildBean> childData;
    public List<ChildBean2> childData2;
}
