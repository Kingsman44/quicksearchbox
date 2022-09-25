package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.x */
/* compiled from: PG */
final class C77277x extends C77184bj {

    /* renamed from: a */
    public C77188bn f213133a;

    /* renamed from: b */
    public C77183bi f213134b;

    /* renamed from: c */
    public C77186bl f213135c;

    /* renamed from: d */
    public Optional f213136d = Optional.empty();

    /* renamed from: e */
    public C83216f f213137e;

    /* renamed from: f */
    private boolean f213138f;

    /* renamed from: g */
    private boolean f213139g;

    /* renamed from: h */
    private byte f213140h;

    /* renamed from: a */
    public final C77185bk mo72470a() {
        C77188bn bnVar;
        C77183bi biVar;
        C77186bl blVar;
        C83216f fVar;
        if (this.f213140h == 3 && (bnVar = this.f213133a) != null && (biVar = this.f213134b) != null && (blVar = this.f213135c) != null && (fVar = this.f213137e) != null) {
            return new C77278y(bnVar, this.f213138f, biVar, blVar, this.f213139g, this.f213136d, fVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f213133a == null) {
            sb.append(" genericAlarmFulfiller");
        }
        if ((this.f213140h & 1) == 0) {
            sb.append(" allowedWhenAlarmIsRinging");
        }
        if (this.f213134b == null) {
            sb.append(" filter");
        }
        if (this.f213135c == null) {
            sb.append(" onMatch");
        }
        if ((this.f213140h & 2) == 0) {
            sb.append(" onDeviceExecutionRequired");
        }
        if (this.f213137e == null) {
            sb.append(" fulfillerLogger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72471b(boolean z) {
        this.f213138f = z;
        this.f213140h = (byte) (this.f213140h | 1);
    }

    /* renamed from: c */
    public final void mo72472c(boolean z) {
        this.f213139g = z;
        this.f213140h = (byte) (this.f213140h | 2);
    }
}
