package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.d */
/* compiled from: PG */
public final class C75883d extends C75891l {

    /* renamed from: a */
    private final Duration f210540a;

    /* renamed from: b */
    private final C22871g f210541b;

    public C75883d(C75892m mVar, Duration duration, C22871g gVar) {
        super(mVar);
        this.f210540a = duration;
        this.f210541b = gVar;
    }

    /* renamed from: f */
    public final synchronized int mo71939f() {
        this.f210541b.mo28213m("[NGA] delay state execution", this.f210540a.toMillis(), new C75882c(this));
        return 1;
    }
}
