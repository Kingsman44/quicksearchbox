package com.google.android.apps.gsa.nga.engine.understanding.teleport;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.j */
/* compiled from: PG */
final class C79312j extends C79314l {

    /* renamed from: a */
    private final String f217812a;

    public C79312j(String str) {
        this.f217812a = str;
    }

    /* renamed from: a */
    public final C79310h mo73870a() {
        return C79310h.APP;
    }

    /* renamed from: b */
    public final String mo73871b() {
        return this.f217812a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C79311i) {
            C79311i iVar = (C79311i) obj;
            if (C79310h.APP != iVar.mo73870a() || !this.f217812a.equals(iVar.mo73871b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f217812a.hashCode();
    }

    public final String toString() {
        String str = this.f217812a;
        return "AppOrUrl{app=" + str + "}";
    }
}
