package com.google.android.apps.auto.sdk.vanagon;

import android.graphics.Bitmap;

/* compiled from: PG */
public interface PhoneSysUiClient$ScreenshotProvider {

    /* compiled from: PG */
    public interface OnCompleteListener {
        void onScreenshotComplete(Bitmap bitmap);
    }

    void getScreenshot(OnCompleteListener onCompleteListener);
}
