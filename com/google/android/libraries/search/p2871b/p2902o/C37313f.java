package com.google.android.libraries.search.p2871b.p2902o;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.b.o.f */
/* compiled from: PG */
public final class C37313f extends C37314g {

    /* renamed from: a */
    public final String f99144a = "ANDROID_GSA";

    /* renamed from: b */
    public final C58833ax f99145b;

    /* renamed from: c */
    public final C58833ax f99146c;

    /* renamed from: d */
    private final C58833ax f99147d;

    /* renamed from: e */
    private final C58833ax f99148e;

    /* renamed from: f */
    private final C58833ax f99149f;

    /* renamed from: g */
    private final C58833ax f99150g;

    public C37313f(String str, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6) {
        this.f99147d = axVar;
        this.f99148e = axVar2;
        this.f99149f = axVar3;
        this.f99145b = axVar4;
        this.f99146c = axVar5;
        this.f99150g = axVar6;
    }

    /* renamed from: a */
    public final C58833ax mo40867a() {
        return this.f99147d;
    }

    /* renamed from: b */
    public final C58833ax mo40868b() {
        return this.f99145b;
    }

    /* renamed from: c */
    public final C58833ax mo40869c() {
        return this.f99146c;
    }

    /* renamed from: d */
    public final C58833ax mo40870d() {
        return this.f99150g;
    }

    /* renamed from: e */
    public final C58833ax mo40871e() {
        return this.f99149f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37314g) {
            C37314g gVar = (C37314g) obj;
            return this.f99144a.equals(gVar.mo40874g()) && this.f99147d.equals(gVar.mo40867a()) && this.f99148e.equals(gVar.mo40873f()) && this.f99149f.equals(gVar.mo40871e()) && this.f99145b.equals(gVar.mo40868b()) && this.f99146c.equals(gVar.mo40869c()) && this.f99150g.equals(gVar.mo40870d()) && !gVar.mo40875h();
        }
    }

    /* renamed from: f */
    public final C58833ax mo40873f() {
        return this.f99148e;
    }

    /* renamed from: g */
    public final String mo40874g() {
        return this.f99144a;
    }

    /* renamed from: h */
    public final boolean mo40875h() {
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f99144a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f99145b.hashCode()) * 1000003) ^ this.f99146c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str = this.f99144a;
        String valueOf = String.valueOf(this.f99145b);
        String valueOf2 = String.valueOf(this.f99146c);
        return "TransportConfiguration{logSource=" + str + ", accountNameFutureSupplier=Optional.absent(), zwiebackOverrideFutureSupplier=Optional.absent(), transportExecutorService=Optional.absent(), appFlowProtoWrapper=" + valueOf + ", eventCode=" + valueOf2 + ", logVerifier=Optional.absent(), sendAsSemanticEvent=false}";
    }
}
