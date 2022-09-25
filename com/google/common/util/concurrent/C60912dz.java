package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.util.concurrent.dz */
/* compiled from: PG */
final class C60912dz extends C60869cw {

    /* renamed from: a */
    final /* synthetic */ C60915eb f165027a;

    /* renamed from: b */
    private final C60930r f165028b;

    public C60912dz(C60915eb ebVar, C60930r rVar) {
        this.f165027a = ebVar;
        rVar.getClass();
        this.f165028b = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo57287a() {
        C60870cx a = this.f165028b.mo18058a();
        C58838bb.m90867b(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f165028b);
        return a;
    }

    /* renamed from: b */
    public final String mo57288b() {
        return this.f165028b.toString();
    }

    /* renamed from: d */
    public final void mo57290d(Throwable th) {
        this.f165027a.mo57357o(th);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo57291e(Object obj) {
        this.f165027a.mo57358p((C60870cx) obj);
    }

    /* renamed from: g */
    public final boolean mo57293g() {
        return this.f165027a.isDone();
    }
}
