Android-Image-Animator-Frame-Library
====================================

This library handles the mutiple images to Animate frame by frame over and over again .This Library make frame animation easer.

Some Screenshots are given below
<p><b>Screen </b></p>
<p><a href="https://raw.githubusercontent.com/rameshvoltella/Android-Image-Animator-Frame-Library/master/ImageFrameAnimationLibrary/Screenshot_2014-07-27-16-15-32.png" target="_blank"><img src="https://raw.githubusercontent.com/rameshvoltella/Android-Image-Animator-Frame-Library/master/ImageFrameAnimationLibrary/Screenshot_2014-07-27-16-15-32.png" alt="Screenshot one" style="max-width:100%;"></a></p>


Image-Animator-Frame: how to use
------------------------


1. Set FrameImageAnimator view in xml
  
    ```xml
       <com.imageframeanimation.FrameImageAnimator
        android:id="@+id/animater_IV"
       android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        
        android:src="@drawable/frame_000" />
```

2. Setting in Main Class
  
    ```java
     /* Image Set To Animate */
     public static int[] mImageToAnimate = new int[] { R.drawable.frame_000,
			R.drawable.frame_001,.....};

   // FrameImageAnimatorimageView
		mAnimateImageView = (FrameImageAnimator) findViewById(R.id.animater_IV);

		mAnimatorControl = new AnimatorControl();

		// Setting the Animation Speed (SLOW,MEDIUM or FAST)
		int mAnimationSpeed = AnimationSpeed.FAST;

		// Applying the Images to Animate with the speed AnimationControl
		mAnimatorControl.mApplyFrames(mImageToAnimate, MainActivity.this,
				mAnimateImageView, mAnimationSpeed);
				
				
				 // Starts The Animation
	    	mAnimatorControl.start();

	       // Stop The Animation
		     mAnimatorControl.stop();
	

	

	





