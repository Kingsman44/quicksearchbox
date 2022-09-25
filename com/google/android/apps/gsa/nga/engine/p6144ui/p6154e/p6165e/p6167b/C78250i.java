package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.e.b.i */
/* compiled from: PG */
final class C78250i extends C78245d {

    /* renamed from: b */
    private final C78243b f215400b;

    /* renamed from: c */
    private final C78243b f215401c;

    public C78250i(C78243b bVar, C78243b bVar2) {
        this.f215400b = bVar;
        this.f215401c = bVar2;
    }

    /* renamed from: a */
    public final C78243b mo73179a() {
        return this.f215400b;
    }

    /* renamed from: b */
    public final C78243b mo73180b() {
        return this.f215401c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78245d) {
            C78245d dVar = (C78245d) obj;
            return this.f215400b.equals(dVar.mo73179a()) && this.f215401c.equals(dVar.mo73180b());
        }
    }

    public final int hashCode() {
        return ((this.f215400b.hashCode() ^ 1000003) * 1000003) ^ this.f215401c.hashCode();
    }
}
