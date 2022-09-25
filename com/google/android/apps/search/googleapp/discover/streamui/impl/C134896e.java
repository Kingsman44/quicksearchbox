package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.e */
/* compiled from: PG */
public final class C134896e implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C134898g f367230a;

    /* renamed from: b */
    private final ViewTreeObserver.OnPreDrawListener f367231b;

    public C134896e(C134898g gVar) {
        this.f367230a = gVar;
        this.f367231b = new C134895d(gVar);
    }

    public final void onViewAttachedToWindow(View view) {
        C69664n.m101061g(view, "v");
        this.f367230a.f367240h.mo112025a((RecyclerView) view);
        view.getViewTreeObserver().addOnPreDrawListener(this.f367231b);
    }

    public final void onViewDetachedFromWindow(View view) {
        C69664n.m101061g(view, "v");
        this.f367230a.f367239g.mo13325W((RecyclerView) view);
        view.getViewTreeObserver().removeOnPreDrawListener(this.f367231b);
    }
}
