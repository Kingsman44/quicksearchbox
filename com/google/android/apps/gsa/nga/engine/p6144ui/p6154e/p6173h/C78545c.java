package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80779f;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.c */
/* compiled from: PG */
public final class C78545c extends C78553h {

    /* renamed from: a */
    private final C80779f f216297a;

    public C78545c(C80779f fVar) {
        this.f216297a = fVar;
    }

    /* renamed from: a */
    public final C78532ao mo73464a() {
        return C78532ao.APP_SHORTCUT;
    }

    /* renamed from: b */
    public final C80779f mo73465b() {
        return this.f216297a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78531an) {
            C78531an anVar = (C78531an) obj;
            if (C78532ao.APP_SHORTCUT != anVar.mo73464a() || !this.f216297a.equals(anVar.mo73465b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216297a.hashCode();
    }

    public final String toString() {
        String obj = this.f216297a.toString();
        return "DoubleContent{appShortcut=" + obj + "}";
    }
}
