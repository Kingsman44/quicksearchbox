package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import java.util.Locale;

/* renamed from: com.google.android.libraries.as.b.b.a */
/* compiled from: PG */
public final class C10784a extends C10882h {

    /* renamed from: a */
    public final Locale f35801a;

    /* renamed from: b */
    public final int f35802b;

    /* renamed from: d */
    private final C58528ij f35803d;

    /* renamed from: e */
    private final C58495hd f35804e;

    /* renamed from: f */
    private final long f35805f;

    /* renamed from: g */
    private final C58833ax f35806g;

    /* renamed from: h */
    private final C58833ax f35807h;

    /* renamed from: i */
    private final int f35808i;

    public C10784a(Locale locale, int i, int i2, C58528ij ijVar, C58495hd hdVar, long j, C58833ax axVar, C58833ax axVar2) {
        if (locale != null) {
            this.f35801a = locale;
            this.f35802b = i;
            if (i2 != 0) {
                this.f35808i = i2;
                if (ijVar != null) {
                    this.f35803d = ijVar;
                    if (hdVar != null) {
                        this.f35804e = hdVar;
                        this.f35805f = j;
                        this.f35806g = axVar;
                        this.f35807h = axVar2;
                        return;
                    }
                    throw new NullPointerException("Null featuresForDomains");
                }
                throw new NullPointerException("Null applicationDomains");
            }
            throw new NullPointerException("Null installType");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final int mo19282a() {
        return this.f35802b;
    }

    /* renamed from: b */
    public final long mo19283b() {
        return this.f35805f;
    }

    /* renamed from: c */
    public final C58833ax mo19284c() {
        return this.f35807h;
    }

    /* renamed from: d */
    public final C58833ax mo19285d() {
        return this.f35806g;
    }

    /* renamed from: e */
    public final C58495hd mo19286e() {
        return this.f35804e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10882h) {
            C10882h hVar = (C10882h) obj;
            return this.f35801a.equals(hVar.mo19289g()) && this.f35802b == hVar.mo19282a() && this.f35808i == hVar.mo19290h() && this.f35803d.equals(hVar.mo19288f()) && this.f35804e.equals(hVar.mo19286e()) && this.f35805f == hVar.mo19283b() && this.f35806g.equals(hVar.mo19285d()) && this.f35807h.equals(hVar.mo19284c());
        }
    }

    /* renamed from: f */
    public final C58528ij mo19288f() {
        return this.f35803d;
    }

    /* renamed from: g */
    public final Locale mo19289g() {
        return this.f35801a;
    }

    /* renamed from: h */
    public final int mo19290h() {
        return this.f35808i;
    }

    public final int hashCode() {
        int hashCode = this.f35801a.hashCode();
        int i = this.f35802b;
        int i2 = this.f35808i;
        int hashCode2 = this.f35803d.hashCode();
        int a = C58758qx.m90643a(this.f35804e.entrySet());
        long j = this.f35805f;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode2) * 1000003) ^ a) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f35806g.hashCode()) * 1000003) ^ this.f35807h.hashCode();
    }

    public final String toString() {
        String obj = this.f35801a.toString();
        int i = this.f35802b;
        int i2 = this.f35808i;
        String str = i2 != 1 ? i2 != 2 ? "SYSTEM_PARTITION" : "ZIPFILE_DOWNLOAD" : "UNKNOWN";
        String obj2 = this.f35803d.toString();
        String obj3 = this.f35804e.toString();
        long j = this.f35805f;
        String obj4 = this.f35806g.toString();
        String obj5 = this.f35807h.toString();
        return "LanguagePackDescriptor{locale=" + obj + ", version=" + i + ", installType=" + str + ", applicationDomains=" + obj2 + ", featuresForDomains=" + obj3 + ", sizeBytes=" + j + ", zipfileParams=" + obj4 + ", systemPartitionParams=" + obj5 + "}";
    }
}
