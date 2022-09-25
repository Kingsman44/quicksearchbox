package com.google.apps.tiktok.dataservice;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.apps.tiktok.dataservice.a */
/* compiled from: PG */
class C46679a extends C46770cn {

    /* renamed from: a */
    public final C58528ij f121954a;

    public C46679a(C58528ij ijVar) {
        if (ijVar != null) {
            this.f121954a = ijVar;
            return;
        }
        throw new NullPointerException("Null childKeys");
    }

    /* renamed from: a */
    public final C58528ij mo50711a() {
        return this.f121954a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46770cn) {
            return this.f121954a.equals(((C46770cn) obj).mo50711a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f121954a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f121954a.toString();
        return "MergedKey{childKeys=" + obj + "}";
    }
}
