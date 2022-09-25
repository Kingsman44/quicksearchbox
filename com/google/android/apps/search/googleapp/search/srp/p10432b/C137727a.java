package com.google.android.apps.search.googleapp.search.srp.p10432b;

import android.net.Uri;
import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.clicktracking.ClickTracking", mo61344c = "ClickTracking.kt", mo61345d = "logUriRequestDataForClickTracking", mo61346e = {50})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.b.a */
/* compiled from: PG */
final class C137727a extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f374641a;

    /* renamed from: b */
    final /* synthetic */ C137732f f374642b;

    /* renamed from: c */
    int f374643c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137727a(C137732f fVar, C69577g gVar) {
        super(gVar);
        this.f374642b = fVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f374641a = obj;
        this.f374643c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f374642b.mo113932a((Uri) null, this);
    }
}
