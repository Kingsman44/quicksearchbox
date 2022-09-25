package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.a */
/* compiled from: PG */
public final class C76541a extends C76593e {

    /* renamed from: a */
    public Supplier f211764a;

    /* renamed from: b */
    public Optional f211765b = Optional.empty();

    /* renamed from: c */
    public int f211766c;

    /* renamed from: d */
    private C80379i f211767d;

    /* renamed from: e */
    private C58485gu f211768e;

    /* renamed from: f */
    private C58495hd f211769f;

    /* renamed from: g */
    private Optional f211770g = Optional.empty();

    /* renamed from: a */
    public final C76594f mo72242a() {
        C58485gu guVar;
        C58495hd hdVar;
        Supplier supplier;
        int i;
        C80379i iVar = this.f211767d;
        if (iVar != null && (guVar = this.f211768e) != null && (hdVar = this.f211769f) != null && (supplier = this.f211764a) != null && (i = this.f211766c) != 0) {
            return new C76583b(iVar, guVar, hdVar, supplier, this.f211770g, i, this.f211765b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f211767d == null) {
            sb.append(" rankingFeatures");
        }
        if (this.f211768e == null) {
            sb.append(" intentNames");
        }
        if (this.f211769f == null) {
            sb.append(" intentFlags");
        }
        if (this.f211764a == null) {
            sb.append(" intentPredicate");
        }
        if (this.f211766c == 0) {
            sb.append(" performanceTimingEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72243b(C58495hd hdVar) {
        this.f211769f = hdVar;
    }

    /* renamed from: c */
    public final void mo72244c(C58485gu guVar) {
        if (guVar != null) {
            this.f211768e = guVar;
            return;
        }
        throw new NullPointerException("Null intentNames");
    }

    /* renamed from: d */
    public final void mo72245d(C80379i iVar) {
        if (iVar != null) {
            this.f211767d = iVar;
            return;
        }
        throw new NullPointerException("Null rankingFeatures");
    }

    /* renamed from: e */
    public final void mo72246e(Optional optional) {
        if (optional != null) {
            this.f211770g = optional;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
