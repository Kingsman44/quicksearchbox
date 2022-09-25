package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.common.util.concurrent.bq */
/* compiled from: PG */
public final class C60836bq {

    /* renamed from: a */
    public C60835bp f164923a = new C60835bp();

    /* renamed from: b */
    private final AtomicReference f164924b = new AtomicReference(C60866ct.f164955a);

    /* renamed from: a */
    public final C60870cx mo57304a(Callable callable, Executor executor) {
        callable.getClass();
        executor.getClass();
        return mo57305b(new C60831bl(callable), executor);
    }

    /* renamed from: b */
    public final C60870cx mo57305b(C60930r rVar, Executor executor) {
        rVar.getClass();
        executor.getClass();
        C60834bo boVar = new C60834bo(executor, this);
        C60832bm bmVar = new C60832bm(boVar, rVar);
        SettableFuture settableFuture = new SettableFuture();
        C60870cx cxVar = (C60870cx) this.f164924b.getAndSet(settableFuture);
        C60915eb ebVar = new C60915eb((C60930r) bmVar);
        cxVar.mo4106b(ebVar, boVar);
        C60870cx j = C60856cj.m92901j(ebVar);
        C60830bk bkVar = new C60830bk(ebVar, settableFuture, cxVar, j, boVar);
        j.mo4106b(bkVar, C60826bg.f164896a);
        ebVar.mo4106b(bkVar, C60826bg.f164896a);
        return j;
    }
}
