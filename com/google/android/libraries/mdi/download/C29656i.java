package com.google.android.libraries.mdi.download;

import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.i */
/* compiled from: PG */
public final class C29656i extends C28743bu {

    /* renamed from: a */
    private final C31639g f80308a;

    /* renamed from: b */
    private final C58833ax f80309b;

    /* renamed from: c */
    private final C58833ax f80310c;

    public C29656i(C31639g gVar, C58833ax axVar, C58833ax axVar2) {
        this.f80308a = gVar;
        this.f80309b = axVar;
        this.f80310c = axVar2;
    }

    /* renamed from: a */
    public final C31639g mo34354a() {
        return this.f80308a;
    }

    /* renamed from: b */
    public final C58833ax mo34355b() {
        return this.f80309b;
    }

    /* renamed from: c */
    public final C58833ax mo34356c() {
        return this.f80310c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28743bu) {
            C28743bu buVar = (C28743bu) obj;
            return this.f80308a.equals(buVar.mo34354a()) && this.f80309b.equals(buVar.mo34355b()) && this.f80310c.equals(buVar.mo34356c());
        }
    }

    public final int hashCode() {
        return ((((this.f80308a.hashCode() ^ 1000003) * 1000003) ^ this.f80309b.hashCode()) * 1000003) ^ this.f80310c.hashCode();
    }

    public final String toString() {
        String obj = this.f80308a.toString();
        String obj2 = this.f80309b.toString();
        String obj3 = this.f80310c.toString();
        return "ExperimentationConfig{phenotypeClient=" + obj + ", hostAppLogSource=" + obj2 + ", primesLogSource=" + obj3 + "}";
    }
}
