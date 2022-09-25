package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.x */
/* compiled from: PG */
final class C87650x implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    final /* synthetic */ ScrollView f236909a;

    /* renamed from: b */
    final /* synthetic */ C87651y f236910b;

    public C87650x(C87651y yVar, ScrollView scrollView) {
        this.f236910b = yVar;
        this.f236909a = scrollView;
    }

    public final void onScrollChanged() {
        this.f236910b.f236911a.f236786P.mo82423h();
        if (this.f236909a.getChildAt(0).getBottom() <= this.f236909a.getHeight() + this.f236909a.getScrollY()) {
            this.f236910b.f236911a.f236786P.mo82424i();
        }
    }
}
