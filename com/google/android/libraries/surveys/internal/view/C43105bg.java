package com.google.android.libraries.surveys.internal.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.libraries.surveys.internal.view.bg */
/* compiled from: PG */
public final /* synthetic */ class C43105bg implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f112737a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f112738b;

    /* renamed from: c */
    public final /* synthetic */ Drawable f112739c;

    /* renamed from: d */
    public final /* synthetic */ Drawable f112740d;

    /* renamed from: e */
    public final /* synthetic */ int f112741e;

    public /* synthetic */ C43105bg(FrameLayout frameLayout, ViewGroup viewGroup, Drawable drawable, Drawable drawable2, int i) {
        this.f112737a = frameLayout;
        this.f112738b = viewGroup;
        this.f112739c = drawable;
        this.f112740d = drawable2;
        this.f112741e = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f112737a;
        ViewGroup viewGroup = this.f112738b;
        Drawable drawable = this.f112739c;
        Drawable drawable2 = this.f112740d;
        int i = this.f112741e;
        int i2 = C43108bj.f112745b;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                if (C43108bj.m76065d(motionEvent, view)) {
                    return true;
                }
                frameLayout.setPressed(false);
                C43108bj.m76064b(viewGroup, 0, drawable, drawable2);
                return true;
            } else if (!frameLayout.isPressed()) {
                return true;
            } else {
                frameLayout.performClick();
                C43108bj.m76064b(viewGroup, i, drawable, drawable2);
                return true;
            }
        } else if (!C43108bj.m76065d(motionEvent, view)) {
            return true;
        } else {
            frameLayout.setPressed(true);
            C43108bj.m76064b(viewGroup, i, drawable, drawable2);
            return true;
        }
    }
}
