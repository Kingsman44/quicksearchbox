package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.f.a.c */
/* compiled from: PG */
public final class C17278c implements C60930r {

    /* renamed from: a */
    public final C60930r f50071a;

    /* renamed from: b */
    public final Duration f50072b;

    /* renamed from: c */
    public final C60950i f50073c;

    /* renamed from: d */
    public final Executor f50074d;

    /* renamed from: e */
    private final AtomicReference f50075e = new AtomicReference();

    public C17278c(C60930r rVar, Duration duration, C60950i iVar, Executor executor) {
        C69664n.m101061g(duration, "cacheTimeout");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(executor, "executor");
        this.f50071a = rVar;
        this.f50072b = duration;
        this.f50073c = iVar;
        this.f50074d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Object updateAndGet = DesugarAtomicReference.updateAndGet(this.f50075e, new C17277b(this));
        C69664n.m101058d(updateAndGet);
        return ((C17276a) updateAndGet).f50067a.mo50395b();
    }
}
