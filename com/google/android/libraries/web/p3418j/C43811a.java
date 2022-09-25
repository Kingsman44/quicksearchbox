package com.google.android.libraries.web.p3418j;

/* renamed from: com.google.android.libraries.web.j.a */
/* compiled from: PG */
final class C43811a extends C43843h {

    /* renamed from: a */
    private final Object f114231a;

    /* renamed from: b */
    private final C43842g f114232b;

    public C43811a(Object obj, C43842g gVar) {
        this.f114231a = obj;
        this.f114232b = gVar;
    }

    /* renamed from: a */
    public final Object mo46831a() {
        return this.f114231a;
    }

    /* renamed from: b */
    public final C43842g mo46832b() {
        return this.f114232b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43843h) {
            C43843h hVar = (C43843h) obj;
            return this.f114231a.equals(hVar.mo46831a()) && this.f114232b.equals(hVar.mo46832b());
        }
    }

    public final int hashCode() {
        return ((this.f114231a.hashCode() ^ 1000003) * 1000003) ^ this.f114232b.hashCode();
    }

    public final String toString() {
        String obj = this.f114231a.toString();
        String obj2 = this.f114232b.toString();
        return "WebStoreConfig{defaultData=" + obj + ", upstreamedWindowDataModifier=" + obj2 + "}";
    }
}
