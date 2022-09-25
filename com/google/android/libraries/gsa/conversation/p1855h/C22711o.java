package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.gsa.conversation.h.o */
/* compiled from: PG */
final class C22711o extends C22692ae {

    /* renamed from: a */
    private final C58833ax f62519a;

    /* renamed from: b */
    private final boolean f62520b;

    /* renamed from: c */
    private final boolean f62521c;

    /* renamed from: d */
    private final boolean f62522d;

    /* renamed from: e */
    private final boolean f62523e;

    /* renamed from: f */
    private final boolean f62524f;

    /* renamed from: g */
    private final boolean f62525g;

    public C22711o(C58833ax axVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f62519a = axVar;
        this.f62520b = z;
        this.f62521c = z2;
        this.f62522d = z3;
        this.f62523e = z4;
        this.f62524f = z5;
        this.f62525g = z6;
    }

    /* renamed from: a */
    public final C58833ax mo27800a() {
        return this.f62519a;
    }

    /* renamed from: b */
    public final boolean mo27801b() {
        return this.f62524f;
    }

    /* renamed from: c */
    public final boolean mo27802c() {
        return this.f62520b;
    }

    /* renamed from: d */
    public final boolean mo27803d() {
        return this.f62523e;
    }

    /* renamed from: e */
    public final boolean mo27804e() {
        return this.f62525g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22692ae) {
            C22692ae aeVar = (C22692ae) obj;
            return this.f62519a.equals(aeVar.mo27800a()) && this.f62520b == aeVar.mo27802c() && this.f62521c == aeVar.mo27805f() && this.f62522d == aeVar.mo27806g() && this.f62523e == aeVar.mo27803d() && this.f62524f == aeVar.mo27801b() && this.f62525g == aeVar.mo27804e();
        }
    }

    /* renamed from: f */
    public final boolean mo27805f() {
        return this.f62521c;
    }

    /* renamed from: g */
    public final boolean mo27806g() {
        return this.f62522d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.f62519a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f62520b ? 1237 : 1231)) * 1000003) ^ (true != this.f62521c ? 1237 : 1231)) * 1000003) ^ (true != this.f62522d ? 1237 : 1231)) * 1000003) ^ (true != this.f62523e ? 1237 : 1231)) * 1000003) ^ (true != this.f62524f ? 1237 : 1231)) * 1000003;
        if (true == this.f62525g) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f62519a);
        boolean z = this.f62520b;
        boolean z2 = this.f62521c;
        boolean z3 = this.f62522d;
        boolean z4 = this.f62523e;
        boolean z5 = this.f62524f;
        boolean z6 = this.f62525g;
        return "ExperimentConfig{forceBatchingClientOpResults=" + valueOf + ", isIrisFulfillmentEnabled=" + z + ", isTtsPerformerOnDeviceSynthesisEnabled=" + z2 + ", sendClientOpResultsForFollowOnDirectly=" + z3 + ", isPrefetchStreamingEnabled=" + z4 + ", isEagerCloudHandoverExecutionEnabled=" + z5 + ", isResolveActivityBeforeProviderOpenEnabled=" + z6 + "}";
    }
}
