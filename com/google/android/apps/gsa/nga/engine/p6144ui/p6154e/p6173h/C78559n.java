package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.n */
/* compiled from: PG */
public final class C78559n extends C78562q {

    /* renamed from: a */
    private final String f216312a;

    public C78559n(String str) {
        this.f216312a = str;
    }

    /* renamed from: a */
    public final C78535ar mo73472a() {
        return C78535ar.STATIC_TEXT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78534aq) {
            C78534aq aqVar = (C78534aq) obj;
            if (C78535ar.STATIC_TEXT != aqVar.mo73472a() || !this.f216312a.equals(aqVar.mo73477f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo73477f() {
        return this.f216312a;
    }

    public final int hashCode() {
        return this.f216312a.hashCode();
    }

    public final String toString() {
        String str = this.f216312a;
        return "SingleContent{staticText=" + str + "}";
    }
}
