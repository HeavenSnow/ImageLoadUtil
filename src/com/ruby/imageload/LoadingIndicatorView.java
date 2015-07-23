/**
 * @author: Zhou Haitao
 */

package com.ruby.imageload;

import net.iaf.framework.imgload.ImageWorker.AsyncIndicator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public  abstract class LoadingIndicatorView extends LinearLayout{
	
	public LoadingIndicatorView(Context context){
		super(context);
	}
	
	public LoadingIndicatorView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	/**
	 * @param progress 0-100  100表示加载完成  0开始加载, -1表示加载失败
	 */
	public abstract void onProgressUpdate(int progress);
	
	//-------------------PACKAGE VISIBLE-------------------------------
	private AsyncIndicator asyncIndicator;

	AsyncIndicator getAsyncIndicator() {
		return asyncIndicator;
	}

	public void setAsyncIndicator(AsyncIndicator asyncIndicator) {
		this.asyncIndicator = asyncIndicator;
	}
	
}
