package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.z */
/* compiled from: PG */
final class C77279z extends C77191bq {

    /* renamed from: a */
    public C77196bv f213148a;

    /* renamed from: b */
    public C77195bu f213149b;

    /* renamed from: c */
    public C77193bs f213150c;

    /* renamed from: d */
    public Optional f213151d = Optional.empty();

    /* renamed from: e */
    public C83216f f213152e;

    /* renamed from: f */
    private c f213153f;

    /* renamed from: g */
    private boolean f213154g;

    /* renamed from: h */
    private byte f213155h;

    /* renamed from: a */
    public final C77192br mo72482a() {
        C77196bv bvVar;
        C77195bu buVar;
        C77193bs bsVar;
        c cVar;
        C83216f fVar;
        if (this.f213155h == 1 && (bvVar = this.f213148a) != null && (buVar = this.f213149b) != null && (bsVar = this.f213150c) != null && (cVar = this.f213153f) != null && (fVar = this.f213152e) != null) {
            return new C77148aa(bvVar, buVar, bsVar, this.f213151d, cVar, this.f213154g, fVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f213148a == null) {
            sb.append(" genericTimerFulfiller");
        }
        if (this.f213149b == null) {
            sb.append(" filter");
        }
        if (this.f213150c == null) {
            sb.append(" onMatch");
        }
        if (this.f213153f == null) {
            sb.append(" defaultQuantifier");
        }
        if (this.f213155h == 0) {
            sb.append(" requireOnDeviceExecution");
        }
        if (this.f213152e == null) {
            sb.append(" fulfillerLogger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72483b(c cVar) {
        if (cVar != null) {
            this.f213153f = cVar;
            return;
        }
        throw new NullPointerException("Null defaultQuantifier");
    }

    /* renamed from: c */
    public final void mo72484c(boolean z) {
        this.f213154g = z;
        this.f213155h = 1;
    }
}
