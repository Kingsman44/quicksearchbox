package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ay */
/* compiled from: PG */
public final class C130913ay extends C130917bb {

    /* renamed from: a */
    public C58485gu f358218a;

    /* renamed from: b */
    public Optional f358219b = Optional.empty();

    /* renamed from: c */
    private boolean f358220c;

    /* renamed from: d */
    private boolean f358221d;

    /* renamed from: e */
    private boolean f358222e;

    /* renamed from: f */
    private byte f358223f;

    /* renamed from: a */
    public final C130918bc mo109955a() {
        C58485gu guVar;
        if (this.f358223f == 7 && (guVar = this.f358218a) != null) {
            return new C130914az(guVar, this.f358220c, this.f358221d, this.f358222e, this.f358219b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f358218a == null) {
            sb.append(" smartspaceUpdateSourceList");
        }
        if ((this.f358223f & 1) == 0) {
            sb.append(" isOpaEligible");
        }
        if ((this.f358223f & 2) == 0) {
            sb.append(" isWorkProfile");
        }
        if ((this.f358223f & 4) == 0) {
            sb.append(" isThirdPartyData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo109956b(boolean z) {
        this.f358220c = z;
        this.f358223f = (byte) (this.f358223f | 1);
    }

    /* renamed from: c */
    public final void mo109957c(boolean z) {
        this.f358222e = z;
        this.f358223f = (byte) (this.f358223f | 4);
    }

    /* renamed from: d */
    public final void mo109958d(boolean z) {
        this.f358221d = z;
        this.f358223f = (byte) (this.f358223f | 2);
    }
}
