package com.google.android.libraries.lens.view.p2081au;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.au.e */
/* compiled from: PG */
final class C25555e extends C25561k {

    /* renamed from: a */
    private final int f69564a;

    /* renamed from: b */
    private final C24201ad f69565b;

    /* renamed from: c */
    private final C24208ak f69566c;

    /* renamed from: d */
    private final C25560j f69567d;

    /* renamed from: e */
    private final C58833ax f69568e;

    /* renamed from: f */
    private final C25564n f69569f;

    public C25555e(int i, C24201ad adVar, C24208ak akVar, C25560j jVar, C58833ax axVar, C25564n nVar) {
        this.f69564a = i;
        if (adVar != null) {
            this.f69565b = adVar;
            if (akVar != null) {
                this.f69566c = akVar;
                if (jVar != null) {
                    this.f69567d = jVar;
                    this.f69568e = axVar;
                    if (nVar != null) {
                        this.f69569f = nVar;
                        return;
                    }
                    throw new NullPointerException("Null resultSource");
                }
                throw new NullPointerException("Null prefetchImage");
            }
            throw new NullPointerException("Null result");
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final int mo30621a() {
        return this.f69564a;
    }

    /* renamed from: b */
    public final C24201ad mo30622b() {
        return this.f69565b;
    }

    /* renamed from: c */
    public final C24208ak mo30623c() {
        return this.f69566c;
    }

    /* renamed from: d */
    public final C25560j mo30624d() {
        return this.f69567d;
    }

    /* renamed from: e */
    public final C25564n mo30625e() {
        return this.f69569f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25561k) {
            C25561k kVar = (C25561k) obj;
            return this.f69564a == kVar.mo30621a() && this.f69565b.equals(kVar.mo30622b()) && this.f69566c.equals(kVar.mo30623c()) && this.f69567d.equals(kVar.mo30624d()) && this.f69568e.equals(kVar.mo30627f()) && this.f69569f.equals(kVar.mo30625e());
        }
    }

    /* renamed from: f */
    public final C58833ax mo30627f() {
        return this.f69568e;
    }

    public final int hashCode() {
        return ((((((((((this.f69564a ^ 1000003) * 1000003) ^ this.f69565b.hashCode()) * 1000003) ^ this.f69566c.hashCode()) * 1000003) ^ this.f69567d.hashCode()) * 1000003) ^ this.f69568e.hashCode()) * 1000003) ^ this.f69569f.hashCode();
    }

    public final String toString() {
        int i = this.f69564a;
        String obj = this.f69565b.toString();
        String obj2 = this.f69566c.toString();
        String obj3 = this.f69567d.toString();
        String obj4 = this.f69568e.toString();
        String obj5 = this.f69569f.toString();
        return "EyesImageResult{sourceVersion=" + i + ", query=" + obj + ", result=" + obj2 + ", prefetchImage=" + obj3 + ", interaction=" + obj4 + ", resultSource=" + obj5 + "}";
    }
}
