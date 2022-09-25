package com.google.p5238v.p5239a.p5251g;

import p3186j$.util.Objects;

/* renamed from: com.google.v.a.g.f */
/* compiled from: PG */
public final class C67627f extends C67634m {

    /* renamed from: a */
    public final int f183573a;

    /* renamed from: b */
    public final C67626e f183574b;

    /* renamed from: c */
    private final int f183575c;

    public C67627f(int i, int i2, C67626e eVar) {
        this.f183573a = i;
        this.f183575c = i2;
        this.f183574b = eVar;
    }

    /* renamed from: a */
    public final int mo59956a() {
        C67626e eVar = this.f183574b;
        if (eVar == C67626e.f183571d) {
            return this.f183575c;
        }
        if (eVar == C67626e.f183568a || eVar == C67626e.f183569b || eVar == C67626e.f183570c) {
            return this.f183575c + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: b */
    public final boolean mo59957b() {
        return this.f183574b != C67626e.f183571d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67627f)) {
            return false;
        }
        C67627f fVar = (C67627f) obj;
        if (fVar.f183573a == this.f183573a && fVar.mo59956a() == mo59956a() && fVar.f183574b == this.f183574b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f183575c), this.f183574b);
    }

    public final String toString() {
        String str = this.f183574b.f183572e;
        int i = this.f183575c;
        int i2 = this.f183573a;
        return "AES-CMAC Parameters (variant: " + str + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
