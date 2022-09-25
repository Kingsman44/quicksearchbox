package com.google.android.libraries.lens.view.filters.carousel;

import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.m */
/* compiled from: PG */
final class C25957m implements C0657fs {

    /* renamed from: a */
    final /* synthetic */ C25961q f70544a;

    /* renamed from: b */
    private boolean f70545b = true;

    public C25957m(C25961q qVar) {
        this.f70544a = qVar;
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return this.f70545b && !this.f70544a.f70555h;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        this.f70545b = !z;
    }

    public final void onTouchEvent$ar$ds(MotionEvent motionEvent) {
    }
}
