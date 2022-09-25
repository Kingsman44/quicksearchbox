package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.view.View;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.n */
/* compiled from: PG */
public final /* synthetic */ class C40233n implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C40165ak f105697a;

    public /* synthetic */ C40233n(C40165ak akVar) {
        this.f105697a = akVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C40165ak akVar = this.f105697a;
        int i9 = i8 - i6;
        int i10 = i4 - i2;
        if (i7 - i5 != i3 - i || i9 != i10) {
            akVar.mo42282m();
        }
    }
}
