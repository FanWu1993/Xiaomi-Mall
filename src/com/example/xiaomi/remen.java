package com.example.xiaomi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class remen extends Activity {
	int[] drawableIds={R.drawable.fenlei1,R.drawable.fenlei2,R.drawable.fenlei3,R.drawable.fenlei4,R.drawable.fenlei5,R.drawable.fenlei6};
	int[] nameIds={R.string.erji,R.string.dianyuan,R.string.xiaomi3,R.string.hongmi,R.string.hezi,R.string.pingban};
	int[] nameIds2={R.string.erji1,R.string.dianyuan1,R.string.xiaomi31,R.string.hongmi1,R.string.hezi1,R.string.pingban1};
	int[] nameIds1={R.string.erji2,R.string.dianyuan2,R.string.xiaomi32,R.string.hongmi2,R.string.hezi2,R.string.pingban2};
	
	public List<? extends Map<String, ?>> generateDataList()
			{
		    	ArrayList<Map<String,Object>> list=new ArrayList<Map<String,Object>>();;
		    	int rowCounter=drawableIds.length;//得到表格的行数
		    	for(int i=0;i<rowCounter;i++)
		    	{//循环生成每行的包含对应各个列数据的Map；col1、col2、col3为列名
		    		HashMap<String,Object> hmap=new HashMap<String,Object>();//创建HashMap
		    		hmap.put("col1", drawableIds[i]);   //第一列为图片 		
		    		hmap.put("col2", this.getResources().getString(nameIds[i]));
		    		hmap.put("col3", this.getResources().getString(nameIds1[i]));
		    		hmap.put("col4", this.getResources().getString(nameIds2[i]));//第二例为姓名
		    		list.add(hmap);//将HashMap添加进List中
		    	}    	
		    	return list;
			}
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remen);//切屏到主界面
        ListView gv=(ListView)this.findViewById(R.id.listView1);//初始化ListView
        SimpleAdapter sca=new SimpleAdapter//为ListView设置适配器
        (
          this,           //上下文对象    
          generateDataList(), //数据List
          R.layout.remen1, //行对应layout id
          new String[]{"col1","col2","col3","col4"}, //列名列表
          new int[]{R.id.imageView1,R.id.textView1,R.id.textView2,R.id.textView3}//列对应控件id列表
        );
        gv.setAdapter(sca);

	
    }
    
}