package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.i.bh */
/* compiled from: PG */
public final /* synthetic */ class C23867bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f65312a;

    /* renamed from: b */
    public final /* synthetic */ Callable f65313b;

    public /* synthetic */ C23867bh(SettableFuture settableFuture, Callable callable) {
        this.f65312a = settableFuture;
        this.f65313b = callable;
    }

    public final void run() {
        SettableFuture settableFuture = this.f65312a;
        Callable callable = this.f65313b;
        int i = C23870bk.f65323c;
        try {
            settableFuture.mo57356n(callable.call());
        } catch (Exception e) {
            settableFuture.mo57357o(e);
            throw new RuntimeException(e);
        }
    }
}
