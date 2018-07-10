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
		    	int rowCounter=drawableIds.length;//�õ���������
		    	for(int i=0;i<rowCounter;i++)
		    	{//ѭ������ÿ�еİ�����Ӧ���������ݵ�Map��col1��col2��col3Ϊ����
		    		HashMap<String,Object> hmap=new HashMap<String,Object>();//����HashMap
		    		hmap.put("col1", drawableIds[i]);   //��һ��ΪͼƬ 		
		    		hmap.put("col2", this.getResources().getString(nameIds[i]));
		    		hmap.put("col3",drawableIds1[0]);//�ڶ���Ϊ����
		    		list.add(hmap);//��HashMap��ӽ�List��
		    	}
		    	
		    	return list;
			}
	
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuwu);//������������
        ListView gv=(ListView)this.findViewById(R.id.listView1);//��ʼ��ListView
        SimpleAdapter sca=new SimpleAdapter//ΪListView����������
        (
          this,           //�����Ķ���    
          generateDataList(), //����List
          R.layout.fuwu1, //�ж�Ӧlayout id
          new String[]{"col1","col2","col3"}, //�����б�
          new int[]{R.id.imageView1,R.id.textView1,R.id.imageView2}
          //�ж�Ӧ�ؼ�id�б�
        );
        gv.setAdapter(sca);
        
        

	
    }
    

}
