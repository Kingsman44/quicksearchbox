package com.google.android.libraries.assistant.pcp.p1570j.p1571a;

import com.google.android.libraries.assistant.pcp.p1578m.C18995y;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.b */
/* compiled from: PG */
final class C18794b extends C18797e {

    /* renamed from: a */
    private final C18995y f52927a;

    /* renamed from: b */
    private final boolean f52928b;

    public C18794b(C18995y yVar, boolean z) {
        this.f52927a = yVar;
        this.f52928b = z;
    }

    /* renamed from: a */
    public final C18995y mo24138a() {
        return this.f52927a;
    }

    /* renamed from: b */
    public final boolean mo24139b() {
        return this.f52928b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18797e) {
            C18797e eVar = (C18797e) obj;
            return this.f52927a.equals(eVar.mo24138a()) && this.f52928b == eVar.mo24139b();
        }
    }

    public final int hashCode() {
        return ((this.f52927a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f52928b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f52927a.toString();
        boolean z = this.f52928b;
        return "DataPushResult{storedElement=" + obj + ", isPushed=" + z + "}";
    }
}
