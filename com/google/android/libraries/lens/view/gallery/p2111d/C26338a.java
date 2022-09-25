package com.google.android.libraries.lens.view.gallery.p2111d;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.a */
/* compiled from: PG */
public final class C26338a {

    /* renamed from: a */
    public final int f71596a;

    /* renamed from: b */
    private final int f71597b;

    public C26338a(int i, int i2) {
        this.f71596a = i;
        this.f71597b = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31532a(View view, int i, int i2) {
        int i3 = this.f71596a;
        if (i3 > 0 && i > i3) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = Math.max(i2, (i - this.f71596a) - this.f71597b);
            view.setLayoutParams(layoutParams);
        }
    }
}
