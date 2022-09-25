package com.google.android.libraries.lens.view.gallery;

import android.support.p033v7.widget.C0666ga;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: com.google.android.libraries.lens.view.gallery.u */
/* compiled from: PG */
final class C26434u extends C0666ga {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71925a;

    /* renamed from: b */
    private boolean f71926b = true;

    public C26434u(C26299ac acVar) {
        this.f71925a = acVar;
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f71926b) {
            return false;
        }
        if (!this.f71925a.f71479K) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((float) this.f71925a.f71474F.getPaddingTop())) {
            return true;
        }
        GalleryFrameLayout galleryFrameLayout = this.f71925a.f71471C;
        galleryFrameLayout.getClass();
        return galleryFrameLayout.f71456b;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        this.f71926b = !z;
    }
}
