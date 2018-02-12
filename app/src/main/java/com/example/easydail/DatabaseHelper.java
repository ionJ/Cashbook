package com.example.easydail;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "imooc_daily", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists imooc_cost(" +
                "id integer primary key, " +
                "cost_title varchar, " +
                "cost_data varchar, " +
                "cost_money varchar)");
    }

    // 数据库输入方法
    public void insertCost(CostBean costBean) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("cost_title", costBean.costTitle);
        cv.put("cost_data", costBean.costDate);
        cv.put("cost_money", costBean.costMoney);
        database.insert("imooc_cost", null, cv);
    }
    
    // 数据库查询方法
    public Cursor getAllCostData() {
        SQLiteDatabase database = getWritableDatabase();
        return database.query("imooc_cost", null, null,
                null, null, null, "ASC");
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {

    }
}