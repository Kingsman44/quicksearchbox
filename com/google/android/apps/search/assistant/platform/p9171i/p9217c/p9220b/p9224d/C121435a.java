package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d;

import com.google.assistant.p3781ad.p3787c.p3788a.C48512bd;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.d.a */
/* compiled from: PG */
class C121435a extends C121454t {

    /* renamed from: a */
    public final C48512bd f337091a;

    public C121435a(C48512bd bdVar) {
        if (bdVar != null) {
            this.f337091a = bdVar;
            return;
        }
        throw new NullPointerException("Null appData");
    }

    /* renamed from: a */
    public final C48512bd mo105138a() {
        return this.f337091a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121454t) {
            return this.f337091a.equals(((C121454t) obj).mo105138a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f337091a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f337091a.toString();
        return "AppDataAccessor{appData=" + obj + "}";
    }
}
