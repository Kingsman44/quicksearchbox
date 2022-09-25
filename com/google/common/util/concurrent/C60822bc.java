package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.bc */
/* compiled from: PG */
final class C60822bc extends C60824be {

    /* renamed from: a */
    final /* synthetic */ C60825bf f164889a;

    /* renamed from: c */
    private final C60930r f164890c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60822bc(C60825bf bfVar, C60930r rVar, Executor executor) {
        super(bfVar, executor);
        this.f164889a = bfVar;
        rVar.getClass();
        this.f164890c = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo57287a() {
        C60870cx a = this.f164890c.mo18058a();
        C58838bb.m90867b(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f164890c);
        return a;
    }

    /* renamed from: b */
    public final String mo57288b() {
        return this.f164890c.toString();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo57289c(Object obj) {
        this.f164889a.mo57358p((C60870cx) obj);
    }
}
