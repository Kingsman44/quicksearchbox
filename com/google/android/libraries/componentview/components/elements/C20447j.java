package com.google.android.libraries.componentview.components.elements;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.componentview.components.elements.j */
/* compiled from: PG */
final class C20447j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ int f57499a;

    /* renamed from: b */
    final /* synthetic */ C20451n f57500b;

    public C20447j(C20451n nVar, int i) {
        this.f57500b = nVar;
        this.f57499a = i;
    }

    public final boolean onPreDraw() {
        this.f57500b.f57513d.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f57499a < this.f57500b.f57513d.mAdapter.getItemCount()) {
            this.f57500b.f57512c.scrollToPositionWithOffset(this.f57499a, 0);
        }
        return false;
    }
}
