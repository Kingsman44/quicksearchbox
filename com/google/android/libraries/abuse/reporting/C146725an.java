package com.google.android.libraries.abuse.reporting;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.abuse.reporting.an */
/* compiled from: PG */
final class C146725an implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    final /* synthetic */ int f396229a;

    /* renamed from: b */
    final /* synthetic */ ViewTreeObserver f396230b;

    /* renamed from: c */
    final /* synthetic */ C146726ao f396231c;

    public C146725an(C146726ao aoVar, int i, ViewTreeObserver viewTreeObserver) {
        this.f396231c = aoVar;
        this.f396229a = i;
        this.f396230b = viewTreeObserver;
    }

    public final void onScrollChanged() {
        C146726ao aoVar = this.f396231c;
        int scrollX = aoVar.f396241j.getScrollX();
        int i = this.f396229a;
        if (aoVar.mo123565j()) {
            if (scrollX < i) {
                return;
            }
        } else if (scrollX > i) {
            return;
        }
        this.f396230b.removeOnScrollChangedListener(this);
        C146726ao aoVar2 = this.f396231c;
        aoVar2.f396240i.removeViewAt(aoVar2.f396242k);
    }
}
