package com.google.android.apps.gsa.shared.util.p7159c;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.shared.util.c.am */
/* compiled from: PG */
public final class C90879am extends C90880an {

    /* renamed from: a */
    private final Callable f254090a;

    public C90879am(String str, int i, int i2, Callable callable) {
        super(callable.getClass(), str, i, i2);
        this.f254090a = callable;
    }

    public final Object call() {
        return this.f254090a.call();
    }
}
