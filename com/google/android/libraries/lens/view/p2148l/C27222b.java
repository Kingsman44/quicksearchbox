package com.google.android.libraries.lens.view.p2148l;

import com.google.common.base.C58833ax;
import com.google.common.p4552o.abk;

/* renamed from: com.google.android.libraries.lens.view.l.b */
/* compiled from: PG */
final class C27222b extends C27228h {

    /* renamed from: a */
    public final C58833ax f74424a;

    /* renamed from: b */
    public final C58833ax f74425b;

    /* renamed from: c */
    public final C58833ax f74426c;

    /* renamed from: d */
    public final C58833ax f74427d;

    /* renamed from: e */
    public final C58833ax f74428e;

    /* renamed from: f */
    public final C58833ax f74429f;

    /* renamed from: g */
    public final int f74430g;

    public C27222b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, int i) {
        this.f74424a = axVar;
        this.f74425b = axVar2;
        this.f74426c = axVar3;
        this.f74427d = axVar4;
        this.f74428e = axVar5;
        this.f74429f = axVar6;
        this.f74430g = i;
    }

    /* renamed from: a */
    public final C27226f mo32667a() {
        return new C27221a(this);
    }

    /* renamed from: b */
    public final C58833ax mo32668b() {
        return this.f74425b;
    }

    /* renamed from: c */
    public final C58833ax mo32669c() {
        return this.f74429f;
    }

    /* renamed from: d */
    public final C58833ax mo32670d() {
        return this.f74426c;
    }

    /* renamed from: e */
    public final C58833ax mo32671e() {
        return this.f74427d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27228h) {
            C27228h hVar = (C27228h) obj;
            if (this.f74424a.equals(hVar.mo32674g()) && this.f74425b.equals(hVar.mo32668b()) && this.f74426c.equals(hVar.mo32670d()) && this.f74427d.equals(hVar.mo32671e()) && this.f74428e.equals(hVar.mo32673f()) && this.f74429f.equals(hVar.mo32669c())) {
                int i = this.f74430g;
                int h = hVar.mo32675h();
                if (i == 0) {
                    throw null;
                } else if (i == h) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C58833ax mo32673f() {
        return this.f74428e;
    }

    /* renamed from: g */
    public final C58833ax mo32674g() {
        return this.f74424a;
    }

    /* renamed from: h */
    public final int mo32675h() {
        return this.f74430g;
    }

    public final int hashCode() {
        int hashCode = this.f74424a.hashCode();
        int hashCode2 = this.f74425b.hashCode();
        int hashCode3 = this.f74426c.hashCode();
        int hashCode4 = this.f74427d.hashCode();
        int hashCode5 = this.f74428e.hashCode();
        int hashCode6 = this.f74429f.hashCode();
        int i = this.f74430g;
        abk.m92368a(i);
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f74424a);
        String valueOf2 = String.valueOf(this.f74425b);
        String valueOf3 = String.valueOf(this.f74426c);
        String valueOf4 = String.valueOf(this.f74427d);
        String valueOf5 = String.valueOf(this.f74428e);
        String valueOf6 = String.valueOf(this.f74429f);
        int i = this.f74430g;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        return "ExternalImageData{uri=" + valueOf + ", bitmap=" + valueOf2 + ", imagePayload=" + valueOf3 + ", locationContext=" + valueOf4 + ", source=" + valueOf5 + ", fifeUrl=" + valueOf6 + ", imageCategory=" + num + "}";
    }
}
