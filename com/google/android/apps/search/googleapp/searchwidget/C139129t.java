package com.google.android.apps.search.googleapp.searchwidget;

import android.support.p033v7.widget.LinearLayoutManager;
import android.widget.RemoteViews;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.searchwidget.SearchWidgetRenderer", mo61344c = "SearchWidgetRenderer.kt", mo61345d = "maybeAttachDoodle", mo61346e = {193})
/* renamed from: com.google.android.apps.search.googleapp.searchwidget.t */
/* compiled from: PG */
final class C139129t extends C69565c {

    /* renamed from: a */
    Object f378372a;

    /* renamed from: b */
    Object f378373b;

    /* renamed from: c */
    /* synthetic */ Object f378374c;

    /* renamed from: d */
    final /* synthetic */ C139130u f378375d;

    /* renamed from: e */
    int f378376e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139129t(C139130u uVar, C69577g gVar) {
        super(gVar);
        this.f378375d = uVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f378374c = obj;
        this.f378376e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f378375d.mo114756g((RemoteViews) null, this);
    }
}
