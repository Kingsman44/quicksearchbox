package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fh */
/* compiled from: PG */
final class C108346fh implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ OpaAppActionsServiceCard f301382a;

    public C108346fh(OpaAppActionsServiceCard opaAppActionsServiceCard) {
        this.f301382a = opaAppActionsServiceCard;
    }

    public final void onGlobalLayout() {
        this.f301382a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
