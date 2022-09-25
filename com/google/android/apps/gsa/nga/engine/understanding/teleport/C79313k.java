package com.google.android.apps.gsa.nga.engine.understanding.teleport;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.k */
/* compiled from: PG */
final class C79313k extends C79314l {

    /* renamed from: a */
    private final String f217813a;

    public C79313k(String str) {
        this.f217813a = str;
    }

    /* renamed from: a */
    public final C79310h mo73870a() {
        return C79310h.URL;
    }

    /* renamed from: c */
    public final String mo73872c() {
        return this.f217813a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C79311i) {
            C79311i iVar = (C79311i) obj;
            if (C79310h.URL != iVar.mo73870a() || !this.f217813a.equals(iVar.mo73872c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f217813a.hashCode();
    }

    public final String toString() {
        String str = this.f217813a;
        return "AppOrUrl{url=" + str + "}";
    }
}
