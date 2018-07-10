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
	
	private TabWidget tabWidget;//选项卡组件

	protected void onCreate(Bundle savedInstanceState) {//重写onCreate方法
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_content);
		Constant.tabHost = (TabHost) findViewById(android.R.id.tabhost);
		LayoutInflater.from(this).inflate(R.layout.tab_content,
				Constant.tabHost.getTabContentView(), false);//设置tabHost的Layout
		tabWidget = Constant.tabHost.getTabWidget();
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab1")//tabHost中加入第一项
				.setIndicator(
						"热门",
						null).setContent(
						new Intent(this, remen.class)));
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab2")//tabHost中加入第二项
				.setIndicator(
						"分类",
						null).setContent(
						new Intent(this, fenlei.class)));
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab3")//tabHost中加入第三项
				.setIndicator(
						"活动",
						null).setContent(
						new Intent(this, huodong.class)));
		Constant.tabHost.addTab(Constant.tabHost.newTabSpec("Tab4").setIndicator(
						"服务",
						null).setContent(
						new Intent(this,fuwu.class)));

		Constant.tabHost.setCurrentTab(0);//设置当前选项为第一项

		for (int i = 0; i < tabWidget.getChildCount(); i++) {//设置每个选项
						
			View v = tabWidget.getChildAt(i);
			// 设置tab背景颜色
			v.setBackgroundResource(R.drawable.tab_indicator);

			TextView tv = (TextView) tabWidget.getChildAt(i).findViewById(android.R.id.title);
			tv.setTextColor(Color.GRAY);//设置字体颜色
			tv.setTextSize(15); 
		}
		//设置改变选项时的监听
		Constant.tabHost.setOnTabChangedListener(new OnTabChangeListener() {
			public void onTabChanged(String tabId) {
				if(tabId.equals("Tab1")){	//Tab1变化
					Constant.tabHost.setCurrentTabByTag("Tab1");
				}
				else if(tabId.equals("Tab2")){//Tab2变化
					Constant.tabHost.setCurrentTabByTag("Tab2");			
				}
				else if(tabId.equals("Tab3")){//Tab3变化
					Constant.tabHost.setCurrentTabByTag("Tab3");
				}else if(tabId.equals("Tab4")){
					Constant.tabHost.setCurrentTabByTag("Tab4");
				}
			}
		});
	}
}
