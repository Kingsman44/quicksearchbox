package com.google.android.apps.search.googleapp.p10338l.p10339a;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.C69702k;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDump", mo61344c = "StateDump.kt", mo61345d = "getComplexData-gIAlu-s", mo61346e = {56})
/* renamed from: com.google.android.apps.search.googleapp.l.a.u */
/* compiled from: PG */
final class C136402u extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f371351a;

    /* renamed from: b */
    final /* synthetic */ C136378aa f371352b;

    /* renamed from: c */
    int f371353c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136402u(C136378aa aaVar, C69577g gVar) {
        super(gVar);
        this.f371352b = aaVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f371351a = obj;
        this.f371353c |= LinearLayoutManager.INVALID_OFFSET;
        Object a = this.f371352b.mo112954a((C136397p) null, this);
        return a == C69554a.COROUTINE_SUSPENDED ? a : new C69702k(a);
    }
}
