package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.assistant.p3897e.p3921j.C52081en;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.a */
/* compiled from: PG */
final class C76343a extends C76395u {

    /* renamed from: a */
    public final C52081en f211435a;

    /* renamed from: b */
    public final C52081en f211436b;

    public C76343a(C52081en enVar, C52081en enVar2) {
        if (enVar != null) {
            this.f211435a = enVar;
            if (enVar2 != null) {
                this.f211436b = enVar2;
                return;
            }
            throw new NullPointerException("Null forOpa");
        }
        throw new NullPointerException("Null forNga");
    }

    /* renamed from: a */
    public final C52081en mo72170a() {
        return this.f211435a;
    }

    /* renamed from: b */
    public final C52081en mo72171b() {
        return this.f211436b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76395u) {
            C76395u uVar = (C76395u) obj;
            return this.f211435a.equals(uVar.mo72170a()) && this.f211436b.equals(uVar.mo72171b());
        }
    }

    public final int hashCode() {
        return ((this.f211435a.hashCode() ^ 1000003) * 1000003) ^ this.f211436b.hashCode();
    }

    public final String toString() {
        String obj = this.f211435a.toString();
        String obj2 = this.f211436b.toString();
        return "ConversationDeltaSplit{forNga=" + obj + ", forOpa=" + obj2 + "}";
    }
}
