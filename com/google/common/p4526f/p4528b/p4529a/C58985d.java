package com.google.common.p4526f.p4528b.p4529a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.common.f.b.a.d */
/* compiled from: PG */
public final class C58985d {

    /* renamed from: a */
    private static final AtomicBoolean f156846a = new AtomicBoolean(false);

    /* renamed from: a */
    public static C58984c m91157a(String str) {
        try {
            try {
                return (C58984c) Class.forName(str).asSubclass(C58984c.class).newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                throw new Error("Cannot instantiate backend factory: ".concat(String.valueOf(str)), e);
            }
        } catch (ClassNotFoundException e2) {
            throw new Error("Cannot find backend factory: ".concat(String.valueOf(str)), e2);
        }
    }

    /* renamed from: b */
    public static void m91158b(C58984c cVar) {
        if (cVar == null) {
            cVar = new C59003t();
        }
        AtomicReference atomicReference = C58998o.f156861a;
        while (!atomicReference.compareAndSet((Object) null, cVar)) {
            if (atomicReference.get() != null) {
                throw new IllegalStateException("Logger backends can only be configured once.");
            }
        }
        C58998o.m91184e();
    }

    /* renamed from: c */
    public static void m91159c() {
        if (!f156846a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
    }
}
