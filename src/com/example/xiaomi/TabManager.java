package com.example.xiaomi;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.TabHost.OnTabChangeListener;

public class TabManager extends TabActivity {
	
	private TabWidget tabWidget;//ѡ����

	protected void onCreate(Bundle savedInstanceState) {//��дonCreate����
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_content);
		Constant.tabHost = (TabHost) findViewById(android.R.id.tabhost);
		LayoutInflater.from(this).inflate(R.layout.tab_content,
				Constant.tabHost.getTabContentView(), false);//����tabHost��Layout
		tabWidget = Constant.tabHost.getTabWidget();
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab1")//tabHost�м����һ��
				.setIndicator(
						"����",
						null).setContent(
						new Intent(this, remen.class)));
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab2")//tabHost�м���ڶ���
				.setIndicator(
						"����",
						null).setContent(
						new Intent(this, fenlei.class)));
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab3")//tabHost�м��������
				.setIndicator(
						"�",
						null).setContent(
						new Intent(this, huodong.class)));
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab4").setIndicator(
						"����",
						null).setContent(
						new Intent(this,fuwu.class)));

		Constant.tabHost.setCurrentTab(0);//���õ�ǰѡ��Ϊ��һ��

		for (int i = 0; i < tabWidget.getChildCount(); i++) {//����ÿ��ѡ��
						
			View v = tabWidget.getChildAt(i);
			// ����tab������ɫ
			v.setBackgroundResource(R.drawable.tab_indicator);

			TextView tv = (TextView) tabWidget.getChildAt(i).findViewById(android.R.id.title);
			tv.setTextColor(Color.GRAY);//����������ɫ
			tv.setTextSize(15); 
		}
		//���øı�ѡ��ʱ�ļ���
		Constant.tabHost.setOnTabChangedListener(new OnTabChangeListener() {
			public void onTabChanged(String tabId) {
				if(tabId.equals("Tab1")){	//Tab1�仯
					Constant.tabHost.setCurrentTabByTag("Tab1");
				}
				else if(tabId.equals("Tab2")){//Tab2�仯
					Constant.tabHost.setCurrentTabByTag("Tab2");			
				}
				else if(tabId.equals("Tab3")){//Tab3�仯
					Constant.tabHost.setCurrentTabByTag("Tab3");
				}else if(tabId.equals("Tab4")){
					Constant.tabHost.setCurrentTabByTag("Tab4");
				}
			}
		});
	}
}
