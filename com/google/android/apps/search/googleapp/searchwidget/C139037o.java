package com.google.android.apps.search.googleapp.searchwidget;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.searchwidget.SearchWidgetRenderer", mo61344c = "SearchWidgetRenderer.kt", mo61345d = "createRecentsWidget", mo61346e = {107})
/* renamed from: com.google.android.apps.search.googleapp.searchwidget.o */
/* compiled from: PG */
final class C139037o extends C69565c {

    /* renamed from: a */
    Object f378136a;

    /* renamed from: b */
    /* synthetic */ Object f378137b;

    /* renamed from: c */
    final /* synthetic */ C139130u f378138c;

    /* renamed from: d */
    int f378139d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139037o(C139130u uVar, C69577g gVar) {
        super(gVar);
        this.f378138c = uVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f378137b = obj;
        this.f378139d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f378138c.mo114751b((Bundle) null, this);
    }
}
