package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.b */
/* compiled from: PG */
final class C76583b extends C76594f {

    /* renamed from: a */
    private final C80379i f211823a;

    /* renamed from: b */
    private final C58485gu f211824b;

    /* renamed from: c */
    private final C58495hd f211825c;

    /* renamed from: d */
    private final Supplier f211826d;

    /* renamed from: e */
    private final Optional f211827e;

    /* renamed from: f */
    private final Optional f211828f;

    /* renamed from: g */
    private final int f211829g;

    public C76583b(C80379i iVar, C58485gu guVar, C58495hd hdVar, Supplier supplier, Optional optional, int i, Optional optional2) {
        this.f211823a = iVar;
        this.f211824b = guVar;
        this.f211825c = hdVar;
        this.f211826d = supplier;
        this.f211827e = optional;
        this.f211829g = i;
        this.f211828f = optional2;
    }

    /* renamed from: a */
    public final C80379i mo72249a() {
        return this.f211823a;
    }

    /* renamed from: b */
    public final C58485gu mo72250b() {
        return this.f211824b;
    }

    /* renamed from: c */
    public final C58495hd mo72251c() {
        return this.f211825c;
    }

    /* renamed from: d */
    public final Optional mo72252d() {
        return this.f211828f;
    }

    /* renamed from: e */
    public final Optional mo72253e() {
        return this.f211827e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76594f) {
            C76594f fVar = (C76594f) obj;
            return this.f211823a.equals(fVar.mo72249a()) && C58597ky.m90218i(this.f211824b, fVar.mo72250b()) && C58662ni.m90356o(this.f211825c, fVar.mo72251c()) && this.f211826d.equals(fVar.mo72255f()) && this.f211827e.equals(fVar.mo72253e()) && this.f211829g == fVar.mo72256g() && this.f211828f.equals(fVar.mo72252d());
        }
    }

    /* renamed from: f */
    public final Supplier mo72255f() {
        return this.f211826d;
    }

    /* renamed from: g */
    public final int mo72256g() {
        return this.f211829g;
    }

    public final int hashCode() {
        return ((((((((((((this.f211823a.hashCode() ^ 1000003) * 1000003) ^ this.f211824b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f211825c.entrySet())) * 1000003) ^ this.f211826d.hashCode()) * 1000003) ^ this.f211827e.hashCode()) * 1000003) ^ this.f211829g) * 1000003) ^ this.f211828f.hashCode();
    }

    public final String toString() {
        String obj = this.f211823a.toString();
        String obj2 = this.f211824b.toString();
        String i = C58662ni.m90350i(this.f211825c);
        String obj3 = this.f211826d.toString();
        String valueOf = String.valueOf(this.f211827e);
        String num = Integer.toString(this.f211829g - 1);
        String valueOf2 = String.valueOf(this.f211828f);
        return "FulfillerConfig{rankingFeatures=" + obj + ", intentNames=" + obj2 + ", intentFlags=" + i + ", intentPredicate=" + obj3 + ", type=" + valueOf + ", performanceTimingEventType=" + num + ", fulfillerName=" + valueOf2 + "}";
    }
}
