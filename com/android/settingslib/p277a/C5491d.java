package com.android.settingslib.p277a;

import android.widget.FrameLayout;
import android.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: com.android.settingslib.a.d */
/* compiled from: PG */
public final class C5491d {

    /* renamed from: a */
    public CollapsingToolbarLayout f16634a;

    /* renamed from: b */
    public AppBarLayout f16635b;

    /* renamed from: c */
    public Toolbar f16636c;

    /* renamed from: d */
    public FrameLayout f16637d;

    /* renamed from: e */
    public final C5488a f16638e;

    public C5491d(C5488a aVar) {
        this.f16638e = aVar;
    }

    /* renamed from: a */
    public final void mo11826a(CharSequence charSequence) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f16634a;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.mo47439f(charSequence);
        } else {
            C5491d.super.setTitle(charSequence);
        }
    }
}
