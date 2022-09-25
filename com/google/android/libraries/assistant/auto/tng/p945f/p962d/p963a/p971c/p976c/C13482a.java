package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c;

import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61908br;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.c.a */
/* compiled from: PG */
final class C13482a extends C13484c {

    /* renamed from: a */
    private final C13483b f41365a;

    /* renamed from: b */
    private final C61908br f41366b;

    /* renamed from: c */
    private final int f41367c;

    public C13482a(C13483b bVar, int i, C61908br brVar) {
        if (bVar != null) {
            this.f41365a = bVar;
            this.f41367c = i;
            this.f41366b = brVar;
            return;
        }
        throw new NullPointerException("Null modelType");
    }

    /* renamed from: a */
    public final C13483b mo21118a() {
        return this.f41365a;
    }

    /* renamed from: b */
    public final C61908br mo21119b() {
        return this.f41366b;
    }

    /* renamed from: c */
    public final int mo21120c() {
        return this.f41367c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13484c) {
            C13484c cVar = (C13484c) obj;
            return this.f41365a.equals(cVar.mo21118a()) && this.f41367c == cVar.mo21120c() && this.f41366b.equals(cVar.mo21119b());
        }
    }

    public final int hashCode() {
        return ((((this.f41365a.hashCode() ^ 1000003) * 1000003) ^ this.f41367c) * 1000003) ^ this.f41366b.hashCode();
    }

    public final String toString() {
        String obj = this.f41365a.toString();
        int i = this.f41367c;
        String str = i != 1 ? i != 2 ? "GDD" : "MDD" : "STATIC_FALLBACK";
        String obj2 = this.f41366b.toString();
        return "SmartActionModelContainer{modelType=" + obj + ", modelFileSource=" + str + ", modelProvider=" + obj2 + "}";
    }
}
