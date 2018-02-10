package com.example.easydail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class CostlistAdapter extends BaseAdapter {


    private List<CostBean> mList;
    private Context mContext;
    private LayoutInflater mLayoutInflater; // 解析布局时用到


    public CostlistAdapter(Context context, List<CostBean> list) {
        mContext = context;
        mList = list;
        mLayoutInflater = LayoutInflater.from(context);
    }   // 构造方法



    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup group) {
        return null;
    }

    private static class ViewHolder {
        public TextView mTvCostTitle;
        public TextView mTvCostDate;
        public TextView mTvCostMoney;
    }
}
