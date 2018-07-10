package com.example.xiaomi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class huodong extends Activity{
	int[] drawableIds={R.drawable.huodong1,R.drawable.huodong2,R.drawable.huodong3,R.drawable.huodong4,R.drawable.huodong5};

	
	public List<? extends Map<String, ?>> generateDataList()
			{
		    	ArrayList<Map<String,Object>> list=new ArrayList<Map<String,Object>>();;
		    	int rowCounter=drawableIds.length;//�õ���������
		    	for(int i=0;i<rowCounter;i++)
		    	{//ѭ������ÿ�еİ�����Ӧ���������ݵ�Map��col1��col2��col3Ϊ����
		    		HashMap<String,Object> hmap=new HashMap<String,Object>();//����HashMap
		    		hmap.put("col1", drawableIds[i]);   //��һ��ΪͼƬ 		
		    	//�ڶ���Ϊ����
		    		list.add(hmap);//��HashMap��ӽ�List��
		    	}    	
		    	return list;
			}
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.huodong);//������������
        ListView gv=(ListView)this.findViewById(R.id.listView1);//��ʼ��ListView
        SimpleAdapter sca=new SimpleAdapter//ΪListView����������
        (
          this,           //�����Ķ���    
          generateDataList(), //����List
          R.layout.huodong1, //�ж�Ӧlayout id
          new String[]{"col1"}, //�����б�
          new int[]{R.id.imageView1}//�ж�Ӧ�ؼ�id�б�
        );
        gv.setAdapter(sca);

	
    }

}
