package com.henley.gankio.delegate;

import com.henley.gankio.utils.ViewHolder;

/**
 * ItemView委托代理(用于处理不同ItemView并进行数据和事件绑定)
 *
 * @param <DataType> 数据类型的泛型
 * @author Henley
 * @date 2018/7/12 13:33
 */
public interface ItemViewDelegate<DataType> {

    /**
     * 返回Item布局资源ID
     */
    int getItemLayoutID();

    /**
     * 根据指定的位置数据和索引判断是否由当前{@link ItemViewDelegate}处理数据
     *
     * @param data     数据
     * @param position 位置索引
     */
    boolean isForViewType(DataType data, int position);

    /**
     * 数据和事件绑定
     *
     * @param holder   {@link ViewHolder}对象
     * @param data     数据
     * @param position 位置索引
     */
    void convert(ViewHolder holder, DataType data, int position);

}
