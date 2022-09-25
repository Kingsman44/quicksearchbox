package com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f;

import android.view.View;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40134f;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.f.c */
/* compiled from: PG */
public final class C40249c implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f105720a;

    /* renamed from: b */
    final /* synthetic */ View f105721b;

    public C40249c(Runnable runnable, View view) {
        this.f105720a = runnable;
        this.f105721b = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C40134f) this.f105720a).f105417a.mo42247h();
        this.f105721b.removeOnLayoutChangeListener(this);
    }
}
