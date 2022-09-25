package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58425eo;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.au */
/* compiled from: PG */
public final class C121895au {

    /* renamed from: a */
    public final ReentrantLock f338265a = new ReentrantLock();

    /* renamed from: b */
    public final C58425eo f338266b = new C58425eo(128);

    /* renamed from: c */
    private final C21370a f338267c;

    public C121895au(C21370a aVar) {
        C69664n.m101061g(aVar, "clock");
        this.f338267c = aVar;
    }

    /* renamed from: a */
    public final void mo105424a(C121894at atVar) {
        ReentrantLock reentrantLock = this.f338265a;
        reentrantLock.lock();
        try {
            C58425eo eoVar = this.f338266b;
            Instant ofEpochMilli = Instant.ofEpochMilli(this.f338267c.mo26870b());
            C69664n.m101060f(ofEpochMilli, "clock.now()");
            eoVar.add(new C121898ax(ofEpochMilli, atVar));
        } finally {
            reentrantLock.unlock();
        }
    }
}
