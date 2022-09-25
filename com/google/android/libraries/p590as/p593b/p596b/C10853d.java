package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.as.b.b.d */
/* compiled from: PG */
public final class C10853d extends C10950l {

    /* renamed from: a */
    private final C10882h f35913a;

    /* renamed from: b */
    private final C58833ax f35914b;

    /* renamed from: c */
    private final C58833ax f35915c;

    public C10853d(C10882h hVar, C58833ax axVar, C58833ax axVar2) {
        if (hVar != null) {
            this.f35913a = hVar;
            this.f35914b = axVar;
            this.f35915c = axVar2;
            return;
        }
        throw new NullPointerException("Null descriptor");
    }

    /* renamed from: a */
    public final C10882h mo19321a() {
        return this.f35913a;
    }

    /* renamed from: b */
    public final C58833ax mo19322b() {
        return this.f35914b;
    }

    /* renamed from: c */
    public final C58833ax mo19323c() {
        return this.f35915c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10950l) {
            C10950l lVar = (C10950l) obj;
            return this.f35913a.equals(lVar.mo19321a()) && this.f35914b.equals(lVar.mo19322b()) && this.f35915c.equals(lVar.mo19323c());
        }
    }

    public final int hashCode() {
        return ((((this.f35913a.hashCode() ^ 1000003) * 1000003) ^ this.f35914b.hashCode()) * 1000003) ^ this.f35915c.hashCode();
    }

    public final String toString() {
        String obj = this.f35913a.toString();
        String obj2 = this.f35914b.toString();
        String obj3 = this.f35915c.toString();
        return "LanguagePackPackage{descriptor=" + obj + ", filesystemPath=" + obj2 + ", trainingPlanZipfile=" + obj3 + "}";
    }
}
