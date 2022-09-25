package com.google.android.libraries.lens.view.gallery;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.gallery.x */
/* compiled from: PG */
final class C26437x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f71929a;

    /* renamed from: b */
    final /* synthetic */ C26299ac f71930b;

    public C26437x(C26299ac acVar, View view) {
        this.f71930b = acVar;
        this.f71929a = view;
    }

    public final void onGlobalLayout() {
        this.f71929a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f71930b.f71517y = this.f71929a.getHeight() + this.f71930b.f71495c.getResources().getDimensionPixelSize(R.dimen.lens_gallery_floating_permission_button_bottom_margin);
        this.f71929a.setTranslationY((float) this.f71930b.f71517y);
    }
}
