package com.google.android.apps.search.googleapp.searchwidget;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.searchwidget.SearchWidgetRenderer", mo61344c = "SearchWidgetRenderer.kt", mo61345d = "createRemoteViews", mo61346e = {52, 55, 57, 60})
/* renamed from: com.google.android.apps.search.googleapp.searchwidget.p */
/* compiled from: PG */
final class C139038p extends C69565c {

    /* renamed from: a */
    Object f378140a;

    /* renamed from: b */
    Object f378141b;

    /* renamed from: c */
    /* synthetic */ Object f378142c;

    /* renamed from: d */
    final /* synthetic */ C139130u f378143d;

    /* renamed from: e */
    int f378144e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139038p(C139130u uVar, C69577g gVar) {
        super(gVar);
        this.f378143d = uVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f378142c = obj;
        this.f378144e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f378143d.mo114752c((Bundle) null, 0, this);
    }
}
