package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a */
/* compiled from: PG */
public final /* synthetic */ class C40127a implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f105396a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f105397b;

    public /* synthetic */ C40127a(GestureDetector gestureDetector, View.OnClickListener onClickListener) {
        this.f105396a = gestureDetector;
        this.f105397b = onClickListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f105396a;
        View.OnClickListener onClickListener = this.f105397b;
        if (!gestureDetector.onTouchEvent(motionEvent)) {
            return false;
        }
        ((C40158ad) onClickListener).f105481a.mo42278i();
        return true;
    }
}
