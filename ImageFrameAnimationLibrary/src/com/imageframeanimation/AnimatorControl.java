/***
 * Tile : AnimatorControl class 
 * @author Ramesh M Nair
 *
 * **/

package com.imageframeanimation;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class AnimatorControl {

	FrameImageAnimator mFrameImageAnimator;
	int mspeedType;

	public void mApplyFrames(int[] mImageFrames, Context mContext,
			FrameImageAnimator mFrameImageAnimator, int mspeedType) {

		this.mFrameImageAnimator = mFrameImageAnimator;

		ArrayList<Bitmap> mBitmapList = new ArrayList<Bitmap>();

		this.mspeedType = mspeedType;

		for (int x = 0; x < mImageFrames.length; x++) {
			
			/* Inserts the given images to make frame animations */
			
			BitmapDrawable d = (BitmapDrawable) mContext.getResources()
					.getDrawable(mImageFrames[x]);

			mBitmapList.add(d.getBitmap());

		}

		mFrameImageAnimator.Animater(mBitmapList, mspeedType);

	}

	public void start() {

		mFrameImageAnimator.startAnimater();

	}

	public void stop() {

		mFrameImageAnimator.stopAnimater();

	}
}
