package com.google.android.libraries.onegoogle.tooltip;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.m */
/* compiled from: PG */
public final /* synthetic */ class C31077m implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C31079o f83714a;

    /* renamed from: b */
    public final /* synthetic */ C31090z f83715b;

    public /* synthetic */ C31077m(C31079o oVar, C31090z zVar) {
        this.f83714a = oVar;
        this.f83715b = zVar;
    }

    public final void onDismiss() {
        C31079o oVar = this.f83714a;
        C31090z zVar = this.f83715b;
        ViewTreeObserver viewTreeObserver = zVar.f83738b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(zVar.f83737a);
        }
        ((C31070f) oVar.f83719c).f83702a.mo36801b();
    }
}
