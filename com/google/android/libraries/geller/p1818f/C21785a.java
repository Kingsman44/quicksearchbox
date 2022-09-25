package com.google.android.libraries.geller.p1818f;

import com.google.protos.p5129p.p5131b.C65744ab;
import com.google.protos.p5129p.p5131b.C65855x;

/* renamed from: com.google.android.libraries.geller.f.a */
/* compiled from: PG */
final class C21785a extends C21857g {

    /* renamed from: a */
    private final C65855x f60102a;

    /* renamed from: b */
    private final C65744ab f60103b;

    public C21785a(C65855x xVar, C65744ab abVar) {
        if (xVar != null) {
            this.f60102a = xVar;
            if (abVar != null) {
                this.f60103b = abVar;
                return;
            }
            throw new NullPointerException("Null batchSyncResponse");
        }
        throw new NullPointerException("Null batchSyncRequest");
    }

    /* renamed from: a */
    public final C65855x mo27115a() {
        return this.f60102a;
    }

    /* renamed from: b */
    public final C65744ab mo27116b() {
        return this.f60103b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21857g) {
            C21857g gVar = (C21857g) obj;
            return this.f60102a.equals(gVar.mo27115a()) && this.f60103b.equals(gVar.mo27116b());
        }
    }

    public final int hashCode() {
        return ((this.f60102a.hashCode() ^ 1000003) * 1000003) ^ this.f60103b.hashCode();
    }

    public final String toString() {
        String obj = this.f60102a.toString();
        String obj2 = this.f60103b.toString();
        return "BatchSyncResult{batchSyncRequest=" + obj + ", batchSyncResponse=" + obj2 + "}";
    }
}
