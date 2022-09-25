package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.util.concurrent.h */
/* compiled from: PG */
final class C60920h extends C60922j {
    public C60920h(C60870cx cxVar, C60931s sVar) {
        super(cxVar, sVar);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo57417e(Object obj, Object obj2) {
        C60931s sVar = (C60931s) obj;
        C60870cx apply = sVar.apply(obj2);
        C58838bb.m90867b(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", sVar);
        return apply;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo57418f(Object obj) {
        mo57358p((C60870cx) obj);
    }
}
