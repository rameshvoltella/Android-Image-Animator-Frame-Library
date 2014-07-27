Android-Image-Animator-Frame-Library
====================================

This library handles the mutiple images to Animate frame by frame over and over again .This Library make frame animation easer.
The example of Frame animation is avilable on  [Android-Image-Animator-Frame-Sample](https://github.com/rameshvoltella/Android-Image-Animator-Frame-Sample).  


## VIDEO ([SAMPLE](https://www.youtube.com/watch?v=HPQI7QaTs44&feature=youtu.be))   


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
	

	
	
	

## License

    The MIT License (MIT)

    Copyright (c) 2014 Ramesh M Nair
 
     Permission is hereby granted, free of charge, to any person obtaining a copy
     of this software and associated documentation files (the "Software"), to deal
     in the Software without restriction, including without limitation the rights
     to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
     copies of the Software, and to permit persons to whom the Software is
     furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

     THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.


	

	





