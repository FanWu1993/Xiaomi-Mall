package com.example.xiaomi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class fuwu extends Activity {
	int[] drawableIds={R.drawable.address_icon,R.drawable.adrr_icon,R.drawable.after_sales_icon,
						R.drawable.coupon_icon,R.drawable.edit_icon,R.drawable.express_icon,
						R.drawable.favorite_icon,R.drawable.michat_icon,R.drawable.recharge_icon};
	int[] nameIds={R.string.cxxmzjhfwwd,R.string.ddcx,R.string.dfkdd,R.string.dshdd,R.string.gldz,
						R.string.hfczd,R.string.pjsp,R.string.shfwd,R.string.sjxsjl};
	int[] drawableIds1={R.drawable.mini_arrow};
	
	
	public List<? extends Map<String, ?>> generateDataList()
			{
		    	ArrayList<Map<String,Object>> list=new ArrayList<Map<String,Object>>();;
		    	int rowCounter=drawableIds.length;//得到表格的行数
		    	for(int i=0;i<rowCounter;i++)
		    	{//循环生成每行的包含对应各个列数据的Map；col1、col2、col3为列名
		    		HashMap<String,Object> hmap=new HashMap<String,Object>();//创建HashMap
		    		hmap.put("col1", drawableIds[i]);   //第一列为图片 		
		    		hmap.put("col2", this.getResources().getString(nameIds[i]));
		    		hmap.put("col3",drawableIds1[0]);//第二例为姓名
		    		list.add(hmap);//将HashMap添加进List中
		    	}
		    	
		    	return list;
			}
	
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuwu);//切屏到主界面
        ListView gv=(ListView)this.findViewById(R.id.listView1);//初始化ListView
        SimpleAdapter sca=new SimpleAdapter//为ListView设置适配器
        (
          this,           //上下文对象    
          generateDataList(), //数据List
          R.layout.fuwu1, //行对应layout id
          new String[]{"col1","col2","col3"}, //列名列表
          new int[]{R.id.imageView1,R.id.textView1,R.id.imageView2}
          //列对应控件id列表
        );
        gv.setAdapter(sca);
        
        

	
    }
    

}
