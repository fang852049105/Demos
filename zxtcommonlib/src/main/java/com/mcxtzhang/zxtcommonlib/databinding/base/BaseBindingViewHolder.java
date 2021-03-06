package com.mcxtzhang.zxtcommonlib.databinding.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * 介绍：
 * 作者：zhangxutong
 * 邮箱：mcxtzhang@163.com
 * CSDN：http://blog.csdn.net/zxt0601
 * 时间： 16/09/25.
 */

public class BaseBindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    protected final T mBinding;

    public BaseBindingViewHolder(T t) {
        super(t.getRoot());
        mBinding = t;
    }

    public T getBinding() {
        return mBinding;
    }
}
