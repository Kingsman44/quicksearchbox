package org.chromium.base;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: org.chromium.base.e */
/* compiled from: PG */
public abstract class C72379e {

    /* renamed from: a */
    private static final AtomicReference f192525a = new AtomicReference();

    private C72379e() {
    }

    /* renamed from: a */
    public static C72379e m107036a() {
        return (C72379e) f192525a.get();
    }

    /* renamed from: b */
    public abstract String mo63844b();

    /* renamed from: c */
    public abstract boolean mo63845c();
}
