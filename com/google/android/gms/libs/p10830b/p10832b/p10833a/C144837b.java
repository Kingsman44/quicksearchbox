package com.google.android.gms.libs.p10830b.p10832b.p10833a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.gms.libs.b.b.a.b */
/* compiled from: PG */
final class C144837b extends C144839d {

    /* renamed from: a */
    private final C58833ax f391686a;

    /* renamed from: b */
    private final C58833ax f391687b;

    /* renamed from: c */
    private final C58833ax f391688c;

    /* renamed from: d */
    private final C58833ax f391689d;

    /* renamed from: e */
    private final C58833ax f391690e;

    public C144837b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5) {
        this.f391686a = axVar;
        this.f391687b = axVar2;
        this.f391688c = axVar3;
        this.f391689d = axVar4;
        this.f391690e = axVar5;
    }

    /* renamed from: a */
    public final C58833ax mo120260a() {
        return this.f391687b;
    }

    /* renamed from: b */
    public final C58833ax mo120261b() {
        return this.f391688c;
    }

    /* renamed from: c */
    public final C58833ax mo120262c() {
        return this.f391686a;
    }

    /* renamed from: d */
    public final C58833ax mo120263d() {
        return this.f391690e;
    }

    /* renamed from: e */
    public final C58833ax mo120264e() {
        return this.f391689d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144839d) {
            C144839d dVar = (C144839d) obj;
            return this.f391686a.equals(dVar.mo120262c()) && this.f391687b.equals(dVar.mo120260a()) && this.f391688c.equals(dVar.mo120261b()) && this.f391689d.equals(dVar.mo120264e()) && this.f391690e.equals(dVar.mo120263d());
        }
    }

    public final int hashCode() {
        return ((((((((this.f391686a.hashCode() ^ 1000003) * 1000003) ^ this.f391687b.hashCode()) * 1000003) ^ this.f391688c.hashCode()) * 1000003) ^ this.f391689d.hashCode()) * 1000003) ^ this.f391690e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f391686a);
        String valueOf2 = String.valueOf(this.f391687b);
        String valueOf3 = String.valueOf(this.f391688c);
        String valueOf4 = String.valueOf(this.f391689d);
        String valueOf5 = String.valueOf(this.f391690e);
        return "ValidatedEnforcementDecision{failureReason=" + valueOf + ", enforcementDecision=" + valueOf2 + ", enforcementResponse=" + valueOf3 + ", responseUuid=" + valueOf4 + ", provisionalState=" + valueOf5 + "}";
    }
}
