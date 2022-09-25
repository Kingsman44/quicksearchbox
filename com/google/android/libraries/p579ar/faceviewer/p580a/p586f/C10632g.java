package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.g */
/* compiled from: PG */
final class C10632g extends WebView {
    public C10632g(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
