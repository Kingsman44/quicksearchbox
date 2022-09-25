package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.h */
/* compiled from: PG */
final class C77127h extends C77131l {

    /* renamed from: a */
    private final long f212868a;

    /* renamed from: b */
    private final C74851z f212869b;

    /* renamed from: c */
    private final af f212870c;

    public C77127h(long j, C74851z zVar, af afVar) {
        this.f212868a = j;
        if (zVar != null) {
            this.f212869b = zVar;
            if (afVar != null) {
                this.f212870c = afVar;
                return;
            }
            throw new NullPointerException("Null provider");
        }
        throw new NullPointerException("Null endpoint");
    }

    /* renamed from: a */
    public final long mo72433a() {
        return this.f212868a;
    }

    /* renamed from: b */
    public final C74851z mo72434b() {
        return this.f212869b;
    }

    /* renamed from: c */
    public final af mo72435c() {
        return this.f212870c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77131l) {
            C77131l lVar = (C77131l) obj;
            return this.f212868a == lVar.mo72433a() && this.f212869b.equals(lVar.mo72434b()) && this.f212870c.equals(lVar.mo72435c());
        }
    }

    public final int hashCode() {
        long j = this.f212868a;
        return this.f212870c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f212869b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f212868a;
        String obj = this.f212869b.toString();
        String obj2 = this.f212870c.toString();
        return "EndpointParams{contactId=" + j + ", endpoint=" + obj + ", provider=" + obj2 + "}";
    }
}
