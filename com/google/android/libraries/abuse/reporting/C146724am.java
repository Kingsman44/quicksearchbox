package com.google.android.libraries.abuse.reporting;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.abuse.reporting.am */
/* compiled from: PG */
final class C146724am implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver f396226a;

    /* renamed from: b */
    final /* synthetic */ ReportAbuseCardConfigParcel f396227b;

    /* renamed from: c */
    final /* synthetic */ C146726ao f396228c;

    public C146724am(C146726ao aoVar, ViewTreeObserver viewTreeObserver, ReportAbuseCardConfigParcel reportAbuseCardConfigParcel) {
        this.f396228c = aoVar;
        this.f396226a = viewTreeObserver;
        this.f396227b = reportAbuseCardConfigParcel;
    }

    public final void onGlobalLayout() {
        this.f396226a.removeOnGlobalLayoutListener(this);
        if (this.f396228c.mo123565j()) {
            this.f396228c.f396241j.setScrollX(0);
        }
        this.f396228c.mo123563h();
        this.f396228c.mo123560e(true);
        this.f396228c.mo123564i(this.f396227b);
    }
}
