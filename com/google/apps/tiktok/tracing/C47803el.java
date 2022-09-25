package com.google.apps.tiktok.tracing;

import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.tracing.el */
/* compiled from: PG */
final class C47803el implements Callable {

    /* renamed from: a */
    final /* synthetic */ C47572bw f123809a;

    /* renamed from: b */
    final /* synthetic */ Callable f123810b;

    public C47803el(C47572bw bwVar, Callable callable) {
        this.f123809a = bwVar;
        this.f123810b = callable;
    }

    public final Object call() {
        C47572bw h = C47831fm.m85013h(this.f123809a);
        try {
            Object call = this.f123810b.call();
            C47831fm.m85013h(h);
            return call;
        } catch (Throwable th) {
            C47831fm.m85013h(h);
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f123810b);
        return "propagating=[" + valueOf + "]";
    }
}
