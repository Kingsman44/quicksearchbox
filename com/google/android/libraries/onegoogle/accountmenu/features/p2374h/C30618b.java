package com.google.android.libraries.onegoogle.accountmenu.features.p2374h;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.h.b */
/* compiled from: PG */
final class C30618b extends C30620d {

    /* renamed from: a */
    private final C58833ax f82715a;

    /* renamed from: b */
    private final C58833ax f82716b;

    /* renamed from: c */
    private final C58833ax f82717c;

    /* renamed from: d */
    private final C58833ax f82718d;

    public C30618b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f82715a = axVar;
        this.f82716b = axVar2;
        this.f82717c = axVar3;
        this.f82718d = axVar4;
    }

    /* renamed from: a */
    public final C58833ax mo36332a() {
        return this.f82718d;
    }

    /* renamed from: b */
    public final C58833ax mo36333b() {
        return this.f82717c;
    }

    /* renamed from: c */
    public final C58833ax mo36334c() {
        return this.f82715a;
    }

    /* renamed from: d */
    public final C58833ax mo36335d() {
        return this.f82716b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30620d) {
            C30620d dVar = (C30620d) obj;
            return this.f82715a.equals(dVar.mo36334c()) && this.f82716b.equals(dVar.mo36335d()) && this.f82717c.equals(dVar.mo36333b()) && this.f82718d.equals(dVar.mo36332a());
        }
    }

    public final int hashCode() {
        return ((((((this.f82715a.hashCode() ^ 1000003) * 1000003) ^ this.f82716b.hashCode()) * 1000003) ^ this.f82717c.hashCode()) * 1000003) ^ this.f82718d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82715a);
        String valueOf2 = String.valueOf(this.f82716b);
        String valueOf3 = String.valueOf(this.f82717c);
        String valueOf4 = String.valueOf(this.f82718d);
        return "PolicyFooterCustomizerImpl{privacyPolicyClickListener=" + valueOf + ", termsOfServiceClickListener=" + valueOf2 + ", customItemLabelStringId=" + valueOf3 + ", customItemClickListener=" + valueOf4 + "}";
    }
}
