package com.google.android.apps.gsa.nga.engine.p6044n;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a */
/* compiled from: PG */
public final class C76248a extends C76401e {

    /* renamed from: a */
    public final C77426t f211268a;

    /* renamed from: b */
    public final C74965n f211269b;

    /* renamed from: c */
    public final boolean f211270c;

    public C76248a(C77426t tVar, C74965n nVar, boolean z) {
        if (tVar != null) {
            this.f211268a = tVar;
            if (nVar != null) {
                this.f211269b = nVar;
                this.f211270c = z;
                return;
            }
            throw new NullPointerException("Null queryContext");
        }
        throw new NullPointerException("Null fulfillmentResponse");
    }

    /* renamed from: a */
    public final C77426t mo72146a() {
        return this.f211268a;
    }

    /* renamed from: b */
    public final C74965n mo72147b() {
        return this.f211269b;
    }

    /* renamed from: c */
    public final boolean mo72148c() {
        return this.f211270c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76401e) {
            C76401e eVar = (C76401e) obj;
            return this.f211268a.equals(eVar.mo72146a()) && this.f211269b.equals(eVar.mo72147b()) && this.f211270c == eVar.mo72148c();
        }
    }

    public final int hashCode() {
        return ((((this.f211268a.hashCode() ^ 1000003) * 1000003) ^ this.f211269b.hashCode()) * 1000003) ^ (true != this.f211270c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f211268a.toString();
        String obj2 = this.f211269b.toString();
        boolean z = this.f211270c;
        return "ExecutionInput{fulfillmentResponse=" + obj + ", queryContext=" + obj2 + ", isForPrefetchQuery=" + z + "}";
    }
}
