/***
* Tile : FrameImageAnimator class Animate the Images 
* @author Ramesh M Nair
*
* **/

package com.imageframeanimation;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FrameImageAnimator extends ImageView {

  //Variable declared

	private Context mContext = null;

	int SPEED;

	private boolean mIsAnimating = false;

	private boolean mAnimatingRunning = false;

	private ArrayList<Bitmap> mBitmapList;

	private int playedSprintCount = 0;

	private long mSpeedCounter = 0;

	BitmapFactory.Options options;

	public FrameImageAnimator(Context context, AttributeSet attrs) {
		super(context, attrs);

		mContext = context;
		
	}

	@Override
	protected void onDraw(Canvas c) {
		
		
		//The image frames is sets and resets on this on draw method

		

		if (mAnimatingRunning) {
			
			//Set the Sprint count to zero to start the animation again
			playedSprintCount = 0;

			mAnimatingRunning = false;

			mIsAnimating = true;

			// onDraw method 
			postInvalidate();

		} else if (mIsAnimating) {

			if (playedSprintCount >= mBitmapList.size()) {
				
				//Set the Sprint count to zero to start the animation again
				playedSprintCount = 0;

				// onDraw method 
				postInvalidate();

			} else {

				long time = (System.currentTimeMillis() - mSpeedCounter);
				
				// next Frame is set after the delay period
				
				if (time >= SPEED) 
				{
					//Speed calculator object
					
					mSpeedCounter = System.currentTimeMillis();

					c.drawBitmap(mBitmapList.get(playedSprintCount), 0, 0, null);
					
					//Increase the Sprint count
					playedSprintCount++;

					// onDraw methord 
					postInvalidate();
				} else //Redraw current frame
				{
					c.drawBitmap(mBitmapList.get(playedSprintCount), 0, 0, null);

					// onDraw methord 
					postInvalidate();
				}
			}
		}
	}

	/* Animation Object Initializer method */
	public void Animater(ArrayList<Bitmap> mBitmapList, int SPEED) {

		this.mBitmapList = mBitmapList;
		this.SPEED = SPEED;

	}
	
	//Start the animation
	public void startAnimater() {

		mAnimatingRunning = true;
		postInvalidate();
	}
	//Stop the animation
	public void stopAnimater() {

		mAnimatingRunning = false;
		mIsAnimating = false;

	}
}