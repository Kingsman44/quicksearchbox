package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.ag */
/* compiled from: PG */
final class C97364ag implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C58833ax f271917a;

    /* renamed from: b */
    final /* synthetic */ C97366ai f271918b;

    public C97364ag(C97366ai aiVar, C58833ax axVar) {
        this.f271918b = aiVar;
        this.f271917a = axVar;
    }

    public final void onGlobalLayout() {
        this.f271918b.mo28297il().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f271918b.mo90666e((Rect) this.f271917a.mo56107c());
    }
}
