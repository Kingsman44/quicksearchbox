package com.google.android.material.snackbar;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: com.google.android.material.snackbar.i */
/* compiled from: PG */
final class C44878i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117125a;

    public C44878i(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117125a = baseTransientBottomBar;
    }

    public final void run() {
        Context context;
        BaseTransientBottomBar baseTransientBottomBar = this.f117125a;
        if (baseTransientBottomBar.f117089j != null && (context = baseTransientBottomBar.f117088i) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            BaseTransientBottomBar baseTransientBottomBar2 = this.f117125a;
            int[] iArr = new int[2];
            baseTransientBottomBar2.f117089j.getLocationOnScreen(iArr);
            int height = (i - (iArr[1] + baseTransientBottomBar2.f117089j.getHeight())) + ((int) this.f117125a.f117089j.getTranslationY());
            BaseTransientBottomBar baseTransientBottomBar3 = this.f117125a;
            if (height < baseTransientBottomBar3.f117095p) {
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f117089j.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f117074b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.f117125a.f117095p - height;
                this.f117125a.f117089j.requestLayout();
            }
        }
    }
}
