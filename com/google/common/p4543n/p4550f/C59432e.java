package com.google.common.p4543n.p4550f;

import java.util.Arrays;

/* renamed from: com.google.common.n.f.e */
/* compiled from: PG */
final class C59432e {

    /* renamed from: a */
    private C59435h f157661a;

    /* renamed from: b */
    private double[] f157662b;

    public C59432e() {
        this.f157662b = null;
    }

    public C59432e(C59435h hVar) {
        this.f157661a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59432e)) {
            return false;
        }
        C59432e eVar = (C59432e) obj;
        C59435h hVar = this.f157661a;
        if (hVar != null) {
            C59435h hVar2 = eVar.f157661a;
            return hVar2 != null && hVar.mo56949a(hVar2);
        } else if (eVar.f157661a != null) {
            return false;
        } else {
            double[] dArr = eVar.f157662b;
            return Arrays.equals((double[]) null, (double[]) null);
        }
    }

    public final int hashCode() {
        C59435h hVar = this.f157661a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return Arrays.hashCode((double[]) null);
    }
}
