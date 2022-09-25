package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.az */
/* compiled from: PG */
final class C130914az extends C130918bc {

    /* renamed from: a */
    private final C58485gu f358224a;

    /* renamed from: b */
    private final boolean f358225b;

    /* renamed from: c */
    private final boolean f358226c;

    /* renamed from: d */
    private final boolean f358227d;

    /* renamed from: e */
    private final Optional f358228e;

    public C130914az(C58485gu guVar, boolean z, boolean z2, boolean z3, Optional optional) {
        this.f358224a = guVar;
        this.f358225b = z;
        this.f358226c = z2;
        this.f358227d = z3;
        this.f358228e = optional;
    }

    /* renamed from: a */
    public final C58485gu mo109959a() {
        return this.f358224a;
    }

    /* renamed from: b */
    public final Optional mo109960b() {
        return this.f358228e;
    }

    /* renamed from: c */
    public final boolean mo109961c() {
        return this.f358225b;
    }

    /* renamed from: d */
    public final boolean mo109962d() {
        return this.f358227d;
    }

    /* renamed from: e */
    public final boolean mo109963e() {
        return this.f358226c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130918bc) {
            C130918bc bcVar = (C130918bc) obj;
            return C58597ky.m90218i(this.f358224a, bcVar.mo109959a()) && this.f358225b == bcVar.mo109961c() && this.f358226c == bcVar.mo109963e() && this.f358227d == bcVar.mo109962d() && this.f358228e.equals(bcVar.mo109960b());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f358224a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f358225b ? 1237 : 1231)) * 1000003) ^ (true != this.f358226c ? 1237 : 1231)) * 1000003;
        if (true == this.f358227d) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f358228e.hashCode();
    }

    public final String toString() {
        String obj = this.f358224a.toString();
        boolean z = this.f358225b;
        boolean z2 = this.f358226c;
        boolean z3 = this.f358227d;
        String valueOf = String.valueOf(this.f358228e);
        return "LoggerOptions{smartspaceUpdateSourceList=" + obj + ", isOpaEligible=" + z + ", isWorkProfile=" + z2 + ", isThirdPartyData=" + z3 + ", smartspaceCardPayload=" + valueOf + "}";
    }
}
