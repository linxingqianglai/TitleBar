/**
 * 
 */
package com.example.titlebar;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * @author lxq
 *
 */
public class TitleView extends FrameLayout {
	private TextView mBackBn;
	private TextView mTitleBn;
	private TextView mMenuBn;

	/**
	 * @param context
	 */
	public TitleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public TitleView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater.from(context).inflate(R.layout.view_title, this,true);
		mBackBn=(TextView)findViewById(R.id.bn_back);
		mTitleBn = (TextView)findViewById(R.id.tv_title);
		mMenuBn  = (TextView)findViewById(R.id.bn_menu);
		mBackBn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				((Activity)getContext()).finish();
			}
		});
	}

	/**
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public TitleView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		
	}
	void SetBackText(String text)
	{
		mBackBn.setText(text);
	}
	void SetTitleText(String text)
	{
		mTitleBn.setText(text);
	}
	void SetMenuText(String text)
	{
		mMenuBn.setText(text);
	}
	void SetBackButtonOnClickListener(OnClickListener onClickListener)
	{
		mBackBn.setOnClickListener(onClickListener);
	}
	void SetTitleTextViewOnClickListener(OnClickListener onClickListener)
	{
		mTitleBn.setOnClickListener(onClickListener);
	}
	void setMenuTextViewOnClickListener(OnClickListener onClickListener)
	{
		mMenuBn.setOnClickListener(onClickListener);
	}
	TextView getBackView()
	{
		return mBackBn;
	}
	TextView getTitletView()
	{
		return mTitleBn;
	}
	TextView getMenuView()
	{
		return mMenuBn;
	}

}
