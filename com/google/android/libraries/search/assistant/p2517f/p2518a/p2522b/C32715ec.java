package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.C69702k;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SessionImpl", mo61344c = "SessionImpl.kt", mo61345d = "runCacheSizeLogging-IoAF18A", mo61346e = {168})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ec */
/* compiled from: PG */
final class C32715ec extends C69565c {

    /* renamed from: a */
    Object f87680a;

    /* renamed from: b */
    /* synthetic */ Object f87681b;

    /* renamed from: c */
    final /* synthetic */ C32716ed f87682c;

    /* renamed from: d */
    int f87683d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32715ec(C32716ed edVar, C69577g gVar) {
        super(gVar);
        this.f87682c = edVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f87681b = obj;
        this.f87683d |= LinearLayoutManager.INVALID_OFFSET;
        Object c = this.f87682c.mo38266c(this);
        return c == C69554a.COROUTINE_SUSPENDED ? c : new C69702k(c);
    }
}
