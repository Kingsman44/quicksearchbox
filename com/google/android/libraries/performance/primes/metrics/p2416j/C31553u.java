package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.common.p4526f.C59071e;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.u */
/* compiled from: PG */
public final class C31553u {

    /* renamed from: a */
    public static final C59071e f84960a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.j.u");

    /* renamed from: b */
    public final AtomicInteger f84961b = new AtomicInteger(0);

    /* renamed from: c */
    public final C31543k f84962c;

    /* renamed from: d */
    public final Map f84963d = new ConcurrentHashMap();

    /* renamed from: e */
    public final List f84964e = new ArrayList();

    /* renamed from: f */
    private final ThreadLocal f84965f = new C31552t(this);

    public C31553u(String str) {
        this.f84962c = new C31543k(str, Thread.currentThread().getId(), 2);
    }

    /* renamed from: a */
    public final ArrayDeque mo37245a() {
        return (ArrayDeque) ((WeakReference) this.f84965f.get()).get();
    }
}
