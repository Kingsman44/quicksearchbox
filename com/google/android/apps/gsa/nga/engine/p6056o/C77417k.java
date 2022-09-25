package com.google.android.apps.gsa.nga.engine.p6056o;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.k */
/* compiled from: PG */
public final class C77417k extends C76533aa {

    /* renamed from: a */
    public Optional f213452a = Optional.empty();

    /* renamed from: b */
    private long f213453b;

    /* renamed from: c */
    private byte f213454c;

    /* renamed from: a */
    public final C76534ab mo72223a() {
        if (this.f213454c == 1) {
            return new C77418l(this.f213452a, this.f213453b);
        }
        throw new IllegalStateException("Missing required properties: timestamp");
    }

    /* renamed from: b */
    public final void mo72224b(long j) {
        this.f213453b = j;
        this.f213454c = 1;
    }
}
