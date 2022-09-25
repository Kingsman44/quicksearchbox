package com.google.android.libraries.abuse.reporting;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.abuse.reporting.al */
/* compiled from: PG */
final class C146723al implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver f396224a;

    /* renamed from: b */
    final /* synthetic */ C146726ao f396225b;

    public C146723al(C146726ao aoVar, ViewTreeObserver viewTreeObserver) {
        this.f396225b = aoVar;
        this.f396224a = viewTreeObserver;
    }

    public final void onGlobalLayout() {
        this.f396224a.removeOnGlobalLayoutListener(this);
        if (this.f396225b.mo123565j()) {
            C146726ao aoVar = this.f396225b;
            aoVar.f396241j.setScrollX(aoVar.mo123556a());
        }
        C146726ao aoVar2 = this.f396225b;
        aoVar2.f396241j.smoothScrollBy(aoVar2.mo123557b(), 0);
    }
}
