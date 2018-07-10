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
		    	int rowCounter=drawableIds.length;//�õ���������
		    	for(int i=0;i<rowCounter;i++)
		    	{//ѭ������ÿ�еİ�����Ӧ���������ݵ�Map��col1��col2��col3Ϊ����
		    		HashMap<String,Object> hmap=new HashMap<String,Object>();//����HashMap
		    		hmap.put("col1", drawableIds[i]);   //��һ��ΪͼƬ 		
		    		hmap.put("col2", this.getResources().getString(nameIds[i]));
		    		hmap.put("col3", this.getResources().getString(nameIds1[i]));
		    		hmap.put("col4", this.getResources().getString(nameIds2[i]));//�ڶ���Ϊ����
		    		list.add(hmap);//��HashMap��ӽ�List��
		    	}    	
		    	return list;
			}
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remen);//������������
        ListView gv=(ListView)this.findViewById(R.id.listView1);//��ʼ��ListView
        SimpleAdapter sca=new SimpleAdapter//ΪListView����������
        (
          this,           //�����Ķ���    
          generateDataList(), //����List
          R.layout.remen1, //�ж�Ӧlayout id
          new String[]{"col1","col2","col3","col4"}, //�����б�
          new int[]{R.id.imageView1,R.id.textView1,R.id.textView2,R.id.textView3}//�ж�Ӧ�ؼ�id�б�
        );
        gv.setAdapter(sca);

	
    }
    
}