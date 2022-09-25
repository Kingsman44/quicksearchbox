package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.ov */
/* compiled from: PG */
public final class C58702ov extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58710pc f156432a;

    public C58702ov(C58710pc pcVar) {
        this.f156432a = pcVar;
    }

    /* renamed from: b */
    public final C58710pc mo55782b() {
        return this.f156432a.mo55782b();
    }

    /* renamed from: c */
    public final C58710pc mo55783c() {
        return this.f156432a.mo55783c().mo55782b();
    }

    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.f156432a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58702ov) {
            return this.f156432a.equals(((C58702ov) obj).f156432a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156432a.hashCode() ^ 957692532;
    }

    /* renamed from: lC */
    public final C58710pc mo55784lC() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C58710pc pcVar = this.f156432a;
        sb.append(pcVar);
        return pcVar.toString().concat(".nullsFirst()");
    }
}
