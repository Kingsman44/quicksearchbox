package com.google.android.apps.search.googleapp.p10338l.p10339a;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.C69702k;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDump", mo61344c = "StateDump.kt", mo61345d = "getData-gIAlu-s", mo61346e = {45, 46})
/* renamed from: com.google.android.apps.search.googleapp.l.a.x */
/* compiled from: PG */
final class C136405x extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f371361a;

    /* renamed from: b */
    final /* synthetic */ C136378aa f371362b;

    /* renamed from: c */
    int f371363c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136405x(C136378aa aaVar, C69577g gVar) {
        super(gVar);
        this.f371362b = aaVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f371361a = obj;
        this.f371363c |= LinearLayoutManager.INVALID_OFFSET;
        Object b = this.f371362b.mo112955b((C136399r) null, this);
        return b == C69554a.COROUTINE_SUSPENDED ? b : new C69702k(b);
    }
}
