package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.d */
/* compiled from: PG */
public final class C104393d {

    /* renamed from: a */
    public final View f290479a;

    /* renamed from: b */
    public C104392c f290480b;

    public C104393d(View view) {
        this.f290479a = view;
    }

    /* renamed from: a */
    public static final boolean m172602a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (view.getVisibility() == 0) {
            int i = iArr[0];
            if (new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m172603b(View view) {
        view.animate().withStartAction((Runnable) null).withEndAction((Runnable) null).cancel();
    }
}
