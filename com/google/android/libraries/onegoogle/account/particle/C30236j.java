package com.google.android.libraries.onegoogle.account.particle;

import com.google.android.gms.p10815k.C144415o;

/* renamed from: com.google.android.libraries.onegoogle.account.particle.j */
/* compiled from: PG */
public final class C30236j extends C30240n {

    /* renamed from: a */
    private final String f81737a;

    /* renamed from: b */
    private final C144415o f81738b;

    /* renamed from: c */
    private final String f81739c;

    /* renamed from: d */
    private final String f81740d;

    /* renamed from: e */
    private final String f81741e;

    public C30236j(String str, C144415o oVar, String str2, String str3, String str4) {
        if (str != null) {
            this.f81737a = str;
            if (oVar != null) {
                this.f81738b = oVar;
                this.f81739c = str2;
                this.f81740d = str3;
                this.f81741e = str4;
                return;
            }
            throw new NullPointerException("Null criticalAlertData");
        }
        throw new NullPointerException("Null accountId");
    }

    /* renamed from: a */
    public final C144415o mo35714a() {
        return this.f81738b;
    }

    /* renamed from: b */
    public final String mo35715b() {
        return this.f81737a;
    }

    /* renamed from: c */
    public final String mo35716c() {
        return this.f81739c;
    }

    /* renamed from: d */
    public final String mo35717d() {
        return this.f81740d;
    }

    /* renamed from: e */
    public final String mo35718e() {
        return this.f81741e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30240n) {
            C30240n nVar = (C30240n) obj;
            return this.f81737a.equals(nVar.mo35715b()) && this.f81738b.equals(nVar.mo35714a()) && this.f81739c.equals(nVar.mo35716c()) && this.f81740d.equals(nVar.mo35717d()) && this.f81741e.equals(nVar.mo35718e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f81737a.hashCode() ^ 1000003) * 1000003) ^ this.f81738b.hashCode()) * 1000003) ^ this.f81739c.hashCode()) * 1000003) ^ this.f81740d.hashCode()) * 1000003) ^ this.f81741e.hashCode();
    }

    public final String toString() {
        String str = this.f81737a;
        String obj = this.f81738b.toString();
        String str2 = this.f81739c;
        String str3 = this.f81740d;
        String str4 = this.f81741e;
        return "ValidCriticalAlertData{accountId=" + str + ", criticalAlertData=" + obj + ", rfn=" + str2 + ", rfnc=" + str3 + ", securityEventId=" + str4 + "}";
    }
}
