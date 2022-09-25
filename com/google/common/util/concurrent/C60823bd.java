package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.bd */
/* compiled from: PG */
final class C60823bd extends C60824be {

    /* renamed from: a */
    final /* synthetic */ C60825bf f164891a;

    /* renamed from: c */
    private final Callable f164892c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60823bd(C60825bf bfVar, Callable callable, Executor executor) {
        super(bfVar, executor);
        this.f164891a = bfVar;
        callable.getClass();
        this.f164892c = callable;
    }

    /* renamed from: a */
    public final Object mo57287a() {
        return this.f164892c.call();
    }

    /* renamed from: b */
    public final String mo57288b() {
        return this.f164892c.toString();
    }

    /* renamed from: c */
    public final void mo57289c(Object obj) {
        this.f164891a.mo57356n(obj);
    }
}
