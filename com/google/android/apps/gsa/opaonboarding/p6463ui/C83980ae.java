package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.ae */
/* compiled from: PG */
final class C83980ae implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C83982ag f228774a;

    public C83980ae(C83982ag agVar) {
        this.f228774a = agVar;
    }

    public final void onGlobalLayout() {
        C83982ag agVar = this.f228774a;
        if (agVar.f228777b) {
            agVar.f228776a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            agVar.mo77413b();
        }
    }
}
