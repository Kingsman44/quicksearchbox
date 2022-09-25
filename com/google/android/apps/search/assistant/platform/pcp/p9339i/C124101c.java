package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.c */
/* compiled from: PG */
final class C124101c extends C124080bh {

    /* renamed from: a */
    private final C58528ij f342763a;

    /* renamed from: b */
    private final C58528ij f342764b;

    public C124101c(C58528ij ijVar, C58528ij ijVar2) {
        if (ijVar != null) {
            this.f342763a = ijVar;
            if (ijVar2 != null) {
                this.f342764b = ijVar2;
                return;
            }
            throw new NullPointerException("Null dataTypesToSync");
        }
        throw new NullPointerException("Null alreadySyncedData");
    }

    /* renamed from: a */
    public final C58528ij mo106268a() {
        return this.f342763a;
    }

    /* renamed from: b */
    public final C58528ij mo106269b() {
        return this.f342764b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124080bh) {
            C124080bh bhVar = (C124080bh) obj;
            return this.f342763a.equals(bhVar.mo106268a()) && this.f342764b.equals(bhVar.mo106269b());
        }
    }

    public final int hashCode() {
        return ((this.f342763a.hashCode() ^ 1000003) * 1000003) ^ this.f342764b.hashCode();
    }

    public final String toString() {
        String obj = this.f342763a.toString();
        String obj2 = this.f342764b.toString();
        return "PartiallySyncedData{alreadySyncedData=" + obj + ", dataTypesToSync=" + obj2 + "}";
    }
}
