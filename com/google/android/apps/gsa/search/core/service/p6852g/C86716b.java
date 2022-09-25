package com.google.android.apps.gsa.search.core.service.p6852g;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.b */
/* compiled from: PG */
final class C86716b extends C86728h {

    /* renamed from: a */
    public final String f234241a;

    /* renamed from: b */
    public final String f234242b;

    /* renamed from: c */
    public final C86732l f234243c;

    /* renamed from: d */
    public final C58528ij f234244d;

    public C86716b(String str, String str2, C86732l lVar, C58528ij ijVar) {
        if (str != null) {
            this.f234241a = str;
            if (str2 != null) {
                this.f234242b = str2;
                if (lVar != null) {
                    this.f234243c = lVar;
                    if (ijVar != null) {
                        this.f234244d = ijVar;
                        return;
                    }
                    throw new NullPointerException("Null targetUserScenarios");
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null workProxyName");
        }
        throw new NullPointerException("Null workerId");
    }

    /* renamed from: a */
    public final C86732l mo80320a() {
        return this.f234243c;
    }

    /* renamed from: b */
    public final C58528ij mo80321b() {
        return this.f234244d;
    }

    /* renamed from: c */
    public final String mo80322c() {
        return this.f234242b;
    }

    /* renamed from: d */
    public final String mo80323d() {
        return this.f234241a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C86728h) {
            C86728h hVar = (C86728h) obj;
            return this.f234241a.equals(hVar.mo80323d()) && this.f234242b.equals(hVar.mo80322c()) && this.f234243c.equals(hVar.mo80320a()) && this.f234244d.equals(hVar.mo80321b());
        }
    }

    public final int hashCode() {
        return ((((((this.f234241a.hashCode() ^ 1000003) * 1000003) ^ this.f234242b.hashCode()) * 1000003) ^ this.f234243c.hashCode()) * 1000003) ^ this.f234244d.hashCode();
    }

    public final String toString() {
        String str = this.f234241a;
        String str2 = this.f234242b;
        String obj = this.f234243c.toString();
        String obj2 = this.f234244d.toString();
        return "WorkProxyData{workerId=" + str + ", workProxyName=" + str2 + ", type=" + obj + ", targetUserScenarios=" + obj2 + "}";
    }
}
