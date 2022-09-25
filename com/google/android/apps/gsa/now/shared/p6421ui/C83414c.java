package com.google.android.apps.gsa.now.shared.p6421ui;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.c */
/* compiled from: PG */
final class C83414c implements Runnable {

    /* renamed from: a */
    public Drawable f227383a;

    /* renamed from: b */
    final /* synthetic */ CrossfadingWebImageView f227384b;

    public C83414c(CrossfadingWebImageView crossfadingWebImageView, Drawable drawable) {
        this.f227384b = crossfadingWebImageView;
        this.f227383a = drawable;
    }

    public final void run() {
        C83414c.super.setImageDrawable(this.f227383a);
        CrossfadingWebImageView crossfadingWebImageView = this.f227384b;
        crossfadingWebImageView.f227319a = null;
        crossfadingWebImageView.f227320b = null;
    }
}
