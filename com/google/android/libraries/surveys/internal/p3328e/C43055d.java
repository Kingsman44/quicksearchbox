package com.google.android.libraries.surveys.internal.p3328e;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: com.google.android.libraries.surveys.internal.e.d */
/* compiled from: PG */
public final /* synthetic */ class C43055d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f112611a;

    /* renamed from: b */
    public final /* synthetic */ int f112612b;

    /* renamed from: c */
    public final /* synthetic */ int f112613c;

    /* renamed from: d */
    public final /* synthetic */ View f112614d;

    public /* synthetic */ C43055d(View view, int i, int i2, View view2) {
        this.f112611a = view;
        this.f112612b = i;
        this.f112613c = i2;
        this.f112614d = view2;
    }

    public final void run() {
        View view = this.f112611a;
        int i = this.f112612b;
        int i2 = this.f112613c;
        View view2 = this.f112614d;
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= 2131172514;
        rect.left = rect.left;
        rect.right += i;
        rect.bottom += i2;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }
}
