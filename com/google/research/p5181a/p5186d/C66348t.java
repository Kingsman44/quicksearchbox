package com.google.research.p5181a.p5186d;

import java.util.concurrent.Executors;

/* renamed from: com.google.research.a.d.t */
/* compiled from: PG */
public final class C66348t {

    /* renamed from: a */
    static C66348t f180419a;

    private C66348t() {
        Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() / 2);
    }

    /* renamed from: a */
    public static final void m97071a(int i, C66347s sVar) {
        for (int i2 = 0; i2 < i; i2++) {
            sVar.mo59531a(i2);
        }
    }

    /* renamed from: b */
    public static void m97072b() {
        if (f180419a == null) {
            f180419a = new C66348t();
        }
    }
}
