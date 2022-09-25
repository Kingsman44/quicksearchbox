package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.w */
/* compiled from: PG */
final class C30223w implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ Drawable f81699a;

    /* renamed from: b */
    final /* synthetic */ boolean f81700b;

    /* renamed from: c */
    final /* synthetic */ C30224x f81701c;

    public C30223w(C30224x xVar, Drawable drawable, boolean z) {
        this.f81701c = xVar;
        this.f81699a = drawable;
        this.f81700b = z;
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        C30224x xVar = this.f81701c;
        Drawable drawable = this.f81699a;
        C19559g.m37304c();
        ImageView imageView = (ImageView) xVar.f81702a.get();
        if (!xVar.f81706e && imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        if (this.f81700b) {
            this.f81701c.mo35694b();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
