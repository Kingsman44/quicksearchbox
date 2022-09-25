package com.google.android.libraries.onegoogle.tooltip;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.y */
/* compiled from: PG */
public final /* synthetic */ class C31089y implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ C31090z f83736a;

    public /* synthetic */ C31089y(C31090z zVar) {
        this.f83736a = zVar;
    }

    public final boolean onPreDraw() {
        C31090z zVar = this.f83736a;
        Rect a = C31090z.m57996a(zVar.f83739c);
        if (a.equals(zVar.f83740d)) {
            return true;
        }
        zVar.f83740d.set(a);
        C31076l lVar = zVar.f83741e;
        Rect rect = zVar.f83740d;
        C31079o oVar = lVar.f83713a;
        TooltipView tooltipView = oVar.f83720d;
        if (tooltipView == null) {
            return true;
        }
        tooltipView.f83669c.set(rect);
        oVar.f83720d.requestLayout();
        return true;
    }
}
