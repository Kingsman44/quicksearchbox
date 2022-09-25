package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.util.concurrent.a */
/* compiled from: PG */
final class C60791a extends C60846c {
    public C60791a(C60870cx cxVar, Class cls, C60931s sVar) {
        super(cxVar, cls, sVar);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo57250e(Object obj, Throwable th) {
        C60931s sVar = (C60931s) obj;
        C60870cx apply = sVar.apply(th);
        C58838bb.m90867b(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", sVar);
        return apply;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo57251f(Object obj) {
        mo57358p((C60870cx) obj);
    }
}
