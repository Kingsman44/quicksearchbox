package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.o */
/* compiled from: PG */
public final class C78560o extends C78562q {

    /* renamed from: a */
    private final String f216313a;

    public C78560o(String str) {
        this.f216313a = str;
    }

    /* renamed from: a */
    public final C78535ar mo73472a() {
        return C78535ar.TRANSCRIPTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78534aq) {
            C78534aq aqVar = (C78534aq) obj;
            if (C78535ar.TRANSCRIPTION != aqVar.mo73472a() || !this.f216313a.equals(aqVar.mo73478g())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final String mo73478g() {
        return this.f216313a;
    }

    public final int hashCode() {
        return this.f216313a.hashCode();
    }

    public final String toString() {
        String str = this.f216313a;
        return "SingleContent{transcription=" + str + "}";
    }
}
