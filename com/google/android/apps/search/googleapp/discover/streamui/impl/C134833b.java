package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.support.p033v7.widget.C0646fh;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.b */
/* compiled from: PG */
public final class C134833b implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C134898g f367070a;

    public C134833b(C134898g gVar) {
        this.f367070a = gVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C69664n.m101061g(view, "view");
        view.removeOnLayoutChangeListener(this);
        C134898g gVar = this.f367070a;
        C0646fh fhVar = gVar.f367234b.mItemAnimator;
        if (fhVar != null) {
            fhVar.mo2896t(new C134854c(gVar));
        }
    }
}
