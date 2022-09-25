package com.google.android.apps.search.googleapp.p10338l.p10339a;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.C69702k;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDump", mo61344c = "StateDump.kt", mo61345d = "getKvData-gIAlu-s", mo61346e = {50})
/* renamed from: com.google.android.apps.search.googleapp.l.a.y */
/* compiled from: PG */
final class C136406y extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f371364a;

    /* renamed from: b */
    final /* synthetic */ C136378aa f371365b;

    /* renamed from: c */
    int f371366c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136406y(C136378aa aaVar, C69577g gVar) {
        super(gVar);
        this.f371365b = aaVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f371364a = obj;
        this.f371366c |= LinearLayoutManager.INVALID_OFFSET;
        Object c = this.f371365b.mo112956c((C136398q) null, this);
        return c == C69554a.COROUTINE_SUSPENDED ? c : new C69702k(c);
    }
}
