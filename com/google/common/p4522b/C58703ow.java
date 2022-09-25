package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.ow */
/* compiled from: PG */
public final class C58703ow extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58710pc f156433a;

    public C58703ow(C58710pc pcVar) {
        this.f156433a = pcVar;
    }

    /* renamed from: b */
    public final C58710pc mo55782b() {
        return this;
    }

    /* renamed from: c */
    public final C58710pc mo55783c() {
        return this.f156433a.mo55783c().mo55784lC();
    }

    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.f156433a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58703ow) {
            return this.f156433a.equals(((C58703ow) obj).f156433a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156433a.hashCode() ^ -921210296;
    }

    /* renamed from: lC */
    public final C58710pc mo55784lC() {
        return this.f156433a.mo55784lC();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C58710pc pcVar = this.f156433a;
        sb.append(pcVar);
        return pcVar.toString().concat(".nullsLast()");
    }
}
