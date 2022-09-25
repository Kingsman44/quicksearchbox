package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.z */
/* compiled from: PG */
final class C133369z implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ boolean f363407a;

    /* renamed from: b */
    final /* synthetic */ DeleteHistoryCallbacks f363408b;

    public C133369z(DeleteHistoryCallbacks deleteHistoryCallbacks, boolean z) {
        this.f363408b = deleteHistoryCallbacks;
        this.f363407a = z;
    }

    public final void onGlobalLayout() {
        if (this.f363408b.mo111006f()) {
            this.f363408b.f362988b.requireView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f363408b.mo111005e(this.f363407a);
        }
    }
}
