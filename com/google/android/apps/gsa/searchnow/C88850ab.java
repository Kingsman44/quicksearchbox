package com.google.android.apps.gsa.searchnow;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.searchnow.ab */
/* compiled from: PG */
final class C88850ab implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C88861am f240558a;

    public C88850ab(C88861am amVar) {
        this.f240558a = amVar;
    }

    public final void onGlobalLayout() {
        this.f240558a.f240621v.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f240558a.mo82649j();
    }
}
